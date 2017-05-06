package pe.concytecbecas.model;

public class BecaModel {

    //datos de entrada
    private String categoria;
    private String producto;
    private int meses;
    //datos de salida 
    private double factor;
    private double porcentaje;
    private double importe;
    private double cuota;

    public BecaModel() {
    }

    public BecaModel(String categoria, String producto, int meses) {
        this.categoria = categoria;
        this.producto = producto;
        this.meses = meses;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public double getFactor() {
        return factor;
    }

    public void setFactor(double factor) {
        this.factor = factor;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

}
