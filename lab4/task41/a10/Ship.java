package lab4.task41.a10;

public class Ship extends Vehicle{

    public Ship(double avrSpeed, double pricePassanger, double priceCargo) {
        super(avrSpeed, pricePassanger, priceCargo);
    }

    @Override
    public double getCostOfTransferOfPassengers(double dist) {
        return dist * pricePassanger / 8;
    }

    @Override
    public double getCostOfTransportingCargo(double dist, double weight) {
        return (dist * priceCargo * (weight / 10001)) / 10;
    }

    @Override
    public String toString() {
        return "Ship{}";
    }
}
