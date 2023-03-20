package methodTest;


public class MethodTest1 {
	
	public static void sayHello(){
		System.out.println("뿌잉뿌잉");
		System.out.println("뿌잉뿌잉");
		System.out.println("뿌잉뿌잉");
		return;
	}
	
	public static void main(String[] args) {

		sayHello();
		String title = "자바 프로그래밍";
		System.out.println(title);
		sayHello();
		int year = 2023;
		System.out.println(year);
		sayHello();
	}

}
