class Game {
    String name;
    int players;

    Game() {

    }

    Game(String name, int players) {
        this.name = name;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public void rules() {
        System.out.println("1.No cheating");
        System.out.println("2.No fixing");
    }

    public int noOfPlayers() {
        return noOfPlayers();
    }

    public String toString() {
        return "Name:" + name + "Players:" + players;
    }
}

class BasketBall extends Game {
    BasketBall() {

    }

    BasketBall(String name, int players) {
        super(name, players);
    }

    @Override
    public int noOfPlayers() {
        return noOfPlayers();
    }

    @Override
    public void rules() {
        System.out.println("1. 7 players");
        System.out.println("2. ball should not drop to ground");
    }
}

class Soccer extends Game {
    Soccer() {

    }

    Soccer(String name, int players) {
        super(name, players);
    }

    @Override
    public int noOfPlayers() {
        return noOfPlayers();
    }

    @Override
    public void rules() {
        System.out.println("1. 10 players");
        System.out.println("2. dont touch ball by hand");
    }
}

class Cricket extends Game {
    Cricket() {

    }

    Cricket(String name, int players) {
        super(name, players);
    }

    @Override
    public int noOfPlayers() {
        return noOfPlayers();
    }

    @Override
    public void rules() {
        System.out.println("1. 10 players");
        System.out.println("2. Catch out");
    }

}

public class Sport {
    public static void main(String[] args) {
        Game obj = new BasketBall("Basket ball", 7);
        System.out.println(obj.getName());
        obj.rules();
        System.out.println("---------------------------");
        obj = new Soccer("Soccer", 10);
        System.out.println(obj.getName());
        obj.rules();
        System.out.println("---------------------------");
        obj = new Cricket("Cricket", 10);
        System.out.println(obj.getName());
        obj.rules();

    }
}
