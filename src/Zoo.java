public class Zoo {//
    public static void main(String[] args) {
        Zoo a = new Zoo();
    }

    public Zoo(){
Zebra a = new Zebra();
a.makeSound();
Gorilla g = new Gorilla();
        System.out.println(g.getBananasConsumed() + " bananas!");

        g.setBananasConsumed(4090);
        System.out.println(g.getBananasConsumed() + " bananas!");
    }

    public void method1(){
        System.out.println("hi in method 1");
    }


}
