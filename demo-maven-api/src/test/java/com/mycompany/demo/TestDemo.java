package com.mycompany.demo;

import junit.framework.TestCase;

/**
 * TODO document me
 *
 * @author Andrew Williams
 * @since 1.0
 */
public class TestDemo extends TestCase {
    public void testDefault() throws Exception {
        assertTrue( new Demo( "test" ).getWelcome().endsWith( "test" ) );
        assertFalse( new Demo( "false" ).getWelcome().endsWith( "test" ) );
    }

    public void testNull() throws Exception {
        boolean thrown = false;

        try {
            new Demo( null );
        } catch ( NullPointerException e ) {
            thrown = true;
        }

        assertTrue( thrown );
    }

/* disable these for now, just used to show test errors
    public void testThrows() throws Exception {
        new Demo( null );
    }

    public void testFail() throws Exception {
        fail( "something" );
    }
*/
}
