package OOP_LAB6;

public class StringCompare {
    public static void main(String[] args) {
        //compare String
        String str1 = "Hello";
        String str2 = "Hello";
        //type1(==)
        if (str1 == str2) System.out.println("true");
        else System.out.println("False");
        //type2 (equals()method)
        if (str1.equals(str2)) System.out.println("True");
        else System.out.println("False");

        //type3 (compareTo()method)
        //-,+,0
        if (str1.compareTo(str2) == 0)
            System.out.println("True");
        else if (str1.compareTo(str2) == 1)
            System.out.println("str2 more than str1");
        else
            System.out.println("str1 less than str2");


    }//main
}//class
