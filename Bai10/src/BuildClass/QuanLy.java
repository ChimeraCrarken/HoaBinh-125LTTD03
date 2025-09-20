package BuildClass;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
	// Thuoc tinh
	private ArrayList<BienLai> ds103;

	// Phuong thuc
	// Ham khoi tao
	public QuanLy() {
		ds103 = new ArrayList<BienLai>(10);
	}

	// Ham them bien lai vao danh sach
	public void themBienLai(BienLai bienLai103) {
		ds103.add(bienLai103);
	}

	// Ham nhap danh sach
	public void nhapDanhSach(Scanner sc) {
		BienLai bienLai103;
		System.out.print("Nhap vao so luong bien lai: ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap vao danh sach bien lai:");
		for (int i = 0; i < n; i++) {
			System.out.println("Bien lai thu " + (i + 1) + " la:");
			bienLai103 = new BienLai();
			bienLai103.nhapThongTin(sc);

			themBienLai(bienLai103);
		}
	}

	// Ham hien thi danh sach
	public void hienThiDanhSach() {
		for (int i = 0; i < ds103.size(); i++) {
			System.out.println("Bien lai thu " + (i + 1) + " la:");
			ds103.get(i).hienThiThongTin();
			System.out.println();
		}
	}
}
