import java.util.Arrays;

/**
 * Created by Mohamed Alshamsi on 1/18/2022.
 */
public class Revers {
    public static void main(String[] args) {
        int [] array = {1,2,3,4};
        array = revers(array);
        System.out.println("Array before reversing"+Arrays.toString(array));
        System.out.println("Array after reversing"+Arrays.toString(revers(array)));
    }

    public static int[] revers(int[] array){
        int [] arrayrev = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayrev[array.length-i-1] = array[i];
        }
        return arrayrev;
    }

}
