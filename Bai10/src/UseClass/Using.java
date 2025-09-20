package UseClass;

import java.util.Scanner;

import BuildClass.QuanLy;

public class Using {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		QuanLy ql103 = new QuanLy();
		ql103.nhapDanhSach(sc);

		System.out.println("Danh sach bien lai cua cac ho gia dinh la:");
		ql103.hienThiDanhSach();

		sc.close();
	}

}
