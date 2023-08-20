
public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenido al parqueadero");

        Parqueadero parqueadero =new Parqueadero(5,10,5000);

        Carro toyota = new Carro("QWE123","Toyota","2023");
        Carro honda = new Carro("QWE345","Honda","2023");
        Carro ford = new Carro("QWE678","Ford","2023");

        boolean estacionamientoExitoso1 = parqueadero.parquearCarro(toyota,4,5);
        boolean estacionamientoExitoso2 = parqueadero.parquearCarro(honda,2,3);
        boolean estacionamientoExitoso3 = parqueadero.parquearCarro(ford,1,1);

        if (estacionamientoExitoso1) {
            System.out.println("Carro 1 estacionado exitosamente.");
        } else {
            System.out.println("No se pudo estacionar el carro 1.");
        }

        if (estacionamientoExitoso2) {
            System.out.println("Carro 2 estacionado exitosamente.");
        } else {
            System.out.println("No se pudo estacionar el carro 2.");
        }

        if (estacionamientoExitoso3) {
            System.out.println("Carro 3 estacionado exitosamente.");
        } else {
            System.out.println("No se pudo estacionar el carro 3.");
        }

        // Espacio ocupado

        boolean intentoEstacionarEnOcupado = parqueadero.parquearCarro(toyota, 1, 1);
        if (intentoEstacionarEnOcupado) {
            System.out.println("Carro 1 estacionado. ");
        } else {
            System.out.println("No se pudo estacionar el carro toyota, intente nuevamente.");
        }


        double costoCarro1 = parqueadero.cobrarPorTiempo(toyota, 3);
        double costoCarro2 = parqueadero.cobrarPorTiempo(honda, 2);

        System.out.println("Costo por tiempo del " + toyota.getMarca()+ ": $" + costoCarro1);
        System.out.println("Costo por tiempo del " + honda.getMarca()+ ": $" + costoCarro2);



        // Mostrar estado del parqueadero

        System.out.println("Estado del parqueadero:");
        parqueadero.mostrarEstadoParqueadero();
    }
}