import java.util.ArrayList;
import java.util.List;

public class Biller {


    public Integer billing(List<Integer> listNumbers, List<Character> listOperators){

        for (int b=0; b<listOperators.size(); b++) {

            if (listOperators.get(b) == '*') {
                int answer = listNumbers.get(b) * listNumbers.get(b + 1);
                listNumbers.remove(b);
                listNumbers.remove(b);
                listNumbers.add(b, answer);
                listOperators.remove(b);
                --b;
            }
        }

        for (int v=0; v<listOperators.size(); v++){
            if (listOperators.get(v) == '/') {
                int answer= listNumbers.get(v)/listNumbers.get(v+1);
                listNumbers.remove(v);
                listNumbers.remove(v);
                listNumbers.add(v, answer);
                listOperators.remove(v);
                --v;
            }
        }

        for (int c=0; c<listOperators.size(); c++){
            if (listOperators.get(c) == '-') {
                int answer= listNumbers.get(c)-listNumbers.get(c+1);
                listNumbers.remove(c);
                listNumbers.remove(c);
                listNumbers.add(c, answer);
                listOperators.remove(c);
                --c;
            }
        }

        for (int r=0; r<listOperators.size(); r++){
            if (listOperators.get(r) == '+') {
                int answer= listNumbers.get(r)+listNumbers.get(r+1);
                listNumbers.remove(r);
                listNumbers.remove(r);
                listNumbers.add(r, answer);
                listOperators.remove(r);
                --r;
            }
        }
//        System.out.println("конец "+listNumbers);
//        System.out.println("конец "+listOperators);

        return listNumbers.get(0);

    }
}
