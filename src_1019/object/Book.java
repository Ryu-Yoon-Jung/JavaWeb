package object;

import java.util.Objects;

// toString , equals 둘다 오버라이딩 해서 main에서 확인

public class Book {
	private String title; // 책 제목 저장하는 필드
	private String author; // 책 저자 저장하는 필드
	
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(title, other.title);
	}
	
}
