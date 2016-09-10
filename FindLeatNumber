import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class LeastNumber1 {
public static void main(String[] args){
	int n,i,j,temp,k,size=0,sol=0;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number");
	n=scan.nextInt();
	System.out.println("enter the k value");
	k=scan.nextInt();
	int  result[]=new int[100];
	for(j=0;j<n;j++){
		result[j]=n%10;
		n=n/10;
		size++;
	}
	for(i=0;i<size;i++){
		for(j=i;j<size;j++){
			if(result[i]>result[j]){
				temp=result[i];
				result[j]=result[i];
				result[i]=temp;
			}
		}
	}
	for(i=0;i<size-k;i++){
			sol=sol*10+result[i];
	}
	System.out.println(sol);
}
}
