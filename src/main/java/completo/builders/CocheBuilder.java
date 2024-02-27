package completo.builders;

import modelo.Coche;

import java.math.BigDecimal;

public interface CocheBuilder {
    CocheBuilder reset();
    CocheBuilder numRuedas(int numRuedas);
    CocheBuilder cv(int cv);
    CocheBuilder maxVelocidad(int maxVelocidad);
    CocheBuilder numPuertas(int numPuertas);
    CocheBuilder marca(String marca);
    CocheBuilder modelo(String modelo);
    CocheBuilder precio(BigDecimal precio);
    Coche build();
}
