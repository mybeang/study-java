package CodingInLife.lib;

public class Item {
    String name;
    int strong;
    int magic;
    int hp;
    int mp;

    public Item(String name, int strong, int magic, int hp, int mp) {
        this.name = name;
        this.strong = strong;
        this.magic = magic;
        this.hp = hp;
        this.mp = mp;
    }

    public void showStatus() {
        System.out.println(String.format("Name: %s", this.name));
        System.out.println(String.format("Strong: %d", this.strong));
        System.out.println(String.format("Magic: %d", this.magic));
        System.out.println(String.format("HP: %d", this.hp));
        System.out.println(String.format("MP: %d", this.mp));

    }
}
