/*******************************************************************************
 * Copyright (c) 2006, 2013 Abstratt Technologies
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rafael Chaves (Abstratt Technologies) - initial API and implementation
 *******************************************************************************/ 
package com.abstratt.mdd.frontend.core;

import com.abstratt.mdd.core.Problem;

public class ReturnValueRequired extends Problem {
	public String getMessage() {
		return "The signature requires a return value";
	}
}
