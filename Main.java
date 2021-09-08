import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scnr = new Scanner(System.in);
            int userNum;
            int divNum;
            int answer1;
            int answer2;
            int answer3;

        userNum = scnr.nextInt();
        divNum = scnr.nextInt();

        answer1 = userNum / divNum;
        answer2 = answer1 / divNum;
        answer3 = answer2 / divNum;

        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);



    }
}
