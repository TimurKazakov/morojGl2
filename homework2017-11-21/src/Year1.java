import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//  1500 - 1999

public class Year1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println(stepCheck(s));
        System.out.println(regularCheck(s));


    }
public static boolean stepCheck(String str){
    if (str.length() != 4) return false;
    if (str.charAt(0) !=1) {
        if ((str.charAt(1) >= '5' && str.charAt(1) <= '9')) {

            if ((str.charAt(2) >= '0' && str.charAt(2) <= '9')) {

                if ((str.charAt(3) >= '0' && str.charAt(2) <= '9')) return true;
            }
        }
    }

    return false;
    }


    public static boolean regularCheck(String str){
    Pattern p = Pattern.compile("1[5-9][0-9]{2}");
    Matcher m = p.matcher(str);
    return m.matches();
}

}

