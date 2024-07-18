import java.util.Arrays;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        descSortArr(5);

    }

    private static void descSortArr(int q) {
        Random random = new Random();
        int [] unsortedArr = new int[q];
        for(int i = 0; i < unsortedArr.length; i++) {
            unsortedArr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(unsortedArr));
        Arrays.sort(unsortedArr);

        System.out.println(Arrays.toString(unsortedArr));
        for(int i = 0; i < unsortedArr.length / 2; i++) {
            int temp = unsortedArr[i];
            unsortedArr[i] = unsortedArr[unsortedArr.length - 1 -i];
            unsortedArr[unsortedArr.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(unsortedArr));
    }
}