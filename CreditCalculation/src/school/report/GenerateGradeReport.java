package school.report;

import java.util.ArrayList;

import school.School;
import school.Subject;
import utils.Define;
import school.Student;
import school.Score;
import grade.GradeEvaluation;
import grade.BasicEvaluation;
import grade.MajorEvaluation;
import grade.PFEvaluation;

public class GenerateGradeReport {
	School school = School.getInstance();
	
	public static final String TITLE = " 수강생 학점\t\t\n";
	public static final String HEADER = "  이름 |   학번   | 필수 여부 | 점수 \n";
	public static final String LINE = "--------------------------------\n";
	
	private StringBuffer buffer = new StringBuffer();
	
	public String getReport() {
		ArrayList<Subject> subjectList = school.getSubjectList();
		
		for(Subject subject : subjectList) {
			makeHeader(subject);
			makeBody(subject);
			makeFooter();
		}
		return buffer.toString();
	}
	
	public void makeHeader(Subject subject) {
		buffer.append(GenerateGradeReport.LINE);
		buffer.append("\t" + subject.getSubjectName());
		buffer.append(GenerateGradeReport.TITLE);
		buffer.append(GenerateGradeReport.HEADER);
		buffer.append(GenerateGradeReport.LINE);
	}
	
	public void makeBody(Subject subject) {
		ArrayList<Student> studentList = subject.getStudentList();
		
		for(int i = 0; i < studentList.size(); i++) {
			Student student = studentList.get(i);
			buffer.append(" "+student.getStudentName());
			buffer.append(" | ");
			buffer.append(student.getStudentNum());
			buffer.append(" |   ");
			buffer.append(student.getMajorSubject().getSubjectName());
			buffer.append("   | ");
			
			getScoreGrade(student, subject.getSubjectNum());
			
			buffer.append("\n");
			buffer.append(LINE);
			
		}
	}
	
	public void getScoreGrade(Student student, int subjectNum) {
		ArrayList<Score> scoreList = student.getScoreList();
		int majorNum = student.getMajorSubject().getSubjectNum();
		
		GradeEvaluation[] gradeEvaluation = {new BasicEvaluation(), new MajorEvaluation(), new PFEvaluation()};
		
		for(int i = 0; i < scoreList.size(); i++) {
			Score score = scoreList.get(i);
			if(score.getSubjectName().getSubjectNum() == subjectNum) {
				String grade;
				if(score.getSubjectName().getGradeType() == Define.PF_TYPE) {
					grade = gradeEvaluation[Define.PF_TYPE].getGrade(score.getPoint());
				}
				else {
					if(score.getSubjectName().getSubjectNum() == majorNum) {
						grade = gradeEvaluation[Define.SAB_TYPE].getGrade(score.getPoint());
					}
					else{
						grade = gradeEvaluation[Define.AB_TYPE].getGrade(score.getPoint());
					}
				}
				buffer.append(score.getPoint());
				buffer.append(":");
				buffer.append(grade);
			}
		}
	}
	
	public void makeFooter() {
		buffer.append("\n");
	}
}
