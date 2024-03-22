package es2.arr;

public class Main {
    public static void main(String[] args) {
        ThreadCas[] arrayThread = new ThreadCas[10];
        int[] arr = new int[10];
        for(int i=0; i<arr.length;i++){
            arrayThread[i] = new ThreadCas(arr, i);
        }
        for(int i=0; i<arr.length;i++){
            arrayThread[i].start();
        }
        for(int i=0; i<arr.length;i++){
            try {
                arrayThread[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}