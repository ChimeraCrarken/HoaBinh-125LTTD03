package Class;

import java.util.Scanner;

public class KySu extends CanBo {
	// thuoc tinh
	private String nganhDaoTao103;

	// phuong thuc
	// ham khoi tao khong doi so
	public KySu() {

	}

	// ham khoi tao co doi so
	public KySu(String hoten, String ngaySinh, String gioiTinh, String diaChi, String nganhDaoTao103) {
		super(hoten, ngaySinh, gioiTinh, diaChi);
		this.nganhDaoTao103 = nganhDaoTao103;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap nganh dao tao: ");
		nganhDaoTao103 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tNganh dao tao: " + nganhDaoTao103);
	}
}
