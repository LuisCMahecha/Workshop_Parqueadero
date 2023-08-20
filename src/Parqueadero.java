public class Parqueadero {

    private Carro [][] matrizParqueadero;
    private  double tarifaPorHora;


    public Parqueadero(int filas, int columnas, double tarifaPorHora){
        matrizParqueadero = new Carro[filas][columnas];
        this.tarifaPorHora = tarifaPorHora;

    }

    public boolean parquearCarro(Carro carro, int fila, int columna) {
        if (fila < 0 || fila >= matrizParqueadero.length ||
                columna < 0 || columna >= matrizParqueadero[0].length ||
                matrizParqueadero[fila][columna] != null) {
            return false;
        }
        matrizParqueadero[fila][columna] = carro;
        return true;
    }

    public double cobrarPorTiempo(Carro carro, int horas) {
        return horas * tarifaPorHora;
    }


    public void mostrarEstadoParqueadero(){
        for (int i = 0; i < matrizParqueadero.length; i++) {
            for (int j = 0; j < matrizParqueadero[i].length; j++) {
                if (matrizParqueadero[i][j] == null) {
                    System.out.print(" - "); // Espacio vacío


                } else {
                    System.out.print(" x "); // Espacio ocupado

                }
            }
            System.out.println();
        }
    }
}
