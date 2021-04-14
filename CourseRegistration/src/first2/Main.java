package first2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * This class is for test
 */
public class Main {
	/**
	 * This is the main method
	 */
	public static void main(String[] args) throws IOException {
		for (int i = 0; i < 20; i++) {
			double random = (Math.random() * 20 + 1.0);
			if (random < 20.00022 && random >= 20.0) {
				random = 20.0;
			}
			if (random <= 20.0) {
				System.out.println(random);
			}
		}
	}
	
	/**
	 * This method prints out a string
	 * @param str : string
	 * @return : 1
	 */
	public static int print(String str) {
		System.out.println(str);
		return 1;
	}
}
