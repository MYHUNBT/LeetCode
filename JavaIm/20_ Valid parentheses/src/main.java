/**
 * @author liuboting
 * @date 2020/7/13 13:00
 */

public class main {
    public static void main(String[] args) {
        String str = "({})";
        char[] chars = str.toCharArray();
        if(str.length() % 2 != 0){
            System.out.println("false");
        }
        if(str.isEmpty()) System.out.println("true");
        for (int i = 0; i < str.length()/2+1; i++) {
            str = str.replace("()","")
                     .replace("{}","")
                     .replace("[]","");
            if(str.isEmpty()){
                System.out.println("true");
                break;
            }
        }
        System.out.println(str);
        System.out.println("false");
    }
}
