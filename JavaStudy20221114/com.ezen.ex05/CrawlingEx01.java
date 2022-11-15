package com.ezen.ex05;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingEx01 {
	public static void main(String[] args) {
		String url = "https://finance.naver.com/item/main.naver?code=005930";
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
			System.out.println(doc);
		} catch(Exception e) {
			e.printStackTrace();
		}
		Elements elements = doc.select("div.wrap_company");
		//System.out.println(elements);
		Element element = elements.get(0);
		System.out.println(element);
		
		String name = element.select("h2").text();
		
		String id = element.select("span.code").text();
		System.out.println(name+"("+id+") : ");
		
		elements = doc.select("div#fav_kospi");
		System.out.println(elements);
		
		Elements el = element.select("th.no1");
		System.out.println(el.select("a").get(0).text());
	}

}
