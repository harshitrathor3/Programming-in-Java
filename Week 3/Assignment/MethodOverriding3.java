class Men{
    int walkingDistance(int weight){
        System.out.println(10);
        return 10;
    }
}

class WildMen extends Men{
    void walkingDistance(int weight){
        System.out.println("20");
    }
}

public class MethodOverriding3{
    public static void main(String[] args) {
        WildMen wm = new WildMen();
        wm.walkingDistance(30);
    }
}