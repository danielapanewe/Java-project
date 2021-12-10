import java.util.Arrays;

public class Dicchoettri {
	
	 static void Dicho(int tab[], int p, int d, int valeur){
	        // p : premier element;
	        // d : deuxieme element;
		    //valeur:valeur à trouver;
	        int mid = (p + d)/2;
	        while(p <= d){
	            if(tab[mid] < valeur){
	                p = mid + 1;
	            } 
	            else if(tab[mid] == valeur){
	                System.out.println("l'élément se trouve a l'index: " + mid);
	                break;
	            }
	            else{
	                d = mid - 1;
	            }
	            mid = (p + d)/2;
	        }
	        if(p > d){
	            System.out.println("l'élément n'existe pas!");
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int[] Tab={4,6,8,9,0,5,7,3,2,1};
		  System.out.println("Voici le tableau de départ ");

			for(int i: Tab)	{
								System.out.println(i+" ");
			}
		
for(int i=0; i<Tab.length;i++) {
	for(int j=0;j<Tab.length;j++) {
		if(Tab[i]<Tab[j]) {
			int t=Tab[i];
			Tab[i]=Tab[j];
			Tab[j]=t;
		}
	}
}
System.out.println("\n Après le tri");
for(int i: Tab) {
	System.out.println(i+" ");
}
int valeur=9;
int d=Tab.length-1;
Dicho(Tab,0,d,valeur);
	}

}

