package week3.day1.assignments;

public class StudentInformation {
public void getStudentInformation( int id) {
	System.out.println("Student id: "+ id);
}
public void getStudentInformation(int id,String name) {
	System.out.println("Student id: "+ id);
	System.out.println("Student Name: "+ name);
	}	
public void getStudentInformation(String email,long phone) {
	System.out.println("Student EMail id is: "+email);
	System.out.println("Student PhoneNumber: "+ phone);

}
public static void main(String[] args) {
		// TODO Auto-generated method stub
StudentInformation object= new StudentInformation();
	object.getStudentInformation(14152);
	object.getStudentInformation(14152, "Puhazhenthi");
	object.getStudentInformation("puhal@gmail.com", 995268181);
	}

}
