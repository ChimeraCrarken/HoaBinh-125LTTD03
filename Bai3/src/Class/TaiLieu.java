package Class;

import java.util.Scanner;

public class TaiLieu {
	// thuoc tinh
	private String maTaiLieu103;
	private String tenNXB103;
	private int soBanPhatHanh103;

	// phuong thuc
	// ham khoi tao khong doi so
	public TaiLieu() {

	}

	// ham khoi tao co doi so
	public TaiLieu(String maTaiLieu103, String tenNXB103, int soBanPhatHanh103) {
		this.maTaiLieu103 = maTaiLieu103;
		this.tenNXB103 = tenNXB103;
		this.soBanPhatHanh103 = soBanPhatHanh103;
	}

	// nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ma tai lieu: ");
		maTaiLieu103 = sc.nextLine();
		System.out.print("\tNhap ten nha xuat ban: ");
		tenNXB103 = sc.nextLine();
		System.out.print("\tNhap so ban phat hanh: ");
		soBanPhatHanh103 = sc.nextInt();
		sc.nextLine();
	}

	// hien thi
	public void hienThiThongTin() {
		System.out.println("\tMa tai lieu: " + maTaiLieu103);
		System.out.println("\tTen nha xuat ban: " + tenNXB103);
		System.out.println("\tSo ban phat hanh: " + soBanPhatHanh103);
	}

	// ham lay ra ma tai lieu
	public String getMaTaiLieu() {
		return maTaiLieu103;
	}
}
