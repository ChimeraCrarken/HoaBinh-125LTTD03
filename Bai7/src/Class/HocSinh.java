package Class;

import java.util.Scanner;

public class HocSinh extends Nguoi {
	// thuoc tinh
	private String lop103;
	private String khoaHoc103;
	private String kyHoc103;

	// phuong thuc
	// ham khoi tao khong doi so
	public HocSinh() {

	}

	// ham khoi tao co doi so
	public HocSinh(String hoTen103, String lop103, String khoaHoc103, String kyHoc103) {
		this.hoTen103 = hoTen103;
		this.lop103 = lop103;
		this.khoaHoc103 = khoaHoc103;
		this.kyHoc103 = kyHoc103;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap lop: ");
		lop103 = sc.nextLine();

		System.out.print("\tNhap khoa hoc: ");
		khoaHoc103 = sc.nextLine();

		System.out.print("\tNhap ky hoc: ");
		kyHoc103 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tLop: " + lop103);
		System.out.println("\tKhoa hoc: " + khoaHoc103);
		System.out.println("\tKy hoc: " + kyHoc103);
	}

	// ham lay ra thong tin ve lop103
	public String getLop() {
		return lop103;
	}
}
