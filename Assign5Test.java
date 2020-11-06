//*******************************************************************
// Assign5Test
// This class contains the main method for CS-176L Assignment 4
//*******************************************************************
import java.util.ArrayList;

public class Assign5Test {

	public static void main(String[] args) {
		
		ArrayList<Student> newStudentAL= new ArrayList<Student>();
		
		newStudentAL.add(new Student ("Abdulmuhsin J. Al-Kandari", "s0936669@monmouth.edu", "SE", 2017));
		newStudentAL.add(new Student ("Justin R. Schlemm", "s0898474@monmouth.edu", "SE", 2017));
		newStudentAL.add(new Student ("Mary F. Menges", "s1012284@monmouth.edu", "SE", 2017));

		StudentList myStudentList = new StudentList(newStudentAL);
		
		System.out.println(myStudentList.getAllStudentInfo());
		
		myStudentList.removeStudent("s1012284@monmouth.edu");
		myStudentList.addStudent(new Student ("Yosef D. Davidowitz", "s1284597@monmouth.edu", "SE", 2017));
		myStudentList.addStudent(new Student ("Kinneret H. Kanik", "s1278692@monmouth.edu", "CS", 2017));
		
		System.out.println(myStudentList.getAllStudentInfo());
	}
}