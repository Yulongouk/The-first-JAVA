public class Java_Try_catch {
    public static void main(String[] args) {
        try{
                  String[] car={"ford","toyota","Honda"};
                  System.out.println(car[2]);
        }catch(Exception e){
            System.out.println("You got wrong hah");
        }finally{
            System.out.println("Hey you have complete this task!");
        }
    }
}
