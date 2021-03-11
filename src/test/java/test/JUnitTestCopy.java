package test;

import org.junit.*;

import static org.junit.Assert.*;

public class JUnitTestCopy {
    static int test = 0;

    @BeforeClass
    public static void startTesting(){
        System.out.println("Testing "+JUnitTestCopy.class.getSimpleName()+" ...");
        System.out.println();
    }

    @Before
    public void beforeEachTest(){
        ++test;
        System.out.println("Running test number "+test);
    }

    @Test
    public void addNegative(){
        Addition obj = new Addition();
        assertEquals(-10,obj.add(-2,-8));
        assertNotEquals(0,obj.add(-2,-8));
    }

    @After
    public void afterEachTest(){
        System.out.println("Finished test number "+test);
    }

    @AfterClass
    public static void endTesting(){
        System.out.println();
        System.out.println("Finished "+JUnitTestCopy.class.getSimpleName()+" !!!");
    }

}
