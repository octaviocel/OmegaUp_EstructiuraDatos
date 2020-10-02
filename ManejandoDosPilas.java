package omegaup;

import java.util.Scanner;
import java.util.Stack;

public class ManejandoDosPilas {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner pen = new Scanner(System.in)) {
			Stack<Integer> pila1= new Stack<Integer>();
			Stack<Integer> pila2= new Stack<Integer>();
			int t= pen.nextInt();
			for(int i=0;i<t;i++) {
				int instru= pen.nextInt();
				if(instru==1) {
					int pil=pen.nextInt();
					if(pil==1) {
						pila1.push(pen.nextInt());
					}else if(pil==2) {
						pila2.push(pen.nextInt());
					}
				}else if(instru==2) {
					int de= pen.nextInt();
					if(de==1) {
						int saca=pen.nextInt();
						while(saca!=0) {
							if(!pila1.isEmpty()) {
							pila2.push(pila1.pop());
							}
							saca--;
						}
					}else if(de==2) {
						int saca=pen.nextInt();
						while(saca!=0) {
							if(!pila2.isEmpty()) {
							pila1.push(pila2.pop());
							}
							saca--;
						}
					}
				}
				
			}
			while(!pila1.isEmpty()) {
				System.out.print(pila1.pop()+" ");
				}
			System.out.println();
			while(!pila2.isEmpty()) {
				System.out.print(pila2.pop()+" ");
			}
		}
	}

}
