package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
	// thuoc tinh
	private ArrayList<CanBo> dscb103;

	// phuong thuc
	// ham khoi tao
	public QLCB() {
		dscb103 = new ArrayList<CanBo>(10);
	}

	// ham them can bo
	public void themCanBo(CanBo cb103) {
		dscb103.add(cb103);
	}

	// ham nhap danh sach
	public void nhapDanhSach(Scanner sc) {
		CanBo cb103;
		System.out.print("Nhap vao so luong can bo: ");
		int n = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhap thong tin chi tiet:");
		for (int i = 0; i < n; i++) {
			System.out.println("Lan nhap thu " + (i + 1) + ":");
			System.out.print("Chon can bo (1-KySu; 2-NhanVien;3-CongNhan): ");
			int chon = sc.nextInt();
			sc.nextLine();

			cb103 = new CanBo();

			switch (chon) {
			case 1:
				cb103 = new KySu();
				break;
			case 2:
				cb103 = new NhanVien();
				break;
			case 3:
				cb103 = new CongNhan();
				break;

			default:
				cb103 = new KySu();
				break;
			}

			// sau khi chon loai can bo thi nhap thong tin cho can bo do
			cb103.nhapThongTin(sc);

			// nhap xong roi thi them can bo vao danh sach
			themCanBo(cb103);
		}
	}

	// ham tim kiem theo ten
	public void timKiemCanBo(String hoTen) {
		for (CanBo cb103 : dscb103) {
			if (hoTen.equals(cb103.getHoTen())) {
				cb103.hienThiThongTin();
			}
		}
	}
}
