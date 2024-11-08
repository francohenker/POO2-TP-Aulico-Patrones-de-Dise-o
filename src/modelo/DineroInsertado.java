/**
 * La clase DineroInsertado representa el estado de una máquina expendedora cuando se ha insertado dinero.
 * Implementa la interfaz Estado y define el comportamiento específico para este estado.
 */

public class DineroInsertado implements Estado{
    /**
     * La clase DineroInsertado representa el estado de una máquina expendedora cuando se ha insertado dinero.
     * Implementa la interfaz Estado y define el comportamiento específico para este estado.
     */
    @Override
    public void cambiar(){
        System.out.println("Maquina expendedora con dinero insertado");
    }
}