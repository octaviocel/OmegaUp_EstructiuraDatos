package omegaup;

import java.util.Scanner;
public class RecurriendoSanaDistancia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner pen=new Scanner(System.in);
		int k= pen.nextInt();
		if(k==1) {
			System.out.println(1);
		}else {
		int acu= k, fin=k+1;
		while(k!=0) {
			acu=acu*(k-1);
			fin=fin+acu;
			k--;
		}
		System.out.println(fin);
		}
	
	}
	
}
