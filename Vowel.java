import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char a=scan.next().charAt(0); 
		if(a=='a' || a=='A' || a=='e' || a=='E' || a=='i' || a=='I' || a=='o' || a=='O'){
		System.out.println("the char is vowel");		
		}else{
			System.out.println("its costant");
		}
	}

}
