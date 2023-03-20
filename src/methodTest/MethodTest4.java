package methodTest;


public class MethodTest4 {
	
	public static void sayHello(int n){ //원하는 만큼 main에서 출력하도록 매개변수 사용
		for(int i=1; i<=n; i++) {
			System.out.println("뿌잉뿌잉");
		}
		return;
	}
	
	public static void main(String[] args) {

		sayHello(5);
		String title = "자바 프로그래밍";
		System.out.println(title);
		sayHello(3);
		int year = 2023;
		System.out.println(year);
		sayHello(2);
	}

}
