public class Modifier {
    abstract static class spec {
        int ram = 3, rom = 32;

      //  public abstract void Spec();
    }

    static class phone extends spec {
        String name = "Oppo";
        String release = "2017";

        private void Spec() {
            System.out.println("Abstract mode processing");
        }

    }

    public static void main(String[] args) {
        phone info = new phone();
        System.out.println("My phone is" + info.name);
        System.out.println("Release date" + info.release);
        System.out.println("Ram" + info.ram + "GB and Rom" + info.rom);
        info.Spec();
    }
}