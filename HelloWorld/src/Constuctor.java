public class Constuctor {
//     int x;
//    public  Constuctor(){
//         x = 5;
//    }
//    public static void main(String[] args) {
//        Constuctor myobj = new Constuctor();
//        System.out.println(myobj.x);
//
//    }
    String Name,Contact;
    //Constuctor name class and public class are the same
    public Constuctor(String name , String contact ){
        Name = name;
        Contact = contact;
    }

    public static void main(String[] args) {
        Constuctor hello = new Constuctor("Yulong", "0962906099");
        System.out.println("My name is "+ hello.Name);
        System.out.println("Contact is "+hello.Contact);
    }
}
