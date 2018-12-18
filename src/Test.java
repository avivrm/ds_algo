public class Test {


    public void passing(int v){
        System.out.print("int");
    }

    public void passing(double v){
        System.out.print("double");
    }

    public void passing(float v){
        System.out.print("float");
    }

    public static void main(String[] args) {

        System.exit(1);
        System.out.println("after call exit");
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {System.out.println("Adding ShutdownhookF");}));


        System.gc();


        for(var s: args)
            System.out.println(s);

        Test t = new Test();
        t.passing(4);
    }
}
