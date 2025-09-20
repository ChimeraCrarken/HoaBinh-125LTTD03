package Testing;

import java.util.Scanner;

import Class.KhachSan;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		KhachSan ql103 = new KhachSan();

		ql103.nhapDanhSach(sc);

		System.out.print("Nhap vao khach tro can tinh tien: ");
		int cmnd103 = sc.nextInt();

		System.out.println("==> Tong tien la: " + ql103.tinhTien(cmnd103));

		sc.close();
	}

}
