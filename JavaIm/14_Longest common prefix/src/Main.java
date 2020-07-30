/**
 * @author liuboting
 * @date 2020/7/3 17:55
 */

public class Main {
    public static void main(String[] args) {
        String[] strs = {"aa","a"};
        if(strs.length == 0)
            System.out.println("");;
        String ans = strs[0];
        for(int i =1;i<strs.length;i++) {
            int j=0;
            for(;j<ans.length() && j < strs[i].length();j++) {
                if(ans.charAt(j) != strs[i].charAt(j))
                    break;
            }
            ans = ans.substring(0, j);
        }
        System.out.println(ans);;
    }

}
