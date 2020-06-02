
public class Army {
    Soldier[] soldierArray;
    Archer[] archerArray;
    Mage[] mageArray;

    /**
     * 1. Создать классы Soldier, Archer, Mage
     * a. Каждому классу создать свойства (характеристики): Здоровье,
     * Защита
     * b. Soldier, Archer должны обладать свойством сила, а Mage - магическая
     * сила
     * c. Для всех классов создать методы: ходить, останавливаться,
     * атаковать
     * d. Для класса Mage создать дополнительный метод творить магию
     * 2. Создать класс Army
     * a. Классу Army создать свойства: массив Soldier, массив Archer, массив
     * Mage
     * b. Для класса Army создать метод, который считает количество
     * пригодных к бою всех типов воинов и выводит данные в консоль по
     * следующему правилу: Все кроме Mage, пригодные если здоровье не
     * менее 85, а для Mage не менее 50
     * 3. Укомплектовать армию из 5 Soldier, 3 Archer, 2 Mage
     * 4. Вывести в консоль информацию о пригодных к бою воинах
     * 5.  Направить в атаку только тех воинов, которые пригодные к бою
     */


    public static void main(String[] args) {

        mainMethodArmy();

    }

    static void mainMethodArmy() {

        String[] namesOfSoldier = {"ДЖЕЛИОР", "АРТОРОС", "СТАРОФОР", "ФИЛИСЭЛ",
                "ТУН", "МЕГИЛАГ", "БОВУХОИЛ", "ГРИНЕДИЛКИ", "ЗОЛА", "ТУБЕСАНА"};
        String[] namesOfArcher = {"ИСРИОН", "ЭКРЕ", "ИСЛЕКДОР", "ИССИЛ", "АЙДЖИНУИ",
                "ЭЛРОС", "ВИНИНА", "КИРОДА", "МЕРРИКС", "ВРОН"};
        String[] namesOfMage = {"ФАГИЯ", "ПИРОСКР", "ОСЛЕН", "ЭЙФАН", "ВЕНРН",
                "БЕХАЛ", "ЭЛХО", "МАГОНГИЛ", "ДИЛРОФОР", "ГИР"};

        Soldier[] soldierArray = new Soldier[5];
        Archer[] archerArray = new Archer[3];
        Mage[] mageArray = new Mage[2];

        propertyFillingSoldiers(soldierArray, namesOfSoldier);
        propertyFillingArchers(archerArray, namesOfArcher);
        propertyFillingMages(mageArray, namesOfMage);

        battleReadyArmySoldiers(soldierArray, archerArray, mageArray);
    }

    static void battleReadyArmySoldiers(Soldier[] soldiers, Archer[] archers, Mage[] mages) {

        for (int i = 0; i < soldiers.length; i++) {

            if (soldiers[i].health >= 85) {
                printArray(soldiers, i);
                soldiers[i].attack();
            }
        }
        for (int i = 0; i < archers.length; i++) {

            if (archers[i].health >= 85) {
                printArray(archers, i);
                archers[i].attack();
            }
        }
        for (int i = 0; i < mages.length; i++) {

            if (mages[i].health >= 50) {
                printArray(mages, i);
                mages[i].attack();
            }
        }
    }

    /**
     * Дополнительные условия
     * У Soldier максимальное здоровье может быть в диапазоне от 50 до 120, защита 100-150, сила 80-130;
     * У Archer максимальное здоровье может быть в диапазоне от 40 до 100, защита 30-70, сила 100-170;
     * У Mage максимальное здоровье может быть в диапазоне от 35 до 80, защита 0-40, магичесская сила 150-200;
     */

    static void propertyFillingSoldiers(Soldier[] armyArray, String[] namesOfWarriors) {

        for (int k = 0; k < armyArray.length; k++) {
            armyArray[k] = new Soldier();
            armyArray[k].health = randomGenerationStats(50, 120);
            armyArray[k].armor = randomGenerationStats(100, 150);
            armyArray[k].strength = randomGenerationStats(80, 130);
        }

        for (int i = 0; i < armyArray.length; i++) {

            armyArray[i].name = namesOfWarriors[randomNumberToIndexOfArray(namesOfWarriors)];
            int j = 0;

            while (j < armyArray.length) {

                if ((armyArray[i].name.equals(armyArray[j].name)) && (j != i)) {
                    armyArray[i].name = namesOfWarriors[randomNumberToIndexOfArray(namesOfWarriors)];
                } else {
                    j++;
                }
            }
        }
    }

    static void propertyFillingArchers(Archer[] armyArray, String[] namesOfWarriors) {

        for (int k = 0; k < armyArray.length; k++) {
            armyArray[k] = new Archer();
            armyArray[k].health = randomGenerationStats(40, 100);
            armyArray[k].armor = randomGenerationStats(30, 70);
            armyArray[k].strength = randomGenerationStats(100, 170);
        }

        for (int i = 0; i < armyArray.length; i++) {

            armyArray[i].name = namesOfWarriors[randomNumberToIndexOfArray(namesOfWarriors)];
            int j = 0;

            while (j < armyArray.length) {

                if ((armyArray[i].name.equals(armyArray[j].name)) && (j != i)) {
                    armyArray[i].name = namesOfWarriors[randomNumberToIndexOfArray(namesOfWarriors)];
                } else {
                    j++;
                }
            }
        }
    }

    static void propertyFillingMages(Mage[] armyArray, String[] namesOfWarriors) {

        for (int k = 0; k < armyArray.length; k++) {
            armyArray[k] = new Mage();
            armyArray[k].health = randomGenerationStats(35, 80);
            armyArray[k].armor = randomGenerationStats(0, 40);
            armyArray[k].magicPower = randomGenerationStats(150, 200);
        }

        for (int i = 0; i < armyArray.length; i++) {

            armyArray[i].name = namesOfWarriors[randomNumberToIndexOfArray(namesOfWarriors)];
            int j = 0;

            while (j < armyArray.length) {

                if ((armyArray[i].name.equals(armyArray[j].name)) && (j != i)) {
                    armyArray[i].name = namesOfWarriors[randomNumberToIndexOfArray(namesOfWarriors)];
                } else {
                    j++;
                }
            }
        }
    }

    static void printArray(Soldier[] soldier, int i) {
        System.out.println(String.format("%n%s %s с показателем здоровья = %d," +
                        " бронёй = %d и силой = %d пригоден к бою",
                soldier[i].armyClass, soldier[i].name,
                soldier[i].health, soldier[i].armor, soldier[i].strength));

    }

    static void printArray(Archer[] archers, int i) {
        System.out.println(String.format("%n%s %s с показателем здоровья = %d," +
                        " бронёй = %d и силой = %d пригоден к бою",
                archers[i].armyClass, archers[i].name,
                archers[i].health, archers[i].armor, archers[i].strength));
    }

    static void printArray(Mage[] mages, int i) {
        System.out.println(String.format("%n%s %s с показателем здоровья = %d," +
                        " бронёй = %d и силой = %d пригоден к бою",
                mages[i].armyClass, mages[i].name,
                mages[i].health, mages[i].armor, mages[i].magicPower));
    }

    static int randomGenerationStats(int min, int max) {
        return (int) (min + Math.random() * (max - min));
    }

    static int randomNumberToIndexOfArray(String[] arrayToNames) {
        return (int) (Math.random() * arrayToNames.length);
    }

}
