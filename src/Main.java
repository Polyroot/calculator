import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


//        int x = scanner.nextInt();
//        int x=Integer.valueOf(scanner.nextLine());

//        String string = new String(scanner.nextLine());

        StringBuilder sb = new StringBuilder(scanner.nextLine());

        char[] nums = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char[] oper = {'*', '/', '+', '-'};
        int idxSB = 0;


        List<Character> numScan = new ArrayList<>();
        List<Character> operScan = new ArrayList<>();
        List<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < sb.length(); i++) {
            char symbol = sb.charAt(i);

            for (int k = 0; k < nums.length; k++) {
                if (symbol == nums[k]) {
                    numScan.add(symbol);
                    idxSB++;
                }
            }
            for (int m = 0; m < oper.length; m++) {
                if (symbol == nums[m]) {
                    operScan.add(symbol);
                    idxSB++;
                    indexes.add(idxSB);
                }
            }
//            while ()

            }

            for (Integer f : indexes) {
                System.out.print(f + ", ");
            }
//            int x = Integer.valueOf(sb.charAt(i));
            scanner.close();
        }

    }
