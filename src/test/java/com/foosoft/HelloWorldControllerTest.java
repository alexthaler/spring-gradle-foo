package com.foosoft;

import junit.framework.TestCase;

public class HelloWorldControllerTest extends TestCase {

    public void testGetHelloWorldString() {
        HelloWorldController controller = new HelloWorldController();
        String message = controller.getHelloWorldMessage();
        assertNotNull(message);
        assertTrue(message.equals("Hello World!"));
    }

}
