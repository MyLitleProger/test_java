import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num;
        num = in.nextInt();
        switch (num){
            case 1:
                Hi.hi();
                break;
            case 2:
                Hi.si();
                break;
            default:
                System.out.println("Ой");
                break;
        }
    }
}