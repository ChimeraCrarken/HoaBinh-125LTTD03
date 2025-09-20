package Test;

import java.util.Scanner;

import Class.PhanSo;

public class TestClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PhanSo ps1103=new PhanSo();
		PhanSo ps2103=new PhanSo();
		PhanSo psTong103 =new PhanSo();
		
		// nhap phan so
		System.out.println("Nhap vao phan so thu nhat:");
		ps1103.nhapPS(sc);
		System.out.println("Nhap vao phan so thu hai:");
		ps2103.nhapPS(sc);
		
		// tinh tong 2 phan so
		psTong103=ps1103.congPS(ps2103);
		
		// hien thi phan so
		System.out.println("\nPhan so thu nhat la:");
		ps1103.hienThiPS();
		System.out.println("\nPhan so thu hai la:");
		ps2103.hienThiPS();
		System.out.println("\nPhan so tong la:");
		psTong103.hienThiPS();
		
		psTong103=ps1103.truPS(ps2103);
		System.out.println("\nPhan so hieu la:");
		psTong103.hienThiPS();
		
		psTong103=ps1103.chiaPS(ps2103);
		System.out.println("\nPhan so chia la:");
		psTong103.hienThiPS();
		
		psTong103=ps1103.nhanPS(ps2103);
		System.out.println("\nPhan so nhan la:");
		psTong103.hienThiPS();
		
		if (psTong103.kiemTraToiGian() == true)
			System.out.println("\nPhan so nhan toi gian");
		else
			System.out.println("\nPhan so nhan chua toi gian");
		
		psTong103.toiGianPS();
		System.out.println("\nPhan so nhan toi gian la:");
		psTong103.hienThiPS();
		
		sc.close();
	}

}
