import java.util.Scanner;

public class p2460 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 1;
        int max = 0;
        int people = 0;

        while (count < 11){
            String input = sc.nextLine();
            int out = Integer.parseInt(input.split(" ")[0]);
            int in = Integer.parseInt(input.split(" ")[1]);

            if(count == 1){
                people = in;
                max = in;
            }else{
                people = people - out + in;
                if (max < people)
                    max = people;
            }
            count++;
        }

        System.out.println(max);
    }
}

