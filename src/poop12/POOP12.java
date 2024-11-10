/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop12;

/**
 * La clase principal POOP12.
 * Esta clase inicia varios hilos de ejecución.
 * 
 * @author jazm6
 */
public class POOP12 {

    /**
     * El método principal de la aplicación.
     * @param args los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        
        // Creación e inicio de tres hilos con nombres específicos
        Hilo h1 = new Hilo("hilo1");
        Hilo h2 = new Hilo("hilo2");
        Hilo h3 = new Hilo("hilo3");
        h1.start();
        h2.start();
        h3.start();
        
        // Creación e inicio de dos hilos adicionales sin almacenamiento de referencia
        new Hilo("Hilo4").start();
        new Hilo("Hilo5").start();
        
        // Creación e inicio de tres hilos utilizando la interfaz Runnable
        new Thread(new HiloR(), "HiloR6").start();
        new Thread(new HiloR(), "HiloR7").start();
        new Thread(new HiloR(), "HiloR8").start();
    }
    
}
