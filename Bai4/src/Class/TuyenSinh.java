package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh {
	// thuoc tinh
	private ArrayList<ThiSinh> dsts103;

	// phuong thuc
	public TuyenSinh() {
		dsts103 = new ArrayList<ThiSinh>(10);
	}

	// ham them 1 thi sinh
	public void themThiSinh(ThiSinh ts103) {
		dsts103.add(ts103);
	}

	// nhap danh sach
	public void nhapDanhSach(Scanner sc) {
		ThiSinh ts103;
		int chon;

		System.out.print("Nhap vao so luong thi sinh: ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.println("Thi sinh thuoc khoi nao (1-KhoiA; 2-KhoiB; 3-KhoiC): ");
			chon = sc.nextInt();

			switch (chon) {
			case 1:
				ts103 = new KhoiA("Toan", "Ly", "Hoa");
				break;
			case 2:
				ts103 = new KhoiB("Toan", "Hoa", "Sinh");
				break;
			case 3:
				ts103 = new KhoiC("Van", "Su", "Dia");
				break;
			default:
				ts103 = new KhoiA("Toan", "Ly", "Hoa");
				break;
			}

			ts103.nhapThongTin(sc);
			themThiSinh(ts103);
		}
	}

	// ham hien thi
	public void hienThiDanhSach() {
		int n = dsts103.size();
		for (int i = 0; i < n; i++) {
			System.out.println("Thi sinh thu " + (i + 1) + " la:");
			dsts103.get(i).hienThiThongTin();
		}
	}

	// tim kiem thi sinh theo so bao danh
	public void timKiemThiSinh(int soBaoDanh) {
		for (ThiSinh ts103 : dsts103) {
			if (ts103.getSoBD() == soBaoDanh) {
				ts103.hienThiThongTin();
			}
		}
	}
}
