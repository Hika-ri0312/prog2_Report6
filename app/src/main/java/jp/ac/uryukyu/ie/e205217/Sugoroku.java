package jp.ac.uryukyu.ie.e205217;

import java.util.*;

public class Sugoroku {
    public int goal;
    public int num;
    public String koma;

    public Sugoroku(int num, int goal, String koma){
        this.goal = goal;
        this.num = num;
        this.koma = koma;
    }

    public void map(){
        System.out.printf("ゴールは%dマス目です！\n",goal);
    }
    
    public void play(){
        int[] membersPos = new int[num];		
		while (true) {
			for (int i = 0; i < num; i++) {
				int kuji = new Random().nextInt(8) + 1;
                int backStep = 0;
                if(kuji == 2) {        
                    System.out.println("大吉！");
                    membersPos[i] += 3; 
                    System.out.println("3マス進む");
                }else if(kuji == 4 || kuji == 6) {                    
                    System.out.println("中吉");
                    membersPos[i] += 2;
                    System.out.println("2マス進む");
                }else{            
                    System.out.println("吉");
                    membersPos[i] += 1;
                    System.out.println("1マス進む");}         
				if (membersPos[i] > goal) {
					backStep = membersPos[i] - goal;
					membersPos[i] = goal - backStep;
                }
				System.out.printf("P%dさん...%d(%d)%n", i + 1, kuji, membersPos[i]);
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
				}if (membersPos[i] == goal) {
					System.out.printf("%nGoal! P%dさん の勝ちです!%n", i + 1);
					return;
				} new Scanner(System.in).nextLine();
			}
            System.out.println();
        }
    }
}
