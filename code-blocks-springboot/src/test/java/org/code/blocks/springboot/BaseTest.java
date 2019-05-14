package org.code.blocks.springboot;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Junit base class.
 *
 * @author matthewliu
 * @version 1.0
 * @since 2019/02/14
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class BaseTest {

    public static String listenPort;
    @Rule
    public TestName testName = new TestName();
    @Rule
    public Timeout timeout = new Timeout(120, TimeUnit.SECONDS);

    @Before
    public void setUp() {

        testInit();
    }

    /**
     *  tearDown some for test.
     *
     */
    @After
    public void tearDown() {

        testFinalize();
    }

    public void testInit() {
        Assert.assertTrue(true);
    }

    public void testFinalize() {
        Assert.assertTrue(true);
    }
}
