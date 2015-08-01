/*
* Copyright (C) 2015 Cetsoft, http://www.cetsoft.com
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
* 
* Author : Yusuf Aytas
* Date   : Sep 23, 2013
*/
package com.cetsoft.imcache.cache.heap.tx;

/**
 * The Class TransactionException.
 */
public class TransactionException extends RuntimeException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -1513928931641021361L;

	/**
	 * Instantiates a new transaction exception.
	 *
	 * @param exception the exception
	 */
	public TransactionException(String exception) {
		super(exception);
	}

	/**
	 * Instantiates a new transaction exception.
	 *
	 * @param exception the exception
	 */
	public TransactionException(Exception exception) {
		super(exception);
	}
}
