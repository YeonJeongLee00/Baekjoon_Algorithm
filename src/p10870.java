import java.util.Scanner;

public class p10870 {
    private static Scanner sc = new Scanner(System.in);

    public static int solution(int n){
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return solution(n-1) + solution(n-2);

    }

    public static void main(String[] args) {
        int number = sc.nextInt();
        System.out.println(solution(number));
    }
}
