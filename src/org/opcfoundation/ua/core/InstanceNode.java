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
import org.opcfoundation.ua.builtintypes.NodeId;
import org.opcfoundation.ua.builtintypes.QualifiedName;
import org.opcfoundation.ua.builtintypes.UnsignedInteger;
import org.opcfoundation.ua.core.Node;
import org.opcfoundation.ua.core.NodeClass;
import org.opcfoundation.ua.core.ReferenceNode;



public class InstanceNode extends Node implements Structure, Cloneable {
	
	public static final ExpandedNodeId ID = new ExpandedNodeId(Identifiers.InstanceNode);
	public static final ExpandedNodeId BINARY = new ExpandedNodeId(Identifiers.InstanceNode_Encoding_DefaultBinary);
	public static final ExpandedNodeId XML = new ExpandedNodeId(Identifiers.InstanceNode_Encoding_DefaultXml);
	
    
    public InstanceNode() {}
    
    public InstanceNode(NodeId NodeId, NodeClass NodeClass, QualifiedName BrowseName, LocalizedText DisplayName, LocalizedText Description, UnsignedInteger WriteMask, UnsignedInteger UserWriteMask, ReferenceNode[] References)
    {
        super(NodeId, NodeClass, BrowseName, DisplayName, Description, WriteMask, UserWriteMask, References);
    }
    
    /**
      * Deep clone
      *
      * @return cloned InstanceNode
      */
    public InstanceNode clone()
    {
        InstanceNode result = new InstanceNode();
        result.NodeId = NodeId;
        result.NodeClass = NodeClass;
        result.BrowseName = BrowseName;
        result.DisplayName = DisplayName;
        result.Description = Description;
        result.WriteMask = WriteMask;
        result.UserWriteMask = UserWriteMask;
        if (References!=null) {
            result.References = new ReferenceNode[References.length];
            for (int i=0; i<References.length; i++)
                result.References[i] = References[i].clone();
        }
        return result;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        InstanceNode other = (InstanceNode) obj;
        if (NodeId==null) {
            if (other.NodeId != null) return false;
        } else if (!NodeId.equals(other.NodeId)) return false;
        if (NodeClass==null) {
            if (other.NodeClass != null) return false;
        } else if (!NodeClass.equals(other.NodeClass)) return false;
        if (BrowseName==null) {
            if (other.BrowseName != null) return false;
        } else if (!BrowseName.equals(other.BrowseName)) return false;
        if (DisplayName==null) {
            if (other.DisplayName != null) return false;
        } else if (!DisplayName.equals(other.DisplayName)) return false;
        if (Description==null) {
            if (other.Description != null) return false;
        } else if (!Description.equals(other.Description)) return false;
        if (WriteMask==null) {
            if (other.WriteMask != null) return false;
        } else if (!WriteMask.equals(other.WriteMask)) return false;
        if (UserWriteMask==null) {
            if (other.UserWriteMask != null) return false;
        } else if (!UserWriteMask.equals(other.UserWriteMask)) return false;
        if (References==null) {
            if (other.References != null) return false;
        } else if (!Arrays.equals(References, other.References)) return false;
        return true;
    }
    
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((NodeId == null) ? 0 : NodeId.hashCode());
        result = prime * result
                + ((NodeClass == null) ? 0 : NodeClass.hashCode());
        result = prime * result
                + ((BrowseName == null) ? 0 : BrowseName.hashCode());
        result = prime * result
                + ((DisplayName == null) ? 0 : DisplayName.hashCode());
        result = prime * result
                + ((Description == null) ? 0 : Description.hashCode());
        result = prime * result
                + ((WriteMask == null) ? 0 : WriteMask.hashCode());
        result = prime * result
                + ((UserWriteMask == null) ? 0 : UserWriteMask.hashCode());
        result = prime * result
                + ((References == null) ? 0 : Arrays.hashCode(References));
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
		return "InstanceNode: "+ObjectUtils.printFieldsDeep(this);
	}

}
