package test;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        // All test files
        JUnitTest.class,
        JUnitTestCopy.class
})
public class JUnitTestSuite {
}
