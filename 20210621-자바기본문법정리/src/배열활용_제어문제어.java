import java.util.Scanner;
public class �迭Ȱ��_������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names={"ȫ�浿","��û��","�ڹ���","������","�����",
				       "�̼���","������","��������","�̻�","�Ҽ���"};
		Scanner scan=new Scanner(System.in);
		System.out.print("�̸� �Է�:");
		String name=scan.next();
		boolean bCheck=false; // int k=0; ==> k=1
		for(int i=0;i<names.length;i++)
		{
			if(name.equals(names[i]))
			{
				System.out.println(name+"��(��) "+(i+1)+"��° �����մϴ�");
				bCheck=true;
				break;
			}
			
		}
		if(bCheck==false)
		{
		   System.out.println(name+"��(��) �������� �ʽ��ϴ�!!");
		}

	}

}
