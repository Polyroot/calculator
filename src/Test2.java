import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Test2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        int x = scanner.nextInt();
//        int x=Integer.valueOf(scanner.nextLine());

//        String string = new String(scanner.nextLine());

        StringBuilder sb = new StringBuilder(scanner.nextLine());

        char[] nums = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char[] oper = {'*', '/', '+', '-'};
        int idxSB = 0;

//        System.out.println(oper.length);

        List<Character> numScan = new ArrayList<>();
        List<String> listDubleNumScan = new ArrayList<>();
        List<Character> operScan = new ArrayList<>();
        List<Integer> indexes = new ArrayList<>();


        for (int i = 0; i < sb.length(); i++) {
//            System.out.println("i="+i);
            char symbol = sb.charAt(i);


            for (int k = 0; k < nums.length; k++) {
                if (symbol == nums[k]) {
                    numScan.add(symbol);
                    idxSB++;
                    System.out.println("попал " + idxSB);

                    if (i == sb.length() - 1) {
                        String sDubleNumScan = numScan.stream().map(Object::toString).collect(Collectors.joining());
                        listDubleNumScan.add(sDubleNumScan);
//                    System.out.println(listDubleNumScan);
                    }
                    break;
                } else {

                    for (int m = 0; m < oper.length; m++) {
                        if (symbol == oper[m] && numScan.size() != 0) {

                            operScan.add(symbol);

                            String sDubleNumScan = numScan.stream().map(Object::toString).collect(Collectors.joining());
                            listDubleNumScan.add(sDubleNumScan);
//                        System.out.println(listDubleNumScan);

                            numScan.clear();
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(listDubleNumScan);
        System.out.println(operScan);
        scanner.close();

    }

}
