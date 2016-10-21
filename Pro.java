import java.util.Scanner;

public class Proqus2 {

	public static void main(String[] args) {
	int n,k;
	int ans=0;
	int size=0;
		Scanner scan=new Scanner(System.in);
	System.out.println("enter the number");
	n=scan.nextInt();
	System.out.println("enter the k value");
	k=scan.nextInt();
	int[] sol=new int[10];
for(int i=0;i<n;i++){
	sol[i]=n%10;
	n=n/10;
	size++;
}
	for(int i=0;i<size;i++){
		for(int j=i;j<size;j++){
			
			if(sol[i]>sol[j]){
				int temp=sol[i];
				sol[i]=sol[j];
				sol[j]=temp;
			}
			
		}
	}
	for(int j=0;j<size-k;j++){
		
				ans=ans*10+sol[j];
		

	}
	System.out.println(ans);
	}
	}


