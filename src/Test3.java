import java.util.ArrayList;
import java.util.List;

public class Test3 {


    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        list.add('f');
        list.clear();
        System.out.println(list);

        if (list.size()==0){
            System.out.println("fack");
        }


        char[] nums = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        for (int i=0; i<=nums.length; i++)
            System.out.println(i);

    }
}
