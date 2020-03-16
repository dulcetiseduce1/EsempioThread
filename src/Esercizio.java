public class Esercizio {
    public static void main(String[] args) {

        ThreadCostruttore cos = new ThreadCostruttore();
        ContaThread ct = new ContaThread();

        cos.start();
        ct.start();
        System.out.println("Ciao sono il"+" " + Thread.currentThread().getName());

        int x = 10;
        System.out.println("Ho la variabile x=" + x);
    }
}
