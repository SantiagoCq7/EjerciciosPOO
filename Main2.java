/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author santi
 */

class Mascara{
    public String personaje;
    public Boolean tienepelo;
    
    public Mascara() {
    personaje = "Juan";
    tienepelo = false;
    }
}


public class Main2 {

    public static void main(String[] args) {
        
        Mascara mascara1 = new Mascara();
        

        mascara1.personaje = "Spiderman";
        mascara1.tienepelo = true;
        

        System.out.println("El personaje de la máscara es: " + mascara1.personaje);
        System.out.println("¿La máscara tiene pelo? " + (mascara1.tienepelo ? "Sí" : "No"));
    }
}
