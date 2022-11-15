package com.ezen.ex01;

import java.io.IOException;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingEx04 {
	public static void main(String[] args) throws IOException {
		

	}
	public static ArrayList<DataDAO> seoulHotel() {
		ArrayList<DataDAO> list = new ArrayList<>();
		try {
			int k=1;
			for(int i=1; i<=1; i++) {
				Document doc=Jsoup.connect("https://korean.visitseoul.net/hotels?curPage="+i).get();
				Elements poster=doc.select("ul.article-list li.item div.thumb img"); // 썸네일 이미지
				Elements link=doc.select("ul.article-list li.item a"); // 썸네일장소 세부설명 링크
				Elements title=doc.select("ul.article-list li.item div.infor-element span.title"); // 호텔이름
				Elements score=doc.select("div.infor-element-inner span.trip-ico img"); //평점
				Elements review = doc.select("span.trip-text"); //리뷰수
				
				for(int j=0; j<poster.size(); j++) {
					DataDAO dao = new DataDAO();
					try {
					   System.out.println("번호 : "+k);
					   System.out.println(title.get(j).text());
					   System.out.println(poster.get(j).attr("src"));
					   System.out.println(link.get(j).attr("href"));
					   //System.out.println("평점:" + score.get(j).attr("alt"));
					   String reviews = review.get(j).text() ;
		               System.out.println("리뷰수 : " + reviews.split(" ")[0] );
					   System.out.println("평점 : " + score.get(j).attr("src").substring(60,63));
						   
					   Document doc2=Jsoup.connect("https://korean.visitseoul.net"+link.get(j).attr("href")).get(); 
					   Element address=doc2.select("div.detail-map-infor dl dd").get(0); //dd = 호텔 주소
					   Elements images=doc2.select("div.wide-slide div.item"); // 호텔 내부 이미지사진
					   
					   System.out.println("주소:"+address.text());
					   System.out.println();
					   
					   dao.num = k;
					   dao.name = title.get(j).text();
					   dao.imgAddress = poster.get(j).attr("src");
					   dao.link = link.get(j).attr("href");
					   dao.review = Integer.parseInt(reviews.split(" ")[0]);
					   dao.score = Float.parseFloat(score.get(j).attr("src").substring(60,63));
					   dao.address = address.text();
					   
					   
					   k++;
					}catch(Exception e){
						e.printStackTrace();
					}
					list.add(dao);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} // 서울 호텔목록 페이지
		return list;
	}
}
