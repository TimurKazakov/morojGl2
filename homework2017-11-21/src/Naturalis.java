import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Naturalis {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        Integer x;
        try {
            x = Integer.parseInt(s);
            System.out.println("True");
        } catch (NumberFormatException e) {
            System.out.println("False");
        }
        System.out.println( regularCheck(s));
    }

    public static boolean regularCheck(String s) {
        Pattern p = Pattern.compile("[0-9]*");
        Matcher m = p.matcher(s);
        return m.matches();

    }
}