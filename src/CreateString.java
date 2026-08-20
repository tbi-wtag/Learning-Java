public class CreateString {
    public static void main(String[] args) throws Exception {

        //FOR IMMUTABLE STRINGS
        String s = "Hello";
        s.concat(" World");
        System.out.println(s); // Outputs Hello
        s = s + " World";
        System.out.println(s); // Outputs Hello World

        //FOR MUTABLE STRINGS

        //String buffer
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb); // Outputs Hello World

        //Converting StringBuffer to String
        String str = sb.toString();
        System.out.println(str); // Outputs Hello World
        //Deleting a specific character from StringBuffer
        sb.deleteCharAt(2);
        System.out.println(sb); // Outputs Helo World

        sb.insert(0, "!");
        System.out.println(sb); // Outputs !Helo World

    }
}
