
public class bookdata {
private String title;
private int price;
private String writer ;
public bookdata(String title, int price, String writer) {
	super();         // 최상위 객체인 object를 가져온다는 의미
	this.title = title;
	this.price = price;
	this.writer = writer;
	
}                                                                        
public String getTitle() {
	return title;
}
public int getPrice() {
	return price;
}
public String getWriter() {
	return writer;
}

}
