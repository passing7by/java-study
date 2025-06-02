package sec01.exam04.quiz.quiz01;

import java.util.Objects;

public class Song {
	private String name;
	private String singer;
	
	public Song() {
	
	}
	
	public Song(String name, String singer) {
		this.name = name;
		this.singer = singer;
	}
	
	/*
	@Override
	public int hashCode() {
		return Objects.hash(name, singer);
	}
	
	@Override
	public boolean equals(Object obj) {
		// 동일한 객체인지 체크
		if (this == obj) return true;
		
		// 타입 체크
		// 타입이 다르면 false, 같으면 다음 진행
		if (obj instanceof Song song) {
			if (this.name.equals(song.name) && this.singer.equals(song.singer)) return true;
		}
		return false;
	}
	*/
	
	// hashCode()와 equals() 자동생성
	@Override
	public int hashCode() {
		return Objects.hash(name, singer);
	}
	// Objects, Arrays, Collections 등 -s 컬렉션은 메서드를 제공하는 유틸리티 클래스임
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Song))
			return false;
		Song other = (Song) obj;
		return Objects.equals(name, other.name) && Objects.equals(singer, other.singer);
	}

	@Override
	public String toString() {
		return "{제목=" + name + ", 가수=" + singer + "}";
	}

	
	
}
