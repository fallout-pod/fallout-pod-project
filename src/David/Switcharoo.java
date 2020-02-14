package David;

public class Switcharoo {

    public static void main(String[] args) {

        System.out.println(switcharoo("tt"));
        System.out.println(switcharoo("t"));
        System.out.println(switcharoo("string"));
        System.out.println(switcharoo("valentine"));

    }

    public static String switcharoo(String input) {
        String bucket = "";

        if (input.length()<2) {
            bucket = "Incompatible.";
        }else if (input.charAt(0) == input.charAt(input.length()-1)) {
            bucket = "Two's a pair.";
        }else{
            bucket = bucket + input.substring(input.length()-1, input.length())
                    + input.substring(1, input.length()-1)
                    + input.substring(0, 1);
        }

        return bucket;
    }
}
