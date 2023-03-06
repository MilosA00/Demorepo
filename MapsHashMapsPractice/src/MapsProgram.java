import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapsProgram {

    public static void main(String[] args) {
        Map<String, String> language = new HashMap<>();
        Scanner scanner = new Scanner(System.in);



        System.out.println("asd");
        String keyValue = scanner.nextLine();

        System.out.println("ASD");
        String definition = scanner.nextLine();

        language.put(keyValue,definition);

        System.out.println(language.get(keyValue));
        System.out.println(language);

    }


}
