package Project1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> studentList = new ArrayList<>();
		int key;
		Scanner sc = new Scanner(System.in);
		do {
			showMenu();
			System.out.println("Lua chon cua ban la: ");
			key = Integer.parseInt(sc.nextLine()); 
			
			switch(key) {
			case 1: 
				int n;
				System.out.println("Nhap so sinh vien can them: ");
				n = Integer.parseInt(sc.nextLine());
				for(int i = 0; i<n; i++) {
					Student std = new Student();
					std.nhapThongtin();
					
					studentList.add(std);
				}
				break;
 			case 2:
 				for(int i = 0; i <  studentList.size(); i++) {
 					studentList.get(i).xuatThongtin();
 				}
				
				break;
			case 3: 
				int minIndex = 0, maxIndex = 0;
				float minDiem, maxDiem;
				minDiem = studentList.get(0).getDiem();
				maxDiem = studentList.get(0).getDiem();
				
				for (int i = 1; i < studentList.size(); i++) {
					if(studentList.get(i).getDiem() < minDiem) {
						minIndex = i;
						minDiem = studentList.get(i).getDiem();
					}
					
					if(studentList.get(i).getDiem() > maxDiem) {
						maxIndex = i;
						maxDiem = studentList.get(i).getDiem();
					}
				System.out.println("Sinh vien co diem trung binh cao nhat:  ");
				studentList.get(maxIndex).xuatThongtin();
				
				System.out.println("Sinh vien co diem trung binh thap nhat:  ");
				studentList.get(minIndex).xuatThongtin();

				}
				break;
			case 4: 
				System.out.println("Nhap ma so sinh vien de tim kiem: ");
				String timmssv = sc.nextLine();
				int count = 0;
				
				for (Student student : studentList) {
					if(student.getMssv().equalsIgnoreCase(timmssv)) {
						student.xuatThongtin();
						count++;
					}
				}
				if(count == 0) {
					System.out.println("Khong tim thay sinh vien nao");
				}
				break;
			case 5: 
				//Step1: Sap xep thong tin sinh vien theo thu tu A->Z
				Collections.sort(studentList, new Comparator<Student>() {
					@Override
					 public int compare(Student o1, Student o2) {
						int cmp = o1.getTen().compareTo(o2.getTen());
						if(cmp >= 0) {
							return 1;
						}
						return -1;
					};
				});
				 //Step2: Hien thi  
				for (int i = 0; i < studentList.size(); i++) {
					studentList.get(i).xuatThongtin();
				}
				break;
			case 6:
				Collections.sort(studentList, new Comparator<Student>() {
					@Override
					 public int compare(Student o1, Student o2) {
						return o1.getDiem() >= o2.getDiem()?-1:1;   					};
				});
				 //Step2: Hien thi  
				for (int i = 0; i < studentList.size(); i++) {
					if(studentList.get(i).KtraHocBong()) {
						studentList.get(i).xuatThongtin();
					}
				}
				break;
			case 7: 
				System.out.println("Chuong trinh da thoat ");
				break;
			default:
				System.err.println("Sai cu phap!!! ");
				break;
			}
			
		}while(key!=7);
	}
	
	static void showMenu() {
		System.out.println("\n1. Nhap thong tin sinh vien");
		System.out.println("2. Hien thi thong tin sinh vien");
		System.out.println("3. Hien thi max, min theo diem trung binh");
		System.out.println("4. Tim kiem theo ma so sinh vien");
		System.out.println("5. Sap xep ten sinh vien A->Z");
		System.out.println("6. Hien thi sinh vien duoc hoc bong va sap sep theo diem");
		System.out.println("7. Thoat chuong trinh");


	}

}
 