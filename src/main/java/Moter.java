public class Moter {

    public void disp() {
        System.out.println("this is object creation");
    }
}
class Hari {
    public static void main(String[] args) {
        Moter hero = new Moter();
        Moter honda = new Moter();
        hero.disp();
        honda.disp();
    }
}