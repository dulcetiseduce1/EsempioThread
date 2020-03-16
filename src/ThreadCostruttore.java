public class ThreadCostruttore extends Thread {
    public void run(){
        System.out.println("Ciao sono il Thread"+getName());
        int y = 30;
        System.out.println("Ho letto la variabile y="+y);
    }

}
