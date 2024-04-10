package Bai_kiem_tra_giua_ki_2;

public class Experience extends Employee {
	private int ExpInYear;
	private String ProSkill;
	
public Experience() {
 	}

public int getExpInYear() {
	return ExpInYear;
}

public void setExpInYear(int expInYear) {
	ExpInYear = expInYear;
}

public String getProSkill() {
	return ProSkill;
}

public void setProSkill(String proSkill) {
	ProSkill = proSkill;
}

	//	public Experience(int iD, String fullName, String birthDay, int phone, String email, 
//			 int expInYear, String proSkill) {
//		super(iD, fullName, birthDay, phone, email);
//		ExpInYear = expInYear;
//		ProSkill = proSkill;
//	}
	 public void showInfo() {
	        super.showInfo();
	        System.out.println("Experience in Year: " + ExpInYear);
	        System.out.println("Professional Skill: " + ProSkill);
	    }

}
