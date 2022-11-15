package firstlaba;

public class cheese extends food {

    public cheese() {
        super("Сыр");
    }

    public void consume() {
        System.out.println(this + " съеден");
    }
}