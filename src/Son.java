public final class Son extends Father{
    private String name;
    private int age;
    private String character;

    public Son(String name, int age, String character, SmithFamily smithFamily) {
        super(name, age, character, smithFamily);
        this.name = name;
        this.age = age;
        this.character = character;
    }

    public void info(){
        System.out.println("Name: " + name + ", age: " + age + ", character: " + character + ", profession and hobby: " + getSmithFamily());
    }

    public void info(String info){
        // String info2 = info;
        info = "Beginner java programmer";
        System.out.println(name + " " + info);
    }
}
