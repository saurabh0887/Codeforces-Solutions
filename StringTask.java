import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String out = "";

        string = string.toLowerCase();

        for(int i=0; i<string.length(); i++){
            if(string.charAt(i) == 'a' 
            || string.charAt(i) == 'o'
            || string.charAt(i) == 'y'
            || string.charAt(i) == 'u'
            || string.charAt(i) == 'e'
            || string.charAt(i) == 'i'
            ) {
                
                continue;

            }

            if(Character.isUpperCase(string.charAt(i))){

                out = out + "." + Character.toString(string.charAt(i)).toLowerCase();

            } else {
                out = out + "." + string.charAt(i);
            }
            

        }

        System.out.println(out);
    }
}
