package homework;

public class IfForExample {
    public static void main(String[] args) {
        int a, b;
        a = 5;
        b = 10;

        if (a < b) {
            System.out.println("max:" + b);
        } else {
            System.out.println("max:" + a);
        }

        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }


        char c = (char) a;
        char c1 = (char) b;
        System.out.println(c);
        System.out.println(c1);

        if (a==b) {
            System.out.println("a havasare b");

        }else {
            System.out.println("a havasar che b");

        }
        }
    }


