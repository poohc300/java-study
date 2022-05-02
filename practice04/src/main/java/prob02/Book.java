package prob02;

public class Book {

	private int bookNo;
	private String title;
	private String author;
	private int stateCode;
	
	public Book(int bookNo, String title, String author) {
		// TODO Auto-generated constructor stub
		this.stateCode = 1;
		
	}

	
	
	public int getBookNo() {
		return bookNo;
	}



	public String getTitle() {
		return title;
	}

	public int getStateCode() {
		return stateCode;
	}

	public String getAuthor() {
		return author;
	}



	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public void rent() {
		this.stateCode = 0;
		System.out.println(getTitle()+"이(가) 대여 됐습니다");
	}
	
	public void print() {
		String state = "";
		if(getStateCode() == 1) {
			state = "재고있음";
		}
		else if(getStateCode() == 0) {
			state = "대여중";
		}
		System.out.println("책 제목:"+getTitle()+", 작가:"+getAuthor()+", 대여 유무:"+state);
	}
	
}
