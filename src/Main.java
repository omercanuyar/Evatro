public class Main {

    static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        int n = 227000;
        int index=1;
        
    }
}

// kaynak: https://www.geeksforgeeks.org/java-program-to-check-if-a-number-is-prime-or-not/