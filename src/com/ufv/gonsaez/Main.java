package com.ufv.gonsaez;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nombre:");
        persona.setNombre(sc.nextLine());

        System.out.println("Escribe tus apellidos:");
        persona.setApellidos(sc.nextLine());

        System.out.println("Escribe tu dni sin la letra:");
        persona.setDnisinletra(sc.nextInt());

        System.out.println("Escribe tu edad:");
        persona.setEdad(sc.nextInt());

        System.out.println("Ayoo: " + persona.getNombre());

    }
}
