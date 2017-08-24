package jp.co.rakus.git_branch_test;

public class Test {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 3;
		
		int answer = addCalc(num1, num2);
		
		System.out.println(answer);
		System.out.println(multiCalc(num1, num2));
	}
	
	static int addCalc(int num1, int num2){
		return num1 + num2;
	}
	
	static int multiCalc(int num1, int num2){
		return num1 * num2;
	}

}
