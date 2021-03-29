import java.util.Scanner;

public class p10818 {
    private static final Scanner sc = new Scanner(System.in);
    static String solution(int num,String input){
        String[] list = input.split(" ");

        int min = Integer.parseInt(list[0]);
        int max = Integer.parseInt(list[0]);

        for (int i = 1; i < list.length; i++) {
            int tmp = Integer.parseInt(list[i]);
            if(min > tmp)
                min = tmp;
            if(max < tmp)
                max = tmp;
        }

        return min + " " + max;
    }
    public static void main(String[] args) {
        String numS = sc.nextLine();
        int num = Integer.parseInt(numS);
        String input = sc.nextLine();
        System.out.println(solution(num,input));
    }
}







