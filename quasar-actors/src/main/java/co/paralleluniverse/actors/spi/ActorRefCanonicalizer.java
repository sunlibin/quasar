/*
 * Quasar: lightweight threads and actors for the JVM.
 * Copyright (c) 2013-2014, Parallel Universe Software Co. All rights reserved.
 * 
 * This program and the accompanying materials are dual-licensed under
 * either the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation
 *  
 *   or (per the licensee's choosing)
 *  
 * under the terms of the GNU Lesser General Public License version 3.0
 * as published by the Free Software Foundation.
 */
package co.paralleluniverse.actors.spi;

import co.paralleluniverse.actors.ActorImpl;
import co.paralleluniverse.actors.ActorRef;

/**
 *
 * @author pron
 */
public interface ActorRefCanonicalizer {
    <Message> ActorRef<Message> getRef(ActorImpl<Message> impl, ActorRef<Message> ref);
}
