// 참조 (별칭)
class Student
{
	String name;
	int hakbun;
	String sex;
	String subject;
}
/*
 *   s=Student@41a4555e
     s=Student@3830f1c0
     
     int a=10;
     a=20;
 */
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student s=new Student(); // 메모리에 저장이 안된 상태 => s=null
        /*s.hakbun=100;//41a4555e
        System.out.println("s="+s);
        s=new Student();//3830f1c0
        System.out.println("s="+s);
        System.out.println(s.hakbun);
        s.hakbun=200;
        System.out.println(s.hakbun);
        s=new Student();
        System.out.println(s.hakbun);*/
        s.hakbun=100;
        Student s1=s; // 참조(별칭) ==> s==s1=> 같은 메모리 공간을 사용 
        System.out.println(s1.hakbun);//100
        s1.name="홍길동";
        System.out.println(s.name);
	}

}






