class Animal {
}

class Mammal extends Animal {
}

class Reptile extends Animal {
}

 class Dog extends Mammal {

    public static void main(String args[]) {
        int a = 1;
        int b = 99;
        int c;

        b = a++;
        c = ++b;

        System.out.println("c = " + c);    }
}