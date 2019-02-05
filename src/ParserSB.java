import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class ParserSB {


    List<Integer> getListNum(StringBuilder sb) {


        char[] nums = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char[] oper = {'*', '/', '+', '-'};

        List<Character> numScan = new ArrayList<>();
        List<Integer> listDubleNumScan = new ArrayList<>();
//        List<Character> operScan = new ArrayList<>();
//        List<Integer> indexes = new ArrayList<>();


        for (int i = 0; i < sb.length(); i++) {
            char symbol = sb.charAt(i);


            for (int k = 0; k < nums.length; k++) {
                if (symbol == nums[k]) {
                    numScan.add(symbol);

                    if (i == sb.length() - 1) {
                        int iDubleNumScan = Integer.parseInt(numScan.stream().map(Object::toString).collect(Collectors.joining()));
                        listDubleNumScan.add(iDubleNumScan);
                    }
                    break;

                } else {
                    for (int m = 0; m < oper.length; m++) {
                        if (symbol == oper[m] && numScan.size() != 0) {

//                            operScan.add(symbol);

                            int iDubleNumScan = Integer.parseInt(numScan.stream().map(Object::toString).collect(Collectors.joining()));
                            listDubleNumScan.add(iDubleNumScan);

                            numScan.clear();
                            break;
                        }
                    }
                }
            }
        }
        return listDubleNumScan;
    }

    List<Character> getListOper(StringBuilder sb) {

        char[] oper = {'*', '/', '+', '-'};

        List<Character> operScan = new ArrayList<>();

        for (int i = 0; i < sb.length(); i++) {
            char symbol = sb.charAt(i);

            for (int m = 0; m < oper.length; m++) {
                if (symbol == oper[m]) {

                    operScan.add(symbol);
                    break;
                }
            }
        }
        return operScan;
    }
}
