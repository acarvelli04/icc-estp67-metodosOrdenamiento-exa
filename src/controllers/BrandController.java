package controllers;
import models.*;

public class BrandController {

    public Universidad binarySearchByEnrollment(
        Universidad[] universidades,
        int enrollments,
        boolean isAscending
) {

    int izquierda = 0;
    int derecha = universidades.length - 1;

    while (izquierda <= derecha) {

        int medio = (izquierda + derecha) / 2;
        int valor = universidades[medio].getTotalMatriculados();

        // Caso exacto
        if (valor == enrollments) {
            return universidades[medio];
        }

        // Orden ascendente
        if (isAscending) {
            if (valor < enrollments) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        // Orden descendente
        else {
            if (valor > enrollments) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }
    }

    return null; // No encontrada
}
}
