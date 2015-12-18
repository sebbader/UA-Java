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

package org.opcfoundation.ua.transport;

import org.opcfoundation.ua.common.ServiceResultException;

/**
 * Result listener.
 * 
 * Used with {@link AsyncResult}.
 */
public interface ResultListener<T> {
	
	/**
	 * Request completed, the result is available
	 * 
	 * @param result the result 
	 */
	void onCompleted(T result);
	
	/**
	 * There was an error in processing the request
	 * 
	 * @param error the error
	 */
	void onError(ServiceResultException error);
	
}
