package odev01;

public class Main {

    public static void main(String[] args)  {

        boolean exit = false;

        //Shutdown Hook to get message for termination
        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(new Test());

        //While loop for printing message at 10s Interval
        while (!exit) {

            try {
                System.out.println("System running");
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

