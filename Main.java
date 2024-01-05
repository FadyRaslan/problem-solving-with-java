import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num =scanner.nextInt();
        int result=1;
        for (int i=1;i<=num;i++){
            result*=i;
        }
        if (result%2==0){
            System.out.println("Yes");
        }else {
            System.out.println("NO");
        }
    }

}