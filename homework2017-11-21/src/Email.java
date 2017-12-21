import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println(stepCheck1(s));
        System.out.println(regularCheck(s));

    }
 public static boolean stepCheck1(String str){
     String yandex = new String("@yandex.ru");
     String google = new String("@google.com");
     ArrayList<Character> arrayList = new ArrayList();
int k =0;
     for (int i = 0; i < str.length() ; i++) {
         if (str.charAt(i) != '@') {
             arrayList.add(str.charAt(i));
         } else {
             k=i;
             break;
         }
     }
     for (Character c: arrayList) {
            if( !('A' <= c && c <= 'Z' || 'a' <= c && c <= 'z' || '0' <= c && c <= '9' || c== '_')) return false;
         }

    if(!(str.substring(k).equals(yandex) || str.substring(k).equals(google))){
        return false;
    }
     return true;
    }
public static  boolean regularCheck(String str){
    Pattern p = Pattern.compile("[a-z0-9_]*[@]((yandex\\.ru)|(google\\.com))");
    Matcher m = p.matcher(str);
    return m.matches();
}

}
