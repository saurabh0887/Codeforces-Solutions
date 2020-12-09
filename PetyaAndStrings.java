import java.util.Scanner;

public class PetyaAndStrings {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String one = sc.nextLine();
        String two = sc.nextLine();

        if(one.compareToIgnoreCase(two)>0){
            System.out.println("1");
        } else if(one.compareToIgnoreCase(two)<0){
            System.out.println("-1");
        } else {
            System.out.println("0");
        }

    }
    
}