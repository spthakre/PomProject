package com.jbk.PomProject;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ATest 
    extends TestCase
{
    public ATest( String testName )
    {
        super( testName );
    }

    
    public static Test suite()
    {
        return new TestSuite( ATest.class );
    }

    
    public void testA()
    {
        assertTrue( true );
    }
}
