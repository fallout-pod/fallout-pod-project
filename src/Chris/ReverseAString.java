package Chris;

public class ReverseAString {
    public static void main(String[] args) {
        System.out.println(solution("Potato Man"));
        System.out.println(solution("Jabroni"));
        System.out.println(solution("123456789"));
    }
    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }

}

