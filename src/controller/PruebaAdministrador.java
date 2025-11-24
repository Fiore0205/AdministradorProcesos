/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.AdministradorProcesos;
import model.Recurso;

public class PruebaAdministrador extends Thread {

     public static void main(String[] args) {

        AdministradorProcesos admin = new AdministradorProcesos();

        // ============================================================
        // 1. CREAR MÁQUINAS
        // ============================================================

        // Máquina 1 → tiempoInicio = 0
        admin.crearMaquina(1, "Maquina-A", 0, 30, 2);
        admin.agregarMaquina();
        admin.asignarRecursoAMaquina(new Recurso(0, "Imp", 5));
        admin.asignarRecursoAMaquina(new Recurso(1, "Dis", 3));
        admin.asignarRecursoAMaquina(new Recurso(2, "DVD", 2));

        // Máquina 2 → tiempoInicio = 2
        admin.crearMaquina(2, "Maquina-B", 2, 50, 4);
        admin.agregarMaquina();
        admin.asignarRecursoAMaquina(new Recurso(0, "Imp", 10));
        admin.asignarRecursoAMaquina(new Recurso(1, "Dis", 5));
        admin.asignarRecursoAMaquina(new Recurso(2, "DVD", 4));


        // ============================================================
        // 2. CREAR PROCESOS
        // ============================================================

        // PROCESO 1 → quedará en ESPERA
        // le damos más memoria de la disponible en Maquina 1
        admin.crearProceso(1, "P1", 1, 0, 4, 40, 1); 
        admin.asignarRecursoAProceso(new Recurso(0, "Imp", 3)); 
        admin.asignarRecursoAProceso(new Recurso(1, "Dis", 2)); 
        admin.agregarProceso();

        // PROCESO 2 → ACTIVO
        admin.crearProceso(2, "P2", 1, 0, 3, 10, 1);
        admin.asignarRecursoAProceso(new Recurso(0, "Imp", 2)); 
        admin.asignarRecursoAProceso(new Recurso(1, "Dis", 1)); 
        admin.agregarProceso();

        // PROCESO 3 → BLOQUEADO
        admin.crearProceso(3, "P3", 1, 0, 2, 5, 1);
        admin.asignarRecursoAProceso(new Recurso(0, "Imp", 99)); 
        admin.asignarRecursoAProceso(new Recurso(1, "Dis", 99)); 
        admin.agregarProceso();


        // ============================================================
        // 3. INICIAR ALGORITMO FIFO
        // ============================================================

        System.out.println("\n=== INICIANDO EJECUCIÓN FIFO ===\n");

        admin.algoritmoOrdenDeLlegada();

        System.out.println("\n=== ESTADOS FINALES ===\n");
        System.out.println(admin.listarTablaDeEstados());
    }
}
