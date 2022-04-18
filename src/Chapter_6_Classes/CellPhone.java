package Chapter_6_Classes;

public class CellPhone {
    private String manufact;
    private String model;
    private double retailPrice;

    /**
     * Constructor
     * @param man The phone's manufacturer
     * @param mod The phone's model number
     * @param price The phone's retail price
     */

    public CellPhone(String man, String mod, double price){
        manufact = man;
        model = mod;
        retailPrice = price;
    }

    /**
     * The setManufact method sets the phone's
     * manufacturer name.
     * @param manufact The phone's manufacturer
     */
    public void setManufact(String manufact) {
        this.manufact = manufact;
    }

    /**
     * The setModel method sets the phone's
     * model number
     * @param model The phone's model number
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * The setRetailPrice method sets the phone's
     * retail price.
     * @param retailPrice The phone's retail price.
     */
    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    /**
     * getManufact method
     * @return The name of the phone's manufacturer
     */
    public String getManufact() {
        return manufact;
    }

    /**
     * getModel method
     * @return The phone's model number
     */

    public String getModel() {
        return model;
    }

    /**
     * getRetailPrice method
     * @return The phone's retail price
     */
    public double getRetailPrice() {
        return retailPrice;
    }
}
