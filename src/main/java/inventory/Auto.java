package inventory;

public class Auto extends Vehiculo{
    private String tipoCarroceria;
    private int numeroPuertas;

    public Auto (Auto target) {
        super(target);
        if (target != null) {
            this.tipoCarroceria = target.tipoCarroceria;
            this.numeroPuertas = target.numeroPuertas;
        }
    }

    @Override
    public Vehiculo clone() {
        return new Auto(this);
    }
}
