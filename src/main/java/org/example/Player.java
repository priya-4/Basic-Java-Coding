package org.example;

public class Player {
    String name;
    String level;
    String health;

    Player(){

    }
     Player(String name,String level, String health){
        name=this.name;
        level=this.level;
        health=this.health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getHealth() {
        return health;
    }



    public void setHealth(String health) {
        this.health = health;
    }
    @Override
    public String toString(){
        return "name: "+ this.name + "level: "+this.level +"health : " + this.health;
    }
}
