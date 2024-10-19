package board;

import java.util.Objects;

// 게시글 클래스 (객체 생성 1개당 게시글 1개)
public class Post {
	private static int count = 0; // 게시글 번호
	private int id; // 게시글 고유 번호 
	private String title; // 게시글 제목
	private String content; // 게시글 내용
	
	// 매개변수 있는 생성자
	public Post(String title, String content) {
		this.id = count++;
		this.title = title;
		this.content = content;
	}

	// getter/ setter
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Post.count = count;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
 
	// equals메서드 오버라이드
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		return Objects.equals(content, other.content) && id == other.id && Objects.equals(title, other.title);
	}

	// toString 오버라이딩
	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", content=" + content + "]";
	}
	
}
