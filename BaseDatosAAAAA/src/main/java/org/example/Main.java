package org.example;

import org.example.Controladores.BotonesBase;
import org.example.Vista.menu;
import org.example.Vista.ventanaBase;

import static java.awt.SystemColor.menu;

public class Main {
    public static void main(String[] args) {
        System.out.println("hola mundo");
        menu men=new menu("Estructura de Datos");
        ventanaBase view= new ventanaBase("Estructura de Datos");
        BotonesBase controllerbase=new BotonesBase(view);

    }
}