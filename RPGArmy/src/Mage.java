public class Mage {
    String armyClass = "Mage";
    String name;
    int health;
    int armor;
    int magicPower;


    void walk() {
        System.out.println(String.format("%s по имени %s с показателями здоровья = %d," +
                " защиты = %d и силы = %d ИДЁТ", armyClass, name, health, armor, magicPower));
    }

    void hold() {
        System.out.println(String.format("%s по имени %s с показателями здоровья = %d," +
                " защиты = %d и силы = %d СТОИТ", armyClass, name, health, armor, magicPower));
    }

    void attack() {
        System.out.println(String.format("%s по имени %s АТАКУЕТ", armyClass, name));
    }

    void castingMagic() {
        System.out.println(String.format("%s по имени %s с показателями здоровья = %d," +
                " защиты = %d и силы = %d КАСТУЕТ МАГИЮ", armyClass, name, health, armor, magicPower));
    }


}
