package Class;

import java.util.Scanner;

public class Sach extends TaiLieu {
	// thuoc tinh
	private String tacGia103;
	private int soTrang103;

	// phuong thuc
	// ham khoi tao khong doi so
	public Sach() {

	}

	// ham khoi tao co doi so
	public Sach(String maTaiLieu, String tenNXB, int soBanPhatHanh, String tacGia103, int soTrang103) {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
		this.tacGia103 = tacGia103;
		this.soTrang103 = soTrang103;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap tac gia: ");
		tacGia103 = sc.nextLine();
		System.out.print("\tNhap so trang: ");
		soTrang103 = sc.nextInt();
		sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\ttac gia: " + tacGia103);
		System.out.println("\tSo trang: " + soTrang103);
	}
}
