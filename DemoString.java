package labmanual;

//2.Write a program to do the following using in-built methods in the string class of java.
public class DemoString {
    public static void main(String[] args) {
//        a. Find the 3rd character in the string “Hello World”.
        String s = "Hello world";
        System.out.println(s.charAt(3));

//        b. Find the index of character ‘o’ in string “Java Programming”.
        String a = "java programmoing";
        System.out.println(a.indexOf("o"));

//        c. Convert the string “be honest“to uppercase.
        String b = "be honest";
        System.out.println(b.toUpperCase());

//        d. Replace character ‘l’; with ‘I’ in the string “hello”.

        String c = "hello";
        System.out.println(c.replace("l", "i"));

    }
}