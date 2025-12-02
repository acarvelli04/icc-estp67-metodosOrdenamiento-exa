package models;
public class CarModel {
    String modelName;
    CarYear[] años;

    public CarModel() {
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public CarYear[] getAños() {
        return años;
    }

    public void setAños(CarYear[] años) {
        this.años = años;
    }

    public CarModel(String modelName, CarYear[] años) {
        this.modelName = modelName;
        this.años = años;
    }

    

}