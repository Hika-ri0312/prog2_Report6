package jp.ac.uryukyu.ie.e205217;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    /**
     * 1番のくじ(大吉)が出ると３歩進むことができるかを検証
     * 検証手順
     * 引数mobkujiの値を1とする
     * kuji(mobkuji)を実行し、3が返されることを期待。これを検証する。
     */
    @Test    
    void GameTest() {
        int mobkuji = 1;
        Sugoroku mobevent = new Sugoroku(2,7,"○");
        assertEquals(3, mobevent.kujibiki(mobkuji)); //testnum = kuji(kuji) 
    }
}