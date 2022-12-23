package homework2;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] array = {2, 5, 11, 25, 66, 10, 62, 46, 3, 7};
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + ", ");
//
//        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("amena mec tiv  " + max);


//
    }

}

