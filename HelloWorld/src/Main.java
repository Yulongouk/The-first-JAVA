class Base
{
    public void test1()
    {
        System.out.println("Test 1");
    }

}

class Child1 extends Base{
    public void test2()
    {
        System.out.println("Test 2");
    }

}

class Child2 extends Child1{
    public void test3()
    {
        System.out.println("Test 3");
    }

}

public class Main
{
    public static void main(String[] args) {
        Child2 obj = new Child2();
        obj.test3();
        obj.test2();
        obj.test1();
    }
}
