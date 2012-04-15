/*
 * Copyright (c) 2011 LinkedIn, Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package krati.store.avro.client;

import krati.io.Serializer;
import krati.store.avro.protocol.MultiTenantStoreResponder;
import krati.store.avro.protocol.StoreResponder;

/**
 * StoreClientLocal
 * 
 * @author jwu
 * @since 10/03, 2011
 */
public class StoreClientLocal<K, V> extends StoreClientImpl<K, V> {
    
    public StoreClientLocal(StoreResponder responder, String source, Serializer<K> keySerializer, Serializer<V> valueSerializer) {
        super(source, keySerializer, valueSerializer, new TransceiverFactoryLocal(responder));
    }
    
    public StoreClientLocal(MultiTenantStoreResponder responder, String source, Serializer<K> keySerializer, Serializer<V> valueSerializer) {
        super(source, keySerializer, valueSerializer, new TransceiverFactoryLocal(responder));
    }
}