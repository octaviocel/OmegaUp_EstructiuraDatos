package omegaup;

import java.util.Scanner;

public class funcionRara {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner pen = new Scanner(System.in)) {
			int s= pen.nextInt();
			if(s<=5) {
			for(int i=0;i<s;i++) {
				int x= pen.nextInt();
				int y= pen.nextInt();
				if(x<=10000&&y<=10000) {
				int result= recursivo(x,y);
				System.out.println(result);
				}
			}	
			}
		}
	}

	public static int recursivo(int x, int y) {
		if(y<=2) {
			return x+y;
		}
		return x+recursivo(x,y-1)+(5*recursivo(x,y-2));
		
	}
}
