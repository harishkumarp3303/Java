package Strings;

public class Sample1 {
    public static void main(String[] args) {
        String s1="Harish";
        String s2="Harish";


        // checking if reference variable is pointing to same memory in string pool

        System.out.println(s1==s2);

        // Now changing value of s1 to verify s2 is changing as it pointing to same memory

        s1="Nanda";

        System.out.println(s2);

        // s2 is not changing bcz String is immutable so s1 will be creating new object 
        // and s2 is preserved due to security reasons

        String s3=new String("kumar");
        String s4=new String("kumar");

        System.out.println(s3==s4);

    }
}
