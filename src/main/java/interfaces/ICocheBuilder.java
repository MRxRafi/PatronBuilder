package interfaces;

import modelo.Coche;

import java.math.BigDecimal;

public interface ICocheBuilder {
    interface Id {
        Marca id(long id);
    }

    interface Marca {
        Precio marca(String marca);
    }

    interface Precio {
        Optionals precio(BigDecimal precio);
    }

    interface Optionals {
        Optionals numRuedas(int numRuedas);
        Optionals cv(int cv);
        Optionals maxVelocidad(int maxVelocidad);
        Optionals numPuertas(int numPuertas);
        Optionals modelo(String modelo);
        Optionals piezaEspecial(String piezaEspecial);
        Coche build();
    }

    interface Todas extends Id, Marca, Precio, Optionals {
    }
}
