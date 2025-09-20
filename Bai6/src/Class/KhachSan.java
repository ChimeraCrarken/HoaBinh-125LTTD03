package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class KhachSan {
	// thuoc tinh
	private ArrayList<KhachTro> ds103;

	// phuong thuc
	// ham khoi tao
	public KhachSan() {
		ds103 = new ArrayList<KhachTro>(10);
	}

	// ham them khach103 tro vao khach103 san
	public void themKhachTro(KhachTro kt) {
		ds103.add(kt);
	}

	// ham nhap danh sach
	public void nhapDanhSach(Scanner sc) {
		KhachTro khach103;

		System.out.print("Nhap vao so luong khach: ");
		int n = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhap vao thong tin khach tro:");
		for (int i = 0; i < n; i++) {
			System.out.println("Khach tro thu " + (i + 1) + " la:");
			khach103 = new KhachTro();
			khach103.nhapThongTin(sc);
			themKhachTro(khach103);
		}
	}

	// ham hien thi
	public void hienThiDanhSach() {
		for (KhachTro khach103 : ds103) {
			khach103.hienThiThongTin();
		}
	}

	// ham tinh tien
	public double tinhTien(int CMND) {
		double tien = 0;

		for (KhachTro khach103 : ds103) {
			if (khach103.getCMND() == CMND) {
				tien = khach103.getSoNgayTro() * khach103.getGiaPhong();
			}
		}

		return tien;
	}
}
