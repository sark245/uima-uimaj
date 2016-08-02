/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.uima.examples.tokenizer;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;

public class Token extends Annotation {

    public static final int typeIndexID = JCasRegistry.register(Token.class);

    public static final int type = typeIndexID;

    public int getTypeIndexID() {
        return typeIndexID;
    }

    // Never called. Disable default constructor
    protected  Token() {
    }

    /** Internal - Constructor used by generator */
    public  Token(TypeImpl type, CASImpl casImpl) {
        super(type, casImpl);
    }

    public  Token(JCas jcas) {
        super(jcas);
    }

    public  Token(JCas jcas, int start, int end) {
        super(jcas, start, end);
    }
}
