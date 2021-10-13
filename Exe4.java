
public class Exe4 {
	public static void main(String[] args)
    {
        String str = "Global Logic HQ is in Noida";

        byte[] byte_arr = str.getBytes();

        String str2 = new String(byte_arr);

        System.out.println("\nThe new String equals \n" + str2 + "\n");
    }
}
