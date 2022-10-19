public class StaticInnerClass {
    static int x = 10;
     int y = 20;
    static class  Inner{
        void show(){
            System.out.println("Static variable of outer class: "+x);
           // System.out.println(y);//the static inner class can directly access only the static members
            //of outer class
        }
    }
}
