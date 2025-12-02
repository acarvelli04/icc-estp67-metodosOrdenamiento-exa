package controllers;
import models.*;

public class BrandController {

    public Brand binarySearchByValidYears(
    Brand[] brands, 
    int validYears,
    boolean isAscending
    ) {

        int izquierda = 0;
        int derecha = brands.length - 1;

        while (izquierda <= derecha) {

            int medio = (izquierda + derecha) / 2;
            int valor = brands[medio].getTotalValidYears();

            // Caso exacto
            if (valor == validYears) {
                return brands[medio];
            }

            // Orden ascendente
            if (isAscending) {
                if (valor < validYears) {
                    izquierda = medio + 1;
                } else {
                    derecha = medio - 1;
                }
            }

            // Orden descendente
            else {
                if (valor > validYears) {
                    izquierda = medio + 1;
                } else {
                    derecha = medio - 1;
                }
            }
        }

    return null; // No encontrada
    }

    public Brand[] sortSelectionDesc(Brand[] brands) {
        for (int i = 0; i < brands.length; i++) {
            int indiceMenor = i;
            for (int j = 1; j < brands.length-1; j++) {
                if (brands[j].getTotalValidYears() > brands[indiceMenor].getTotalValidYears()) {
                    indiceMenor = j;
                }
            }
            if(indiceMenor != i){
            Brand temp = brands[indiceMenor];
            brands[i] = brands[indiceMenor];
            brands[indiceMenor] = temp;
            }
        }
        return brands;
    }
}
    
    



