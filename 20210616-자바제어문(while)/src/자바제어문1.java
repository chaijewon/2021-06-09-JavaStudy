import java.io.FileReader;

/*
 *  167 page
 *    while : �ݺ��� (������ �ݺ�Ƚ���� ���� ���)
 *            => ��Ʈ��ũ (�������α׷�) , ������ , �����ͺ��̽� , ���� ����� 
 *               EOF(-1)
 *    1) ���� 
 *       �ʱⰪ   ======= 1
 *       while(���ǽ�)=== �ʱⰪ�� ���� ���� => false�� ����
 *       {  
 *              | true
 *           �ݺ� ���๮�� ==> 3
 *           ������       ==> 4 ==> ������ ���� => 2 ���ǽ�
 *       }
 *                        true
 *       �ʱⰪ ==> ���ǽ� ==========> �ݺ� ���� ���� ======> �������� ���� ����
 *                  | false�� ����                             |
 *                   |                                         |
 *                   =======================================  |
 */  
public class �ڹ����1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        // 1~100���� ��� 
		/*int i=1;
		while(true)// ���ѷ��� 
		{
			System.out.print(i+" ");
			i++;
		}*/
		// ���� �б� => while  
		int i=0;
		FileReader fr=new FileReader("C:\\Users\\SIST\\git\\0609_javaStudy\\20210616-�ڹ����(�ݺ���)\\src\\�ڹ����_�ݺ���5.java");
		while((i=fr.read())!=-1) // -1 ���ϳ� (EOF)
		{
			System.out.print((char)(i));
		}
		fr.close();
	}

}








