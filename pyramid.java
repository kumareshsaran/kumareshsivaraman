import java.util.Scanner;

public class Pyramid {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int i,j,k;
     int n=s.nextInt();
     for(i=1;i<=n;i++){
    	 for(j=n;j>=i;j--)
    		 System.out.print(" ");
    		 for(k=1;k<=i;k++){
    		 System.out.print(k+" ");
    		 }
    	 
    	 System.out.println();
    	 }
     }
}
