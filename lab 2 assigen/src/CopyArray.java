import java.util.Arrays;

/**
 * Created Mohamed Alshamsi on 1/18/2022.
 */
public class CopyArray {
    public static void main(String[] args) {
        int [] array = {1,2,3,4};
        int [] arrayCopy = new int[array.length];

        copy(array,arrayCopy);
        System.out.println("array before copy"+Arrays.toString(array));
        System.out.println("array after copy it"+Arrays.toString(arrayCopy));
    }

    public static int [] copy(int[] array1, int[] array2){
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
//        arra2 = arr1;
        return array2;
    }
}
