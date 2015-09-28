/**
 * (c) 2003-2015 MuleSoft, Inc. The software in this package is published under the terms of the CPAL v1.0 license,
 * a copy of which has been included with this distribution in the LICENSE.md file.
 */
package org.mule.modules.ghpagestest.automation;

import org.junit.Before;
import org.mule.modules.ghpagestest.GhpagesTestConnector;
import org.mule.tools.devkit.ctf.mockup.ConnectorDispatcher;
import org.mule.tools.devkit.ctf.mockup.ConnectorTestContext;

public abstract class AbstractTestCase {
	
	private GhpagesTestConnector connector;
	private ConnectorDispatcher<GhpagesTestConnector> dispatcher;
	
	
	protected GhpagesTestConnector getConnector() {
		return connector;
	}


	protected ConnectorDispatcher<GhpagesTestConnector> getDispatcher() {
		return dispatcher;
	}

	@Before
	public void init() throws Exception {
		
		//Initialization for single-test run
        ConnectorTestContext.initialize(GhpagesTestConnector.class, false);
		
		//Context instance
		ConnectorTestContext<GhpagesTestConnector> context = ConnectorTestContext.getInstance(GhpagesTestConnector.class);
		
		//Connector dispatcher
		dispatcher = context.getConnectorDispatcher();
		
		connector = dispatcher.createMockup();
		
	}

}
