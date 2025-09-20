package Class;

import java.util.Scanner;

public class Nguoi {
	// thuoc tinh
	protected String hoTen103;
	protected String ngaySinh103;
	protected String queQuan103;

	// phuong thuc
	// ham khoi tao khong so
	public Nguoi() {

	}

	// ham khoi tao co doi so
	public Nguoi(String hoTen103, String ngaySinh103, String queQuan103) {
		this.hoTen103 = hoTen103;
		this.ngaySinh103 = ngaySinh103;
		this.queQuan103 = queQuan103;
	}

	// ham nhap thong tin
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen103 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		ngaySinh103 = sc.nextLine();
		System.out.print("\tNhap que quan: ");
		queQuan103 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen103);
		System.out.println("\tNgay sinh: " + ngaySinh103);
		System.out.println("\tQue quan: " + queQuan103);
	}
}
