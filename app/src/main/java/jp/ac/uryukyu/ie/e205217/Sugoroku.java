package jp.ac.uryukyu.ie.e205217;

import java.util.*;

public class Sugoroku {
    public int num;
    public int goal;
    public String koma;
    /**
     * すごろくクラス
     * @param num　参加人数
     * @param goal ゴール位置
     * @param koma　使うコマ
     */

    public Sugoroku(int num, int goal, String koma){
        this.num = num;
        this.goal = goal;
        this.koma = koma;
    }

    /**
     * マップメソッド
     * ゴール位置のアナウンスをする。
     */
    public void map(){
        System.out.printf("ゴールは%dマス目です！\n",goal);
    }
    
    /**
     * くじメソッド
     * くじを引き、進むマスを決める
     * @param kuji くじの番号
     * 1番は大吉、2番と3番は中吉、それ以外は吉
     * @return　1,2,3
     */
    public int kujibiki(int kuji){
        if(kuji == 1) {        
            System.out.println("大吉！");
            return 3;
        }else if(kuji == 2 || kuji == 3) {                    
            System.out.println("中吉");
            return 2;            
        }else{            
            System.out.println("吉");
            return 1;            
            }
    }

    /**
     * プレイメソッド
     * ゲームを実行するメソッド
     * マスの生成、イベントの発生を行う
     */
    public void play(){
        int[] membersPos = new int[num];		
		while (true) {
			for (int i = 0; i < num; i++) {
				int kuji = new Random().nextInt(8) + 1;
                int backStep = 0;
                int go = 0;                
                go = kujibiki(kuji);
                membersPos[i] += go;
                String result = String.format("%sマス進む", go); 
                System.out.println(result);       
				if (membersPos[i] > goal) {
					backStep = membersPos[i] - goal;
					membersPos[i] = goal - backStep;
                }
				System.out.printf("P%dさん...%d(現在位置%dマス目)%n", i + 1, kuji, membersPos[i]);
				if (backStep > 0) {
					System.out.printf("ゴールを超えたので %d マス戻ります%n", backStep);
                }
                if(membersPos[i] == 8 || membersPos[i] == 12){
                    membersPos[i] = 0;
                    System.out.println("スタート地点に戻ります。");
                }
                if(membersPos[i] == 5 || membersPos[i] == 13 || membersPos[i] == 16){
                    membersPos[i] += 2;
                    System.out.println("2マス進みます。");
                }                
				for (int j = 0; j < goal; j++) {
					if(membersPos[i] != goal && j==goal-1){
						System.out.print("|");
                    }else if(j<membersPos[i]){
						System.out.print(koma);
                    }else{
						System.out.print(" ");
                    }
				}
                if (membersPos[i] == goal) {
					System.out.printf("%nGoal! P%dさん の勝ちです!%n", i + 1);
					return; 
				} new Scanner(System.in).nextLine();
			}
            System.out.println();
        }
    }
}