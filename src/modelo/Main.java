public class Main {
    public static void main(String[] args) {
        Maquina maquina = new Maquina();
        maquina.cambiar();
        maquina.setEstado(new DineroInsertado());
        maquina.cambiar();
        maquina.setEstado(new ProductoDispensado());
        maquina.cambiar();
    }
}