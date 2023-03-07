package org.example;
import java.io.*;
import java.util.Scanner;

public class Writer1 {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        s.useDelimiter("\n");
        String nombre, curp,carrera, matricula, hobby;
        int edad;
        try{
            File f=new File("Archivo1.txt");
            if(!f.exists()){
                f.createNewFile();
            }
            FileWriter fw= new FileWriter(f,true);
            BufferedWriter bw= new BufferedWriter(fw);
            PrintWriter pw= new PrintWriter(bw);

            pw.println("");
            System.out.print("Ingresa tu nombre completo:");
            nombre = s.next();
            System.out.print("Ingresa tu CURP:");
            curp = s.next();
            System.out.print("Ingresa tu edad:");
            edad = s.nextInt();
            System.out.print("Ingresa tu carrera:");
            carrera = s.next();
            System.out.print("ingresa tu matricula: ");
            matricula = s.next();
            System.out.print("cual es tu hobby?:");
            hobby = s.next();

            pw.println("Tu Nombre completo es: "+ nombre);
            pw.println("Tu CURP es: "+curp);
            pw.println("Tu edad es: "+edad);
            pw.println("Tu carrera es: "+carrera);
            pw.println("Tu matricula es: "+matricula);
            pw.println("Tu hobby: "+hobby);

            pw.close();
            System.out.println("¡Se pudo escribir sin problemas!");
        }catch(IOException ioe){
            System.out.println("Ocurrio un problema!:C ");
            ioe.printStackTrace();
        }
    }
}
