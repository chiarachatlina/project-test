/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.game;

/**
 *
 * @author chiara
 */
public class Player {
    
    //atribut
    String name, namee;
    
    int Speed, speed, healthPoint, healthpoint, Damage, damage, Armor, armor;
    //int healthPoint;
    
    //method
    void run(){
        System.out.println(name + " is running ... ");
        System.out.println("Speed " + Speed);
        System.out.println(" ");
    }
    
    void running(){
        System.out.println(namee + " is running ... ");
        System.out.println("Speed " + speed);
        System.out.println(" ");
    }
    
    void attack(){
        System.out.println(name + " is attacking...");
        System.out.println("Damage "+damage);
        System.out.println(" ");
    }
    
    void attacking(){
        System.out.println(namee + " is attacking...");
        System.out.println("Damage "+Damage);
        System.out.println(" ");
    }
    
    void defend(){
        System.out.println(name + " is defending...");
        System.out.println("Armor "+armor);
        System.out.println(" ");
    }
    
    void defending(){
        System.out.println(namee + " is defending...");
        System.out.println("Armor "+Armor);
        System.out.println(" ");
    }
    
    boolean isDead(){
        
       if(healthPoint<=0) return true;
       return false;

    }
    
   
    boolean point(){
        if(armor<100) return true;
        return false;
    }
    
    boolean trying(){
        if (healthPoint<100) return true;
        return false;
    }
    
    boolean tackk(){
        if (damage<300) return true;
        return false;
    }
    
    boolean ppoin(){
        if (healthpoint<=0) return true;
        return false;
    }
    
    boolean hhidup(){
        if (healthpoint>0) return true;
        return false;
    }
}