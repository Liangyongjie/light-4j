/*
 * Copyright (c) 2016 Network New Technologies Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.networknt.server;

/**
 * If you want initialize database connections, load some resource or cached data
 * during server startup, please implement this interface with a class and put
 * it into your API project /src/main/resource/config/service.yml com.networknt.server.StartupHookProvider
 * During server startup, these startup hooks will be called to initialize the server
 * state.
 *
 * @author Steve Hu
 */
public interface StartupHookProvider {
    /**
     * Every implementation must implement this onStartup method to hook in
     * some business logic during server startup phase.
     */
    void onStartup();
}
