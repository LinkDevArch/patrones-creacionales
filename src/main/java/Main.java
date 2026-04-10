import contratos.*;
import inventario.Auto;

public class Main {
    public static void main(String[] args) {
        // crear cliente
        Cliente cliente = new Cliente();

        // crear vehículo (Auto)
        Auto vehiculo = new Auto(null);
        vehiculo.setMarca("Toyota");
        vehiculo.setPlaca("ABC-123");
        vehiculo.setAutonomia(550.0);
        vehiculo.setEsHibrido(false);

        // crear contrato usando Builder
        ContratoBuilder builder = new ContratoAlquilerBuilder();
        builder.setCliente(cliente);
        builder.setVehiculo(vehiculo);
        builder.setPlan("Premium");
        builder.setDuracion(7);
        builder.addGPS();
        builder.addSeguro();

        Contrato contrato = builder.build();

        // mostrar resultado
        System.out.println("Contrato creado exitosamente");
        System.out.println("Plan: " + contrato.getPlan());
        System.out.println("Duración: " + contrato.getDuracionDias() + " días");
        System.out.println("Vehículo: " + contrato.getVehiculo().getMarca());
    }
}
