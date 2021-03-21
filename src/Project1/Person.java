package Project1;

import java.util.Scanner;

public class Person {
	String ten;
	String gioitinh;
	String ngaysinh;
	String diachi;
	public Person() {
	}
	public Person(String ten, String gioitinh, String ngaysinh, String diachi) {
		this.ten = ten;
		this.gioitinh = gioitinh;
		this.ngaysinh = ngaysinh;
		this.diachi = diachi;
	}
	
	
	public void nhapThongtin() {
		Scanner nhap = new Scanner(System.in);
		System.out.println("Nhap ten: ");
		ten = nhap.nextLine();
		
		System.out.println("Nhap gioi tinh: ");
		gioitinh = nhap.nextLine();
		
		System.out.println("Nhap ngay sinh: ");
		ngaysinh = nhap.nextLine();
		
		System.out.println("Nhap dia chi: ");
		diachi = nhap.nextLine();
	}
	
	public void xuatThongtin() {
		System.out.println("Ten: " + ten + "; gioi tinh: "+ gioitinh+ 
							"; Ngay sinh: " + ngaysinh + "; Dia chi:" + diachi);
		
	}
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public String getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	
}
