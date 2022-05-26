package school;

import java.util.ArrayList;
import utils.Define;

public class Subject {
	int subjectNum;
	String subjectName;
	int gradeType;
	
	ArrayList<Student> studentList = new ArrayList<Student>();
	
	public Subject(int subjectNum, String subjectName) {
		this.subjectNum = subjectNum;
		this.subjectName = subjectName;
		this.gradeType = Define.AB_TYPE;
	}
	
	public void registor(Student student) {
		studentList.add(student);
	}
	
	public int getSubjectNum() {
		return subjectNum;
	}
	
	public void setSubjectNum(int subjectNum) {
		this.subjectNum = subjectNum;
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public ArrayList<Student> getStudentList(){
		return studentList;
	}
	
	public void setStudentList() {
		this.studentList = studentList;
	}
	
	public int getGradeType() {
		return gradeType;
	}
	
	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}
}