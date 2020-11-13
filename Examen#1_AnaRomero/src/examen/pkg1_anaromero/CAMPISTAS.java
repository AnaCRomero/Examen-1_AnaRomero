package examen.pkg1_anaromero;

/**
 *
 * @author Ana Romero
 */
public class CAMPISTAS extends PERSONAS{
    private String tipo,estado;

    public CAMPISTAS() {
        super();
    }

    public CAMPISTAS(String tipo, String estado, String nombre, String sexo, int edad, String ARMAS) {
        super(nombre, sexo, edad, ARMAS);
        this.tipo = tipo;
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "CAMPISTAS{" + "tipo=" + tipo + ", estado=" + estado + '}';
    } 
}
