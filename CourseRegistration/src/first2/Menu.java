package first2;

import java.util.Scanner;

public class Menu {
	boolean[] subject = new boolean[3]; // 0 : korean, 1 : english, 2 : math
	
	public int printMainMenu() {
		int ret = 0;
		System.out.println("#Menu");
		System.out.println("1. Course List");
		System.out.println("2. My Course");
		Scanner sc = new Scanner(System.in);
		ret = sc.nextInt();
		return ret;
	}
	
	public void printCourseList() {
		int ret = 0;
		System.out.println("#Course List");
		System.out.println("1. Korea");
		System.out.println("2. Math");
		System.out.println("3. English");
		Scanner sc = new Scanner(System.in);
		ret = sc.nextInt();
		subject[ret - 1] = true; 
		printResult(ret);
	}
	
	public void printResult(int num) {
		System.out.println("subject " + num + " is registered!");
	}
}
