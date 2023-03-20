package methodTest;
//다음과 같이 몇단을 출력할지 매개변수로 전달받아 
//해당하는 구구단을 출력하는 메소드를 정의 해 봅니다.

public class MethodTest5 {
	
	public static void gugudan(int dan) {
		for(int i=1; i<=9; i++) {
			int result = dan*i;
			System.out.println(dan +"*"+ i +"="+ result);
		}
	}
	
	
	public static void main(String[] args) {
		gugudan(7);
		gugudan(8);
		gugudan(9);
		
	}

}
