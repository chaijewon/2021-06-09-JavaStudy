import java.io.FileReader;

/*
 *  167 page
 *    while : 반복문 (지정된 반복횟수가 없는 경우)
 *            => 네트워크 (서버프로그램) , 스레드 , 데이터베이스 , 파일 입출력 
 *               EOF(-1)
 *    1) 형식 
 *       초기값   ======= 1
 *       while(조건식)=== 초기값에 대한 조건 => false면 종료
 *       {  
 *              | true
 *           반복 실행문장 ==> 3
 *           증가식       ==> 4 ==> 증가된 값을 => 2 조건식
 *       }
 *                        true
 *       초기값 ==> 조건식 ==========> 반복 문장 수행 ======> 증가식을 통해 증가
 *                  | false면 종료                             |
 *                   |                                         |
 *                   =======================================  |
 */  
public class 자바제어문1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        // 1~100까지 출력 
		/*int i=1;
		while(true)// 무한루프 
		{
			System.out.print(i+" ");
			i++;
		}*/
		// 파일 읽기 => while  
		int i=0;
		FileReader fr=new FileReader("C:\\Users\\SIST\\git\\0609_javaStudy\\20210616-자바제어문(반복문)\\src\\자바제어문_반복문5.java");
		while((i=fr.read())!=-1) // -1 파일끝 (EOF)
		{
			System.out.print((char)(i));
		}
		fr.close();
	}

}








