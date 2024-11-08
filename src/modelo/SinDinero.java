/**
 * La clase SinDinero representa el estado de una máquina expendedora cuando no tiene dinero.
 * Implementa la interfaz Estado y define el comportamiento específico para este estado.
 */
public class SinDinero implements Estado{
    /**
     * Método que define el comportamiento de la máquina expendedora cuando está en el estado SinDinero.
     * Imprime un mensaje indicando que la máquina no tiene dinero.
     */
    @Override
    public void cambiar(){
        System.out.println("Maquina expendedora sin dinero");
    }
}