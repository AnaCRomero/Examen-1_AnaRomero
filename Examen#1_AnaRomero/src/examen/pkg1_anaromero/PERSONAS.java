package examen.pkg1_anaromero;
/**
 *
 * @author Ana Romero
 */
public class PERSONAS {
    private String nombre,sexo;
    private int edad;
    private ARMAS ARMAS;

    public PERSONAS() {
    }

    public PERSONAS(String nombre, String sexo, int edad, ARMAS ARMAS) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.ARMAS = ARMAS;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ARMAS getARMAS() {
        return ARMAS;
    }

    public void setARMAS(ARMAS ARMAS) {
        this.ARMAS = ARMAS;
    }

    @Override
    public String toString() {
        return "PERSONAS{" + "nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", ARMAS=" + ARMAS + '}';
    }
}
