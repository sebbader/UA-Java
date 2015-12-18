 /* Copyright (c) 1996-2015, OPC Foundation. All rights reserved.
   The source code in this file is covered under a dual-license scenario:
     - RCL: for OPC Foundation members in good-standing
     - GPL V2: everybody else
   RCL license terms accompanied with this source code. See http://opcfoundation.org/License/RCL/1.00/
   GNU General Public License as published by the Free Software Foundation;
   version 2 of the License are accompanied with this source code. See http://opcfoundation.org/License/GPLv2
   This source code is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
*/

package org.opcfoundation.ua.core;

import org.opcfoundation.ua.builtintypes.Structure;
import org.opcfoundation.ua.builtintypes.ExpandedNodeId;
import org.opcfoundation.ua.core.Identifiers;
import org.opcfoundation.ua.utils.ObjectUtils;
import java.util.Arrays;
import org.opcfoundation.ua.builtintypes.LocalizedText;
import org.opcfoundation.ua.core.ApplicationType;



public class ApplicationDescription extends Object implements Structure, Cloneable {
	
	public static final ExpandedNodeId ID = new ExpandedNodeId(Identifiers.ApplicationDescription);
	public static final ExpandedNodeId BINARY = new ExpandedNodeId(Identifiers.ApplicationDescription_Encoding_DefaultBinary);
	public static final ExpandedNodeId XML = new ExpandedNodeId(Identifiers.ApplicationDescription_Encoding_DefaultXml);
	
    protected String ApplicationUri;
    protected String ProductUri;
    protected LocalizedText ApplicationName;
    protected ApplicationType ApplicationType;
    protected String GatewayServerUri;
    protected String DiscoveryProfileUri;
    protected String[] DiscoveryUrls;
    
    public ApplicationDescription() {}
    
    public ApplicationDescription(String ApplicationUri, String ProductUri, LocalizedText ApplicationName, ApplicationType ApplicationType, String GatewayServerUri, String DiscoveryProfileUri, String[] DiscoveryUrls)
    {
        this.ApplicationUri = ApplicationUri;
        this.ProductUri = ProductUri;
        this.ApplicationName = ApplicationName;
        this.ApplicationType = ApplicationType;
        this.GatewayServerUri = GatewayServerUri;
        this.DiscoveryProfileUri = DiscoveryProfileUri;
        this.DiscoveryUrls = DiscoveryUrls;
    }
    
    public String getApplicationUri()
    {
        return ApplicationUri;
    }
    
    public void setApplicationUri(String ApplicationUri)
    {
        this.ApplicationUri = ApplicationUri;
    }
    
    public String getProductUri()
    {
        return ProductUri;
    }
    
    public void setProductUri(String ProductUri)
    {
        this.ProductUri = ProductUri;
    }
    
    public LocalizedText getApplicationName()
    {
        return ApplicationName;
    }
    
    public void setApplicationName(LocalizedText ApplicationName)
    {
        this.ApplicationName = ApplicationName;
    }
    
    public ApplicationType getApplicationType()
    {
        return ApplicationType;
    }
    
    public void setApplicationType(ApplicationType ApplicationType)
    {
        this.ApplicationType = ApplicationType;
    }
    
    public String getGatewayServerUri()
    {
        return GatewayServerUri;
    }
    
    public void setGatewayServerUri(String GatewayServerUri)
    {
        this.GatewayServerUri = GatewayServerUri;
    }
    
    public String getDiscoveryProfileUri()
    {
        return DiscoveryProfileUri;
    }
    
    public void setDiscoveryProfileUri(String DiscoveryProfileUri)
    {
        this.DiscoveryProfileUri = DiscoveryProfileUri;
    }
    
    public String[] getDiscoveryUrls()
    {
        return DiscoveryUrls;
    }
    
    public void setDiscoveryUrls(String[] DiscoveryUrls)
    {
        this.DiscoveryUrls = DiscoveryUrls;
    }
    
    /**
      * Deep clone
      *
      * @return cloned ApplicationDescription
      */
    public ApplicationDescription clone()
    {
        ApplicationDescription result = new ApplicationDescription();
        result.ApplicationUri = ApplicationUri;
        result.ProductUri = ProductUri;
        result.ApplicationName = ApplicationName;
        result.ApplicationType = ApplicationType;
        result.GatewayServerUri = GatewayServerUri;
        result.DiscoveryProfileUri = DiscoveryProfileUri;
        result.DiscoveryUrls = DiscoveryUrls==null ? null : DiscoveryUrls.clone();
        return result;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        ApplicationDescription other = (ApplicationDescription) obj;
        if (ApplicationUri==null) {
            if (other.ApplicationUri != null) return false;
        } else if (!ApplicationUri.equals(other.ApplicationUri)) return false;
        if (ProductUri==null) {
            if (other.ProductUri != null) return false;
        } else if (!ProductUri.equals(other.ProductUri)) return false;
        if (ApplicationName==null) {
            if (other.ApplicationName != null) return false;
        } else if (!ApplicationName.equals(other.ApplicationName)) return false;
        if (ApplicationType==null) {
            if (other.ApplicationType != null) return false;
        } else if (!ApplicationType.equals(other.ApplicationType)) return false;
        if (GatewayServerUri==null) {
            if (other.GatewayServerUri != null) return false;
        } else if (!GatewayServerUri.equals(other.GatewayServerUri)) return false;
        if (DiscoveryProfileUri==null) {
            if (other.DiscoveryProfileUri != null) return false;
        } else if (!DiscoveryProfileUri.equals(other.DiscoveryProfileUri)) return false;
        if (DiscoveryUrls==null) {
            if (other.DiscoveryUrls != null) return false;
        } else if (!Arrays.equals(DiscoveryUrls, other.DiscoveryUrls)) return false;
        return true;
    }
    
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((ApplicationUri == null) ? 0 : ApplicationUri.hashCode());
        result = prime * result
                + ((ProductUri == null) ? 0 : ProductUri.hashCode());
        result = prime * result
                + ((ApplicationName == null) ? 0 : ApplicationName.hashCode());
        result = prime * result
                + ((ApplicationType == null) ? 0 : ApplicationType.hashCode());
        result = prime * result
                + ((GatewayServerUri == null) ? 0 : GatewayServerUri.hashCode());
        result = prime * result
                + ((DiscoveryProfileUri == null) ? 0 : DiscoveryProfileUri.hashCode());
        result = prime * result
                + ((DiscoveryUrls == null) ? 0 : Arrays.hashCode(DiscoveryUrls));
        return result;
    }
    


	public ExpandedNodeId getTypeId() {
		return ID;
	}

	public ExpandedNodeId getXmlEncodeId() {
		return XML;
	}

	public ExpandedNodeId getBinaryEncodeId() {
		return BINARY;
	}
	
	public String toString() {
		return "ApplicationDescription: "+ObjectUtils.printFieldsDeep(this);
	}

}
