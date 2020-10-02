package omegaup;


import java.io.IOException;

import java.util.Scanner;



public class TiendadeDonAlberto {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Lista lis= new Lista();

			Scanner br=new Scanner(System.in);
			for(int i=0;i<5;i++) {
				int articulos= br.nextInt();
				if(articulos<=100) {
				while(articulos!=0) {
					int articulo=br.nextInt();
					int cuanto= br.nextInt();
					if(articulo<=10000&&cuanto<=1000000) {
					lis.insertar(articulo, cuanto);
					}
					articulos--;
				}
				}
			}
		lis.simplifica();
		lis.recorrer();
	}

}
class Nod{
	int articulo;
	int veces;
	Nod sig;
}
class Lista {
	Nod inicio=null;
    
	public void insertar(int c,int e){
        Nod nuevo = new Nod();
        nuevo.articulo = c;
        nuevo.veces = e;
        
        if(inicio != null){
            nuevo.sig = inicio;
        }
        inicio = nuevo;
    }
    public void simplifica() {
    	int p=0;
    	Lista salvador= new Lista();
    	if(inicio!=null) {
    	Nod aux = inicio;
    	while (aux!=null) { 
    			if(p<aux.articulo) { 		
    				p = aux.articulo;
    			}
             aux = aux.sig;
         }
    	 }
    	if(inicio!=null) {	
	    	while(p!=0) {
	    		Nod aux1=inicio;
	    		int aco=0;
	    		
	    		while(aux1!=null) {
	    			if(aux1.articulo==p) {
	    				aco=aco+aux1.veces;
	    			}
	    			aux1=aux1.sig;
	    		}
	    		
	    		//System.out.println(p);
	    		Nod temp= new Nod();
	    		temp.articulo=p;
	    		//System.out.println(aco);
	    		temp.veces=aco;
	    		if(temp.veces!=0) {
	    		salvador.insertar(temp.articulo, temp.veces);
	    		}
	    		p--;
	    	}
	    	}
	    	inicio=salvador.inicio;
    }
    public void recorrer(){
        
        Nod aux = inicio;
        
        while(aux!=null){
            System.out.println(aux.articulo+" "+aux.veces);
            
            aux =  aux.sig;
        }
    }
}