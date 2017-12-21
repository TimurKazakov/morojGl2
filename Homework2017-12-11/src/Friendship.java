import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Friendship {



    String friendsNames;
    String id1;
    String id2;

    public Friendship(String friendsNames, String id1, String id2) {
        this.friendsNames = friendsNames;
        this.id1 = id1;
        this.id2 = id2;
    }

    public Friendship(String friendsNames) {
        this.friendsNames = friendsNames;
    }
    @Override
    public String toString() {
        return this.friendsNames;
    }


    public static  final String FRIENDSHIPFILEPATH = "src\\Friendship.txt";
    // файл типа "id и id = друзья" 5 слов 4 пробела
    public static ArrayList<Friendship> getFriends() throws IOException {
         ArrayList<Friendship> friends = new ArrayList<>();
         ArrayList friendshipList = new ArrayList();

        BufferedReader reader = new BufferedReader(new FileReader(FRIENDSHIPFILEPATH));
        int counter = 0;
        while (reader.ready()){
            String makeFriens = reader.readLine();
            for (String x: makeFriens.split(" ")) {
                friendshipList.add(x);
            }
        String makeFriendsName = friendshipList.get(0+ counter)+ "friendOf"+friendshipList.get(2 + counter);
            friends.add(new Friendship(makeFriendsName, friendshipList.get(0 + counter)+"", friendshipList.get(2+counter)+""));

        counter += 5;

        }

        return friends;

    }



}
