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

    }
}