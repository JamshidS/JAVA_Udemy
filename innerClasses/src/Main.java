public class Main {
    public static void main(String[] args) {
        NestedClass nestedClass = new NestedClass();
        nestedClass.outerShow();

        //The way to create the object of inner class using outer class object.
        NestedClass.Inner inner = new NestedClass().new Inner();
        inner.show();

        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.display();

        AnonymousInnerClass  innerClass = new AnonymousInnerClass();
        innerClass.meth();


        //we can create an inner static class object without creating outer class object.
        StaticInnerClass.Inner staticInner = new StaticInnerClass.Inner();
        staticInner.show();

    }
}