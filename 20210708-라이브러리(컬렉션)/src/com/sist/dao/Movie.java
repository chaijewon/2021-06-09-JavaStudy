package com.sist.dao;
/*
 *  MNO      NOT NULL NUMBER        
TITLE    NOT NULL VARCHAR2(500) 
POSTER   NOT NULL VARCHAR2(260) 
GENRE    NOT NULL VARCHAR2(300) 
DIRECTOR          VARCHAR2(200) 
ACTOR             VARCHAR2(500) 
STORY    NOT NULL CLOB          
KEY               VARCHAR2(50) 
 */
// 1. 오라클 , 2. 파일 , 3. 웹에서 실시간 읽기 
public class Movie {
    private int mno; // 영화 고유 번호
    private String title;
    private String genre;
    private String director;
    private String actor;
    private String story;
    private String key; // 동영상 (youtube)
   // 읽기 / 쓰기 ==> 클래스로 사용자 정의 데이터형 ==> 반드시 (읽기/쓰기,데이터 은닉화) => 캡슐화
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	   
}
