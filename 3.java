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
		int r=0;
		while(n!=0)
		{
			int rem=n%10;
			r=(r*10)+rem;
			n=n/10;
		}
		System.out.print(r);
	}
}
