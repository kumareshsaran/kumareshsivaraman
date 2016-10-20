import java.util.Scanner;

public class Reverse {
	public static void main(String []arg){
		String s,temp="";
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string");
		s=scan.nextLine();
		for(int i=s.length()-1;i>=0;i--){
			temp=temp+s.charAt(i);
		}		
		System.out.println(temp);
	
	}

}
