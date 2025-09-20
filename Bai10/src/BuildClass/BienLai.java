package BuildClass;

import java.util.Scanner;

public class BienLai extends KhachHang {
	// Thuoc tinh
	private int chiSoMoi103;
	private int chiSoCu103;
	private double tien103;

	// Phuong thuc
	// Ham khoi tao khong doi so
	public BienLai() {

	}

	// Ham khoi tao co doi so
	public BienLai(int chiSoMoi103, int chiSoCu103, double tien103) {
		this.chiSoMoi103 = chiSoMoi103;
		this.chiSoCu103 = chiSoCu103;
		this.tien103 = tien103;
	}

	public BienLai(String tenChuHo103, int chiSoMoi103, int chiSoCu103, double tien103) {
		this.tenChuHo103 = tenChuHo103;
		this.chiSoMoi103 = chiSoMoi103;
		this.chiSoCu103 = chiSoCu103;
		this.tien103 = tien103;
	}

	// Ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap chi so moi: ");
		chiSoMoi103 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap chi so cu: ");
		chiSoCu103 = sc.nextInt();
		sc.nextLine();
		tien103 = (chiSoMoi103 - chiSoCu103) * 750;
	}

	// Ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tChi so moi: " + chiSoMoi103);
		System.out.println("\tChi so cu: " + chiSoCu103);
		System.out.println("\tTien: : " + tien103);
	}
}
