package Bai_kiem_tra_giua_ki_2;

public class Employee implements IEmployee   {
		private int ID;
		private String FullName;
		private String BirthDay;
		private int Phone;
		private String Email;
		private String Employee_type;
		private int Employee_count;
		
		public Employee() {
			
		}
		public Employee(int iD, String fullName, String birthDay, int phone, String email, String employee_type,
				String employee_count) {
			super();
			ID = iD;
			FullName = fullName;
			BirthDay = birthDay;
			Phone = phone;
			Email = email;
			Employee_type = employee_type;
			Employee_count = 0;
		}
		

		public int getID() {
			return ID;
		}


		public void setID(int iD) {
			ID = iD;
		}


		public String getFullName() {
			return FullName;
		}


		public void setFullName(String fullName) {
			FullName = fullName;
		}


		public String getBirthDay() {
			return BirthDay;
		}


		public void setBirthDay(String birthDay) {
			BirthDay = birthDay;
		}


		public int getPhone() {
			return Phone;
		}


		public void setPhone(int phone) {
			Phone = phone;
		}


		public String getEmail() {
			return Email;
		}


		public void setEmail(String email) {
			Email = email;
		}


		public String getEmployee_type() {
			return Employee_type;
		}


		public void setEmployee_type(String employee_type) {
			Employee_type = employee_type;
		}


		public int getEmployee_count() {
			return Employee_count;
		}


		public void setEmployee_count(int employee_count) {
			Employee_count = employee_count;
		}


		@Override
		public String toString() {
			return "Employee [ID=" + ID + ", FullName=" + FullName + ", BirthDay=" + BirthDay + ", Phone=" + Phone
					+ ", Email=" + Email + ", Employee_type=" + Employee_type + ", Employee_count=" + Employee_count
					+ "]";
		}


		@Override
		public void showInfo() {
			// TODO Auto-generated method stub
			System.out.println("ID: " + ID);
	        System.out.println("Full Name: " + FullName);
	        System.out.println("Birth Day: " + BirthDay);
	        System.out.println("Phone: " + Phone);
	        System.out.println("Email: " +Email);
	        System.out.println("Employee Type: " + Employee_type);
	        System.out.println("Employee Count: " + Employee_count	);
		}
		

}
