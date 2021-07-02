// 생성자 종류 => 매개변수 없다(디폴트 생성자) , 매개변수가 있다 (입력값을 받아서 초기화, 파일 읽기,데이터베이스 읽기)
class Sawon
{
	String name="홍길동";//null
	String dept="개발부";//null
	String loc="서울";//null
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getLoc() {
		
		return loc;
		
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	Sawon(String n,String d,String l)
	{
	   name=n;
	   dept=d;
	   loc=l;
	}
}
public class 생성자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Sawon s1=new Sawon("홍길동","개발부","서울");
        System.out.println(s1.name);
        System.out.println(s1.dept);
        System.out.println(s1.loc);
        System.out.println("==========");
        Sawon s2=new Sawon("심청이","기획부","경기");
        System.out.println(s2.name);
        System.out.println(s2.dept);
        System.out.println(s2.loc);
        System.out.println("==========");
        Sawon s3=new Sawon("박문수","영업부","부산");
        System.out.println(s3.name);
        System.out.println(s3.dept);
        System.out.println(s3.loc);
        
	}

}
