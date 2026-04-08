package contratos;

import inventory.Vehiculo;

public class Contrato {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private String plan;
    private int duracionDias;
    private boolean gps;
    private boolean seguro;
    private boolean cargadorPortatil;
    private double descuento;

    public Contrato(Cliente cliente, Vehiculo vehiculo, String plan, int duracionDias, boolean gps, boolean seguro,
            boolean cargadorPortatil, double descuento) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.plan = plan;
        this.duracionDias = duracionDias;
        this.gps = gps;
        this.seguro = seguro;
        this.cargadorPortatil = cargadorPortatil;
        this.descuento = descuento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public int getDuracionDias() {
        return duracionDias;
    }

    public void setDuracionDias(int duracionDias) {
        this.duracionDias = duracionDias;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public boolean isSeguro() {
        return seguro;
    }

    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }

    public boolean isCargadorPortatil() {
        return cargadorPortatil;
    }

    public void setCargadorPortatil(boolean cargadorPortatil) {
        this.cargadorPortatil = cargadorPortatil;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}
