/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.game;

/**
 *
 * @author chiara
 */
public class Game {

    public static void main(String[] args) {
        //Buat objek
        Player hero = new Player();
        Player enemy = new Player();
        
        hero.name = "Gyuvin";
        hero.Speed = 60;
        hero.healthPoint = 100;
        hero.damage = 300;
        hero.armor = 350;
        
        hero.run();        
        hero.attack(); 
        hero.defend();
        
        if(hero.isDead()){
            System.out.println("Game Over!");
        }
        if(hero.point()){
            System.out.println("You need more armor!");
        }
        if(hero.trying()){
            System.out.println("Keep going, " + hero.name +"");
        }
        if(hero.tackk()){
            System.out.println("You need more damage!");
            System.out.println("You brought a buff food!");
        }
        
        System.out.println("NEW ENEMY IS COMING!");
        System.out.println(" ");
        enemy.namee = "Ricky";
        enemy.speed = 80;
        enemy.healthpoint = 100;
        enemy.Damage = 2000;
        enemy.Armor = 400;
        
        enemy.running();
        enemy.attacking();
        enemy.defending();
        
        if(enemy.ppoin()){
            System.out.println("Enemy defeated.");
            System.out.println("YOU WIN!");
        }
        if(enemy.hhidup()){
            System.out.println("Enemy is still alive.");
            System.out.println("YOU LOSE!");
        }
    }
}
