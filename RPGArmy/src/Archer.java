public class Archer {
    String armyClass = "Archer";
    String name;
    int health;
    int armor;
    int strength;

    void walk() {
        System.out.println(String.format("%s по имени %s с показателями здоровья = %d," +
                " защиты = %d и силы = %d ИДЁТ", armyClass, name, health, armor, strength));
    }

    void hold() {
        System.out.println(String.format("%s по имени %s с показателями здоровья = %d," +
                " защиты = %d и силы = %d СТОИТ", armyClass, name, health, armor, strength));
    }

    void attack() {
        System.out.println(String.format("%s по имени %s АТАКУЕТ", armyClass, name));
    }


}
