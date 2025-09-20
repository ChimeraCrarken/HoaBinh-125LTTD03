package Test;

import java.util.Scanner;

import Class.PhanSo;

public class TestClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PhanSo ps1=new PhanSo();
		PhanSo ps2=new PhanSo();
		PhanSo psTong =new PhanSo();
		
		// nhap phan so
		System.out.println("Nhap vao phan so thu nhat:");
		ps1.nhapPS(sc);
		System.out.println("Nhap vao phan so thu hai:");
		ps2.nhapPS(sc);
		
		// tinh tong 2 phan so
		psTong=ps1.congPS(ps2);
		
		// hien thi phan so
		System.out.println("\nPhan so thu nhat la:");
		ps1.hienThiPS();
		System.out.println("\nPhan so thu hai la:");
		ps2.hienThiPS();
		System.out.println("\nPhan so tong la:");
		psTong.hienThiPS();
		
		psTong=ps1.truPS(ps2);
		System.out.println("\nPhan so hieu la:");
		psTong.hienThiPS();
		
		psTong=ps1.chiaPS(ps2);
		System.out.println("\nPhan so chia la:");
		psTong.hienThiPS();
		
		psTong=ps1.nhanPS(ps2);
		System.out.println("\nPhan so nhan la:");
		psTong.hienThiPS();
		
		if (psTong.kiemTraToiGian() == true)
			System.out.println("\nPhan so nhan toi gian");
		else
			System.out.println("\nPhan so nhan chua toi gian");
		
		psTong.toiGianPS();
		System.out.println("\nPhan so nhan toi gian la:");
		psTong.hienThiPS();
		
		sc.close();
	}

}
