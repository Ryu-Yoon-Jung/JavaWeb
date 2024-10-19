package board;

import java.util.ArrayList;

// 게시판 관리하는 클래스(=여러개의 게시글을 관리 = 게시글 추가&삭제 기능담당)
public class Board {
	// ArrayList 타입 
	private ArrayList<Post> list;

	// 생성자 1 (둘중 아무거나 편한걸로)
	public Board(ArrayList<Post> list) {
		this.list = list;
	}
	
	// 생성자 2 (둘중 아무거나 편한걸로)
	public Board() {
		list = new ArrayList<>(); 
	}
	
	// 게시글 추가하는 add() 메서드
	// title, content 값 받아서 Post 객체 생성 
	// 생성한 객체를 ArrayList에 add()하여 추가
	public void addPost(String title, String content) {
		Post post = new Post(title, content);
		list.add(post);
		
		System.out.println("게시글 등록 성공");
	}
	
	// 게시글 보여주는 viewPosts() 메서드
	// list 객체가 null 이 아닐때만 객체출력
	public void viewPosts() {
		if(list.isEmpty()) {
			System.out.println("게시글 없음");
			return;
		}
		
		for (Post post : list) {
			System.out.println(post);
		}
	}
	
	// 게시글 삭제하는 deletePost() 메서드
	// 특정 게시글 id 값으로 특정 게시글 삭제
	public void deletePost(int id) {
		Post target = null;
		
		// list 순회하면서 id값이 같은지 확인하고 
		// id값 같은 글만 삭제
		for (Post post : list) {
			if(post.getId() == id) {
				target = post;
				break;
			}
		}
		
		if(target != null) {
			list.remove(target);
			System.out.println("글 삭제 완료");
		}else {
			System.out.println("없는 게시글 입니다");
		}
		
	}
	
}
