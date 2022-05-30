class Cat{
    void speak(){
        System.out.println("Meonnnnn");
    }
}

class PetCat extends Cat{
    void speak(){
        System.out.println("Meowwwww");
    }
}

class MagicCat extends Cat{
    static boolean noOne;

    void speak(){
        if (noOne)
            super.speak();
        else
            System.out.println("Hello Cat");
    }
}

public class Demonstration_66 {
    public static void main(String[] args) {
    PetCat c1 = new PetCat();
    MagicCat c2 = new MagicCat();
    
    MagicCat.noOne = true;
    c2.speak();
    c1.speak();
    
    MagicCat.noOne = false;
    c2.speak();
    c1.speak();

    }    
}
