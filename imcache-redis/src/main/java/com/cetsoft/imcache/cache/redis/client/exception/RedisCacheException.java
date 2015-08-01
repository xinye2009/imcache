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
* Date   : Sep 8, 2014
*/
package com.cetsoft.imcache.cache.redis.client.exception;


/**
 * The Class RedisCacheException is thrown when there is a problem with 
 * cache.
 */
public class RedisCacheException extends RuntimeException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 7379846444846442221L;

	/**
	 * Instantiates a new redis cache exception.
	 *
	 * @param message the message
	 */
	public RedisCacheException(String message) {
        super(message);
    }

    /**
     * Instantiates a new redis cache exception.
     *
     * @param message the message
     * @param cause the cause
     */
    public RedisCacheException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Instantiates a new redis cache exception.
     *
     * @param cause the cause
     */
    public RedisCacheException(Throwable cause) {
        super(cause);
    }
}
