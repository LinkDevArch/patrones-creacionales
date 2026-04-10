package contratos;

import inventario.Vehiculo;

public class ContratoAlquilerBuilder implements ContratoBuilder {

    private Contrato contrato;

    public ContratoAlquilerBuilder() {
        contrato = new Contrato(null, null, null, 0,
                false, false, false, 0.0);
    }

    @Override
    public void setCliente(Cliente cliente) {
        contrato.setCliente(cliente);
    }

    @Override
    public void setVehiculo(Vehiculo vehiculo) {
        contrato.setVehiculo(vehiculo);
    }

    @Override
    public void setPlan(String plan) {
        contrato.setPlan(plan);
    }

    @Override
    public void setDuracion(int dias) {
        contrato.setDuracionDias(dias);
    }

    @Override
    public void addGPS() {
        contrato.setGps(true);
    }

    @Override
    public void addSeguro() {
        contrato.setSeguro(true);
    }

    @Override
    public void addCargadorPortatil() {
        contrato.setCargadorPortatil(true);
    }

    @Override
    public Contrato build() {

        if (contrato.getDuracionDias() > 30) {
            contrato.setDescuento(0.15); // 15% descuento
        }

        return contrato;
    }
}