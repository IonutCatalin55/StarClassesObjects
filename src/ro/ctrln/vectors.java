package ro.ctrln;

import java.util.Arrays;

public class vectors {
    public static void main(String[] args) {

        char[] source = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        char[] destination = new char[13];
        char[] sourceOne = {'c', 'a', 'b', 'd', 'e', 'f'};
        char[] sourcetwo = {'z', 'w', 'b', 'a', 'v', 't'};

        System.arraycopy(source, 1, destination, 4, 5);
        System.out.println(destination);

        char[] copyOfRange = Arrays.copyOfRange(source, 2, 5);
        System.out.println(copyOfRange);

        char[] anotherCopyOfRange = Arrays.copyOfRange(source, 0, 9);
        System.out.println(anotherCopyOfRange);

        copyOfRange = Arrays.copyOfRange(source, 0, 20);
        System.out.println(copyOfRange);
        System.out.println(copyOfRange.length);

        /*
        copyOfRange  = Arrays.copyOfRange(source, 15, 20);
        System.out.println(copyOfRange);
         */
        Arrays.fill(destination, '3');
        System.out.println(destination);

        Arrays.binarySearch(source, 'z');
        //System.out.println(Arrays.binarySearch(source, 'z'));
        //System.out.println(Arrays.binarySearch(source, 'z'));
        //System.out.println(Arrays.binarySearch(sourceOne, 'b'));
        //System.out.println(Arrays.binarySearch(sourcetwo, 'b'));
        System.out.println(sourcetwo);
        Arrays.sort(sourcetwo);
        System.out.println(sourcetwo);
        System.out.println(Arrays.binarySearch(sourcetwo, 'z'));

    }
}
