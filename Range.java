import java.util.Scanner;

public class Userrange {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int input;
		System.out.println("enter the number in 1 to 9");
		input=scan.nextInt();
		if(((input>=1) && (input<=9))){
			System.out.println("entered number is in given order");
			
		}else{
			System.out.println("out of range");
		}
		

	}

}
