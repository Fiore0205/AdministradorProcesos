package model;

import java.util.ArrayList;

public class Maquina {

    private ListaRecursos listaRecursoMaquina;
    private int unidadesMemoriaMaquina;
    private int unidadesMemoriaDisponible;
    private int unidadesMemoriaUtilizada;
    private int cantidadNucleos;
    private int nMaquina;
    private int unidadesCPUMaquina;
    private String nombre;
    private String ubicacion;
    private int tiempoInicio;
    private ArrayList<String> memoriaMapa;  // Representación visual

    // --- CONSTRUCTOR PRINCIPAL ---
    public Maquina(int nMaquina, String nombre,
            int tiempoInicio, int unidadesMemoriaMaquina,
            int unidadesCPUMaquina) {

        this.nMaquina = nMaquina;
        this.nombre = nombre;
        ubicacion = "";
        this.tiempoInicio = tiempoInicio;
        this.unidadesMemoriaMaquina = unidadesMemoriaMaquina;
        this.unidadesMemoriaDisponible = unidadesMemoriaMaquina;
        this.unidadesMemoriaUtilizada = 0;
        this.unidadesCPUMaquina = unidadesCPUMaquina;
        cantidadNucleos = (int) (Math.random() * 4) + 1;

        listaRecursoMaquina = new ListaRecursos(15);
        listarMemoriaLibres();
    }

    // --- GETTERS Y SETTERS ---
    public int getNMaquina() {
        return nMaquina;
    }

    public void setNMaquina(int nMaquina) {
        this.nMaquina = nMaquina;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getTiempoInicio() {
        return tiempoInicio;
    }

    public void setTiempoInicio(int tiempoInicio) {
        this.tiempoInicio = tiempoInicio;
    }

    public int getUnidadesMemoriaMaquina() {
        return unidadesMemoriaMaquina;
    }

    public void setUnidadesMemoriaMaquina(int unidades) {
        this.unidadesMemoriaMaquina = unidades;
        this.unidadesMemoriaDisponible = unidades;
    }

    public int getUnidadesMemoriaDisponible() {
        return unidadesMemoriaDisponible;
    }

    public int getUnidadesMemoriaUtilizada() {
        return unidadesMemoriaUtilizada;
    }

    public int getUnidadesCPUMaquina() {
        return unidadesCPUMaquina;
    }

    public void setUnidadesCPUMaquina(int unidadesCPUMaquina) {
        this.unidadesCPUMaquina = unidadesCPUMaquina;
    }

    public int getCantidadNucleos() {
        return cantidadNucleos;
    }

    public void setCantidadNucleos(int cantidadNucleos) {
        this.cantidadNucleos = cantidadNucleos;
    }

    public ListaRecursos getListaRecursoMaquina() {
        return listaRecursoMaquina;
    }

    // --- MÉTODOS MEMORIA ---
    public void asignarMemoria(int cantidad) {
        unidadesMemoriaDisponible -= cantidad;
        unidadesMemoriaUtilizada += cantidad;
    }

    public void liberarMemoria(int cantidad) {
        unidadesMemoriaDisponible += cantidad;
        unidadesMemoriaUtilizada -= cantidad;
    }

    // --- MÉTODOS CPU ---
    public boolean asignarProcesador() {
        if (unidadesCPUMaquina > 0) {
            unidadesCPUMaquina -= 1;
            return true;
        }
        return false;
    }

    public void liberarProcesador() {
        unidadesCPUMaquina += 1;
    }

    // --- RECURSOS ---
    public void asignarRecurso(Recurso nuevo) {
        listaRecursoMaquina.agregarRecurso(nuevo);
    }

    public void liberarRecursoPorNumero(int numeroRecurso) {
        listaRecursoMaquina.liberarRecursoPorNumero(numeroRecurso);
    }

    public String listarRecursosDisponibles() {
        return listaRecursoMaquina.listarRecursosDetalle();
    }

    // --- STRING DETALLE ---
    public String listarMaquina() {
        return nombre + "\t" + tiempoInicio + "\t"
                + unidadesMemoriaMaquina + "\t"
                + unidadesMemoriaDisponible + "\t"
                + unidadesMemoriaUtilizada;
    }

    public String toString() {
        return "Máquina:............" + nombre
                + "\nNúmero:..........." + nMaquina
                + "\nTiempo Inicio:...." + tiempoInicio
                + "\nMemoria:.........." + unidadesMemoriaMaquina
                + "\nDisponible:......." + unidadesMemoriaDisponible
                + "\nUsada:............" + unidadesMemoriaUtilizada
                + "\nCPU:.............." + unidadesCPUMaquina
                + "\nNúcleos:.........." + cantidadNucleos;
    }

    public String toStringDetalle() {
        String sal = "";
        sal += nombre + ": ";
        sal += nMaquina + ", ";
        sal += tiempoInicio + ", ";
        sal += unidadesMemoriaMaquina + ", ";
        sal += unidadesMemoriaDisponible + ", ";
        sal += unidadesMemoriaUtilizada + ", ";
        sal += unidadesCPUMaquina + ", ";
        sal += cantidadNucleos;
        return sal;
    }

    public String listarRecursosTabla() {
        StringBuilder sb = new StringBuilder();

        // Encabezado de tabla
        sb.append(String.format("%-5s %-12s %-10s %-10s\n",
                "#", "NOMBRE", "DISP.", "OCUP."));

        // Línea divisora opcional
        sb.append("------------------------------------------\n");

        // Ciclo por todos los recursos de la máquina
        for (Recurso r : listaRecursoMaquina.getLista()) {
            sb.append(r.toStringRecursoTabla()).append("\n");
        }

        return sb.toString();
    }

    //--- Listar Memoria de Maquina ---
    public String enlistarMemoriaMaquina() {
        StringBuilder sb = new StringBuilder();

        sb.append(nombre).append("\t");

        for (String celda : memoriaMapa) {
            sb.append(celda).append("  ");
        }
        return sb.toString();
    }

    //--- inicializar Mapa de Memoria ---
    public void listarMemoriaLibres() {
        memoriaMapa = new ArrayList<>();
        for (int i = 0; i < unidadesMemoriaMaquina; i++) {
            memoriaMapa.add("L");
        }
    }

    // --- Asignar memoria y llenar mapa ---
    public void ocuparMemoriaMapa(Proceso p) {
        int cantidad = p.getUnidadesMem();
        int asignados = 0;

        for (int i = 0; i < memoriaMapa.size() && asignados < cantidad; i++) {
            if (memoriaMapa.get(i).equals("L")) {
                memoriaMapa.set(i, "P" + p.getNProceso());
                asignados++;
            }
        }
    }

    public void liberarMemoriaMapa(Proceso p) {
        String etiqueta = "P" + p.getNProceso();

        for (int i = 0; i < memoriaMapa.size(); i++) {
            if (memoriaMapa.get(i).equals(etiqueta)) {
                memoriaMapa.set(i, "L");
            }
        }
    }

    public String mostrarMapaMemoria() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("%-4s", nombre + " "));

        for (String celda : memoriaMapa) {
            sb.append(String.format("%-3s", celda));
        }
        return sb.toString();
    }

}
