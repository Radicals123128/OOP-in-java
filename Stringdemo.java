public class Stringdemo{
    public static void main(String[] args) {

        String s1 = new String("Computer");
        String s2 = new String("Code");

        char charAtIndex= s1.charAt(3);

        System.out.println("String s1: " + s1);
        System.out.println("String s2: " + s2);
        System.out.println("Character at index 3 of s1: " + charAtIndex);

        int length=s1.length();
        System.out.println("character of the string"+length);

        String substring = s1.substring(0, 4);
        System.out.println("Substring of s1 from index 0 to 4: " + substring);

        boolean equals = s1.equals(s2);
        System.out.println("s1 equals s2: " + equals);

        boolean isEmpty = s1.isEmpty();
        System.out.println("Empty " + isEmpty);

        String  toLowerCase=s1.toLowerCase();
        System.out.println("to lower case=" + toLowerCase);

        String toUpperCase=s1.toUpperCase();
        System.out.println("to upper case=" + toUpperCase);
    }
}
