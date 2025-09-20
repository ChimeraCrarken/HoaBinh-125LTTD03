package Testing;

import java.util.Scanner;

import Class.TuyenSinh;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		TuyenSinh dsTuyenSinh103 = new TuyenSinh();

		System.out.println("Nhap vao danh sach thi sinh: ");
		dsTuyenSinh103.nhapDanhSach(sc);

		System.out.println("Danh sach thi sinh du thi la:");
		dsTuyenSinh103.hienThiDanhSach();

		System.out.print("Nhap so bao danh can tim: ");
		int soBaoDanh103 = sc.nextInt();
		sc.nextLine();

		dsTuyenSinh103.timKiemThiSinh(soBaoDanh103);

		sc.close();
	}

}
