package contratos;

public class Cliente {

    private String nombre;

    public Cliente() {
        this.nombre = "Cliente sin nombre";
}
public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

}