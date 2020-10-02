package omegaup;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class ValuacionPosfija {
	public static final Integer EOF= -1;
	public static void main(String[] args) {
		try (Scanner pen = new Scanner(System.in)) {
			Queue<String> cola= new LinkedList<String>();
			Stack<Integer> pila= new Stack<Integer>();
			String fre= pen.nextLine();
			StringTokenizer tokens = new StringTokenizer(fre);
			while(tokens.hasMoreTokens()){
				cola.add(tokens.nextToken());
			}
			/*while(!cola.isEmpty()) {
				System.out.println(cola.remove());
			}
}*/
			while(!cola.isEmpty()) {
				if(!cola.isEmpty()) {
				String v= cola.remove();
				boolean vera= ver(v.charAt(0));
				if(vera==true) {
					if(!pila.isEmpty()) {
						int g=pila.pop();
						if(!pila.isEmpty()) {
						int f=pila.pop();
						int re=operacion(v.charAt(0),f,g);
						pila.push(re);
						}
					}
				}else {
					pila.push(Integer.parseInt(v));
				}
				}
			}
			if(!pila.isEmpty()) {
			System.out.println(pila.peek());
			}
		}
	}
	public static boolean ver(char x) {
		if(x=='+'||x=='-'||x=='*'||x=='/'||x=='^') {
			return true;
		}else {
			return false;
		}
	}
	public static int operacion(char x, int s, int d) {
		if(x=='+') {
			return s+d;
		}else if(x=='-') {
			return s-d;
		}else if(x=='*') {
			return s*d;
		}else if(x=='/') {
			if(d!=0) {
				return s/d;
			}
		} 
			return (int) Math.pow(s, d);
	}
	
}
