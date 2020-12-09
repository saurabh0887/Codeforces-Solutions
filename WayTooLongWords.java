import java.util.Scanner;

public class WayTooLongWords {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        String word =  null;

        for(int i=0; i<n; i++){

            word = sc.nextLine();

            if(word.length()>10){
                System.out.print(word.charAt(0));
				System.out.print(word.length()-2); 
				System.out.println(word.charAt(word.length() -1));
            } else {
                System.out.println(word);
            }

        }

    }

}