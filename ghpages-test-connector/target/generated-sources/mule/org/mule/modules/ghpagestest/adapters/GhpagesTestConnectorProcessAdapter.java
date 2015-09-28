
package org.mule.modules.ghpagestest.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.ghpagestest.GhpagesTestConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>GhpagesTestConnectorProcessAdapter</code> is a wrapper around {@link GhpagesTestConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.0", date = "2015-09-28T08:25:41-03:00", comments = "Build mule-devkit-3.7.0.2589.361fd9f")
public class GhpagesTestConnectorProcessAdapter
    extends GhpagesTestConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<GhpagesTestConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, GhpagesTestConnectorCapabilitiesAdapter> getProcessTemplate() {
        final GhpagesTestConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,GhpagesTestConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, GhpagesTestConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, GhpagesTestConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
