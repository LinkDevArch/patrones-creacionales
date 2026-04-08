package contratos;

import inventory.Vehiculo;

public interface ContratoBuilder {
    void setCliente(Cliente cliente);

    void setVehiculo(Vehiculo vehiculo);

    void setPlan(String plan);

    void setDuracion(int dias);

    void addGPS();

    void addSeguro();

    void addCargadorPortatil();

    Contrato build();
}
