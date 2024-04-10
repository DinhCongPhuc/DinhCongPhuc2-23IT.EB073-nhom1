package Bai_kiem_tra_giua_ki_2;

import java.util.Date;

public class Intern extends Employee {
	private String Majors;
	private int Semester;
	private String University_name;
	
	public Intern() {
		
	}
	public Intern(int iD, String fullName, String birthDay, int phone, String email, String employee_type,
			String employee_count, String majors, int semester, String university_name) {
		super(iD, fullName, birthDay, phone, email, employee_type, employee_count);
		Majors = majors;
		Semester = semester;
		University_name = university_name;
	}
	
	public String getMajors() {
		return Majors;
	}
	public void setMajors(String majors) {
		Majors = majors;
	}
	public int getSemester() {
		return Semester;
	}
	public void setSemester(int semester) {
		Semester = semester;
	}
	public String getUniversity_name() {
		return University_name;
	}
	public void setUniversity_name(String university_name) {
		University_name = university_name;
	}
	public void showInfo() {
		System.out.println("Majors: " + Majors);
		System.out.println("Semester: " + Semester);
		System.out.println("University: " + University_name);
		
	}
}
