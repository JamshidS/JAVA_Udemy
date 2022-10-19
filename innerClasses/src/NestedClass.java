public class NestedClass {
    int x =10;

    //Nested Inner Class which can directly access the outer class members
    class Inner{
        int y =20;
        void show(){
            System.out.println(x+" "+y);
        }
    }

    void outerShow(){
        Inner inner =  new Inner();
        inner.show();
       // System.out.println(inner.y); outer class can't access directly the members of outer class
       //it can use it by creating inner class object
    }
}
