package models;
public class Brand {

    CarModel[] modelos;

    public Brand() {
    }

    public Brand(CarModel[] modelos) {
        this.modelos = modelos;
    }

    public CarModel[] getModelos() {
        return modelos;
    }

    public void setModelos(CarModel[] modelos) {
        this.modelos = modelos;
    }


    public int getTotalValidYears() {
        int total = 0;
        for (int i = 0; i < modelos.length; i++) {
             
            CarModel modelo = modelos[i];
            CarYear[] lista = modelo.getAños();

            for (int j = 0; j < lista.length; j++) {   
                CarYear carYear = lista[j];
                if(carYear.isValid()){
                    total++;
                }
            }   
        }
        return total;

    }

    
        
}
