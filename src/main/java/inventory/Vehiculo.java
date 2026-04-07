package inventory;

public abstract class Vehiculo implements Cloneable{
    protected String marca;
    protected String placa;
    protected double autonomia;
    protected boolean esHibrido;

    public Vehiculo(Vehiculo target) {
        if (target != null) {
            this.marca = target.marca;
            this.placa = target.placa;
            this.autonomia = target.autonomia;
            this.esHibrido = target.esHibrido;
        }
    }

    public abstract Vehiculo clone();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    public boolean isEsHibrido() {
        return esHibrido;
    }

    public void setEsHibrido(boolean esHibrido) {
        this.esHibrido = esHibrido;
    }
}
