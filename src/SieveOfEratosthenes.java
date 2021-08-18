import java.util.*;

public class SieveOfEratosthenes {
    static ArrayList<String> sieveOfEratosthenes(int n){
        ArrayList<String> result = new ArrayList<>();
        boolean[] prime = new boolean[n];
        for(int i = 0; i < prime.length; i++){
            prime[i] = true;
        }

        for(int i = 2; i < Math.sqrt(n); i++){
            if(prime[i]){
                for(int j = i * i; j < n; j = j + i){
                    prime[j] = false;
                }
            }
        }

        for(int i = 2; i < n; i++){
            if(prime[i]){
                System.out.print(i + " ");
                result.add(String.valueOf(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        sieveOfEratosthenes(num);
    }
}
