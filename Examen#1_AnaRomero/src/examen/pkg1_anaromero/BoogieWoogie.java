package examen.pkg1_anaromero;
import java.util.ArrayList;

/**
 *
 * @author Ana Romero
 */
public class BoogieWoogie extends PERSONAS{
    private ArrayList <PERSONAS> secuestrados = new ArrayList();

    public BoogieWoogie() {
        super();
    }

    public BoogieWoogie(String nombre, String sexo, int edad, String ARMAS, ArrayList <PERSONAS> secuestrados) {
        super(nombre, sexo, edad, ARMAS);
        this.secuestrados = secuestrados;
    }

    public ArrayList<PERSONAS> getSecuestrados() {
        return secuestrados;
    }

    public void setSecuestrados(ArrayList<PERSONAS> secuestrados) {
        this.secuestrados = secuestrados;
    }

    @Override
    public String toString() {
        return "BoogieWoogie{" + "secuestrados=" + secuestrados + '}';
    }
}
