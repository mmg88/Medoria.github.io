
import java.util.*;
/**
 * Created by Mohamed Alshamsi on 1/18/2022.
 */
public class RandomRemove {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        removerandomly(array);
    }
 public  static void removerandomly(int[] array) {
        Random r = new Random();
        while (array.length > 0) {
            int index = r.nextInt(array.length);
            array[index]=0;
            System.out.println("INDEX = " + index + ", ELEMENT = " + array[index]);
            int[] array1 = new int[array.length - 1];
            for (int i = 0; i < index; i++)
                array1[i] = array[i];
            for (int i = index; i < array.length - 1; i++)
                array1[i] = array[i + 1];
            array = array1;
        }
    }
}
