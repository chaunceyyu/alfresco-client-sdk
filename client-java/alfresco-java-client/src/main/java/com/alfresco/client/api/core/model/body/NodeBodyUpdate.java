/*
 *   Copyright (C) 2005-2016 Alfresco Software Limited.
 *
 *   This file is part of Alfresco Java Client.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.alfresco.client.api.core.model.body;

import java.util.List;

import com.google.gson.internal.LinkedTreeMap;

/**
 * Created by jpascal on 15/12/2015.
 */
public class NodeBodyUpdate
{
    private final String name;

    private final String nodeType;

    private final LinkedTreeMap<String, Object> properties;

    private final List<String> aspectNames;

    public NodeBodyUpdate(String name)
    {
        this.name = name;
        this.nodeType = null;
        this.properties = null;
        this.aspectNames = null;
    }

    public NodeBodyUpdate(LinkedTreeMap<String, Object> properties)
    {
        this.name = null;
        this.nodeType = null;
        if (properties != null && !properties.isEmpty())
        {
            this.properties = properties;
        }
        else
        {
            this.properties = null;
        }
        this.aspectNames = null;
    }

    public NodeBodyUpdate(String name, String nodeType, LinkedTreeMap<String, Object> properties,
            List<String> aspectNames)
    {
        this.name = name;
        this.nodeType = nodeType;
        if (properties != null && !properties.isEmpty())
        {
            this.properties = properties;
        }
        else
        {
            this.properties = null;
        }
        this.aspectNames = aspectNames;
    }

    public String getName()
    {
        return name;
    }

    public LinkedTreeMap<String, Object> getProperties()
    {
        return properties;
    }

    public List<String> getAspectNames()
    {
        return aspectNames;
    }

    public String getNodeType()
    {
        return nodeType;
    }
}
