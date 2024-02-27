package basico;

import modelo.Coche;

import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Coche cocheSinBuilder = new Coche(1, 4, 170, 190, 5, "Renault", "Clio", new BigDecimal(22000), List.of("Freno disco", "Volante cuero"));
        System.out.println(cocheSinBuilder);

        Coche cocheConBuilder = Coche.builder(1, "Renault", new BigDecimal(22000))
                .numRuedas(4)
                .cv(170)
                .maxVelocidad(190)
                .numPuertas(5)
                .modelo("Clio")
                .piezaEspecial("Freno disco")
                .piezaEspecial("Volante cuero")
                .build();
        System.out.println(cocheConBuilder);
    }
}
