package Class;

import java.util.Scanner;

public class CanBo {
	// thuoc tinh
	private String hoTen103;
	private String ngaySinh103;
	private String gioiTinh103;
	private String diaChi103;

	// phuong thuc
	// ham khoi tao khong doi so
	public CanBo() {

	}

	// ham khoi tao co doi so
	public CanBo(String hoten103, String ngaySinh103, String gioiTinh103, String diaChi103) {
		this.hoTen103 = hoten103;
		this.ngaySinh103 = ngaySinh103;
		this.gioiTinh103 = gioiTinh103;
		this.diaChi103 = diaChi103;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen103 = sc.nextLine();
		System.out.print("\tNhap ngay sinh (dd/MM/yyyy): ");
		ngaySinh103 = sc.nextLine();
		System.out.print("\tNhap gioi tinh: ");
		gioiTinh103 = sc.nextLine();
		System.out.print("\tNhap dia chi: ");
		diaChi103 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen103);
		System.out.println("\tNgay sinh: " + ngaySinh103);
		System.out.println("\tGioi tinh: " + gioiTinh103);
		System.out.println("\tDia chi: " + diaChi103);
	}

	// ham lay thong tin ho ten
	public String getHoTen() {
		return this.hoTen103;
	}
}
