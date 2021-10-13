public class Exe1 {

    public static void main(String[] args)
    {
        String str1 = "I work at Global Logic";
        String str2 = "Global";
        System.out.println("Original String: " + str1);
        System.out.println("Specified sequence of char values: " + str2);
        System.out.println(str1.contains(str2));
    }
}