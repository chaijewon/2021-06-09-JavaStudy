
public class �ڹ����_���ǹ�3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //char ch=(Math.random())
		//System.out.println((int)'Z'); // 90
		//System.out.println((int)'z'); // 122
		int a=(int)(Math.random()*3);// 0.0*2==> 0.0 , 0.99*2=> 1.9...
		
		char ch=' ';// �ʱ�ȭ 
		if(a==0)
			ch=(char)((Math.random()*26)+65);// �빮��
		if(a==1)
			ch=(char)((Math.random()*26)+97);// �ҹ��� 
		if(a==2)
			ch=(char)((Math.random()*10)+48); // '0' 0 ,'1' ~~~ '9'
		// 0~25�߻�  ==> 65 'A'=> 65 , 'Z'=90  => 0~25+65
		
		//System.out.println(ch);
		//�빮�� ���� ch>='A' && ch<='Z'  &&: ���� ����  (�̰�)
		//�ҹ��� ���� ch>='a' && ch<='z'  ||: ���� �ۿ� �ִ� ��� (�̰ų�) 
		if(ch>='A' && ch<='Z')
			System.out.println(ch+"��(��) �빮�� �Դϴ�");
		if(ch>='a' && ch<='z')
			System.out.println(ch+"��(��) �ҹ��� �Դϴ�");
		if( !((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')))// �빮�ڳ� �ҹ��ڰ� �ƴ� ���
			System.out.println(ch+"��(��) ���ĺ��� �ƴմϴ�");
		
		//System.out.println((char)48);
		
		
	}

}








