import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String[] commands = {"Сидеть", "Лежать"};
        Shelter shelter = new Shelter("Mir", "Lenina 1");

        Dog dog = new Dog("Rex", "Ovcharka", commands, ColorEnum.BROWN, shelter);
        System.out.println(dog.getInfo());
        System.out.println();

        dog.makeVoice();
        dog.makeVoice("Гув Гув");
        dog.makeVoice("Гив Гив",3);
        System.out.println();

        Dog dog2 = new Dog();
        System.out.println();

        Dog dog3 = new Dog("Lulu", "German Shepherd", ColorEnum.BLACK, shelter);
        System.out.println(dog3.getInfo());
        System.out.println();


        SmithFamily bob = new SmithFamily("Professional chess player","golf");
        SmithFamily tom = new SmithFamily("Java Developer","chess");
        SmithFamily will = new SmithFamily("schoolboy","chess");

        Grandfather grandfather = new Grandfather();
        System.out.println("Name: " + grandfather.getName() + ", age: " + grandfather.getAge() + ", character: " + grandfather.getCharacter() + "\n");

        Father father = new Father("Tom", 40, "kind", tom);
        father.info();
        father.info("");
        father.info(10);
        System.out.println();

        Son son = new Son("Will", 10,"honest", will);
        son.info();
        son.info("");
    }
}