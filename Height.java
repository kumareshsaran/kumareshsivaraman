/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
Scanner scan = new Scanner(System.in);
int height[]=new int[50];
int i,j;
int temp;
System.out.println("enter the students height");
for(i=0;i<50;i++)
{
height[i]=scan.nextFloat();
}
for(i=0;i<50;i++)
{
for(j=i+1;j<50;j++)
{
if(height[i]<height[j])
{
temp=height[i];
height[i]=height[j];
height[j]=temp;
}
}
}
System.out.println("The 4th Tallest Student Height: "+height[3]);
i=scan.nextInt();
System.out.println(height[i]);
}
}
}
