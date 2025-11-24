package model;

import java.util.ArrayList;

public class ListaMaquinas {

    private ArrayList<Maquina> listaMaquinas;
    private String nombre;

    public ListaMaquinas() {
        this.nombre = "ListaMaquinas";
        this.listaMaquinas = new ArrayList<>();
    }

    public ListaMaquinas(String nombre) {
        this.nombre = nombre;
        this.listaMaquinas = new ArrayList<>();
    }

    // --- GETTERS / SETTERS ---
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Maquina> getLista() {
        return listaMaquinas;
    }

    // --- AGREGAR ---
    public void agregarMaquina(Maquina nueva) {
        listaMaquinas.add(nueva);
    }

    // --- BUSCAR ---
    public Maquina buscarMaquina(int nMaquina) {
        for (Maquina m : listaMaquinas) {
            if (m.getNMaquina() == nMaquina) {
                return m;
            }
        }
        return null;
    }

    // --- CONSULTAR ---
    public String consultarMaquina(int nMaquina) {
        Maquina m = buscarMaquina(nMaquina);
        return (m != null) ? m.toString() : "Máquina no encontrada";
    }

    // --- MODIFICAR ---
    public void modificarMaquina(String nMaquina, String nombre,
            String tiempoInicio, String uMemoria,
            String uCPU) {

        Maquina m = buscarMaquina(Integer.parseInt(nMaquina));

        if (m != null) {
            if (!nombre.isEmpty()) {
                m.setNombre(nombre);
            }
            if (!tiempoInicio.isEmpty()) {
                m.setTiempoInicio(Integer.parseInt(tiempoInicio));
            }
            if (!uMemoria.isEmpty()) {
                m.setUnidadesMemoriaMaquina(Integer.parseInt(uMemoria));
            }
            if (!uCPU.isEmpty()) {
                m.setUnidadesCPUMaquina(Integer.parseInt(uCPU));
            }
        }
    }

    // --- ELIMINAR ---
    public boolean eliminarMaquina(int nMaquina) {
        for (int i = 0; i < listaMaquinas.size(); i++) {
            if (listaMaquinas.get(i).getNMaquina() == nMaquina) {
                listaMaquinas.remove(i);
                return true;
            }
        }
        return false;
    }

    // --- LISTAR ---
    public String listarMaquinasDetalle() {
        String salida = "Nombre |Tini |MEM |DISPO |UTI\n";
        for (Maquina m : listaMaquinas) {
            salida += m.toStringDetalle() + "\n";
        }
        return salida;
    }

    // --- LISTAR RECURSOS DE MÁQUINA ---
    public String listarRecursosDisponibles(int nMaquina) {
        Maquina m = buscarMaquina(nMaquina);
        if (m != null) {
            return m.listarRecursosDisponibles();
        }
        return "Máquina no encontrada";
    }

    // --- LIMPIAR ---
    public void limpiarLista() {
        listaMaquinas.clear();
    }

    public String listarRecursosDeTodasLasMaquinas() {
        StringBuilder sb = new StringBuilder();

        for (Maquina m : listaMaquinas) {
            sb.append(m.listarRecursosTabla()).append("\n");
        }

        return sb.toString();
    }

}
