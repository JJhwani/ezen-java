package com.ezen.ex02;

public class SeoulHotelVO {
	int no;  //번호
	String hotelName; //호텔명
	String imgAddress; //이미지 주소
	String links; //링크
	int reviewCnt; //리뷰수
	double gradeCnt; //리뷰평점
	String SeoulAddress;  //주소
	
	public SeoulHotelVO() { }

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getImgAddress() {
		return imgAddress;
	}

	public void setImgAddress(String imgAddress) {
		this.imgAddress = imgAddress;
	}

	public String getLinks() {
		return links;
	}

	public void setLinks(String links) {
		this.links = links;
	}

	public int getReviewCnt() {
		return reviewCnt;
	}

	public void setReviewCnt(int reviewCnt) {
		this.reviewCnt = reviewCnt;
	}

	public double getGradeCnt() {
		return gradeCnt;
	}

	public void setGradeCnt(double gradeCnt) {
		this.gradeCnt = gradeCnt;
	}

	public String getSeoulAddress() {
		return SeoulAddress;
	}

	public void setSeoulAddress(String seoulAddress) {
		SeoulAddress = seoulAddress;
	}

	
}