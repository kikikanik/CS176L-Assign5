// StudentList
// This class can be used to create a StudentList object which contains an array of Student objects
//*******************************************************************
import java.util.ArrayList;

public class StudentList {
	ArrayList<Student> studentAL= new ArrayList<Student>();

	
	public StudentList(ArrayList<Student> studentAL){
		setStudentAL(studentAL);
	}

	public ArrayList<Student> getStudentAL() {
		return studentAL;
	}

	public void setStudentAL(ArrayList<Student> studentAL) {
		this.studentAL = studentAL;
	}
	
//to add a Student
	public void addStudent(Student inputStudent) {
			studentAL.add(inputStudent);
		}

//to remove a Student
	public void removeStudent(String email) {
		for (int i = 0; i< studentAL.size(); i++) {
			if(studentAL.get(i).getEmail()== email) {
				studentAL.remove(studentAL.get(i));
			}
		}		
	}
	
	public String getStudentInfo() {
		String allStudentInfo = ""; 
		for (int i = 0; i< studentAL.size(); i++) {
			allStudentInfo = allStudentInfo + studentAL.get(i).toString() + System.lineSeparator();
		}
		return allStudentInfo;
	}
	public String getAllStudentInfo() {
		String allStudentInfo = ""; 
		for (int i = 0; i< studentAL.size(); i++) {
			allStudentInfo = allStudentInfo + studentAL.get(i).toString() + System.lineSeparator();
		}
		return allStudentInfo;
	}
}