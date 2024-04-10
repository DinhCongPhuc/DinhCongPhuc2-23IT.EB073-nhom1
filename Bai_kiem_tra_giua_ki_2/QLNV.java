package Bai_kiem_tra_giua_ki_2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QLNV {
	Employee em[] = new Employee[0];
	
	 public void ThemNhanVienExperience () {
		 Scanner sc = new Scanner(System.in);
		 Experience e = new Experience();
		        System.out.print("Nhap ID: ");
		        e.setID(sc.nextInt());
		        sc.nextLine();
		        System.out.print("Nhap ten: ");
		        e.setFullName(sc.nextLine());
		        System.out.print("Nhap ngay sinh: ");
		        e.setBirthDay(sc.nextLine());
		        System.out.print("Nhap email: ");
		        e.setEmail(sc.nextLine());
		        System.out.print("Nhap so nam kinh nghiem: ");
		        e.setExpInYear(sc.nextInt());
		        sc.nextLine();
		        System.out.print("Nhap ky nang chuyen mon: ");
		        e.setProSkill(sc.nextLine());
		        em = Arrays.copyOf(em, em.length + 1);
		        em[em.length - 1] = e;
		    }
	 
	 public void ThemNhanVienFresher () {
		 Scanner sc = new Scanner(System.in);
		 Fresher e = new Fresher();
		        System.out.print("Nhap ID: ");
		        e.setID(sc.nextInt());
		        sc.nextLine();
		        System.out.print("Nhap ten: ");
		        e.setFullName(sc.nextLine());
		        System.out.print("Nhap ngay sinh: ");
		        e.setBirthDay(sc.nextLine());
		        System.out.print("Nhap email: ");
		        e.setEmail(sc.nextLine());
		        System.out.print("Nhap thoi gian tot nghiep: ");
		        e.setGraduation_date(sc.nextLine());
		        System.out.print("Nhap xep loai tot nghiep: ");
		        e.setGraduation_rank(sc.nextLine());
		        System.out.print("Nhap truong tot nghiep: ");
		        e.setEducation(sc.nextLine());
		        em = Arrays.copyOf(em, em.length + 1);
		        em[em.length - 1] = e;
		    }
	 
	 public void ThemNhanVienIntern () {
		 Scanner sc = new Scanner(System.in);
		 Intern e = new Intern();
		        System.out.print("Nhap ID: ");
		        e.setID(sc.nextInt());
		        sc.nextLine();
		        System.out.print("Nhap ten: ");
		        e.setFullName(sc.nextLine());
		        System.out.print("Nhap ngay sinh: ");
		        e.setBirthDay(sc.nextLine());
		        System.out.print("Nhap email: ");
		        e.setEmail(sc.nextLine());
		        System.out.print("Nhap chuyen nganh hoc: ");
		        e.setMajors(sc.nextLine());
		        System.out.print("Nhap hoc ki dang hoc: ");
		        e.setSemester(sc.nextInt());
		        sc.nextLine();
		        System.out.print("Nhap ten truong dang hoc: ");
		        e.setUniversity_name(sc.nextLine());
		        em = Arrays.copyOf(em, em.length + 1);
		        em[em.length - 1] = e;
		    }
	 
		    public void HienThiDS() {
		        for (int i = 0; i < em.length; i++) {
		            System.out.println(em[i].toString() + "\n");
		        }
		    }

		    
	 }

