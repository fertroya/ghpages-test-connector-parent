
package org.mule.modules.ghpagestest.adapters;

import javax.annotation.Generated;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;
import org.mule.modules.ghpagestest.GhpagesTestConnector;


/**
 * A <code>GhpagesTestConnectorCapabilitiesAdapter</code> is a wrapper around {@link GhpagesTestConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.0", date = "2015-09-28T08:25:41-03:00", comments = "Build mule-devkit-3.7.0.2589.361fd9f")
public class GhpagesTestConnectorCapabilitiesAdapter
    extends GhpagesTestConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
