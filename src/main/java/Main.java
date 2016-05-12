import java.util.*;

/**
 * Created by Mayer Roman on 12.05.2016.
 */
public class Main {
    private static void sequentialAdditionSpeedTest(int numberOfAdditions) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        long arrayListSpeed;
        long linkedListSpeed;
        long startTime;
        long finishTime;


        startTime = System.currentTimeMillis();
        for (int i = 0; i < numberOfAdditions; i++) {
            arrayList.add(i);
        }
        finishTime = System.currentTimeMillis();
        arrayListSpeed = finishTime - startTime;


        startTime = System.currentTimeMillis();
        for (int i = 0; i < numberOfAdditions; i++) {
            linkedList.add(i);
        }
        finishTime = System.currentTimeMillis();
        linkedListSpeed = finishTime - startTime;


        System.out.print("ArrayList make " + numberOfAdditions + " sequential additions");
        System.out.println(" in " + arrayListSpeed + " ms");

        System.out.print("LinkedList make " + numberOfAdditions + " sequential additions");
        System.out.println(" in " + linkedListSpeed + " ms");

        System.out.println("___________________________________");
    }

    private static void randomAdditionSpeedTest(int initialListSize, int numberOfAdditions) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        Random random = new Random();

        long arrayListSpeed;
        long linkedListSpeed;
        long startTime;
        long finishTime;


        for (int i = 0; i < initialListSize; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }


        startTime = System.currentTimeMillis();
        for (int i = 0; i < numberOfAdditions; i++) {
            arrayList.add(i, random.nextInt(arrayList.size()));
        }
        finishTime = System.currentTimeMillis();
        arrayListSpeed = finishTime - startTime;


        startTime = System.currentTimeMillis();
        for (int i = 0; i < numberOfAdditions; i++) {
            linkedList.add(i, random.nextInt(linkedList.size()));
        }
        finishTime = System.currentTimeMillis();
        linkedListSpeed = finishTime - startTime;


        System.out.print("ArrayList with initial size " + initialListSize);
        System.out.print(" make " + numberOfAdditions + " random additions");
        System.out.println(" in " + arrayListSpeed + " ms");

        System.out.print("LinkedList with initial size " + initialListSize);
        System.out.print(" make " + numberOfAdditions + " random additions");
        System.out.println(" in " + linkedListSpeed + " ms");

        System.out.println("___________________________________");
    }

    private static void randomGetSpeedTest(int initialListSize, int numberOfRandomGets) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        Random random = new Random();

        long arrayListSpeed;
        long linkedListSpeed;
        long startTime;
        long finishTime;


        for (int i = 0; i < initialListSize; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }


        startTime = System.currentTimeMillis();
        for (int i = 0; i < numberOfRandomGets; i++) {
            arrayList.get(random.nextInt(initialListSize));
        }
        finishTime = System.currentTimeMillis();
        arrayListSpeed = finishTime - startTime;


        startTime = System.currentTimeMillis();
        for (int i = 0; i < numberOfRandomGets; i++) {
            linkedList.get(random.nextInt(initialListSize));
        }
        finishTime = System.currentTimeMillis();
        linkedListSpeed = finishTime - startTime;


        System.out.print("ArrayList with initial size " + initialListSize);
        System.out.print(" make " + numberOfRandomGets + " random gets");
        System.out.println(" in " + arrayListSpeed + " ms");

        System.out.print("LinkedList with initial size " + initialListSize);
        System.out.print(" make " + numberOfRandomGets + " random gets");
        System.out.println(" in " + linkedListSpeed + " ms");

        System.out.println("___________________________________");
    }

    private static void iteratorSpeedTest(int listSize) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        Iterator<Integer> iterator;

        long arrayListSpeed;
        long linkedListSpeed;
        long startTime;
        long finishTime;

        for (int i = 0; i < listSize; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }


        iterator = arrayList.iterator();
        startTime = System.currentTimeMillis();
        while (iterator.hasNext()) {
            iterator.next();
        }
        finishTime = System.currentTimeMillis();
        arrayListSpeed = finishTime - startTime;


        iterator = linkedList.iterator();
        startTime = System.currentTimeMillis();
        while (iterator.hasNext()) {
            iterator.next();
        }
        finishTime = System.currentTimeMillis();
        linkedListSpeed = finishTime - startTime;



        System.out.print("ArrayList with size " + listSize);
        System.out.print(" was passed by the iterator ");
        System.out.println("in " + arrayListSpeed + " ms");

        System.out.print("LinkedList with size " + listSize);
        System.out.print(" was passed by the iterator ");
        System.out.println("in " + linkedListSpeed + " ms");

        System.out.println("___________________________________");
    }

    private static void sortSpeedTest(int listSize){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        long arrayListSpeed;
        long linkedListSpeed;
        long startTime;
        long finishTime;


        for (int i = listSize; i > 0; i--) {
            arrayList.add(i);
            linkedList.add(i);
        }

        startTime = System.currentTimeMillis();
        Collections.sort(arrayList);
        finishTime = System.currentTimeMillis();
        arrayListSpeed = finishTime - startTime;


        startTime = System.currentTimeMillis();
        Collections.sort(linkedList);
        finishTime = System.currentTimeMillis();
        linkedListSpeed = finishTime - startTime;


        System.out.print("ArrayList with size " + listSize);
        System.out.println(" was sorted in " + arrayListSpeed + " ms");

        System.out.print("LinkedList with size " + listSize);
        System.out.println(" was sorted in " + linkedListSpeed + " ms");

        System.out.println("___________________________________");

    }

    private static void randomRemoveSpeedTest(int initialListSize, int numberOfRemoving){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        Random random = new Random();

        long arrayListSpeed;
        long linkedListSpeed;
        long startTime;
        long finishTime;


        for (int i = 0; i < initialListSize; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }


        startTime = System.currentTimeMillis();
        for (int i = 0; i < numberOfRemoving; i++) {
            arrayList.remove(random.nextInt(arrayList.size()));
        }
        finishTime = System.currentTimeMillis();
        arrayListSpeed = finishTime - startTime;


        startTime = System.currentTimeMillis();
        for (int i = 0; i < numberOfRemoving; i++) {
            linkedList.remove(random.nextInt(linkedList.size()));
        }
        finishTime = System.currentTimeMillis();
        linkedListSpeed = finishTime - startTime;



        System.out.print("ArrayList with initial size " + initialListSize);
        System.out.print(" make " + numberOfRemoving + " random removing");
        System.out.println(" in " + arrayListSpeed + " ms");

        System.out.print("LinkedList with initial size " + initialListSize);
        System.out.print(" make " + numberOfRemoving + " random removing");
        System.out.println(" in " + linkedListSpeed + " ms");

        System.out.println("___________________________________");

    }


    public static void main(String[] args) {
        sequentialAdditionSpeedTest(1000000);
        randomAdditionSpeedTest(1000000, 1000);
        randomGetSpeedTest(1000000, 10000);
        iteratorSpeedTest(10000000);
        sortSpeedTest(10000000);
        randomRemoveSpeedTest(100000, 10000);
    }
}
