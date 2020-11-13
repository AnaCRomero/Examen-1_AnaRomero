package examen.pkg1_anaromero;
import java.util.ArrayList;

/**
 *
 * @author Ana Romero
 */
public class BoogieWoogie extends PERSONAS{
    private int secuestrados;

    public BoogieWoogie() {
        super();
    }

    public BoogieWoogie(String nombre, String sexo, int edad, String ARMAS, int secuestrados) {
        super(nombre, sexo, edad, ARMAS);
        this.secuestrados = secuestrados;
    }

    public int  getSecuestrados() {
        return secuestrados;
    }

    public void setSecuestrados(int secuestrados) {
        this.secuestrados = secuestrados;
    }

    @Override
    public String toString() {
        return "secuestrados=" + secuestrados ;
    }

    
}
