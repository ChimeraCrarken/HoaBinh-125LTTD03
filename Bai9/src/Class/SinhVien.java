package Class;

import java.util.Scanner;

public class SinhVien {
	// thuoc tinh
	protected String hoTen103;
	protected String maSV103;
	protected String ngaySinh103;
	protected String lop103;

	// phuong thuc
	// ham khoi tao khong doi so
	public SinhVien() {

	}

	// ham khoi tao co doi so
	public SinhVien(String hoTen103, String maSV103, String ngaySinh103, String lop103) {
		this.hoTen103 = hoTen103;
		this.maSV103 = maSV103;
		this.ngaySinh103 = ngaySinh103;
		this.lop103 = lop103;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen103 = sc.nextLine();

		System.out.print("\tNhap ma sinh vien: ");
		maSV103 = sc.nextLine();

		System.out.print("\tNhap ngay sinh: ");
		ngaySinh103 = sc.nextLine();

		System.out.print("\tNhap lop: ");
		lop103 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen103);
		System.out.println("\tNgay sinh: " + ngaySinh103);
		System.out.println("\tMa sinh vien: " + maSV103);
		System.out.println("\tLop: " + lop103);
	}
}
