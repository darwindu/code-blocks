package org.code.blocks.spring;

import java.util.concurrent.TimeUnit;

import org.code.blocks.spring.constant.PropertitesConstant;
import org.code.blocks.spring.service.HelloWorldSpringService;
import org.code.blocks.spring.service.impl.HelloWorldSpringServiceImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Junit base class.
 *
 * @author matthewliu
 * @version 1.0
 * @since 2019/02/14
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
    locations = {"classpath:codeBolcksApplicationContext.xml"})
public class BaseTest {

    public static String listenPort;
    @Rule
    public TestName testName = new TestName();
    @Rule
    public Timeout timeout = new Timeout(120, TimeUnit.SECONDS);

    protected HelloWorldSpringService helloWorldSpringService;

    @Before
    public void setUp() {

        testInit();
        listenPort = PropertitesConstant.WEEVENT_SERVER_PORT;
        helloWorldSpringService = new HelloWorldSpringServiceImpl();
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
