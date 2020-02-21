package David;

public class Phonetotext {
    public static void main(String[] args) {
        System.out.println(textToNum("123-647-EYES"));
        System.out.println(textToNum("(325)444-TEST"));
        System.out.println(textToNum("653-TRY-THIS"));
        System.out.println(textToNum("435-224-7613"));

    }

    public static String textToNum(String phone) {
        phone = phone.replaceAll("[ABC]", "2")
                .replaceAll("[DEF]", "3")
                .replaceAll("[GHI]", "4")
                .replaceAll("[JKL]", "5")
                .replaceAll("[MNO]", "6")
                .replaceAll("[PQRS]", "7")
                .replaceAll("[TUV]", "8")
                .replaceAll("[WXYZ]", "9");
        return phone;
    }
}
