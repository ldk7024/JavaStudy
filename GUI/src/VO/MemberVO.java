package VO;

public class MemberVO {

	// 필드
	private String id;
	private String pw;
	private String name;
	private String gender;
	private String hobby;
	
	// 생성자
	public MemberVO(String id, String pw, String name, String gender, String hobby) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.gender = gender;
		this.hobby = hobby;
	}
	
	// GETTER
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public String getHobby() {
		return hobby;
	}
	
}
