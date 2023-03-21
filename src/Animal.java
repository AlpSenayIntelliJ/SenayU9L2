public class Animal {
    private String name;
    private int age;
    private boolean vaccinated;
    private boolean canReproduce;
    public Animal(String name, int age, boolean vaccinated, boolean canReproduce) {
        this.name = name;
        this.age = age;
        this.vaccinated = vaccinated;
        this.canReproduce = canReproduce;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public boolean getVaccinationStatus() {
        return vaccinated;
    }
    public boolean getReproductionStatus() {
        return canReproduce;
    }
    public void adopt() {
        System.out.println(name + " got adopted!");
    }
    public void feed() {
        System.out.println(name + " got fed!");
    }
    public void reproduce() {
        System.out.println(name + " has reproduced!");
    }
}
