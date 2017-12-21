import org.omg.CORBA.INTERNAL;
import sun.applet.Main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public  class Searchigs  {
    // Эти List`ы получены в классах,  после обработки файлов, используются в методах ниже.
    ArrayList<User> allUsers = User.getUsers();
    ArrayList<Payment> paymentsLog = Payment.getPayments();
    ArrayList<Friendship> friends = Friendship.getFriends();


    public Searchigs() throws IOException {
    }

    public static void main(String[] args) throws IOException {

        System.out.println("Самый щедрый");
        System.out.println( findGenerous());
//        Найти самого щедрого пользователя (перечислил - payer - большего денег)
        System.out.println("Щедрый город");
        System.out.println( generousCity());
//        Найти город, где самые щедрые пользователи (перечислили больше всего денег)
        System.out.println("Самая высокая средняя");
        System.out.println(   biggestAverage());
//        Найти пользователя, средняя величина платежа которого самая большая
        findBro();
//        Найти пользователя "бро", у которого отношение "платежи друзьям" к "платежам" самое большое.


    }




    public static Map<String,Integer> payersMap() throws IOException {
        ArrayList<Payment>  paymentsLog = Payment.getPayments();
        Map<String, Integer> mapOfPayers = new HashMap<>();
        for (Payment x: paymentsLog) {
            mapOfPayers.put(x.payerId,0);
        }

        for (Payment x : paymentsLog) {
            Integer sum = mapOfPayers.get(x.payerId);
            mapOfPayers.put(x.payerId, sum + x.amount);

        }

        return mapOfPayers;

    } // Map для плательщиков: сразу просуммированы платежи
    public static String findNameByID(String id) throws IOException {
        ArrayList<User> allUsers = User.getUsers();
        for (User x :allUsers ) {
            if (x.id.equals(id)) return x.name;
        }
        return "не нашел";
    }  // возвращает имя по id
    public static String findNameByCity(String id) throws IOException {
        ArrayList<User> allUsers = User.getUsers();
        for (User x : allUsers ) {
            if (x.id.equals(id)) return x.city;
        }
        return "не нашел";
    } // возвращает город пр id
    private static Boolean friendly(String id1, String id2) throws IOException {
        ArrayList<Friendship> friends = Friendship.getFriends();
        for (Friendship x: friends) {
            if (x.id1.equals(id1) && x.id2.equals(id2) || x.id1.equals(id2) && x.id2.equals(id1)){
                return true;
            }
        }
        return false;
    } // возвращает друзья или нет


    private static String findGenerous() throws IOException {

        Map<String, Integer> mapOfPayers = payersMap();
        int max = 0;
        String id = "";
        for (Map.Entry<String, Integer> pair : mapOfPayers.entrySet()) {
            if (pair.getValue() > max) {
                max = pair.getValue();
                id = pair.getKey();
            }
        }
        String name = findNameByID(id );
        return name;
    }

    private static String generousCity( ) throws IOException {
        ArrayList<User> allUsers =User.getUsers();
        Map <String, Integer> payersMap = payersMap();
        Map <String, Integer> cities = new HashMap<>();  // Map для  подсчета города и его суммы.
        for (User x: allUsers) {                          // заполнение городами
            cities.put(x.city,0);
        }
        for (Map.Entry<String, Integer> pair : payersMap.entrySet()) { // заполнение сумм
            String id = pair.getKey();
            Integer amount = pair.getValue();
            String city = findNameByCity(id);
            for   (Map.Entry<String,Integer> pair2 : cities.entrySet()){
                if (pair2.getKey().equals(city)){
                    int sum = pair2.getValue();
                    cities.put(city, sum+amount);
                }
            }
        }
        Integer max = 0;
        String city ="";
        for (Map.Entry<String,Integer> pair : cities.entrySet()) {   // поиска щедрого города
            if (pair.getValue() > max){
                max = pair.getValue();
                city = pair.getKey();
            }
        }

        return city;
    }

    private static String biggestAverage() throws IOException {

        ArrayList<Payment> paymentsLog = Payment.getPayments();
        Map<String,Integer> payersMap = payersMap();
        for (Map.Entry<String ,Integer> pair: payersMap.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            int counter = 0;// количество операций у одного id
            for (Payment x : paymentsLog) {
                if (x.payerId.equals(key)) counter++;
            }

            if (counter != 0) { //
                payersMap.put(key, value/counter);
            }
        }
        // поиск наибольшего среднего
        String id="";
        Integer max = 0;
        for (Map.Entry<String ,Integer> pair: payersMap.entrySet()) {
            if (pair.getValue() > max){
                max = pair.getValue();
                id = pair.getKey();
            }
        }

        return findNameByID(id);
    }

    private static void findBro() throws IOException {

        ArrayList<Payment> paymentsLog = Payment.getPayments();
        // Map для бро
        Map<String,Integer> broHelp = new HashMap<>();
        // Заполнение broHelp
        for (Payment x: paymentsLog) {
            broHelp.put(x.payerId, 0);
        }

        for (Map.Entry<String, Integer> pair : broHelp.entrySet() ) {
            String key = pair.getKey();
//          переменные для поиска соотношения
            int bro = 0, nebro = 0;
            for (Payment x: paymentsLog) {
                if (x.payerId.equals(key)) {
                    if (friendly(x.payerId, x.payeeId) == true) {
                        bro++;
                    } else nebro++;
                }
            }
            if (nebro !=0) {
                broHelp.put(key,bro*100/nebro);
            } else broHelp.put(key, 100);
        }
        // поиск бро
        int max = 0;
        for (Map.Entry<String, Integer> pair: broHelp.entrySet() ) {
            if (pair.getValue() > max) max = pair.getValue();
        }
        System.out.println("Лучший бро на районе:");
        for (Map.Entry<String, Integer> pair: broHelp.entrySet() ) {
            if (pair.getValue() == max) System.out.println(findNameByID(pair.getKey()));

        }
    }

}
