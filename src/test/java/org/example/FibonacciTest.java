package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    Fibonacci fib = null;
    @Before
    public void setUp() throws Exception {
        fib= new Fibonacci();
    }

    @After
    public void tearDown() throws Exception {
        fib = null;
    }

    @Test
    public void test1() {
        assertEquals( 1,fib.fibonacci(1));
    }

    @Test
    public void test2(){
        assertEquals(0,fib.fibonacci(0));
    }

    @Test
    public void test3(){
        assertEquals(-1,fib.fibonacci(-8));
    }

}