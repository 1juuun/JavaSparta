public class Bus extends PublicTransportation {
     public Bus(int number) {
       this.number = number;
       this.start("운행");
       this.price = 1000;
       this.maxPassenger = 30;
       System.out.println(number + "번 버스가 생성되었습니다.");
    }

    // 승객 탑승
    void onTheBus(int newPassenger) {

        if (newPassenger + this.currentPassenger > 30) {
            System.out.println("최대 승객 수를 초과했습니다.");
        }
        else if (!this.state.equals("운행")) {
            System.out.println("운행중이 아닙니다.");
        } else {
            this.setCurrentPassenger(newPassenger);
            System.out.println("탑승 승객 수 : " + this.currentPassenger);
            System.out.println("잔여 승객 수 : " + (30 - this.currentPassenger));
            System.out.println("요금 확인 : " + (this.price * newPassenger));
        }
    }

    // 기름양 체크하기
    public void checkOil(int Oil) {

        this.setOilAmount(Oil);

        if (this.oilAmount >= 10) {
            if (this.state.equals("운행")) {
                System.out.println("현재 주유량 : " + this.oilAmount);
            } else if (this.state.equals("차고지행")) {
                System.out.println("상태 : " + this.state);
                System.out.println("주유량 : " + this.oilAmount);
            }
        } else {
            System.out.println("주유량 : " + this.oilAmount);
            this.start("차고지행");
            System.out.println("주유가 필요합니다.");
            System.out.println("상태 : " + this.state);
        }

    }

}

