/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.AdministradorProcesos;
import model.Maquina;
import model.Proceso;
import model.ListaParticiones;

/**
 *
 * @author fioli
 */
public class PruebaBorrador {

    public static void main(String[] args) {

        AdministradorProcesos admin = new AdministradorProcesos();

        // Crear máquina
        Maquina m = new Maquina(1, "M1", 0, 256, 1);
        admin.getListaMaquinasActiva().add(m);

        System.out.println("=========================================");
        System.out.println("     PRUEBA: ASIGNACIÓN DINÁMICA");
        System.out.println("=========================================");

        Proceso d1 = new Proceso(1, "D1", 1, 0, 5, 40, 0);
        Proceso d2 = new Proceso(2, "D2", 1, 0, 5, 20, 0);
        Proceso d3 = new Proceso(3, "D3", 1, 0, 5, 50, 0);

        admin.asignarMemoriaAProceso(d1, m, 0); // dinámico
        admin.asignarMemoriaAProceso(d2, m, 0);
        admin.asignarMemoriaAProceso(d3, m, 0);

        System.out.println(m.getListaParticiones().listarParticiones());

        System.out.println("\n--- Liberando D2 ---");
        admin.liberarMemoriaProceso(d2);
        System.out.println(m.getListaParticiones().listarParticiones());

        System.out.println("\n--- Fusionando Libres ---");
        m.getListaParticiones().fusionarLibres();
        System.out.println(m.getListaParticiones().listarParticiones());

        System.out.println("\n--- Compactando ---");
        m.getListaParticiones().compactar();
        System.out.println(m.getListaParticiones().listarParticiones());

        // DESPUÉS DE LA PRIMERA PARTE, REINICIAMOS LA MEMORIA
        m.resetListaParticiones();

        System.out.println("\n=========================================");
        System.out.println("     PRUEBA: PRIMER AJUSTE");
        System.out.println("=========================================");

        // Reiniciar particiones en máquina
        m.setListaParticiones(new ListaParticiones());

        Proceso p1 = new Proceso(4, "P1", 1, 0, 5, 30, 0);
        Proceso p2 = new Proceso(5, "P2", 1, 0, 5, 40, 0);
        Proceso p3 = new Proceso(6, "P3", 1, 0, 5, 20, 0);

        admin.asignarMemoriaAProceso(p1, m, 1); // Primer Ajuste
        admin.asignarMemoriaAProceso(p2, m, 1);
        admin.asignarMemoriaAProceso(p3, m, 1);

        System.out.println(m.getListaParticiones().listarParticiones());

        System.out.println("\n=========================================");
        System.out.println("     PRUEBA: MEJOR AJUSTE");
        System.out.println("=========================================");

        m.setListaParticiones(new ListaParticiones());

        Proceso b1 = new Proceso(7, "B1", 1, 0, 5, 35, 0);
        Proceso b2 = new Proceso(8, "B2", 1, 0, 5, 15, 0);
        Proceso b3 = new Proceso(9, "B3", 1, 0, 5, 45, 0);

        admin.asignarMemoriaAProceso(b1, m, 2); // Mejor Ajuste
        admin.asignarMemoriaAProceso(b2, m, 2);
        admin.asignarMemoriaAProceso(b3, m, 2);

        System.out.println(m.getListaParticiones().listarParticiones());

        System.out.println("\n=========================================");
        System.out.println("     PRUEBA: PEOR AJUSTE");
        System.out.println("=========================================");

        m.setListaParticiones(new ListaParticiones());

        Proceso w1 = new Proceso(10, "W1", 1, 0, 5, 25, 0);
        Proceso w2 = new Proceso(11, "W2", 1, 0, 5, 50, 0);
        Proceso w3 = new Proceso(12, "W3", 1, 0, 5, 30, 0);

        admin.asignarMemoriaAProceso(w1, m, 3); // Peor Ajuste
        admin.asignarMemoriaAProceso(w2, m, 3);
        admin.asignarMemoriaAProceso(w3, m, 3);

        System.out.println(m.getListaParticiones().listarParticiones());
    }
}
