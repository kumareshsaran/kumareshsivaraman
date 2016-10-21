import java.util.Scanner;

public class ReverseString1 {

	public static void main(String[] args) {
		float a[]=new float[6];
		int n;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the range");
		n=scan.nextInt();
		System.out.println("enter the interger");
		for(int i=0;i<=n;i++){
			a[i]=scan.nextFloat();
		}
		for(int i=0;i<=n;i++){
			for(int j=i;j<=n;j++){
				if(a[i]<a[j]){
					float  temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		for(int j=0;j<=n;j++){
			System.out.println(a[j]);
		}
	}

}

