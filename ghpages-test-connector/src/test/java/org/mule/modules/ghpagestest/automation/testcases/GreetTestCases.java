/**
 * (c) 2003-2015 MuleSoft, Inc. The software in this package is published under the terms of the CPAL v1.0 license,
 * a copy of which has been included with this distribution in the LICENSE.md file.
 */
 
package org.mule.modules.ghpagestest.automation.testcases;

import static org.junit.Assert.*;

import org.mule.modules.ghpagestest.automation.AbstractTestCase;
import org.mule.tools.devkit.ctf.junit.RegressionTests;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class GreetTestCases extends AbstractTestCase {

    @Test
    @Category({RegressionTests.class})
    public void testFlow() throws Exception {
    	
    	assertEquals(getConnector().greet("Foo"), "Hello Foo. How are you?");
    }
}