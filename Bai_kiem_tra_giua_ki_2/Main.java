package Bai_kiem_tra_giua_ki_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QLNV ql = new QLNV();
        int chon = 0;
        boolean check = true;
        while (check != false) {
            System.out.println(
                    "1.Them nhan vien Experience\n2.Them nhan vien Fresher\n3.Them nhan vien Intern \n4.Hien thi danh sach\n5.Xoa nhan vien");
            Scanner k = new Scanner(System.in);
            chon = k.nextInt();
            switch (chon) {
                case 1:
                    ql.ThemNhanVienExperience();
                    break;
                case 2:
                    ql.ThemNhanVienFresher();
                    break;
                case 3:
                    ql.ThemNhanVienIntern();
                    break;
                case 4:
                    ql.HienThiDS();
                    break;
                case 5:
                    
	}
        }
	}
}
