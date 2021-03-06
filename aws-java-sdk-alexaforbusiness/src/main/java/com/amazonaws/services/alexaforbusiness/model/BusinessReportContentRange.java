/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The content range of the report.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/BusinessReportContentRange"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BusinessReportContentRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The interval of the content range.
     * </p>
     */
    private String interval;

    /**
     * <p>
     * The interval of the content range.
     * </p>
     * 
     * @param interval
     *        The interval of the content range.
     * @see BusinessReportInterval
     */

    public void setInterval(String interval) {
        this.interval = interval;
    }

    /**
     * <p>
     * The interval of the content range.
     * </p>
     * 
     * @return The interval of the content range.
     * @see BusinessReportInterval
     */

    public String getInterval() {
        return this.interval;
    }

    /**
     * <p>
     * The interval of the content range.
     * </p>
     * 
     * @param interval
     *        The interval of the content range.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BusinessReportInterval
     */

    public BusinessReportContentRange withInterval(String interval) {
        setInterval(interval);
        return this;
    }

    /**
     * <p>
     * The interval of the content range.
     * </p>
     * 
     * @param interval
     *        The interval of the content range.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BusinessReportInterval
     */

    public BusinessReportContentRange withInterval(BusinessReportInterval interval) {
        this.interval = interval.toString();
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInterval() != null)
            sb.append("Interval: ").append(getInterval());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BusinessReportContentRange == false)
            return false;
        BusinessReportContentRange other = (BusinessReportContentRange) obj;
        if (other.getInterval() == null ^ this.getInterval() == null)
            return false;
        if (other.getInterval() != null && other.getInterval().equals(this.getInterval()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInterval() == null) ? 0 : getInterval().hashCode());
        return hashCode;
    }

    @Override
    public BusinessReportContentRange clone() {
        try {
            return (BusinessReportContentRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.alexaforbusiness.model.transform.BusinessReportContentRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
