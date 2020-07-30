/**
 * @author liuboting
 * @date 2020/7/8 18:49
 */

public class BetterSolution {
    public static void main(String[] args) {
        String[] strs = {"aa","a"};
        if(strs==null|| strs.length==0) System.out.println("");;
        for(int i=1;i<strs.length;i++){
//单次求取每个元素的公共前缀，将第一个元素作为参照，循环将第一个元素长度从后缩短一个判断
            while(strs[i].indexOf(strs[0])!=0){
                strs[0]=strs[0].substring(0, strs[0].length()-1);
                if(strs[0].isEmpty()) System.out.println("");;
            }
        }
        System.out.println(strs[0]);;
    }
}
