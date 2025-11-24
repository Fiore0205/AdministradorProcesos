/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author fioli
 */
public class AdministradorProcesos {

    ListaProcesos listaProcesos;
    Proceso proceso;
    private ListaMaquinas listaMaquinas;
    private Maquina maquina;

    public AdministradorProcesos() {
        listaProcesos = new ListaProcesos();
        listaMaquinas = new ListaMaquinas();
    }

    //getters y setters
    public ListaProcesos getListaProcesos() {
        return listaProcesos;
    }

    public void setListaProcesos(ListaProcesos listaProcesos) {
        this.listaProcesos = listaProcesos;
    }

    public Proceso getProceso() {
        return proceso;
    }

    public void setProceso(Proceso proceso) {
        this.proceso = proceso;
    }

    //------- METODOS DE PROCESOS BOTONES --------------------
    public void crearProceso(int nProceso, String nombre, int prioridad, int tipo, int unidadesTiempo, int unidadesMem,
            int unidadesCpu) {
        proceso = new Proceso(nProceso, nombre, prioridad, tipo, unidadesTiempo, unidadesMem, unidadesCpu);
    }

    public void modificarProceso(String nProceso, String nombre, String prioridad, String tipo, String unidadesTiempo, String unidadesMem,
            String unidadesCpu) {
        listaProcesos.modificarProceso(nProceso, nombre, prioridad, tipo, unidadesTiempo, unidadesMem, unidadesCpu);
    }

    public boolean eliminarProceso(int nProceso) {
        return listaProcesos.eliminarProceso(nProceso);
    }

    public String consultarProceso(int nProceso) {
        return listaProcesos.consultarProceso(nProceso);
    }

    public void agregarProceso() {
        listaProcesos.agregarProceso(proceso);
    }

    public void asignarRecursoAProceso(Recurso r) {
        proceso.asignarRecurso(r);
    }

    //------- METODOS DE PROCESOS LISTAS --------------------
    public String listarProcesosDetalle() { //para cuadro de procesos
        return listaProcesos.listarProcesosDetalle();
    }

    public String listarRecursosRequeridos() {
        return proceso.listarRecursosRequeridos();
    }

    public String listarProcesoDetalle() {
        return proceso.toStringDetalle();
    }
    
    public String listarRecursosRequeridos(int nProceso) {
        return listaProcesos.listarRecursosRequeridos(nProceso);
    }

    // ============================================================
    //                    MÉTODOS DE MÁQUINAS
    // ============================================================
    public void crearMaquina(int nMaquina, String nombre,
            int tiempoInicio, int unidadesMemoria, int unidadesCPU) {

        maquina = new Maquina(nMaquina, nombre, tiempoInicio,
                unidadesMemoria, unidadesCPU);
    }

    public void agregarMaquina() {
        listaMaquinas.agregarMaquina(maquina);
    }

    public boolean eliminarMaquina(int nMaquina) {
        return listaMaquinas.eliminarMaquina(nMaquina);
    }

    public void modificarMaquina(String nMaquina, String nuevoNombre,
            String nuevoTiempoInicio, String nuevoUMemoria, String nuevoUCPU) {

        listaMaquinas.modificarMaquina(nMaquina, nuevoNombre,
                nuevoTiempoInicio, nuevoUMemoria, nuevoUCPU);
    }

    public String consultarMaquina(int nMaquina) {
        return listaMaquinas.consultarMaquina(nMaquina);
    }

    public void asignarRecursoAMaquina(Recurso r) {
        maquina.asignarRecurso(r);
    }

    // ----METODOS MAQUINAS LISTAR ----
    public String listarMaquinasDetalle() {
        return listaMaquinas.listarMaquinasDetalle();
    }

    public String detalleMaquina() {
        return maquina.toString();
    }

    public String listarRecursosMaquina(int nMaquina) {
        return listaMaquinas.listarRecursosDisponibles(nMaquina);
    }

    public String listarRecursosDisponibles() {
        return maquina.listarRecursosDisponibles();
    }
}
