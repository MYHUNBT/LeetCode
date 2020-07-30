/**
 * @author liuboting
 * @date 2020/7/26 14:39
 */

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,2,2,3,3,3,3};
        int val = 3;
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        System.out.println(i);
    }
}
