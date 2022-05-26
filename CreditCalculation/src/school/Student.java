package school;

import java.util.ArrayList;

public class Student {
	private String studentName;
	private int studentNum;
	private Subject majorSubject;
	
	private ArrayList<Score> scoreList = new ArrayList<Score>();
	
	public Student(String studentName, int studentNum, Subject majorSubject) {
		this.studentName = studentName;
		this.studentNum = studentNum;
		this.majorSubject = majorSubject;
	}
	
	public void addSubjectScore(Score score) {
		scoreList.add(score);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String stuedntName) {
		this.studentName = studentName;
	}
	
	public int getStudentNum() {
		return studentNum;
	}
	
	public void SetStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
	
	public Subject getMajorSubject() {
		return majorSubject;
	}
	
	public void setMajor(Subject majorSubject) {
		this.majorSubject = majorSubject;
	}
	
	public ArrayList<Score> getScoreList(){
		return scoreList;
	}
	
	public void setScoreList(ArrayList<Score> scoreList) {
		this.scoreList = scoreList;
	}
}