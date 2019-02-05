import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scanner.nextLine());

        ParserSB parserSB = new ParserSB();

//        System.out.println("начало " + parserSB.getListNum(sb));
//        System.out.println("начало " + parserSB.getListOper(sb));

        Biller biller = new Biller();

        System.out.println("Ответ: "+biller.billing(parserSB.getListNum(sb), parserSB.getListOper(sb)));

    }
}
