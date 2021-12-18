package jp.ac.uryukyu.ie.e205217;

import java.util.*;
public class Omikuzi{
    public String god;

    public Omikuzi(String god){
        this.god = god;
    }

    public void Otuge(){
        System.out.printf("ゴールおめでとう！%s様からの今年のお告げです\n",god);
        new Scanner(System.in).nextLine();
        
        List<String> list = Arrays.asList("『恋愛』：恋愛成就...?！","『学問』：期末試験は満点だ！！","『健康』：コロナに負けるな！！","『商売』金運アップ間違いなし！！"); 

        int index = new Random().nextInt(list.size()); // ランダムに選択された 0 以上 4 未満の整数
        String result = list.get(index); // ランダムに選択された要素

        System.out.println(result); ;

        System.out.println("今年も良い一年でありますように...");
    }
}
