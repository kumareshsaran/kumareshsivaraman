import java.util.Scanner;

public class MaxnumArray {
	public static void main(String[] args){
	int i,j,temp;
	int[] b=new int[20];
	Scanner n=new Scanner(System.in);
	int num=n.nextInt();
	int sum=0;
	for(i=0;i<num;i++){
		for(j=i+1;j<num;j++){
			if(b[j]>b[i]){
				temp=b[i];
				b[i]=b[j];
				b[j]=temp; 
				
			}
		}
		for(i=0;i<num-1;i++){
			temp=b[i+1];
			int c=0;
			while(temp!=0){
				temp=temp/10;
				c++;
			}
			sum=(int) ((sum*Math.pow(10,c))+b[i+1]);
		}
		System.out.println(sum);
	}
	}

	private static int pow(int i, int c) {
		return (int) Math.pow(i, c);
	}

}
