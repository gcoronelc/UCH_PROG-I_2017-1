package pe.epdy.methodfactoryexample.model;

public class ElijeIdiomaNumero {
    private String idioma;
    private NombresNumeros nNum;
    
    public ElijeIdiomaNumero() {
        
    }

    public ElijeIdiomaNumero(String idioma, NombresNumeros nNum) {
        this.idioma = idioma;
        this.nNum = nNum;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public NombresNumeros getnNum() {
        return nNum;
    }

    public void setnNum(NombresNumeros nNum) {
        this.nNum = nNum;
    }
}
