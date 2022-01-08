package jp.ac.uryukyu.ie.e205217;

public class Player {
    public String name;
    public int position;

    /**
    * プレイヤークラス
    * @param name プレイヤー名
    * @param position スタート位置
    */

    public Player(String name, int position){
        this.name = name;
        this.position = position;
    }   
    
    /**
     * 登録メソッド
     * プレイヤー名、スタート位置を確認
     */
    public void to_roku(){
        System.out.printf("%sさん、登録完了。%dマス目からスタート！\n", name, position);
    } 
}