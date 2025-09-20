package Testing;

import java.util.Scanner;

import Class.QLCB;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		QLCB qlcb103 = new QLCB();

		qlcb103.nhapDanhSach(sc);

		System.out.print("Nhap vao ho ten can tim kiem: ");
		String name103 = sc.nextLine();

		qlcb103.timKiemCanBo(name103);

		// huy sc
		sc.close();
	}

}
