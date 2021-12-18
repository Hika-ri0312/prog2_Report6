import jp.ac.uryukyu.ie.e205217.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("1", 0);
        Player player2 = new Player("2", 0);    

        System.out.println("おみくじすごろくゲーム開始です！");
        new Scanner(System.in).nextLine();
        player1.to_roku();
        player2.to_roku();
    }
}
