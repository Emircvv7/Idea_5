class Hero {
    private String name;
    private int age;
    public Hero(String name) {
        this.name = name;
    }
    public Hero(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getInfo() {
        if (age > 0) {
            return "Имя: " + name + ", Возраст: " + age;
        } else {
            return "Имя: " + name;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Hero[] heroes = createHeroes();

        for (Hero hero : heroes) {
            System.out.println(hero.getInfo());
        }
    }

    public static Hero[] createHeroes() {
        Hero[] heroes = new Hero[3];
        Hero hero1 = new Hero("Герой 1");
        Hero hero2 = new Hero("Герой 2", 16);
        Hero hero3 = new Hero("Герой 3");

        heroes[0] = hero1;
        heroes[1] = hero2;
        heroes[2] = hero3;

        return heroes;
    }
}


