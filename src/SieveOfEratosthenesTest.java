import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;


class SieveOfEratosthenesTest {

    @org.junit.jupiter.api.Test
    void test1() {
        //should fail
        ArrayList<String> test1 = new ArrayList<>();
        test1.add("2");
        test1.add("3");
        Assertions.assertEquals(SieveOfEratosthenes.sieveOfEratosthenes(3),test1);

    }

    @org.junit.jupiter.api.Test
    void test2() {
        //should pass
        ArrayList<String> test2 = new ArrayList<>();
        test2.add("2");
        test2.add("3");
        test2.add("5");
        test2.add("7");
        test2.add("11");
        test2.add("13");
        test2.add("17");
        test2.add("19");
        test2.add("23");
        test2.add("29");
        Assertions.assertEquals(SieveOfEratosthenes.sieveOfEratosthenes(30),test2);
    }

    @org.junit.jupiter.api.Test
    void test3() {
        //should pass
        ArrayList<String> test3 = new ArrayList<>();
        test3.add("2");
        test3.add("3");
        test3.add("5");
        test3.add("7");
        Assertions.assertEquals(SieveOfEratosthenes.sieveOfEratosthenes(10),test3);
    }

    @org.junit.jupiter.api.Test
    void test4() {
        //should fail
        ArrayList<String> test4 = new ArrayList<>();
        test4.add("2");
        test4.add("3");
        test4.add("5");
        test4.add("8");
        Assertions.assertEquals(SieveOfEratosthenes.sieveOfEratosthenes(10),test4);
    }

    @org.junit.jupiter.api.Test
    void test5() {
        //edge case, should pass
        ArrayList<String> test5 = new ArrayList<>();
        Assertions.assertEquals(SieveOfEratosthenes.sieveOfEratosthenes(0),test5);
    }

}
