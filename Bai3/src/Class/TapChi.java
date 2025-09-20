package Class;

import java.util.Scanner;

public class TapChi extends TaiLieu {
	// thuoc tinh
	private int soPhatHanh103;
	private int thangPhatHanh103;

	// phuong thuc
	// ham khoi tao khong doi so
	public TapChi() {

	}

	// ham khoi tao co doi so
	public TapChi(String maTaiLieu, String tenNXB, int soBanPhatHanh, int soPhatHanh103, int thangPhatHanh103) {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
		this.soPhatHanh103 = soBanPhatHanh;
		this.thangPhatHanh103 = thangPhatHanh103;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap so phat hanh: ");
		soPhatHanh103 = sc.nextInt();
		System.out.print("\tNhap thang phat hanh: ");
		thangPhatHanh103 = sc.nextInt();
		sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tSo phat hanh: " + soPhatHanh103);
		System.out.println("\tThang phat hanh: " + thangPhatHanh103);
	}
}
