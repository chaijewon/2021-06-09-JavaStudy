
public class ����Ǯ��_���� {
	// ���� ó��
    static boolean isYear(int year)
    {
    	if((year%4==0 && year%100!=0)||(year%400==0)) // ���� ���� 
    		  return true;
    	else
    		  return false;
    }
    // ��� 
    static void print()
    {
    	int year=�ڹٸ޼ҵ�����.input("�⵵");// ���뼺 
    	boolean check=isYear(year);
    	if(check)
    		System.out.println(year+"�⵵�� �����Դϴ�");
    	else
    		System.out.println(year+"�⵵�� ������ �ƴմϴ�");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        print();
	}

}
