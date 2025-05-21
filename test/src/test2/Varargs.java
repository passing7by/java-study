package test2;

public class Varargs {
//	void sum(String...str, String s) {
//        for(String a:str)
//            System.out.print(a+s);
//    }
//	void sum(String s, String...str) {
//		for(String a:str)
//			System.out.print(a+s);
//	}
    void sum(String...str) {
        for(String a:str)
            System.out.print(a);
    }
}
