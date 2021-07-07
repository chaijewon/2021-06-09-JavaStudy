package com.sist.lang;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

class FoodHouse
{
	// �ս�ȭ 
	private int rank;
	private String name;
	private String address;
	private double score;
	private String review;
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	
}
/*
 *   <figcaption>
                      <div class="info">
                        <div class="wannago_wrap">
                          <button class="btn-type-icon favorite wannago_btn "
                                  data-restaurant_uuid="13357"
                                  data-action_id="">
                          </button>
                          <p class="wannago_txt">����ʹ� </p>
                        </div>
                        <span class="title ">
                          <a href="/restaurants/aeO_cG35KO"
                             onclick="trackEvent('CLICK_RESTAURANT', {&quot;position&quot;:0,&quot;restaurant_key&quot;:&quot;aeO_cG35KO&quot;})">
                            1.<h3> �н�Ʈ����Ƽũ</h3>
                          </a>
                        </span>
                        <strong class="point  ">
                          <span>4.7 </span>
                        </strong>
                        <p class="etc ">����Ư���� �߱� ��ȣ�� 249 ����Ŷ�ȣ�� 1F</p>
                      </div>
                    </figcaption>
                  </figure>

                    <div class="review-content no-bottom">
                      <figure class="user">
                        <div class="thumb lazy"
                             data-original="https://s3-ap-northeast-1.amazonaws.com/img.prod.mp/9239_1447128966860?fit=around|56:56&amp;crop=56:56;*,*&amp;output-format=jpg&amp;output-quality=80"
                             data-error="https://mp-seoul-image-production-s3.mangoplate.com/web/resources/jmcmlp180qwkp1jj.png?fit=around|*:*&amp;crop=*:*;*,*&amp;output-format=jpg&amp;output-quality=80">
                        </div>
                        <figcaption class="">
                          ������
                        </figcaption>
                      </figure>
                      <p class="short_review " onclick="trackEvent('CLICK_FEATURED_REVIEW')" data-restaurant_key="aeO_cG35KO" data-is_long_reivew="
                        true
                        ">
                          �� ������ �ܸ��� ���̽ó���.. ���� �ִ� ���� ȲȦ�ѵ� ������ ���̻��̿��� ������ ���� ����ϴ�Ф� �۳⿡ �԰� �;��µ� ������ ���İ�����...
                      </p>

                      <p class="long_review ">
                        �� ������ �ܸ��� ���̽ó���.. ���� �ִ� ���� ȲȦ�ѵ� ������ ���̻��̿��� ������ ���� ����ϴ�Ф� �۳⿡ �԰� �;��µ� ������ ���İ����� �� �Ծ��ٴ� ���� �翬.. ���ش� ���� �ʰ� ���� ã�ư����ϴٿ䤾���� �׷��� ���ͺ��ٴ� ������ �� ���ִٴ� ��Ⱑ ���Ƽ� ���� �� ��븦 �ؼ� �׷���.. �����ʱ���!!!!!!!!!!! ���Ϳ� �̷��� ���� ���� �ö󰡴°� ���� �˴ϱ�Ф�
                      </p>

                        <span class="review_more_btn" onclick="trackEvent('CLICK_MORE_REVIEW', {&quot;position&quot;:0,&quot;restaurant_key&quot;:&quot;aeO_cG35KO&quot;})">������</span>
                    </div>
 */
public class ����Ŭ�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        FoodHouse[] fh=new FoodHouse[10];
        try
        {
        	Document doc=Jsoup.connect("https://www.mangoplate.com/top_lists/2849_fruitdessert").get();
        	//System.out.println(doc);
        	// <span> => �±� => �ڹ�(Element)
        	Elements span=doc.select("span.title");
        	Elements strong=doc.select("strong.point");
        	Elements addr=doc.select("p.etc");
        	Elements review=doc.select("p.short_review");
        	/*
        	 *      1. �н�Ʈ����Ƽũ
					2. �����ýõ���Ʈ
					3. �����̺귯��
					4. ����
					5. ��������ũ
					6. 10��19��
					7. �ķѾض���
					8. ��Ʈ���Ʈ
					9. �����̻굵
					10. ������ȫī��
        	 */
        	for(int i=0;i<10;i++)
        	{
        		//System.out.println(span.get(i).text());
        		String etc=span.get(i).text();
        		String rank=etc.substring(0,etc.indexOf("."));// .�տ��� 
        		String name=etc.substring(etc.indexOf(".")+1);// .�ڿ��� 
        		  //etc.replaceAll("[^0-9]", "");
        		//System.out.println(rank);
        		// rank�� ������ ����
        		int k=Integer.parseInt(rank); 
        		System.out.println(name.trim());
        		System.out.println(Double.parseDouble(strong.get(i).text()));
        		// strong.get(i).text() => String
        		// Double.parseDouble(strong.get(i).text()) => double
        		System.out.println(addr.get(i).text());
        		System.out.println(review.get(i).text());
        		System.out.println("===========================================");
        		// �������� ���� 
        		// WrapperŬ���� => String�� �ش� ������������ ���� �ַ� ��� 
        		/*
        		 *   parseInt()  <=====>  valueOf() : �ڹ�=>�������� ���� 
        		 *   parseDouble() <=====> valueOf()
        		 *   parseLong()  <=======> valueOf()
        		 *   parseBoolean() <======> valueOf()
        		 *   
        		 *   String hit="1"
        		 *     => hit+=1 ===> "111111111111"
        		 *   int hit=1;
        		 *     => hit+=1 ==> 2
        		 */
        	}
        }catch(Exception ex)
        {
        	ex.printStackTrace();//���� ó�� 
        }
	}

}












