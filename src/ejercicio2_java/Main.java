/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_java;

import java.util.Scanner;

/**
 *
 * @author Victor Rosario
 */
public class Main {

    public static void main(String[] args) {
        //Ejercicio 2
        
        Scanner read = new Scanner(System.in);
        String nombre;
        int edad;
        char sexo;
        double peso;
        double altura;
        
        System.out.print("\n* Ingrese el nombre: ");
        nombre = read.next();
        
        System.out.print("\n* Ingrese el la edad: ");
        edad = read.nextInt();
        
        System.out.print("\n* Ingrese el sexo (M o F): ");
        sexo = read.next().charAt(0);
        
        System.out.print("\n* Ingrese el peso (en libras): ");
        peso = read.nextDouble();
        
        System.out.print("\n* Ingrese la altura (en pies): ");
        altura = read.nextDouble();
        
        //objetos
        
        Persona persona = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();
        
        persona3.setNombre("josefina");
        persona3.setEdad(35);
        persona3.setPeso(130);
        persona3.setSexo('I');
        persona3.setAltura(5.6);
        
        switch(persona.calcularPesoIdeal()){
            case -1: System.out.println("\n* La persona 1 esta en su peso ideal");
            break;
            
            case 0: System.out.println("\n* La persona 1 esta por debajo su peso ideal");
            break;
            
            case 1: System.out.println("\n* La persona 1 esta en sobre peso");
            break;
        }
        
         switch(persona2.calcularPesoIdeal()){
            case -1: System.out.println("\n* La persona 2 esta en su peso ideal");
            break;
            
            case 0: System.out.println("\n* La persona 2 esta por debajo su peso ideal");
            break;
            
            case 1: System.out.println("\n* La persona 2 esta en sobre peso");
            break;
        }
         
        switch(persona3.calcularPesoIdeal()){
            case -1: System.out.println("\n* La persona 3 esta en su peso ideal");
            break;
            
            case 0: System.out.println("\n* La persona 3 esta por debajo su peso ideal");
            break;
            
            case 1: System.out.println("\n* La persona 3 esta en sobre peso");
            break;
        }
          
        
        persona.ToString();
        persona2.ToString();
        persona3.ToString();
        
    }
    
}
