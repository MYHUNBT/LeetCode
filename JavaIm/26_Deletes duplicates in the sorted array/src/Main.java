import java.util.Arrays;

/**
 * @author liuboting
 * @date 2020/7/26 11:03
 */

public class Main {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,5,9,7,7,2,3};
        Arrays.sort(nums);
        int[] count = new int[nums[nums.length -1]+1];
//        System.out.println(Arrays.toString(count));
        for (int i = 0; i < nums.length; i++) {
                count[nums[i]]++;
        }
        for (int i = 0; i < count.length; i++) {
            if(count[i] != 0){
                System.out.println(i);
            }
        }
    }
}
