
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author santi
 */




public class LibroMain {
        public static void main(String[] args) {

        Libro libro1 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 5);
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 3);


        System.out.println("Ejemplares prestados de " + libro1.getTitulo() + ": " + libro1.getNumEjemplaresPrestados());
        System.out.println("Prestamo de " + libro1.getTitulo() + ": " + libro1.prestar());
        System.out.println("Ejemplares prestados de " + libro1.getTitulo() + ": " + libro1.getNumEjemplaresPrestados());

        System.out.println("Ejemplares prestados de " + libro2.getTitulo() + ": " + libro2.getNumEjemplaresPrestados());
        System.out.println("Prestamo de " + libro2.getTitulo() + ": " + libro2.prestar());
        System.out.println("Ejemplares prestados de " + libro2.getTitulo() + ": " + libro2.getNumEjemplaresPrestados());

        System.out.println("Devolución de " + libro1.getTitulo() + ": " + libro1.devolver());
        System.out.println("Ejemplares prestados de " + libro1.getTitulo() + ": " + libro1.getNumEjemplaresPrestados());

        System.out.println("Devolución de " + libro2.getTitulo() + ": " + libro2.devolver());
        System.out.println("Ejemplares prestados de " + libro2.getTitulo() + ": " + libro2.getNumEjemplaresPrestados());
    }
}
