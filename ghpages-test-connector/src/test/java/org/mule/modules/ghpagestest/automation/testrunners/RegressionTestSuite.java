/**
 * (c) 2003-2015 MuleSoft, Inc. The software in this package is published under the terms of the CPAL v1.0 license,
 * a copy of which has been included with this distribution in the LICENSE.md file.
 */
package org.mule.modules.ghpagestest.automation.testrunners;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.mule.modules.ghpagestest.automation.testcases.GreetTestCases;
import org.mule.modules.ghpagestest.GhpagesTestConnector;
import org.mule.tools.devkit.ctf.junit.RegressionTests;
import org.mule.tools.devkit.ctf.mockup.ConnectorTestContext;

@RunWith(Categories.class)
@IncludeCategory(RegressionTests.class)

@SuiteClasses({
	GreetTestCases.class
	
})

public class RegressionTestSuite {
	
	@BeforeClass
	public static void initialiseSuite(){
		
		ConnectorTestContext.initialize(GhpagesTestConnector.class);

	}
	
	@AfterClass
    public static void shutdownSuite() {

        ConnectorTestContext.shutDown();

    }
	
}