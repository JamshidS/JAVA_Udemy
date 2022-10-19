public class LocalInnerClass {

    void display(){
        class Inner{
            void innerDisplay(){
                System.out.println("Hello World");
            }
        }
        new Inner().innerDisplay();//without creating its object--using anonymous object
//        Inner inner = new Inner();
//        inner.innerDisplay();
    }
}
