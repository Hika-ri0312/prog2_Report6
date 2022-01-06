package jp.ac.uryukyu.ie.e205217;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    @Test    
    void GameTest() {
        int mobkuji = 1;
        Sugoroku mobevent = new Sugoroku(2,7,"○");
        assertEquals(3, mobevent.kuji(mobkuji)); //testnum = kuji(kuji) 
    }
}