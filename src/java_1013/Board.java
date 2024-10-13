package java_1013;

public class Board {

	// 게시글 번호 bno
	// 글작성자 writer
	// 글내용 content
	
	private int bno;
	private String writer;
	private String content;
	private static Board instance;
	
	
	public static Board getInstance() {
		// 객체반환
		// null 아닐때만 객체 반환하는 유효성 검증
		
		if(instance == null) {
			instance = new Board();			
		}
		
		return instance;
	} 
	
	
	public Board() {
		// TODO Auto-generated constructor stub
	}
	
	public Board(int bno,String writer,String content) {
		this.bno = bno;
		this.writer = writer;
		this.content = content;
	}
	// 매개변수 있는 생성자 
	// 객체 생성시점에 위에 필드 한번에 초기화 해주는거

	// getter / setter 메서드
	
	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getBno() {
		return bno;
	}
	
	
	public String toString(int bno, String writer, String content) {
		
		return "글번호는" + bno  + " 작성자 " + writer + " 내용 " +  content;
	}
	
	
	
	
}
