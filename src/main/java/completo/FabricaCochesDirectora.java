package completo;

import modelo.Coche;

import java.math.BigDecimal;

public class FabricaCochesDirectora {
    public FabricaCochesDirectora() {}
    public Coche construirCocheDescapotable() {
        return Coche.builder(1, "BMW", new BigDecimal(54000))
                .cv(320)
                .maxVelocidad(280)
                .numRuedas(4)
                .numPuertas(2)
                .piezaEspecial("Motor deportivo edición especial 2024")
                .build();
    }

    public Coche construirFurgoneta() {
        return Coche.builder(2, "Mercedes", new BigDecimal(59000))
                .modelo("Sprinter")
                .cv(210)
                .maxVelocidad(190)
                .numRuedas(4)
                .numPuertas(3)
                .piezaEspecial("Puertas cromadas color platino")
                .piezaEspecial("Asientos XXL")
                .build();
    }

    public Coche construirCocheDeportivoRenault() {
        return Coche.builder(3, "Renault", new BigDecimal(48000))
                .cv(350)
                .maxVelocidad(290)
                .numRuedas(4)
                .piezaEspecial("Airbag especial para salvar a locos como tú.")
                .piezaEspecial("Sistema especial detecta-choques con llamada al crematorio, viaje directo.")
                .build();
    }
}
