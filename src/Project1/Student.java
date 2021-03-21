package Project1;

import java.util.Scanner;

public class Student extends Person {
	String mssv;
	float diem;
	String mail;
	
	//Constructor
	public Student() {
		super();
	}
	
	@Override
	public void xuatThongtin() {
		// TODO Auto-generated method stub
		super.xuatThongtin();
		System.out.print("Ma so sinh vien: "+ mssv + "; Diem: "+diem +"; Mail: "+ mail);
		System.err.println("");
	}
	
	@Override
	public void nhapThongtin() {
		super.nhapThongtin(); //Ke thua thong tin tu Person
		Scanner nhap = new Scanner(System.in);
		System.out.println("Nhap ma so sinh vien: ");
		//Code day du 
		//Nhap mssv
		while(true) {
			String inmssv = nhap.nextLine();
			boolean ktra = setMssv(inmssv);
			if(ktra){
				break;
			}
		}
		//Code ngan gon hon
		//while(!setMssv(nhap.nextLine())); 
		//Nhap diem
		System.out.println("Nhap diem sinh vien: ");
		while(true) {
			Float indiem = Float.parseFloat(nhap.nextLine());
			boolean ktra = setDiem(indiem);
			if(ktra){
				break;
			} 
		}
		//Nhap mail
		System.out.println("Nhap dia chi mail: ");
		while(true) {
			String inmail = nhap.nextLine();
			boolean ktra = setMail(inmail);
			if(ktra){
				break;
			}
		}
	}

	
	public String getMssv() {
		return mssv;
	}

	public boolean setMssv(String mssv) {
		if(mssv != null && mssv.length()== 10) {//Dieu kien mssv la 8 kitu
			this.mssv = mssv;
			return true;
		}else {
			System.err.println("Nhap lai ma so sinh vien (10 ki tu): ");
			return false;
		}
	}

	public float getDiem() {
		return diem;
	}

	public boolean setDiem(float diem) {
		if(diem >=0 && diem <=10) {
			this.diem = diem;
			return true;
		}else {
			System.err.println("Nhap lai diem: ");
			return false;
		}
	}

	public String getMail() {
		return mail;
	}

	public boolean setMail(String mail) {
		if(mail != null && mail.contains("@gmail.com") && !mail.contains(" ")) {
			this.mail = mail;
			return true;
		}
		else {
			System.err.println("Nhap lai dia chi mail: ");
			return false; 
		}
	}
	public boolean KtraHocBong() {
		if(diem>=8) {
			return true;
		}
		return false;
	}
}
