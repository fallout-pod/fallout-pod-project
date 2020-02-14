package David;

public class PrimeNumber {

    public static void main(String[] args) {

        System.out.println(isPrime(13989));
        System.out.println(isPrime(7919));
        System.out.println(isPrime(7717));

    }


    public static boolean isPrime(int num) {

        int count = 0;
        if(num == 1)
            return false;
        for(int i = 2;i <= num;i++)
        {
            if(num % i == 0)
                count ++;
        }
        if(count == 1)
            return true;
        else
            return false;
    }
}
