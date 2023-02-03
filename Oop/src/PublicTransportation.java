public class PublicTransportation {
    int number;
    public int oilAmount = 100;
    int speed = 0;
    int currentPassenger;
    int maxPassenger;
    int price;
    String state;

    // 기본 생성자 생성
    public PublicTransportation () { }

    // 운행시작
    public void start(String state){
        this.state = state;
    }

    // 상태 변경
    public void changeState() {
        if(state.equals("운행")) {
            state = "차고지행";
        } else {
            state = "운행";
        }

        if(oilAmount < 10) {
            this.state = "차고지행";
        }
    }

    // 속도변경
    public void setSpeed(int speed) {
        this.speed += speed;
        System.out.println("현재 속도는 : " + this.speed);
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public int getOilAmount() {
        return oilAmount;
    }
    public void setOilAmount(int oilAmount) {
        this.oilAmount -= oilAmount;

        System.out.println("남아있는 주유양 : " + getOilAmount());
        if(oilAmount < 10) {
            changeState();
            System.out.println("주유 필요!");
        }
    }

    public int getSpeed() {
        return speed;
    }
    public int getCurrentPassenger() {
        return currentPassenger;
    }
    public void setCurrentPassenger(int currentPassenger) {
        this.currentPassenger = currentPassenger;
    }
    public int getMaxPassenger() {
        return maxPassenger;
    }
    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

}
