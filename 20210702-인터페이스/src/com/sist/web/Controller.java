package com.sist.web;
/*
 *   �޼ҵ忡 �Ű����� 
 *          ======
 *          �Ϲ� ���� (�⺻��) : Call by Value => �ٸ� �޸𸮿� ���� ���� (����)
 *          ���� ���� (�迭 , Ŭ����) : �ּҸ� ���� (��ü �ּҸ� ������ �ش�) => Call by Reference
 *          �޼ҵ� ó�� ==> Ŭ������ �Ű����� , ������ (Ŭ���� ��ü�� ��������)
 *                                             ======
 *                                             ����� ���� �������� (������,�Ǽ���)
 */
public interface Controller {
     public String handlerRequest(HttpRequest req,HttpResponse res);
     // ��ü ���� 
}
