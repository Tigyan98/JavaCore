package homework2;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] array = {2, 5, 11, 25, 66, 10, 62, 46, 3, 7};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length-1){
                System.out.print(",");
            }else {
                System.out.print(".");
            }

        }
        System.out.println();

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("amena poqr: " + min);

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("amena mec tiv:" + max);


        System.out.println("arajin tivy: " + array[0]);
        int verjiIndex = array.length - 1;
        System.out.println("verjin tivy: " + array[verjiIndex]);


    }

}

