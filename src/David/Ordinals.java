package David;

public class Ordinals {
    public static void main(String[] args) {
        System.out.println(ordinal(5));
        System.out.println(ordinal(0));
        System.out.println(ordinal(7));
        System.out.println(ordinal(2));
        System.out.println(ordinal(13));
        System.out.println(ordinal(134));
    }
    public static String ordinal(int i) {
        int mod100 = i % 100;
        int mod10 = i % 10;
        if(mod10 == 1 && mod100 != 11) {
            return i + "st";
        } else if(mod10 == 2 && mod100 != 12) {
            return i + "nd";
        } else if(mod10 == 3 && mod100 != 13) {
            return i + "rd";
        } else {
            return i + "th";
        }
    }
}
