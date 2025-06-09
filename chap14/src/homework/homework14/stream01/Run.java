package homework.homework14.stream01;

public class Run {
	public static void main(String[] args) {
		String song = "나비야, 나비야 이리 날아오너라"
				+ "\n노랑나비, 흰 나비 춤을 추며 오너라"
				+"\n봄바람에 꽃잎도 방긋방긋 웃으며"
				+ "\n참새도 짹짹짹 노래하며 춤춘다";
		
		Practice p = new Practice();
		
		System.out.println(p.method1(song));
		System.out.println(p.method2(song));
	}
}
