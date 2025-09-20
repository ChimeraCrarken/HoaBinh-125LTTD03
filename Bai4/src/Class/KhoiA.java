package Class;

import java.util.Scanner;

public class KhoiA extends ThiSinh {
	// thuoc tinh
	private String mon1103;
	private String mon2103;
	private String mon3103;

	// phuong thuc
	// ham khoi tao khong doi so
	public KhoiA() {

	}

	// ham khoi tao co doi so
	public KhoiA(String mon1103, String mon2103, String mon3103) {
		this.mon1103 = mon1103;
		this.mon2103 = mon2103;
		this.mon3103 = mon3103;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap mon 1: ");
		mon1103 = sc.nextLine();
		System.out.print("\tNhap mon 2: ");
		mon2103 = sc.nextLine();
		System.out.print("\tNhap mon 3: ");
		mon3103 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tTo hop mon thi: " + mon1103 + " - " + mon2103 + " - " + mon3103);
	}
}
