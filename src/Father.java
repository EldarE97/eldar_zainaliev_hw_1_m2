public class Father extends Grandfather {
    private String name2;
    private int age2;
    private String character2;

    public Father(String name, int age, String character, SmithFamily smithFamily) {
       this.name2 = name;
       this.age2 = age;
       this.character2 = character;
        //super.getSmithFamily();
    }
    public void info(){
        System.out.println("Name: " + name2 + ", age: " + age2 + ", character: " + character2 + ", profession and hobby: " + getSmithFamily());
    }
    public void info(String info){
       // String info2 = info;
        info = "Senior java programmer";
        System.out.println(name2 + " " + info);
    }
    public final void info(int age){
        System.out.println(name2 + " started programming at the age of " + age);
    }
}
