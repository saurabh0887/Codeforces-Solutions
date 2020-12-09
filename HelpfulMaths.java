import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String string = sc.nextLine();

        if(string.length()>1){
            String[] numbers = string.split("\\+");

        String result = "";

        Arrays.sort(numbers);

        for(int i=1; i<numbers.length-1; i++){
            result = result + numbers[i] + "+";
        }

        System.out.println(numbers[0].toString() + "+" + result.toString() +  numbers[numbers.length-1].toString());
        } else {
            System.out.println(string);
        }
        

    }

}
