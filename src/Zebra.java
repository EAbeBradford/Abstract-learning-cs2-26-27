public class Zebra extends Animal{

    public Zebra(){
        numLegs = 4;
    }

    @Override
    public void makeSound() {
        System.out.println("i neigh");
    }
}
