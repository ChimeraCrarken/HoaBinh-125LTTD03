package Class;

import java.util.Date;
import java.util.Scanner;

public class HoDan extends Nguoi {
	// thuoc tinh
	private int soNguoi103;
	private int soNha103;
	private Nguoi[] list103; // list103 la mang danh sach chua cac thanh vien trong ho

	// phuong thuc
	// ham khoi tao khong doi so
	public HoDan() {
		list103 = new Nguoi[10];
	}

	// ham khoi tao co doi so
	public HoDan(String hoTen, Date ngaySinh, String ngheNghiep, int soNguoi103, int soNha103) {
		super(hoTen, ngaySinh, ngheNghiep);
		this.soNguoi103 = soNguoi103;
		this.soNha103 = soNha103;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap so nguoi: ");
		soNguoi103 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha103 = sc.nextInt();
		sc.nextLine();
		System.out.println("\tNhap thong tin cho tung nguoi trong ho:");
		for (int i = 0; i < soNguoi103; i++) {
			System.out.println("Nguoi thu " + (i + 1) + " la:");
			list103[i] = new Nguoi();
			list103[i].nhapThongTin(sc);
		}
	}

	// hien thi
	public void hienThiThongTin() {
		System.out.println("\tSo nguoi: " + soNguoi103);
		System.out.println("\tSo nha: " + soNha103);
		System.out.println("\tThong tin cua tung nguoi trong gia dinh:");
		for (int i = 0; i < soNguoi103; i++) {
			System.out.println("Nguoi thu " + (i + 1) + " la:");
			list103[i].hienThiThongTin();
		}
	}

	// ham lay ra thanh vien trong ho dan
	public Nguoi[] getList() {
		return list103;
	}

	// ham lay ra so thanh vien trong ho gia dinh
	public int getSoNguoi() {
		return soNguoi103;
	}
}
