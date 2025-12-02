package models;
public class CarModel {
    CarYear[] años;

    public CarModel() {
    }

    public CarModel(CarYear[] años) {
        this.años = años;
    }

    public CarYear[] getAños() {
        return años;
    }

    public void setAños(CarYear[] años) {
        this.años = años;
    }

    
}
