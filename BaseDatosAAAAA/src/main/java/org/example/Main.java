package org.example;

import org.example.Controladores.BotonesBase;
import org.example.Vista.ventanaBase;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ventanaBase view= new ventanaBase("Estructura de Datos");
        BotonesBase controllerbase=new BotonesBase(view);

    }
}