package Class;

import java.util.Scanner;

public class KhachTro extends Nguoi {
	// thuoc tinh
	private int soNgayTro103;
	private String loaiPhong103;
	private double giaPhong103;

	// phuong thuc
	// ham khoi tao khong doi so
	public KhachTro() {

	}

	// ham khoi tao co doi so
	public KhachTro(String hoTen, int CMND, int soNgayTro103, String loaiPhong103, double giaPhong103) {
		this.hoTen103 = hoTen;
		this.CMND103 = CMND;
		this.soNgayTro103 = soNgayTro103;
		this.loaiPhong103 = loaiPhong103;
		this.giaPhong103 = giaPhong103;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap so ngay tro: ");
		soNgayTro103 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap loai phong: ");
		loaiPhong103 = sc.nextLine();
		System.out.print("\tNhap gia phong: ");
		giaPhong103 = sc.nextDouble();
		sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tSo ngay tro: " + soNgayTro103);
		System.out.println("\tLoai phong: " + loaiPhong103);
		System.out.println("\tGia phong: " + giaPhong103);
	}

	// ham lay ra thong tin so ngay tro
	public int getSoNgayTro() {
		return soNgayTro103;
	}

	// ham lay thong tin gia phong
	public double getGiaPhong() {
		return giaPhong103;
	}
}
