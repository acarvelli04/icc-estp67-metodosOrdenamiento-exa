import controllers.BrandController;
import models.Brand;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Examen interciclo de Estructuras de Datos");
        System.out.println("====Configurar studente.env====");

        for (int i = 0; i < args.length; i++) {
            System.out.println();
        }

        controllers.BrandController.sortSelectionDesc(Brand[] brand);
        controllers.BrandController.binarySearchByValidYears(honda,8,false);
        
        for (int i = 0; i < args.length; i++) {
            System.out.println();
        }
    }


}
