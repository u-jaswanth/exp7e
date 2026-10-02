public class App {

    public static void testAddition() {

        assert 2 + 3 == 5;

        System.out.println("test_addition: PASS");
    }

    public static void testSubtraction() {

        assert 5 - 2 == 3;

        System.out.println("test_subtraction: PASS");
    }

    public static void main(String[] args) {

        System.out.println(
            "---- Batch Testing (No Parameters) ----"
        );

        testAddition();

        testSubtraction();
    }
}
