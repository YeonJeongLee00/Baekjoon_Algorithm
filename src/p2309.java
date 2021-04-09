import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class p2309 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int sum = 0;

        int[] array = new int[9];
        ArrayList<Integer> al = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < 9; i++) {
            array[i] = sc.nextInt();
            if (i < 7) {
                sum = sum + array[i];
                al.add(array[i]);
                index++;
            }
        }

        if (sum != 100) {
            for (int i = 0; i < 7; i++) {
                sum -= array[i];
                al.remove(array[i]);
                index--;
                for (int j = 0; j < 9; j++) {
                    if (j != i){
                        sum += array[j];
                        if (sum == 100 && index == 6){
                            al.add(array[j]);
                            break;
                        }else{

                        }
                    }
                }
                if (sum == 100 && index == 7)
                    break;
            }

        }

        int allSum = 0;
        Collections.sort(al);
        for (int i = 0; i < 7; i++) {
                System.out.println(al.get(i));
        }
    }
}
