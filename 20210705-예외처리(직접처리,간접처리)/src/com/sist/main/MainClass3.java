package com.sist.main;
/*
 *   => �ڹٿ��� �����ϴ� error�޼��� 
 *      getMessage() : ���ڿ��θ� ǥ�� 
 *      printStackTrace() : ����Ǵ� ó�� ������ �����ش�
 *   => ��Ƽ catch
 *      catch(NumberFormatException | ArrayIndexOutOfBoundsException e) => ���� ó�� 
 *      => ����ó���� �ѹ��� ó�� �� ��쿡�� ���� ū ���� ó�� Ŭ���� �̿� 
 *         catch(Exception e) => ����ó�� ��ü�� ���� ���� 
 *         catch(Throwable e) => Exception��ü,Error��ü�� ���� �� �� �ִ�
 *         
 *     A.java  =========== A.class ========== ����
 *              javac                 java
 *              =====                 =====
 *              �����Ͻ�                ��Ÿ�� (����ø��� ó�� ==> �ʿ��Ҷ� ����ó��)
 *              => �ݵ�� ����ó���� �Ѵ�
 *              => �����Ͻÿ� �����Ϸ��� ����(����ó���� ����ߴ��� Ȯ��)
 *              => ��Ʈ��ũ , ������ , IO , ����Ŭ ���� 
 *                                 =============== �� 
 */
public class MainClass3 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		int a=10;
        int b=3;
        int c=a/b;// ���� �߻� ==> catch (catch������ ����)
        System.out.println("c="+c);// ������ ���ϴ� ����
        /*try
        {
            int a=10;
            int b=0;
            int c=a/b;// ���� �߻� ==> catch (catch������ ����)
            System.out.println("c="+c);// ������ ���ϴ� ����
            
        }catch(ArithmeticException e)
        {
        	//System.out.println(e.getMessage());
        	e.printStackTrace();
        }*/
	}

}
