package Chris;

public class Maskify {

    public static void main(String[] args) {
        System.out.println(Maskify.maskify("Yahoooo"));
        System.out.println(Maskify.maskify("43245894839485"));
        System.out.println(Maskify.maskify("1"));
        System.out.println(Maskify.maskify("   e"));
    }
    public static String maskify(String str) {
        char[] strChars = str.toCharArray();
        for( int i = 0; i < strChars.length - 4; i++ ) {
            strChars[i] = '#';
        }
        return new String(strChars);
    }
}