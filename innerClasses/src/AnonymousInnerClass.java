public class AnonymousInnerClass {
    //just a method for giving example
    public  void meth(){
//        MyClass myClass = new MyClass() {
//            @Override
//            void show() {
//                System.out.println("AnonymousInnerClass is called");
//            }
//        };
//        myClass.show();

        //Anonymous class calling using anonymous object
        new MyClass(){void show(){System.out.println("AnonymousInnerClass is called");}}.show();


    }
}
