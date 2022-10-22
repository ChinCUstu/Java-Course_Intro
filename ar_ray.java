import java.util.Arrays;

public class ar_ray {

    public static void main(String[] args){
//        boolean[] numbers = new boolean[5];
//        numbers[0] = false;
//        numbers[1] = true;
//        int[] numbers = {2, 1, 3, 6, 5};
//        numbers[0] = 1;
//        Arrays.sort(numbers);
//        System.out.println(numbers.length);
//
//        System.out.println(Arrays.toString(numbers));
//        Multi-Dimensional Array
        int[][] numbers = {{1,2,4},{4,1,5}};
        numbers[1][0] = 1;
        System.out.println(Arrays.deepToString(numbers));
    }
}
