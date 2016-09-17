import java.util.Scanner;

public class OddorEvev {

	public static void main(String[] args) {
		int a;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		a=scan.nextInt();
if(a%2==0){
	System.out.println(a+"\t is even number");
}else{
	System.out.println(a+"\t is odd number");
}
	}

}
