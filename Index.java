public class Index {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int num[]=new int[a],i;
		for(i=0;i<a;i++)
		{
			num[i]=in.nextInt();
			
		}
				
		for(i=0;i<a;i++)
		{
			if(i==num[i]){
				System.out.println(num[i]);
			}
		}
	}
	}
