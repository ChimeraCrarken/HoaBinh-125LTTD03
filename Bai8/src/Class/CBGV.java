package Class;

import java.util.Scanner;

public class CBGV extends Nguoi {
	// thuoc tinh
	private double luongCung103;
	private double thuong103;
	private double phat103;
	private double luongThucLinh103;

	// phuong thuc
	// ham khoi tao khong doi so
	public CBGV() {

	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap luong cung: ");
		luongCung103 = sc.nextDouble();
		sc.nextLine();

		System.out.print("\tNhap thuong: ");
		thuong103 = sc.nextDouble();
		sc.nextLine();

		System.out.print("\tNhap phat: ");
		phat103 = sc.nextDouble();
		sc.nextLine();

		// tinh luong
		luongThucLinh103 = luongCung103 + thuong103 - phat103;
	}

	// ham hien thi thong tin
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tLuong cung: " + luongCung103);
		System.out.println("\tThuong: " + thuong103);
		System.out.println("\tPhat: " + phat103);
		System.out.println("\tLuong thuc linh: " + luongThucLinh103);
	}

	// ham lay ra thong tin ve luong thuc linh
	public double getLuongThucLinh() {
		return luongThucLinh103;
	}
}
