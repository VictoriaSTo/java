import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] myArr = {1,2,3,4,5};
        reverse(myArr);
    }

    public static void reverse(int [] args) {
        System.out.println(Arrays.toString(args));
        for(int i = 0; i < args.length / 2; i++) {
            int temp = args[i];
            args[i] = args[args.length-1-i];
            args[args.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(args));
    }
}

