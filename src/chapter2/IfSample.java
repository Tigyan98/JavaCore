package chapter2;

public class IfSample {
    public static void main(String[] args) {
        int x, y;

        x = 10;
        y = 20;

        if (x < y) {
            System.out.println("x poqre y");

            x = x * 2;
            if (x == y) {
                System.out.println("x havasare y");

                x = x * 2;
                if (x > y) {
                    System.out.println("x mece y");


                }
            }

        }

    }

}
