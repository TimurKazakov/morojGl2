import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 1453 - 2017

public class Year2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println(stepCheck(s));
        System.out.println(regularCheck(s));


    }
    public static boolean stepCheck(String str){
        if (str.length() != 4) return false;
        if (str.charAt(0) =='1') {
            if (str.charAt(1) < '4') {
                return false;
            } else if (str.charAt(1) == '4') {
                if (str.charAt(2) < '5') {
                    return false;
                } else if (str.charAt(2) == '5') {
                    if (str.charAt(3) < '3') {
                        return false;
                    }
                }
            }


            if ((str.charAt(2) >= '0' && str.charAt(2) <= '9')) {
                if ((str.charAt(3) >= '0' && str.charAt(2) <= '9')) return true;
            }

        }


        if (str.charAt(0) == '2'){
            if (str.charAt(1) == '0'){
                if (str.charAt(2) == '0'){
                    if ((str.charAt(3) >= '0' && str.charAt(2) <= '9')) return true;
                }
                if ((str.charAt(2) == '1')){
                    if ((str.charAt(3) >= '0' && str.charAt(3) <= '7')) return true;
                }
            if (str.charAt(2) > '1') return false;
            }
        }

        return false;
    }


    public static boolean regularCheck(String str){
        Pattern p = Pattern.compile("([1][4][5][3-9])|([1][4][6-9][0-9])|([1][5-9][0-9][0-9])|([2][0][0][0-9]|[2][0][1][0-7])");
        Matcher m = p.matcher(str);
        return m.matches();
    }

}
