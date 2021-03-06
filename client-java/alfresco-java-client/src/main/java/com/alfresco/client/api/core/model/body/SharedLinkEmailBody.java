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

import com.google.gson.annotations.SerializedName;

/**
 * Created by jpascal on 23/08/2016.
 */
public class SharedLinkEmailBody
{

    @SerializedName("client")
    public final String client;

    @SerializedName("message")
    public final String message;

    @SerializedName("locale")
    public final String locale;

    @SerializedName("recipientEmails")
    public final List<String> recipientEmails;

    public SharedLinkEmailBody(String client, String message, String locale, List<String> recipientEmails)
    {
        this.client = client;
        this.message = message;
        this.locale = locale;
        this.recipientEmails = recipientEmails;
    }
}
