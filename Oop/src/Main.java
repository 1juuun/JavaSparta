public class Main {
    public static void main(String[] args) {

//        Bus bus = new Bus(1);
//        Bus bus2 = new Bus(2);
//
//        bus.onTheBus(2);
//
//        bus.checkOil(50);

        Taxi taxi = new Taxi(1);

        taxi.onTheTaxi(2, "서울역", 2);
        taxi.setOilAmount(80);
        taxi.pay();


    }


}