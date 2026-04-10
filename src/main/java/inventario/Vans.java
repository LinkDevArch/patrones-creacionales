package inventario;

public class Vans extends Vehiculo{
    int capacidadPasajeros;

    public Vans(Vans target) {
        super(target);
        if (target != null) {
            this.capacidadPasajeros = target.capacidadPasajeros;
        }
    }

    @Override
    public Vehiculo clone() {
        return new Vans(this);
    }
}
