package pl.javastart.first;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test {
	
	static int a = 10;
	static int b = 3;
	static int c = 4;
	static int d[] = new int[10];

	public static void main(String[] args) {
	
		int a = 10;
		int b = 0;
		int c[] = new int[10];
		
		while(test(b)) {
			
			System.out.println(d[b++]);
			
					
		}
		
		
		
//		System.out.println(d[9]);
		
	}
	
	public static int timeConsumingTransformation(int number) {
	    try {
	        Thread.sleep(100);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    return number;
	}
	
	public static boolean test(int i) {
		
		d[i] = i;
		
		a--;
		
		System.out.println("test");
		
		return a>0;
		
	}

	
}