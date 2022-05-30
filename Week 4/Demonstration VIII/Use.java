import pack1.*;
import pack1.myClass;
import pack2.*;

public class Use {
    public static void main(String[] args) {
        myClass c1 = new myClass();
        pack2.myClass c2 = new pack2.myClass();
        c1.msg1();
        c2.msg1();
    }
}
