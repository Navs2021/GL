
public class Exe3 {
	public static void main(String[] args)
    {
        String str1 = "Global Logic HQ is in Noida";
        String str2 = "I work at Global Logic";

         String s = "Global";

        boolean st1 = str1.startsWith(s);
        boolean st2 = str2.startsWith(s);

        System.out.println( str1 + " starts with " + s + "?\n " + st1);
        System.out.println( str2 + " starts with " +  s + "?\n " + st2);
    }
}

