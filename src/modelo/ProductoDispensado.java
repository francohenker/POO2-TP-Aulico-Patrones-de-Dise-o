/**
 * La clase ProductoDispensado representa el estado de una máquina expendedora cuando se ha dispensado un producto.
 * Implementa la interfaz Estado y define el comportamiento específico para este estado.
 */
public class ProductoDispensado implements Estado{
    /**
     * Método que define el comportamiento de la máquina expendedora cuando está en el estado ProductoDispensado.
     * Imprime un mensaje indicando que la máquina ha dispensado un producto.
     */
    @Override
    public void cambiar(){
        System.out.println("Maquina expendedora con producto dispensado");
    }
}