package linkedlist.episode1;

import java.util.concurrent.ForkJoinPool;

public class ArrayMain {
    public static void main(String[] args) {
        // top down design
        // queue has 10 ppl
        int[] qu = new int[10];// fixed length
        qu[0]= 1;
        qu[1]= 3;
        qu[2]= 6;
        qu[3]= 8;
        qu[4]= 9;
        int quLen = 5;
        System.out.println("original qu:");
        for (int i = 0; i < quLen; i++) {
            System.out.printf("%d\t",qu[i]);
        }
        System.out.println();

        // add element
        int kid = 7;
        quLen = enQueue(qu,quLen,kid);
        System.out.println("new queue");
        for (int i = 0; i < quLen; i++) {
            System.out.printf("%d\t",qu[i]);
        }
        System.out.println();

        // delete elements
        quLen = leaveQueue(qu,quLen,2);
        System.out.println("after dequeue");
        for (int i = 0; i < quLen; i++) {
            System.out.printf("%d\t",qu[i]);
        }
        System.out.println();


        }

    private static int leaveQueue(int[] qu, int quLen, int i) {
        int kid = qu[i];
        for (int j = i+1; j <quLen ; j++) {
            qu[j-1] = qu[j];
        }
        return quLen-1;
    }

    public  static int enQueue(int[] qu, int quLen,int kid) {
        int pos = quLen;
        for (int i = 0; i < quLen; i++) {
            if (qu[i] >=kid) {
                pos = i;
                break;
            }
        }
        for (int i = quLen-1; i >=pos ; i--) {
            qu[i+1] = qu[i];

        }
        qu[pos] = kid;
        return quLen+1;


    }
}
