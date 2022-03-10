package stdmngpkg;

public class StudentManager {

	private int rNo;
	private String name;
	private int score;
	private String grade;

	public StudentManager(int rNo, String name, int score, String grade) {
		super();
		this.rNo = rNo;
		this.name = name;
		this.score = score;
		this.grade = grade;
	}
	public int getrNo() {
		return rNo;
	}
	public void setrNo(int rNo) {
		this.rNo = rNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "StudentManager [rNo=" + rNo + ", name=" + name + ", score=" + score + ", grade=" + grade + "]";
	}



}
