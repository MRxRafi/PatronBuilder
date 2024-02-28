package completo;

public class Main {
    public static void main(String[] args) {
        FabricaCochesDirectora fabricaCoches = new FabricaCochesDirectora();
        System.out.println(fabricaCoches.construirCocheDescapotable());
        System.out.println(fabricaCoches.construirFurgoneta());
        System.out.println(fabricaCoches.construirCocheDeportivoRenault());
    }
}
