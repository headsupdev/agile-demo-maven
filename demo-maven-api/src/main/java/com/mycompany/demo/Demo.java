package com.mycompany.demo;

/**
 * TODO document me
 *
 * @author Andrew Williams
 * @since 1.0
 */
public class Demo {
    private String world;

    public Demo( String world ) {
        if ( world == null ) {
            throw new NullPointerException();
        }

        this.world = world;
    }

    public String getWelcome() {
        return "Hello " + world;
    }
}
