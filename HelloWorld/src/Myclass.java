public class Myclass {
    //Different between static and public
    //Using static doesn't need create the object
    static void mystatic() {
        System.out.println("There no need to create the object");
    }
    public void mypublic() {
        System.out.println("It must create the object first");
    }

    public static void main(String[] args) {
        mystatic(); // It will be called without creating the object
        Myclass mycalled = new Myclass();
        mycalled.mypublic();// it will be called when we use the object by using the public;

    }
}
