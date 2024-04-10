package Bai_kiem_tra_giua_ki_2;

public class Fresher extends Employee {
	
	private String Graduation_date;
	private String Graduation_rank;
	private String Education;
	
	public Fresher() {
		
	}
	public Fresher(int iD, String fullName, String birthDay, int phone, String email, String employee_type,
			String employee_count, String graduation_date, String graduation_rank, String education) {
		super(iD, fullName, birthDay, phone, email, employee_type, employee_count);
		Graduation_date = graduation_date;
		Graduation_rank = graduation_rank;
		Education = education;
	}
	
	public String getGraduation_date() {
		return Graduation_date;
	}
	public void setGraduation_date(String graduation_date) {
		Graduation_date = graduation_date;
	}
	public String getGraduation_rank() {
		return Graduation_rank;
	}
	public void setGraduation_rank(String graduation_rank) {
		Graduation_rank = graduation_rank;
	}
	public String getEducation() {
		return Education;
	}
	public void setEducation(String education) {
		Education = education;
	}
	public void showInfo() {
        super.showInfo();
        System.out.println("Graduation Date: " + Graduation_date);
        System.out.println("Graduation Rank: " + Graduation_rank);
        System.out.println("Education: " + Education);
    }

}
