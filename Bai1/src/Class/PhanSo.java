package Class;

import java.util.Scanner;

public class PhanSo {
	// thuoc tinh
	private int tuSo103;
	private int mauSo103;

	// phuong thuc
	// ham khoi tao khong doi so
	public PhanSo() {
		tuSo103 = 0;
		mauSo103 = 1;
	}

	// ham khoi tao co doi so
	public PhanSo(int tuSo103, int mauSo103) {
		this.tuSo103 = tuSo103;
		this.mauSo103 = mauSo103;
	}

	// ham nhap phan so
	public void nhapPS(Scanner sc) {
		int a;
		int b;

		do {
			System.out.print("\tNhap vao tu so: ");
			a = sc.nextInt();

			System.out.print("\tNhap vao mau so: ");
			b = sc.nextInt();

			// kiem tra
			if (b == 0) {
				System.out.println("Mau so khong duoc bang 0. Hay nhap lai!");
			} else {
				tuSo103 = a;
				mauSo103 = b;
			}
		} while (b == 0);
	}

	// ham hien thi
	public void hienThiPS() {
		if (tuSo103 * mauSo103 < 0) {
			System.out.println("\t-" + Math.abs(tuSo103) + "/" + Math.abs(mauSo103));
		} else {
			System.out.println("\t" + Math.abs(tuSo103) + "/" + Math.abs(mauSo103));
		}
	}

	// ham cong
	public PhanSo congPS(PhanSo ps2) {
		int a = tuSo103 * ps2.mauSo103 + ps2.tuSo103 * mauSo103;
		int b = mauSo103 * ps2.mauSo103;

		return new PhanSo(a, b);
	}

	// ham tru
	public PhanSo truPS(PhanSo ps2) {
		int a = tuSo103 * ps2.mauSo103 - ps2.tuSo103 * mauSo103;
		int b = mauSo103 * ps2.mauSo103;

		return new PhanSo(a, b);
	}

	// ham nhan
	public PhanSo nhanPS(PhanSo ps2) {
		int a = tuSo103 * ps2.tuSo103;
		int b = mauSo103 * ps2.mauSo103;

		return new PhanSo(a, b);
	}

	// ham chia
	public PhanSo chiaPS(PhanSo ps2) {
		int a = tuSo103 * ps2.mauSo103;
		int b = mauSo103 * ps2.tuSo103;

		return new PhanSo(a, b);
	}

	// ham tim uscln
	private int timUSCLN(int a, int b) {
		int r = a % b;

		while (r != 0) {
			a = b;
			b = r;
			r = a % b;
		}

		return b;
	}

	// ham kiem tra phan so toi gian hay chua
	public boolean kiemTraToiGian() {
		if (timUSCLN(tuSo103, mauSo103) == 1) {
			return true;
		}
		return false;
	}

	// ham toi gian
	public void toiGianPS() {
		int x = timUSCLN(tuSo103, mauSo103);

		tuSo103 /= x;
		mauSo103 /= x;
	}
}
