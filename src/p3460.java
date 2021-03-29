import java.util.Scanner;
import java.util.ArrayList;

public class p3460 {
    private static final Scanner sc = new Scanner(System.in);

    public static String solution(ArrayList<Integer> list){
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            int remain = list.get(i);
            int bi = 0;
            while (remain > 0){
                if(remain % 2 == 1){
                    result = result.concat(Integer.toString(bi)+ " ");
                }
                remain = remain / 2;
                bi++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int num = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < num; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(solution(list));
    }

}

