/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_java;

/**
 *
 * @author Victor Rosario
 */
public class Persona {
    String nombre = "";
    int edad = 0;
    String cedula = "0000000000";
    char sexo = 'M';
    double peso = 0;
    double altura = 0;
    
    public void setNombre(String nombre){this.nombre = nombre;}
    public void setEdad(int edad){this.edad = edad;}
    public void setSexo(char sexo){this.sexo = sexo;}
    public void setPeso(double peso){this.peso = peso;}
    public void setAltura(double altura){this.altura = altura;}
     
    
    public Persona(){
        generarCedula();
    }
    
    public Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        generarCedula();
    }
    
    public Persona(String nombre, int edad, char sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        generarCedula();
    }
    
    public double convertirPieAMetros(){  
        return altura / 3.281;
    }
    
    public double convertirAKilogramos(){
        return peso / 2.205;
    }
    
    public int calcularPesoIdeal(){
        double resultado = convertirAKilogramos() / (Math.pow(convertirPieAMetros(), 2));
        
        if(resultado < 20){
            return -1;
        }
        else if(resultado >=20 && resultado <= 25){
            return 0;
        }
        else{
            return 1;
        }       
    }
    
    public boolean esMayorDeEdad(){
        if(edad >= 18)
            return true;
        return false;
    }
    
    public char comprobarSexo(){
        if(sexo != 'M' && sexo != 'F' )
            return 'H';
        return sexo;
            
    }
    
    public void ToString(){
        if(comprobarSexo() != 'H'){
            System.out.println
            ("Nombre: " + nombre + "\n" +
             "Edad: " + edad + "\n" +
             "Cedula: " + cedula + "\n" +
             "Sexo :" + sexo + "\n" + 
             "Peso: " + convertirAKilogramos() + " Kilogramos" + "\n" +
             "Altura: " + convertirPieAMetros() + " Metros \n"         
            );
        }
        else{
            System.out.println
            ("Nombre: " + nombre + "\n" +
             "Edad: " + edad + "\n" +
             "Cedula: " + cedula + "\n" +
             "Peso: " + convertirAKilogramos() + " Kilogramos" + "\n" +
             "Altura: " + convertirPieAMetros() + " Metros \n"         
            );
        }
        
    }
    
    public void generarCedula(){
        String numeroAleatorio = String.valueOf(Math.random());
        this.cedula = numeroAleatorio.substring(2, 13);
    }
}
