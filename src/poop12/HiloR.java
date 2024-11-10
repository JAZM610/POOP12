/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 * La clase HiloR implementa la interfaz Runnable y representa un hilo de ejecución
 * personalizado que imprime su nombre y el número de iteración.
 * 
 * @author jazm6
 */
public class HiloR implements Runnable{

    /**
     * Método run que contiene el código que será ejecutado cuando el hilo inicie.
     * Imprime el número de iteración y el nombre del hilo en cada iteración.
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteración " + i + " " + Thread.currentThread().getName());
        }
        System.out.println("Termina el " + Thread.currentThread().getName());
    }
    
}
