// 데이터형으로만 사용 => 변수만 가지고 있다 : 쓰기,읽기
/*
 *   클래스 
 *   1) 없는 데이터형을 만들어서 사용 : 사용자 정의 데이터형을 만든다 
 *      = int , long , double .....
 *   2) 기능 추가 (메소드) => 동작이 가능하게 만든다 
 */
// 데이터형 클래스 
public class Movie {
    private String title;
    private String grade;
    private String regdate;
    private double score;
    private double reserve;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public double getReserve() {
		return reserve;
	}
	public void setReserve(double reserve) {
		this.reserve = reserve;
	}
   
}
