package omegaup;

import java.util.*;

public class Parentesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner pen = new Scanner(System.in);
		int repeticiones= pen.nextInt();
		for(int i=0;i<repeticiones;i++) {
			String c= pen.next();
			boolean fin= verificaParentesis(c);
			if(fin==true) {
				System.out.println("SI");
			}else {
				System.out.println("NO");
			}
			
		}
			
		
		
	}
    public static boolean verificaParentesis(String cadena)  {
        Stack<String> pila = new Stack<String>();       
        	int i = 0;
            while (i<cadena.length()) {  
                if(cadena.charAt(i)=='(') {
                	pila.push("(");
                	}                                
                else if  (cadena.charAt(i)==')') { 
                            if (!pila.empty()){ 
                            	pila.pop(); 
                            	} 
                            else { 
                            	pila.push(")");
                            	break; 
                            	} 
                }
                i++;
            }
            if(pila.empty()){ 
            	return true; 
            	} else { 
            		return false; 
            		}
    }

}
