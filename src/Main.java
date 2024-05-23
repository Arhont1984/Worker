
public class Main {
    public static void main(String[] args) {

        Worker.OnTaskDoneListener listener = result -> System.out.println(result);
        Worker.OnTaskErrorListener error = () -> System.out.println("Error occurred");

        Worker worker = new Worker(listener, error);
        worker.start();
    }
}