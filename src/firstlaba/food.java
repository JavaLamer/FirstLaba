package firstlaba;

public abstract class food implements consumable {
    String name = null;

    public food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
// Реализация метода consume() удалена из базового класса Food
// Это можно сделать, потому что сам Food - абстрактный
}
