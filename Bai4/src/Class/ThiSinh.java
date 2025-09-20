package Class;

import java.util.Scanner;

public class ThiSinh {
	// thuoc tinh
	private int soBD103;
	private String hoTen103;
	private String diaChi103;
	private String dienUuTien103;

	// phuong thuc
	// ham khoi tao khong doi so
	public ThiSinh() {

	}

	// ham khoi tao co doi so
	public ThiSinh(int soBD103, String hoTen103, String diaChi103, String dienUuTien103) {
		this.soBD103 = soBD103;
		this.hoTen103 = hoTen103;
		this.diaChi103 = diaChi103;
		this.dienUuTien103 = dienUuTien103;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap so bao danh: ");
		soBD103 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ho ten: ");
		hoTen103 = sc.nextLine();
		System.out.print("\tNhap dia chi: ");
		diaChi103 = sc.nextLine();
		System.out.print("\tNhap dien uu tien: ");
		dienUuTien103 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tSo bao danh: " + soBD103);
		System.out.println("\tHo ten: " + hoTen103);
		System.out.println("\tDia chi: " + diaChi103);
		System.out.println("\tDien uu tien: " + dienUuTien103);
	}

	// ham lay ra thong tin ve so bao danh
	public int getSoBD() {
		return soBD103;
	}
}
