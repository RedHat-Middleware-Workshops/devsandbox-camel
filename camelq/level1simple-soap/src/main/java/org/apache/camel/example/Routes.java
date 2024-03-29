/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.example;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.BindToRegistry;
import org.apache.camel.component.cxf.jaxws.*;

// import org.example.s1.*;


public class Routes extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        // Routes are loaded from XML files
        // It alligns a definition standard with Fuse and Camel K
    }


    @BindToRegistry
    public static CxfEndpoint s1() throws Exception {

    	CxfEndpoint e = new CxfEndpoint();
        e.setServiceClass("org.example.s1.S1");
        e.setAddress("/s1");
        e.setDataFormat(org.apache.camel.component.cxf.common.DataFormat.PAYLOAD);      
        return e;
    }

}
