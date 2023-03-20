package methodTest;


public class MethodTest3 {
	
	public static void sayHello(String name, int n){ 
		for(int i=1; i<=n; i++) {
			System.out.println(name + "아(야) 안녕");
		}
		return;
	}
	
	public static void main(String[] args) {

		sayHello("철수",1);
		String title = "자바 프로그래밍";
		System.out.println(title);
		sayHello("영희",3);
		int year = 2023;
		System.out.println(year);
		sayHello("동완",2);
	}

}
