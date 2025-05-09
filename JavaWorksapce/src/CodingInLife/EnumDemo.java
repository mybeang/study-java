package CodingInLife;


enum Fruit{
    APPLE("red"), PEACH("pink"), BANANA("yellow");
    private String color;
    Fruit(String color){
        System.out.println("Call Constructor "+this);
        this.color = color;
    }
    String getColor(){
        return this.color;
    }
}

enum Company{
    GOOGLE("USA"),
    APPLE("USA"),
    SAMSUNG("Korea"),
    LG("Korea"),
    KDDI("Japan");

    private final String country;
    Company(String country) {
        this.country = country;
    }
    public String getCountry(){
        return this.country;
    }
}


public class EnumDemo {
    public static void main(String[] args) {
        for(Fruit f : Fruit.values()){
            System.out.println(f+", "+f.getColor());
        }
        System.out.println();
        for(Company c: Company.values()){
            System.out.println(String.format("%s (%s)", c, c.getCountry()));
        }
    }
}
