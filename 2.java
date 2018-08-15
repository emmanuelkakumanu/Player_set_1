import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int f=1;
		if(n<=20)
		{
			for(int i=1;i<=n;i++)
			{
				f=f*i;
			}
			System.out.print(f);
		}
		else
		System.out.print("Must be less than or euqal to 20");
	}
}
