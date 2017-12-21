import sun.applet.Main;

import java.io.*;
import java.util.ArrayList;

public  class User {

    String id;
    String name;
    String city;



    Integer money;


    public User(String id,String name , String city, Integer money) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.money = money;
    }

    public static  final String USERSFILEPATH = "src\\Users.txt";
    // файл вида "id name city money", 4 слова, 3 пробела

    public static ArrayList<User> getUsers() throws IOException {
         ArrayList<User> allUsers = new ArrayList<>();

         ArrayList<String> userData = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(USERSFILEPATH));
        int counter = 0;
        while (reader.ready()){
            String singleUser = reader.readLine();
            for (String x: singleUser.split(" ")) {
                userData.add(x);
            }


            try{
               allUsers.add(new User((userData.get(0+counter)),  userData.get(1+counter),userData.get(2+ counter), Integer.valueOf(userData.get(3+counter))));
            } catch (NumberFormatException e){
                e.printStackTrace();
            }
            counter +=4;
        }


    return allUsers;
    }






}



