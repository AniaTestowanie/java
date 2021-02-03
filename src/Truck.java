public class Truck implements Vehicle {


    @Override
    public void jazda(int speed) {
        speed = 70;
        System.out.println("Jadę ciężarówką z prędkością" + speed);
    }

    @Override
    public void stop() {
        System.out.println("Hamuję ciężarówką!");
    }

    @Override
    public String info() {
        return "ciężarówka";
    }

    public void zatankuj() {
        System.out.println("Zatankuj mnie!");
    }
}
