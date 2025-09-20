package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	// thuoc tinh
	protected String hoTen103;
	protected Date ngaySinh103;
	protected int CMND103;

	// phuong thuc
	// ham khoi tao khong doi so
	public Nguoi() {

	}

	// ham khoi tao co doi so
	public Nguoi(String hoTen103, Date ngaySinh103, int CMND103) {
		this.hoTen103 = hoTen103;
		this.ngaySinh103 = ngaySinh103;
		this.CMND103 = CMND103;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen103 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		String strDate = sc.nextLine();
		ngaySinh103 = strToDate(strDate);
		System.out.print("\tNhap CMND: ");
		CMND103 = sc.nextInt();
	}

	private Date strToDate(String strDate) {
		Date date = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date = sdf.parse(strDate);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang!");
		}

		return date;
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen103);
		System.out.println("\tNgay sinh: " + ngaySinh103);
		System.out.println("\tCMND: " + CMND103);
	}

	// ham lay ra thong tin CMND103
	public int getCMND() {
		return CMND103;
	}
}
