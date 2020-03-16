public class ContaThread extends Thread {
    @Override
    public void run() {
        setName("Pistolo");
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            System.out.println("Ciao" + i);
        }
    }

}
