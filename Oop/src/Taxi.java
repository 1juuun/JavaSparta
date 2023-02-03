public class Taxi extends PublicTransportation{

    String destination;
    String destinationToDistance;
    int distancePrice = 1000;
    int distance = 1;

    public Taxi(int number) {
        start("일반");
        this.number = number;
        maxPassenger = 4;
        price = 3000;
        speed = 0;
        System.out.println(number + "번 택시가 생성되었습니다.");
    }

    public void onTheTaxi(int newPassenger, String destination, int distanceDestination) {

        currentPassenger = 0;
        price = 3000;
        maxPassenger = 4;

        if (state.equals("일반") && newPassenger <= maxPassenger) {
            currentPassenger += newPassenger;

            System.out.println("탑승 승객 : " + newPassenger);
            System.out.println("잔여 승객 : " + currentPassenger);
            System.out.println("기본 요금 확인 : " + price);
            System.out.println("목적지 : " + destination);
            System.out.println("목적지까지 거리 = " + distanceDestination + "km");

            state = "운행중";

        } else {
            System.out.println("탑승 불가");
        }

        if (distanceDestination > 1) {
            addDistanceMoney(distanceDestination);
        }

    }
    // 거리당 요금 추가
    public void addDistanceMoney(int distanceDestination) {
        price = 3000 + (distanceDestination - 1) * 1000;

        System.out.println("지불할 요금 : " + price);
        System.out.println("상태 : " + state);
    }
    // 요금 결제
    public void pay() {
        System.out.println("현재 금액은 " + getPrice() + "원 입니다.");
        this.currentPassenger = 0;
    }
    @Override
    public void changeState() {
        super.changeState();
        if (oilAmount < 10) {
            state = "운행불가";
        }
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestinationToDistance() {
        return destinationToDistance;
    }

    public void setDestinationToDistance(String destinationToDistance) {
        this.destinationToDistance = destinationToDistance;
    }

    public int getDistancePrice() {
        return distancePrice;
    }

    public void setDistancePrice(int distancePrice) {
        this.distancePrice = distancePrice;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

}
