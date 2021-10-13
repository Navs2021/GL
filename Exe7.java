public class Exe7 {
  public static void main(String[] args)
    {        
        int count = 0;
        String str = "Global Logic HQ is in Noida";
        
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }
        }
        System.out.print("Number of  Vowels in the string: " + count);
    }
}
 