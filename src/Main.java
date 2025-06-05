public class Main {
    public static void main(String[] args) {
        char asciiChar = 'A';
        System.out.println("Character: " + asciiChar);

        int asciicode = (int)asciiChar;
        System.out.println("ASCII Code: " + asciicode);

        char koreaChar = '가';
        System.out.println("Character: " + koreaChar);

        int unicodeCord = (int)koreaChar;
        System.out.println("Unicode Code: U+" + Integer.toHexString(unicodeCord).toUpperCase());


    }
}