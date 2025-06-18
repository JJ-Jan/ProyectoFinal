package proyectofinal;

public class Devolucion {
    private Venta venta;
    private String idDevolucion;
    private int cantidadDevuelta;
    private String fechaDevolucion;

    public Devolucion(Venta venta, String idDevolucion, int cantidadDevuelta, String fechaDevolucion) {
        this.venta = venta;
        this.idDevolucion = idDevolucion;
        if (cantidadDevuelta <= venta.getCantVendida())
            this.cantidadDevuelta = cantidadDevuelta;
            articulo.setIsDevuelto(true);
            this.fechaDevolucion = fechaDevolucion;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public String getIdDevolucion() {
        return idDevolucion;
    }

    public void setIdDevolucion(String idDevolucion) {
        this.idDevolucion = idDevolucion;
    }

    public int getCantidadDevuelta() {
        return cantidadDevuelta;
    }

    public void setCantidadDevuelta(int cantidadDevuelta) {
        this.cantidadDevuelta = cantidadDevuelta;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    
    
}
