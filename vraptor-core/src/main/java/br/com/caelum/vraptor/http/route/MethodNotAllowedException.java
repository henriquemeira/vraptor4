/***
 * Copyright (c) 2009 Caelum - www.caelum.com.br/opensource
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package br.com.caelum.vraptor.http.route;

import java.text.MessageFormat;
import java.util.Set;

import br.com.caelum.vraptor.controller.HttpMethod;

/**
 * Exception thrown when no routes matching given URI allow given HTTP method.
 *
 * @author Lucas Cavalcanti
 * @author Caio Filipini
 */
public class MethodNotAllowedException extends RuntimeException {

	private static final long serialVersionUID = 3864735692068670362L;
	private final Set<HttpMethod> allowed ;

	public MethodNotAllowedException(Set<HttpMethod> allowed, String requested) {
		super(MessageFormat.format("Method {0} is not allowed for requested URI. Allowed Methods are {1}",
				requested, allowed));
		this.allowed = allowed;
	}
	
	public Set<HttpMethod> getAllowedMethods() {
		return allowed;
	}

}
