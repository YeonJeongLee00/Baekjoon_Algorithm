import java.util.Scanner;
import java.util.ArrayList;
public class p2501 {
    public static int solution(String input){
        String[] list = input.split(" ");
        int sosu = Integer.parseInt(list[0]);
        int order = Integer.parseInt(list[1]);
        ArrayList<Integer> aksu = new ArrayList<Integer>();
        for (int i = 1; i <= sosu; i++) {
            if(sosu % i == 0){
                aksu.add(i);
            }
        }
        int result = 0;

        if(aksu.size() >= order){
            result = aksu.get(order-1);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(solution(input));
    }
}

