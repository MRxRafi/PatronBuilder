package modelo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Coche {
    private long id;
    private int numRuedas;
    private int cv;
    private int maxVelocidad;
    private int numPuertas;
    private String marca;
    private String modelo;
    private BigDecimal precio;
    private List<String> piezasEspeciales;

    // Imaginaos la cantidad de atributos que podría tener esta clase...

    public Coche() {
        this.piezasEspeciales = new ArrayList<>();
    }

    public Coche(long id, int numRuedas, int cv, int maxVelocidad, int numPuertas, String marca, String modelo, BigDecimal precio, List<String> piezasEspeciales) {
        this.id = id;
        this.numRuedas = numRuedas;
        this.cv = cv;
        this.maxVelocidad = maxVelocidad;
        this.numPuertas = numPuertas;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.piezasEspeciales = piezasEspeciales;
    }

    public static Builder builder(long id, String marca, BigDecimal precio) {
        return new Builder(id, marca, precio);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getMaxVelocidad() {
        return maxVelocidad;
    }

    public void setMaxVelocidad(int maxVelocidad) {
        this.maxVelocidad = maxVelocidad;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public List<String> getPiezasEspeciales() {
        return piezasEspeciales;
    }

    public void setPiezasEspeciales(List<String> piezasEspeciales) {
        this.piezasEspeciales = piezasEspeciales;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", numRuedas=" + numRuedas +
                ", cv=" + cv +
                ", maxVelocidad=" + maxVelocidad +
                ", numPuertas=" + numPuertas +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", piezasEspeciales=" + piezasEspeciales +
                '}';
    }

    public static class Builder {
        private Coche coche;

        private Builder(long id, String marca, BigDecimal precio) {
            this.reset();
            this.coche.id = id;
            this.coche.marca = marca;
            this.coche.precio = precio;
        }

        public Builder reset() {
            this.coche = new Coche();
            return this;
        }

        public Builder id(long id) {
            this.coche.setId(id);
            return this;
        }

        public Builder numRuedas(int numRuedas) {
            this.coche.setNumPuertas(numRuedas);
            return this;
        }

        public Builder cv(int cv) {
            this.coche.setCv(cv);
            return this;
        }

        public Builder maxVelocidad(int maxVelocidad) {
            this.coche.setMaxVelocidad(maxVelocidad);
            return this;
        }

        public Builder numPuertas(int numPuertas) {
            this.coche.setNumPuertas(numPuertas);
            return this;
        }

        public Builder marca(String marca) {
            this.coche.setMarca(marca);
            return this;
        }

        public Builder modelo(String modelo) {
            this.coche.setModelo(modelo);
            return this;
        }

        public Builder precio(BigDecimal precio) {
            this.coche.setPrecio(precio);
            return this;
        }

        public Builder piezaEspecial(String piezaEspecial) {
            if (this.coche.piezasEspeciales == null) {
                this.coche.piezasEspeciales = new ArrayList<>();
            }
            this.coche.piezasEspeciales.add(piezaEspecial);
            return this;
        }

        public Coche build() {
            Coche auxiliar = this.coche;
            this.reset();
            return auxiliar;
        }
    }
}
