package com.sist.main;
import java.util.Scanner;

class Reserve_Seat{
    Scanner s = new Scanner(System.in);
 
    String[] sSeat = new String[10];
    String[] aSeat = new String[15];
    String[] bSeat = new String[20];
 
 
    Reserve_Seat(){ //생성자 (초기화)
        int i = 0;
        while(i<20) {
            if (i<10) sSeat[i] = "---";
            if (i<15) aSeat[i] = "---";
            bSeat[i] = "---";
            i++;
        }
    }
 
 
 
    public void show_reserve() { //조회메뉴
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
 
 
 
    public boolean show_oneline(int inputseats) { //지정 라인 좌석만 보여주기
        switch(inputseats) { //사용자 입력값 받은 파라미터
            case 1: //s좌석 보여주기
                System.out.print("S>> ");
                for(int i=0; i<sSeat.length; i++) {
                    System.out.print(sSeat[i] + " ");
                }
                System.out.println();
                return true;
 
            case 2: //a좌석 보여주기
                System.out.print("A>> ");
                for(int i=0; i<aSeat.length; i++) {
                    System.out.print(aSeat[i] + " ");
                }
                System.out.println();
                return true;
 
            case 3: //b좌석 보여주기
                System.out.print("B>> ");
                for(int i=0; i<bSeat.length; i++) {
                    System.out.print(bSeat[i] + " ");
                }
                System.out.println();
                return true;
 
            default : //1~3 사이의 숫자 입력 안했을 경우
                System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
                return false;
        }
 
    }
 
 
 
    public void reservation() { //예약메뉴
        int inputseat = 0;
        String name = "";
        boolean right;
 
        while(true) {
            System.out.print("좌석구분 S<1>, A<2>, B<3> >> ");
            inputseat = s.nextInt();
 
            right = show_oneline(inputseat); //입력한 좌석 보여주기
 
            if(right == false) continue; //다시 좌석 선택
 
 
            System.out.print("이름 >> ");
            name = s.next();
            System.out.print("번호 >> ");
            int seatnum = s.nextInt();
 
            if(inputseat==1 && !sSeat[seatnum-1].equals("---"))
            {
            	System.out.println("이미 예약된 좌석입니다");
            	continue;
            }
            if(inputseat==2 && !aSeat[seatnum-1].equals("---"))
            {
            	System.out.println("이미 예약된 좌석입니다");
            	continue;
            }
            if(inputseat==3 && !bSeat[seatnum-1].equals("---"))
            {
            	System.out.println("이미 예약된 좌석입니다");
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
                System.out.println("없는 좌석번호입니다. 다시 입력해주세요.");
                continue;
            }
            System.out.println();
            return;
        }
 
    }
 
 
    public void del_reserve() { //예약 취소
        int delete = 0;
        boolean right;
        String delname = "";
        int count; //예약 취소 요청한 이름이 없는 이름인지 있는 이름인지 판별
 
        while(true) {
            count = 0; //이 코드가 while 밖에 있으면 count가 계속 쌓여감.
            System.out.print("좌석구분 S<1>, A<2>, B<3> >> ");
            delete = s.nextInt();
 
            right = show_oneline(delete); //입력한 좌석 보여주기
 
            if(right = false) continue; //다시 좌석 선택
 
 
            System.out.print("이름 >> ");
            delname = s.next();
 
            switch(delete) { //예약 취소
                case 1:
                    for(int i=0; i<sSeat.length; i++) {
                        if(sSeat[i].equals(delname)) {
                            sSeat[i] = "---";
                        }
                        else count += 1;
                    }
 
                    if (count == 10) {
                        System.out.println("예약되지 않은 이름입니다. 다시 시도해주세요.");
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
                        System.out.println("예약되지 않은 이름입니다. 다시 시도해주세요.");
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
                        System.out.println("예약되지 않은 이름입니다. 다시 시도해주세요.");
                        continue;
                    }
 
                    break;
            } //switch문
 
            System.out.println();
            return;
        }
 
    }
 
}
 
 
 
//--메인 메뉴--
public class 공연예약 {
    public static void main(String[] args) {
        int menu = 0;
        Scanner scanner = new Scanner(System.in);
        Reserve_Seat rs = new Reserve_Seat();
 
        while(true) {
            System.out.println("************공연 예약 시스템************");
            System.out.println();
            System.out.println("예약<1>, 조회<2>, 취소<3>, 끝내기<4> ");
            System.out.println("===================================");
            System.out.print("어떤 메뉴를 이용하시겠습니까? ");
 
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
                    System.out.println("시스템을 종료합니다.");
                    return;
 
                default:
                    System.out.println("없는 메뉴입니다. 다시 입력해주세요.");
            }
        }
    }
}

