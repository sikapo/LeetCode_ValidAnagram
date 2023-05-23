import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//      leetCodeTask_1
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

            StringBuilder i = new StringBuilder(input);
            System.out.println(i.reverse().toString().equals(input));

//      leetCodeTask_2
//        boolean dupe = true;
//        int o = 0;
//        int[] nums = {1,1,1,3,3,4,3,2,4,2};
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (nums[i] == nums[j] && i!=j) {
//                    System.out.println(dupe);
//                    i = nums.length + 1;
//                    o = 1;
//                    break;
//                }
//            }
//        }
//        if (o == 0) System.out.println(!dupe);
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        Set<Integer> set = new HashSet<>();

        for (int num: nums) {
            if (set.contains(num)) {
                System.out.println(true);
                break;
            }
            else set.add(num);
        }
        System.out.println(false);
    }
}