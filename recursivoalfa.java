package omegaup;

import java.util.Scanner;

public class recursivoalfa {
	public static void main(String[] args) {
		try (Scanner pen = new Scanner(System.in)) {
			int x=  pen.nextInt();
			if((x<=160)&&(x>=1)) {
				System.out.println(recursivo(x));
			}
		}
	}
	
public static int recursivo(int i) {
	if(i<50) {
		return 2;
	}else {
		return recursivo(i-1)+(recursivo(i-5)*2);
		
	}
}
}