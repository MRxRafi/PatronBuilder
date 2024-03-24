package interfaces;

import modelo.Coche;

import java.math.BigDecimal;
import java.util.ArrayList;

public class CocheBuilder implements ICocheBuilder.Todas {

    private Coche coche;

    private CocheBuilder() {
        this.reset();
    }

    public static ICocheBuilder.Id builder() {
        return new CocheBuilder();
    }

    public void reset() {
        this.coche = new Coche();
    }


    @Override
    public ICocheBuilder.Marca id(long id) {
        this.coche.setId(id);
        return this;
    }

    @Override
    public ICocheBuilder.Precio marca(String marca) {
        this.coche.setMarca(marca);
        return this;
    }

    @Override
    public ICocheBuilder.Optionals precio(BigDecimal precio) {
        this.coche.setPrecio(precio);
        return this;
    }

    @Override
    public ICocheBuilder.Optionals numRuedas(int numRuedas) {
        this.coche.setNumRuedas(numRuedas);
        return this;
    }

    @Override
    public ICocheBuilder.Optionals cv(int cv) {
        this.coche.setCv(cv);
        return this;
    }

    @Override
    public ICocheBuilder.Optionals maxVelocidad(int maxVelocidad) {
        this.coche.setMaxVelocidad(maxVelocidad);
        return this;
    }

    @Override
    public ICocheBuilder.Optionals numPuertas(int numPuertas) {
        this.coche.setNumPuertas(numPuertas);
        return this;
    }

    @Override
    public ICocheBuilder.Optionals modelo(String modelo) {
        this.coche.setModelo(modelo);
        return this;
    }

    @Override
    public ICocheBuilder.Optionals piezaEspecial(String piezaEspecial) {
        if (this.coche.getPiezasEspeciales() == null) {
            this.coche.setPiezasEspeciales(new ArrayList<>());
        }
        this.coche.getPiezasEspeciales().add(piezaEspecial);
        return this;
    }

    @Override
    public Coche build() {
        Coche aux = this.coche;
        this.reset();
        return aux;
    }
}
