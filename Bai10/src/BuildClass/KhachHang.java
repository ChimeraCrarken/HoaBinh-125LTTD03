package BuildClass;

import java.util.Scanner;

public class KhachHang {
	// Thuoc tinh
	protected String tenChuHo103;
	protected int soNha103;
	protected String maCongTo103;

	// Phuong thuc
	// Ham khoi tao khong doi so
	public KhachHang() {

	}

	// Ham khoi tao co doi so
	public KhachHang(String tenChuHo103, int soNha103, String maCongTo103) {
		this.tenChuHo103 = tenChuHo103;
		this.soNha103 = soNha103;
		this.maCongTo103 = maCongTo103;
	}

	// Ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ten chu ho: ");
		tenChuHo103 = sc.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha103 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ma cong to: ");
		maCongTo103 = sc.nextLine();
	}

	// Hm hien thi
	public void hienThiThongTin() {
		System.out.println("\tTen chu ho: " + tenChuHo103);
		System.out.println("\tSo nha: " + soNha103);
		System.out.println("\tMa cong to: " + maCongTo103);
	}
}
