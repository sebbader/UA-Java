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

import java.util.Collection;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.opcfoundation.ua.builtintypes.Enumeration;
import org.opcfoundation.ua.builtintypes.NodeId;
import org.opcfoundation.ua.builtintypes.UnsignedInteger;
import org.opcfoundation.ua.core.Identifiers;



public enum NodeClass implements Enumeration {

    Unspecified(0),
    Object(1),
    Variable(2),
    Method(4),
    ObjectType(8),
    VariableType(16),
    ReferenceType(32),
    DataType(64),
    View(128);
	

	public static final NodeId ID = Identifiers.NodeClass;
	public static EnumSet<NodeClass> NONE = EnumSet.noneOf( NodeClass.class );
	public static EnumSet<NodeClass> ALL = EnumSet.allOf( NodeClass.class );
	
	private final int value;
	NodeClass(int value) {
		this.value = value;
	}
	
	@Override
	public int getValue() {
		return value;
	}

	private static final Map<Integer, NodeClass> map;
	static {
		map = new HashMap<Integer, NodeClass>();
		for (NodeClass i : NodeClass.values()) 
			map.put(i.value, i);        
	}

	public static NodeClass valueOf(int value)
	{
		return map.get(value);
	}
	
	public static NodeClass valueOf(Integer value)
	{
		return value == null ? null : valueOf(value.intValue());
	}

	public static NodeClass valueOf(UnsignedInteger value)
	{
		return value == null ? null : valueOf(value.intValue());
	}

	public static NodeClass[] valueOf(int[] value)
	{
		NodeClass[] result = new NodeClass[value.length];
		for(int i=0; i<value.length; i++)
		  result[i] = valueOf(value[i]);
		return result;
	}

	public static NodeClass[] valueOf(Integer[] value)
	{
		NodeClass[] result = new NodeClass[value.length];
		for(int i=0; i<value.length; i++)
		  result[i] = valueOf(value[i]);
		return result;
	}
	
	public static NodeClass[] valueOf(UnsignedInteger[] value)
	{
		NodeClass[] result = new NodeClass[value.length];
		for(int i=0; i<value.length; i++)
		  result[i] = valueOf(value[i]);
		return result;
	}

	public static UnsignedInteger getMask(NodeClass...list) 
	{
		int result = 0;
		for (NodeClass c : list)
			result |= c.value;
		return UnsignedInteger.getFromBits(result);
	}	

	public static UnsignedInteger getMask(Collection<NodeClass> list) 
	{
		int result = 0;
		for (NodeClass c : list)
			result |= c.value;
		return UnsignedInteger.getFromBits(result);
	}	

	public static EnumSet<NodeClass> getSet(UnsignedInteger mask)
	{
		return getSet(mask.intValue());
	}
	
	public static EnumSet<NodeClass> getSet(int mask)
	{
		List<NodeClass> res = new ArrayList<NodeClass>();
		for (NodeClass l : NodeClass.values()) 
			if ( (mask & l.value) == l.value )
				res.add(l);
		return EnumSet.copyOf(res);
	}	
	
}
