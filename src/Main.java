public class Main {
    public static void main(String[] args)
    {
        Animal myAnimal = new Animal("Some Animal", 6, false, true);
        System.out.println(myAnimal.getName());
        System.out.println(myAnimal.getAge());
        System.out.println(myAnimal.getVaccinationStatus());
        System.out.println(myAnimal.getReproductionStatus());
        myAnimal.adopt();
        myAnimal.feed();
        myAnimal.reproduce();

        Dog sethDog = new Dog("Seth", 17, false, false, false, true);
        System.out.println(sethDog.getName());
        System.out.println(sethDog.getAge());
        System.out.println(sethDog.getVaccinationStatus());
        System.out.println(sethDog.getReproductionStatus());
        System.out.println(sethDog.getWalkedStatus());
        System.out.println(sethDog.getSniffStatus());
        sethDog.adopt();
        sethDog.feed();
        sethDog.reproduce();
        sethDog.walk();
        sethDog.sniff();

        Cat rohitCat = new Cat("Rohit", 0, true, true, false, false);
        System.out.println(rohitCat.getName());
        System.out.println(rohitCat.getAge());
        System.out.println(rohitCat.getVaccinationStatus());
        System.out.println(rohitCat.getReproductionStatus());
        System.out.println(rohitCat.getPlayStatus());
        System.out.println(rohitCat.getScratchedStatus());
        rohitCat.adopt();
        rohitCat.feed();
        rohitCat.reproduce();
        rohitCat.play();
        rohitCat.scratch();
    }
}
