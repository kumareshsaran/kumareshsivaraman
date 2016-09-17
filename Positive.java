import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {
		int a;
		Scanner scan=new Scanner(System.in);
				a=scan.nextInt();
		if(a>0){
			System.out.println("the number is positive"+a);
		}else{
			System.out.println("the number is negative");
		}

	}

}
