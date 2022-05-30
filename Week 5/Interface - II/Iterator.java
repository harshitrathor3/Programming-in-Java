package java.util.*;

public interface Iterator{
    public abstract boolean hasNext();
    Object next();
    void remove();
}

myShapes = getSomeCollenctionOfShapes();
Iterator iter = myShapes.iterator();

while (iter.hasNext()){
    Shape s = (Shape)   iter.next();
    s.draw();
}