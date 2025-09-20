package Class;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class KhuPho {
	// thuoc tinh
	private ArrayList<HoDan> dshd103;

	// phuong thuc
	// ham khoi tao
	public KhuPho() {
		dshd103 = new ArrayList<HoDan>(10);
	}

	// ham them 1 ho dan
	public void themHoDan(HoDan hoDan103) {
		dshd103.add(hoDan103);
	}

	// ham nhap vao danh sach ho dan
	public void nhapDanhSach(Scanner sc) {
		HoDan hoDan103;

		System.out.print("Nhap vao so ho dan: ");
		int soHoDan = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhap vao thong tin cho tung ho dan:");
		for (int i = 0; i < soHoDan; i++) {
			System.out.println("Ho dan thu " + (i + 1) + " la:");
			hoDan103 = new HoDan();
			hoDan103.nhapThongTin(sc);
			themHoDan(hoDan103);
		}
	}

	// ham hien thi danh sach
	public void hienThiDanhSach() {
		int n = dshd103.size();

		for (int i = 0; i < n; i++) {
			System.out.println("Ho dan thu " + (i + 1) + " la:");
			dshd103.get(i).hienThiThongTin();
		}
	}

	// ham tim kiem thong tin
	public void timKiemThongTin() {
		// lay ra duoc nam hien tai
		Date now = new Date();
		int namHienTai = now.getYear() + 1900;

		Nguoi[] dstv = null;

		for (HoDan hoDan103 : dshd103) {
			dstv = hoDan103.getList();
			for (int i = 0; i < hoDan103.getSoNguoi(); i++) {
				if (namHienTai - (dstv[i].getNgaySinh().getYear() + 1900) == 80) {
					hoDan103.hienThiThongTin();
				}
			}
		}
	}
}
