/**
 * @author liuboting
 * @date 2020/7/13 11:33
 */

public class text {
    public static void main(String[] args) {
        String s = "sda{}e";
        s = s.replaceAll("\\{\\}","");
        System.out.println(s);
    }
}
