public class Dog extends Animal {
    private boolean hasBeenWalked;
    private boolean hasSniffed;
    public Dog(String name, int age, boolean vaccinated, boolean canReproduce, boolean hasBeenWalked, boolean hasSniffed) {
        super(name, age, vaccinated, canReproduce);
        this.hasBeenWalked = hasBeenWalked;
        this.hasSniffed = hasSniffed;
    }
    public boolean getWalkedStatus() {
        return hasBeenWalked;
    }
    public boolean getSniffStatus() {
        return hasSniffed;
    }
    public void walk() {
        System.out.println("On a walk with" + getName());
    }
    public void sniff() {
        System.out.println(getName() + " sniffed!");
    }
}
