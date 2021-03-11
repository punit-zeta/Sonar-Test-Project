package test;

import org.junit.*;

import static org.junit.Assert.*;

public class JUnitTest {

    static int test = 0;

    @BeforeClass
    public static void startTesting(){
        System.out.println("Testing "+JUnitTest.class.getSimpleName()+" ...");
        System.out.println();
    }

    @Before
    public void beforeEachTest(){
        ++test;
        System.out.println("Running test number "+test);
    }

    @Test
    public void addPositive(){
        Addition obj = new Addition();
        assertEquals(10,obj.add(2,8));
        assertNotEquals(0,obj.add(2,8));
        assertArrayEquals(new int[]{10,20},new int[]{obj.add(2,8),obj.add(12,8)});
        assertFalse(12 == obj.add(2,8));
        assertSame(10,obj.add(2,8));
    }

    @After
    public void afterEachTest(){
        System.out.println("Finished test number "+test);
    }

    @AfterClass
    public static void endTesting(){
        System.out.println("Finished "+JUnitTest.class.getSimpleName()+" !!!");
        System.out.println();
    }

}