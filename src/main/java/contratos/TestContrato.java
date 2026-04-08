package contratos;

import inventory.Auto;

public class TestContrato {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        Auto vehiculo = new Auto(null);
        vehiculo.setMarca("Toyota");
        vehiculo.setPlaca("ABC-123");
        vehiculo.setAutonomia(550.0);
        vehiculo.setEsHibrido(false);

        ContratoBuilder builder = new ContratoAlquilerBuilder();
        builder.setCliente(cliente);
        builder.setVehiculo(vehiculo);
        builder.setPlan("Premium");
        builder.setDuracion(7);
        builder.addGPS();
        builder.addSeguro();
        builder.addCargadorPortatil();

        Contrato contrato = builder.build();

        System.out.println("Contrato creado:");
        System.out.println("Cliente: " + contrato.getCliente());
        System.out.println("Vehiculo: " + contrato.getVehiculo().getMarca() + " " + contrato.getVehiculo().getPlaca());
        System.out.println("Plan: " + contrato.getPlan());
        System.out.println("Duracion dias: " + contrato.getDuracionDias());
        System.out.println("GPS: " + contrato.isGps());
        System.out.println("Seguro: " + contrato.isSeguro());
        System.out.println("Cargador portatil: " + contrato.isCargadorPortatil());
    }
}
