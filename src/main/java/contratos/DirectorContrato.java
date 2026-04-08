package contratos;

import inventory.Vehiculo;

public class DirectorContrato {

    public Contrato construirContratoBasico(
            Cliente cliente,
            Vehiculo vehiculo,
            int dias) {

        ContratoBuilder builder = new ContratoAlquilerBuilder();

        builder.setCliente(cliente);
        builder.setVehiculo(vehiculo);
        builder.setPlan("Basico");
        builder.setDuracion(dias);

        return builder.build();
    }

    public Contrato construirContratoPremium(
            Cliente cliente,
            Vehiculo vehiculo,
            int dias) {

        ContratoBuilder builder = new ContratoAlquilerBuilder();

        builder.setCliente(cliente);
        builder.setVehiculo(vehiculo);
        builder.setPlan("Premium");
        builder.setDuracion(dias);
        builder.addGPS();
        builder.addSeguro();
        builder.addCargadorPortatil();

        return builder.build();
    }
}