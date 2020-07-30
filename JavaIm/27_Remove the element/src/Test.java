import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author liuboting
 * @date 2020/7/26 17:33
 */

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(0);
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
