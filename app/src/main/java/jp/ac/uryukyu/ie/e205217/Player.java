package jp.ac.uryukyu.ie.e205217;

public class Player {
    public String name;
    public int position;

    public Player(String name, int position){
        this.name = name;
        this.position = position;
    }   
    public void to_roku(){
        System.out.printf("%sさん、登録完了。%dマス目からスタート！\n", name, position);
    } 
}