package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TheMuon extends SinhVien {
	// thuoc tinh
	private int soMuon103;
	private Date ngayMuon103;
	private Date hanTra103;
	private String soHieu103;

	// phuong thuc
	// ham khoi tao khong doi so
	public TheMuon() {

	}

	// ham khoi tao co doi so
	public TheMuon(int soMuon103, Date ngayMuon103, String soHieu103) {
		this.soMuon103 = soMuon103;
		this.ngayMuon103 = ngayMuon103;
		this.soHieu103 = soHieu103;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap so muon: ");
		soMuon103 = sc.nextInt();
		sc.nextLine();

		System.out.print("\tNhap ngay muon: ");
		String strNgayMuon = sc.nextLine();
		ngayMuon103 = strToDate(strNgayMuon);

		System.out.print("\tNhap ngay tra: ");
		String strNgayTra = sc.nextLine();
		//String strNgayTra = "31-12-2020";
		hanTra103 = strToDate(strNgayTra);

		System.out.println("\tNhap so hieu: ");
		soHieu103 = sc.nextLine();
	}

	private Date strToDate(String strNgayMuon) {
		Date date = null;

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date = sdf.parse(strNgayMuon);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang!");
		}

		return date;
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tSo phieu muon: " + soMuon103);
		System.out.println("\tNgay muon: " + ngayMuon103);
		System.out.println("\tHan tra: " + hanTra103);
		System.out.println("\tSo hieu: " + soHieu103);
	}

	// ham lay ra thong tin ve han tra
	public Date getHanTra() {
		return hanTra103;
	}
}
