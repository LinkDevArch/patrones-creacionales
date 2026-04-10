package inventario;

public class CamionLigero extends Vehiculo {
    int capacidadCargaToneladas;

    public CamionLigero(CamionLigero target) {
        super(target);
        if (target != null) {
            this.capacidadCargaToneladas = target.capacidadCargaToneladas;
        }
    }

    @Override
    public Vehiculo clone() {
        return new CamionLigero(this);
    }
}
