package es2.arr;

public class ThreadCas extends Thread{
    int indice;
    int[] array = new int[10];

    ThreadCas(int[] array, int indice) {
        this.indice = indice;
        this.array = array;
    }

    @Override
    public void run() {
        int val = (int) (Math.random() * 100)+1;
        array[indice] = val;
        System.out.println(Thread.currentThread().getName() + " ha messo " + val);
    }
}
