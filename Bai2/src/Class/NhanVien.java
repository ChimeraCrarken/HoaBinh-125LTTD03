package Class;

import java.util.Scanner;

public class NhanVien extends CanBo {
	// thuoc tinh
	private String congViec103;

	// phuong thuc
	// ham khoi tao khong doi so
	public NhanVien() {

	}

	// ham khoi tao co doi so
	public NhanVien(String hoten, String ngaySinh, String gioiTinh, String diaChi, String congViec103) {
		super(hoten, ngaySinh, gioiTinh, diaChi);
		this.congViec103 = congViec103;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap cong viec: ");
		congViec103 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tCong viec: " + congViec103);
	}
}
