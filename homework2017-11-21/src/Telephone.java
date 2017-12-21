import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Номер телефона странный, но так  было в условиях - заказчик сказал, значит надо
public class Telephone {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println(stepCheck(s));
        System.out.println(regularCheck(s));
    }
    public static boolean stepCheck(String str){
        char[] chars = new char[str.length()];
        chars = str.toCharArray();
        if ( chars[0] == '+' && chars[1] == '7'){
            chars[0] = 1;
            if (chars[2] == '-' && chars[6] == '-' && chars[9] == '-' ){
                chars[2] = 1;
                chars[6] = 1;
                chars[9] = 1;
                for (int i = 0; i <chars.length ; i++) {
                    if (chars[i] == '0' || chars[i] == '1' || chars[i] == '2' || chars[i] == '3' || chars[i] == '4' || chars[i] == '5' || chars[i] == '6' || chars[i] == '7' || chars[i] == '8' || chars[i] == '9' ){
                        return true;
                    }
                }

            }
        }
        return false;
    }
    public static boolean regularCheck(String str){
        Pattern p = Pattern.compile("+7-[0-9]{3}-[0-9]{2}-[0-9]{2}");
        Matcher m = p.matcher(str);
        return m.matches();
    }

}
