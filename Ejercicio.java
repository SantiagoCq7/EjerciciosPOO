/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author santi
 */

class Triangulo{
    private int base;
    private int altura;
    
public Triangulo(int base, int altura){
    this.base = base;
    this.altura = altura;
}

public void setBase(int base){
    this.base = base;
}

public void setAltura(int altura){
    this.altura = altura;    
}

public int getBase(){
    return base;
}

public int getAltura(){
    return altura;
}

public double calcularArea(){
    return (base*altura) / 2;
}

}



public class Ejercicio {
        public static void main(String[] args) {

        Triangulo triangulo1 = new Triangulo(5, 5);
        Triangulo triangulo2 = new Triangulo(7, 7);

        // Consultar los atributos
        System.out.println("Triángulo 1:");
        System.out.println("Base: " + triangulo1.getBase());
        System.out.println("Altura: " + triangulo1.getAltura());
        System.out.println("Área: " + triangulo1.calcularArea());

        System.out.println();

        System.out.println("Triángulo 2:");
        System.out.println("Base: " + triangulo2.getBase());
        System.out.println("Altura: " + triangulo2.getAltura());
        System.out.println("Área: " + triangulo2.calcularArea());

        // Cambio atributos
        triangulo1.setBase(10);
        triangulo1.setAltura(10);

        System.out.println();
        System.out.println("Después de cambiar los valores:");

        System.out.println("Triángulo 1:");
        System.out.println("Base: " + triangulo1.getBase());
        System.out.println("Altura: " + triangulo1.getAltura());
        System.out.println("Área: " + triangulo1.calcularArea());
    }
}
