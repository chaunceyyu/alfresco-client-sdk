/**
 * Alfresco Search REST API
 * Provides access to the search features of Alfresco
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
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

package com.alfresco.client.api.search.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * ResultSetContextFacetFields
 */
public class ResultSetContextFacetFields
{
    @SerializedName("label")
    private String label = null;

    @SerializedName("buckets")
    private List<ResultSetContextBuckets> buckets = new ArrayList<ResultSetContextBuckets>();

    /**
     * The field name or its explicit label, if provided on the request
     * 
     * @return label
     **/
    public String getLabel()
    {
        return label;
    }

    public void setLabel(String label)
    {
        this.label = label;
    }

    /**
     * An array of buckets and values
     * 
     * @return buckets
     **/
    public List<ResultSetContextBuckets> getBuckets()
    {
        return buckets;
    }

    public void setBuckets(List<ResultSetContextBuckets> buckets)
    {
        this.buckets = buckets;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }
        ResultSetContextFacetFields resultSetContextFacetFields = (ResultSetContextFacetFields) o;
        return Objects.equals(this.label, resultSetContextFacetFields.label)
                && Objects.equals(this.buckets, resultSetContextFacetFields.buckets);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(label, buckets);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResultSetContextFacetFields {\n");

        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    buckets: ").append(toIndentedString(buckets)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o)
    {
        if (o == null) { return "null"; }
        return o.toString().replace("\n", "\n    ");
    }
}
