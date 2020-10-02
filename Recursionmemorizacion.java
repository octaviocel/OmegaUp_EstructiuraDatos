package omegaup;

import java.util.Scanner;

public class Recursionmemorizacion {
	private static int t=0;
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner pen = new Scanner(System.in)) {
			int a,b,c;
			a=pen.nextInt();
			b=pen.nextInt();
			c=pen.nextInt();
			if(a<=100&&b<=100&&c<=100) {
			int aux=recur(a,b,c);
			System.out.println(aux);
			}
		}
		System.out.println(t);
		
	}
	public static int recur(int i, int j, int k) {
			 t++;
		if(i<=3||j<=3||k<=3) {			
			return i+(2*j)+(3*k);
		}else if((i+j+k)==100) {
			return 0;
		}else {
			return recur(i-1,j-1,k-1)+recur(i,j-3,k-3)+recur(i/2,j,k);
		}
	}

}
