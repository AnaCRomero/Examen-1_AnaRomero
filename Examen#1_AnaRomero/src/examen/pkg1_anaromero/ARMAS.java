package examen.pkg1_anaromero;

/**
 *
 * @author Ana Romero
 */
public class ARMAS {
    private String tipo;

    public ARMAS() {
    }

    public ARMAS(String tipo) {
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "ARMAS{" + "tipo=" + tipo + '}';
    }
    
    
}
