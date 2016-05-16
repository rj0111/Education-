
public class Main {
    // Homework 6 part 2
    public static void main(String[] args) {
        int address = 19986;
        int pageSize = 4096;


        int pageNumber = address / pageSize;
        int offset = address % pageSize;

        System.out.println("The address " + address + " \nThe System contains: \nPage number = " + pageNumber + " \nAnd offset = " + offset);

    }
}
