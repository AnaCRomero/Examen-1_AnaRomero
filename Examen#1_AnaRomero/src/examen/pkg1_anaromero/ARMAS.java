package examen.pkg1_anaromero;

/**
 *
 * @author Ana Romero
 */
public class ARMAS {
    private String tipo;
    private int damage;

    public ARMAS() {
    }

    public ARMAS(String tipo, int damage) {
        this.tipo = tipo;
        this.damage = damage;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return tipo;
    }
}
