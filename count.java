import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		int input1;
		int input2;
		int output1=0;
		int count;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of array");
		input1=scan.nextInt();
		String[] input3=new String[input1];
		System.out.println("enter the word");
		for(int i=0;i<input3.length;i++){
			input3[i]=scan.next();
		}
		System.out.println("enter the length of words to be counted");
		count=scan.nextInt();
		
		for(int i=0;i<input3.length;i++){
			if(input3[i].length()==count){
				output1++;
			}
					}
		System.out.println("the number of words is"+output1);

		
											
			
		}
	
	}


	
		
