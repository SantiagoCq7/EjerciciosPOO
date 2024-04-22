/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author santi
 */
import java.util.Scanner;

class Papel {
    public String color;
    public int grosor;

    public Papel() {
        color = "Blanco";
        grosor = 1;
    }
}

public class Main {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Papel papel1 = new Papel();
        
        papel1.color = "Blanco";
        papel1.grosor = 1;
        
        System.out.println("Color: " + papel1.color);
        System.out.println("Grosor: " + papel1.grosor);
        
    }
}
