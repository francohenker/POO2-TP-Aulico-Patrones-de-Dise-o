/**
 * La clase Maquina representa una máquina expendedora que puede cambiar de estado.
 * Implementa la interfaz Estado para permitir el cambio de estado.
 */
public class Maquina implements Estado{
    private Estado estado;

    /**
     * Constructor de la clase Maquina.
     * Inicializa la máquina con el estado SinDinero.
     */
    public Maquina(){
        this.estado = new SinDinero();
    }

    /**
     * Cambia el estado actual de la máquina.
     * Llama al método cambiar() del estado actual.
     */
    @Override
    public void cambiar(){
        this.estado.cambiar();
    }

    /**
     * Establece un nuevo estado para la máquina.
     * @param estado El nuevo estado a establecer.
     */
    public void setEstado(Estado estado){
        this.estado = estado;
    }
}