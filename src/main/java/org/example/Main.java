package org.example;

import jdk.swing.interop.SwingInterOpUtils;
import org.example.modelos.Herramienta;
import org.example.modelos.Samurai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //creando objetos
        Samurai samurai=new Samurai();
        Samurai samuraiDos=new Samurai();
        Herramienta herramienta= new Herramienta("Escopeta",90.0);
        Herramienta herramientaDos= new Herramienta();
        Scanner entradaPorTeclado = new Scanner(System.in);

        //UTILIZAR-ACCEDER-VER-MODIFICAR-OPERAR-REVISAR-VALIDAR
        //LOS ATRIBUTOS Y METODOS DE UNA CLASE
        samurai.setNombres("Koshito micamoto");
        System.out.print("Digita la edad del primer samurai: ");
        samurai.setEdad(entradaPorTeclado.nextInt());

        entradaPorTeclado.nextLine();
        


        System.out.println("**********RESULTADOS*********");
        System.out.println("El samurai: "+samurai.getNombres()+" Tiene: "+samurai.getEdad());



    }
}