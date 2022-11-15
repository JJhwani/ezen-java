package com.ezen.ex02;

import java.io.IOException;
import java.util.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Seoul_Hotel {
	static ArrayList<SeoulHotelVO> list = new ArrayList<SeoulHotelVO>();
	
	public static void main(String[] args) {
		Seoul_Hotel sh =  new Seoul_Hotel();
		sh.seoulHotel();
		sh.seoulHotelShow();
	}
	
	public static ArrayList<SeoulHotelVO> seoulHotel(){
		int no;  //번호
		String hotelName; //호텔명
		String imgAddress; // 이미지 주소
		String links; // 링크
		int reviewCnt; //리뷰수
		double gradeCnt; //리뷰평점
		String SeoulAddress;  //주소
		
		try {
			int k=1;
			for(int i=1; i<=1; i++) {
				Document doc=Jsoup.connect("https://korean.visitseoul.net/hotels?curPage="+i).get();
				Elements title=doc.select("ul.article-list li.item div.infor-element span.title"); // 호텔이름
				Elements poster=doc.select("ul.article-list li.item div.thumb img"); // 썸네일 이미지
				Elements link=doc.select("ul.article-list li.item a"); // 썸네일장소 세부설명 링크
				Elements score=doc.select("div.infor-element-inner span.trip-ico img"); //평점
				Elements review = doc.select("span.trip-text"); //리뷰수
				
				for(int j=0; j<poster.size(); j++) {
					try {
						Document doc2=Jsoup.connect("https://korean.visitseoul.net"+link.get(j).attr("href")).get(); 
						Element address=doc2.select("div.detail-map-infor dl dd").get(0); //dd = 호텔 주소
						Elements images=doc2.select("div.wide-slide div.item"); // 호텔 내부 이미지사진
													
						System.out.println("번호:"+k);
						System.out.println(title.get(j).text());
						System.out.println(poster.get(j).attr("src"));
						System.out.println(link.get(j).attr("href"));
						String reviews = review.get(j).text() ;
						System.out.println("리뷰수 : " + reviews.split(" ")[0] );
						System.out.println("평점 : " + score.get(j).attr("src").substring(60,63));
						System.out.println("주소:"+address.text());
						System.out.println();
						
						no = k;
						hotelName = title.get(j).text();
						imgAddress = poster.get(j).attr("src");
						links = link.get(j).attr("href");
						reviewCnt = Integer.parseInt(reviews.split(" ")[0]) ; //문자를 정수형
						gradeCnt = Double.parseDouble(score.get(j).attr("src").substring(60,63));
						SeoulAddress = address.text();						  
						
						k++;
						
						SeoulHotelVO shVO = new SeoulHotelVO();
						 
						shVO.setNo(no);
						shVO.setHotelName(hotelName);
						shVO.setImgAddress(imgAddress);
						shVO.setLinks(links);
						shVO.setReviewCnt(reviewCnt);
						shVO.setGradeCnt(gradeCnt);
						shVO.setSeoulAddress(SeoulAddress);
						  
						list.add(shVO);
						  
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} // 서울 호텔목록 페이지		
		return list;
	}
		
	public void seoulHotelShow() {
		System.out.println("--------------------------------");
		for( SeoulHotelVO sh : list) {
			System.out.println("번호 :  " + sh.getNo());
			System.out.println("호델명 :  " + sh.getHotelName());
			//System.out.println("이미지 :  " + sh.getImgAddress());
			//System.out.println("링크 :  " + sh.getLinks());
			System.out.println("리뷰수 :  " + sh.getReviewCnt());
			System.out.println("리뷰평점 :  " + sh.getGradeCnt());
			System.out.println("주소  :  " + sh.getSeoulAddress());
			System.out.println("--------------------------------");
		}		
	}
}
