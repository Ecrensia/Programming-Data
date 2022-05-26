package school;

public class Score {
	int studentNum;
	int point;
	Subject subject;
	
	public Score(int studentNum, Subject subjectName, int point) {
		this.studentNum = studentNum;
		this.subject = subjectName;
		this.point = point;
	}
	
	public int getStudentNum() {
		return studentNum;
	}
	
	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
	
	public int getPoint() {
		return point;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	
	public Subject getSubjectName() {
		return subject;
	}
	
	public void setSubjectName(Subject subjectName) {
		this.subject = subjectName;
	}
	
	@Override
	public String toString() {
		return "ÇÐ¹ø : " + studentNum + " , " + subject.getSubjectName() + " : " + point;
	}
}