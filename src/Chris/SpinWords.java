package Chris;

public class SpinWords {

    public static void main(String[] args) {
        System.out.println(spinWords("Love is four char long"));
        System.out.println(spinWords("Super Jabronis have Fantastic times ."));
        System.out.println(spinWords("I haven't had Breakfast yet. Oh, well, not that important anyway."));
    }

    public static String spinWords(String sentence) {
        String returnString = "";
        String[] words = sentence.split(" ");
        for (String word : words) {
            if (word.length() < 5) {
                returnString += word + " ";
                continue;
            } else {
                String tempString = "";
                for (int i = word.length() - 1; i >= 0; i--) {
                    tempString += word.charAt(i) ;
                }
                returnString += tempString + " ";
            }

        }
        return returnString;
    }
}