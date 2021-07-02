package com.sist.main;
import java.util.Scanner;

class Reserve_Seat{
    Scanner s = new Scanner(System.in);
 
    String[] sSeat = new String[10];
    String[] aSeat = new String[15];
    String[] bSeat = new String[20];
 
 
    Reserve_Seat(){ //������ (�ʱ�ȭ)
        int i = 0;
        while(i<20) {
            if (i<10) sSeat[i] = "---";
            if (i<15) aSeat[i] = "---";
            bSeat[i] = "---";
            i++;
        }
    }
 
 
 
    public void show_reserve() { //��ȸ�޴�
        System.out.print("S>> ");
        for(int i=0; i<sSeat.length; i++) {
            System.out.print(sSeat[i] + " ");
        }
 
        System.out.println();
 
        System.out.print("A>> ");
        for(int i=0; i<aSeat.length; i++) {
            System.out.print(aSeat[i] + " ");
        }
 
        System.out.println();
 
        System.out.print("B>> ");
        for(int i=0; i<bSeat.length; i++) {
            System.out.print(bSeat[i] + " ");
        }
 
        System.out.println();
    }
 
 
 
    public boolean show_oneline(int inputseats) { //���� ���� �¼��� �����ֱ�
        switch(inputseats) { //����� �Է°� ���� �Ķ����
            case 1: //s�¼� �����ֱ�
                System.out.print("S>> ");
                for(int i=0; i<sSeat.length; i++) {
                    System.out.print(sSeat[i] + " ");
                }
                System.out.println();
                return true;
 
            case 2: //a�¼� �����ֱ�
                System.out.print("A>> ");
                for(int i=0; i<aSeat.length; i++) {
                    System.out.print(aSeat[i] + " ");
                }
                System.out.println();
                return true;
 
            case 3: //b�¼� �����ֱ�
                System.out.print("B>> ");
                for(int i=0; i<bSeat.length; i++) {
                    System.out.print(bSeat[i] + " ");
                }
                System.out.println();
                return true;
 
            default : //1~3 ������ ���� �Է� ������ ���
                System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���.");
                return false;
        }
 
    }
 
 
 
    public void reservation() { //����޴�
        int inputseat = 0;
        String name = "";
        boolean right;
 
        while(true) {
            System.out.print("�¼����� S<1>, A<2>, B<3> >> ");
            inputseat = s.nextInt();
 
            right = show_oneline(inputseat); //�Է��� �¼� �����ֱ�
 
            if(right == false) continue; //�ٽ� �¼� ����
 
 
            System.out.print("�̸� >> ");
            name = s.next();
            System.out.print("��ȣ >> ");
            int seatnum = s.nextInt();
 
            if(inputseat==1 && !sSeat[seatnum-1].equals("---"))
            {
            	System.out.println("�̹� ����� �¼��Դϴ�");
            	continue;
            }
            if(inputseat==2 && !aSeat[seatnum-1].equals("---"))
            {
            	System.out.println("�̹� ����� �¼��Դϴ�");
            	continue;
            }
            if(inputseat==3 && !bSeat[seatnum-1].equals("---"))
            {
            	System.out.println("�̹� ����� �¼��Դϴ�");
            	continue;
            }
            
            try {
                switch(inputseat) {
                    case 1:
                        sSeat[seatnum-1] = name;
                        break;
                    case 2:
                        aSeat[seatnum-1] = name;
                        break;
                    case 3:
                        bSeat[seatnum-1] = name;
                        break;
                }
 
            }
            catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("���� �¼���ȣ�Դϴ�. �ٽ� �Է����ּ���.");
                continue;
            }
            System.out.println();
            return;
        }
 
    }
 
 
    public void del_reserve() { //���� ���
        int delete = 0;
        boolean right;
        String delname = "";
        int count; //���� ��� ��û�� �̸��� ���� �̸����� �ִ� �̸����� �Ǻ�
 
        while(true) {
            count = 0; //�� �ڵ尡 while �ۿ� ������ count�� ��� �׿���.
            System.out.print("�¼����� S<1>, A<2>, B<3> >> ");
            delete = s.nextInt();
 
            right = show_oneline(delete); //�Է��� �¼� �����ֱ�
 
            if(right = false) continue; //�ٽ� �¼� ����
 
 
            System.out.print("�̸� >> ");
            delname = s.next();
 
            switch(delete) { //���� ���
                case 1:
                    for(int i=0; i<sSeat.length; i++) {
                        if(sSeat[i].equals(delname)) {
                            sSeat[i] = "---";
                        }
                        else count += 1;
                    }
 
                    if (count == 10) {
                        System.out.println("������� ���� �̸��Դϴ�. �ٽ� �õ����ּ���.");
                        continue;
                    }
                    break;
 
 
                case 2:
                    for(int i=0; i<aSeat.length; i++) {
                        if(aSeat[i].equals(delname))
                            aSeat[i] = "---";
                        else count += 1;
                    }
 
                    if (count == 15) {
                        System.out.println("������� ���� �̸��Դϴ�. �ٽ� �õ����ּ���.");
                        continue;
                    }
 
                    break;
 
 
                case 3:
                    for(int i=0; i<bSeat.length; i++) {
                        if(bSeat[i].equals(delname))
                            bSeat[i] = "---";
                        else count += 1;
                    }
 
                    if (count == 20) {
                        System.out.println("������� ���� �̸��Դϴ�. �ٽ� �õ����ּ���.");
                        continue;
                    }
 
                    break;
            } //switch��
 
            System.out.println();
            return;
        }
 
    }
 
}
 
 
 
//--���� �޴�--
public class �������� {
    public static void main(String[] args) {
        int menu = 0;
        Scanner scanner = new Scanner(System.in);
        Reserve_Seat rs = new Reserve_Seat();
 
        while(true) {
            System.out.println("************���� ���� �ý���************");
            System.out.println();
            System.out.println("����<1>, ��ȸ<2>, ���<3>, ������<4> ");
            System.out.println("===================================");
            System.out.print("� �޴��� �̿��Ͻðڽ��ϱ�? ");
 
            menu = scanner.nextInt();
 
            switch(menu) {
                case 1 :
                    rs.reservation();
                    break;
                case 2:
                    rs.show_reserve();
                    break;
                case 3:
                    rs.del_reserve();
                    break;
                case 4:
                    System.out.println("�ý����� �����մϴ�.");
                    return;
 
                default:
                    System.out.println("���� �޴��Դϴ�. �ٽ� �Է����ּ���.");
            }
        }
    }
}

