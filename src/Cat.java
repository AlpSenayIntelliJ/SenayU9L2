public class Cat extends Animal {
    private boolean hasPlayedWith;
    private boolean scratch;
    public Cat(String name, int age, boolean vaccinated, boolean canReproduce, boolean hasPlayedWith, boolean scratch) {
        super(name, age, vaccinated, canReproduce);
        this.hasPlayedWith = hasPlayedWith;
        this.scratch = scratch;
    }
    public boolean getPlayStatus() {
        return hasPlayedWith;
    }
    public boolean getScratchedStatus() {
        return scratch;
    }
    public void play() {
        System.out.println("Played with " + getName());
    }
    public void scratch() {
        System.out.println(getName() + " scratched you!");
    }
}
