
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String a;
        String b;
        char k;
        int f=0;
        char v;
        Scanner s = new Scanner(System.in);
        a = s.next();
        b = s.next();
        HashMap<Character, Character> p = new HashMap<Character, Character>();
        int l = a.length();
        for (int i = 0; i < l; i++) {
            k = a.charAt(i);
            v = b.charAt(i);
            p.put(k, v);

        }
        for (int i = 0; i < l; i++) {
            k = a.charAt(i);
            v = b.charAt(i);
            char t = p.get(k);
            if (p.containsKey(k)) {
                if (!p.containsValue(v)) {
                    System.out.println("False");
                    f=1;break;
                }
            }

        }
        if(f==0){
            System.out.println("True");
            
        }
	}
}
