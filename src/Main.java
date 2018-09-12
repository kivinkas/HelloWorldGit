public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("New Line");

        int i;
        i = 10;
        System.out.println("i + 1 = " + i);
        for (int j=0; j<10; j++)
            i = i+j;
        System.out.println("i = " + i);

        TestClassNew t = new TestClassNew("MyTestClass");
        System.out.println(t.getName());
    }
}
