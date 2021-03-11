package test;

public class Addition {

    public int add(int a, int b) {
        return a + b;
    }

    public void notCovered(){
        System.out.println("This function is not covered in JUnit test");
    }

    public void duplicate(){
        String s = "I am duplicate";
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        notCovered();
    }
}
