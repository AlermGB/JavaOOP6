public class Main {
    public static void main(String[] args) {

        Animal mouse1 = new Animal(1);
        Human ivan = new Human(33, "Ivan");
        Cat murz = new Cat(2, "Murzik", ivan);

        ivan.callPet(murz);
        ivan.playWitPet(murz);
        ivan.feedPet(murz);
        System.out.println(murz);

        ivan.playWitPet(murz);
        ivan.driveAvayPet(murz);
        System.out.println(murz);
    }
}
