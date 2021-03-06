/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a <code>grok</code> classifier for <code>CreateClassifier</code> to create.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateGrokClassifierRequest" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGrokClassifierRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An identifier of the data format that the classifier matches, such as Twitter, JSON, Omniture logs, Amazon
     * CloudWatch Logs, and so on.
     * </p>
     */
    private String classification;
    /**
     * <p>
     * The name of the new classifier.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The grok pattern used by this classifier.
     * </p>
     */
    private String grokPattern;
    /**
     * <p>
     * Optional custom grok patterns used by this classifier.
     * </p>
     */
    private String customPatterns;

    /**
     * <p>
     * An identifier of the data format that the classifier matches, such as Twitter, JSON, Omniture logs, Amazon
     * CloudWatch Logs, and so on.
     * </p>
     * 
     * @param classification
     *        An identifier of the data format that the classifier matches, such as Twitter, JSON, Omniture logs, Amazon
     *        CloudWatch Logs, and so on.
     */

    public void setClassification(String classification) {
        this.classification = classification;
    }

    /**
     * <p>
     * An identifier of the data format that the classifier matches, such as Twitter, JSON, Omniture logs, Amazon
     * CloudWatch Logs, and so on.
     * </p>
     * 
     * @return An identifier of the data format that the classifier matches, such as Twitter, JSON, Omniture logs,
     *         Amazon CloudWatch Logs, and so on.
     */

    public String getClassification() {
        return this.classification;
    }

    /**
     * <p>
     * An identifier of the data format that the classifier matches, such as Twitter, JSON, Omniture logs, Amazon
     * CloudWatch Logs, and so on.
     * </p>
     * 
     * @param classification
     *        An identifier of the data format that the classifier matches, such as Twitter, JSON, Omniture logs, Amazon
     *        CloudWatch Logs, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGrokClassifierRequest withClassification(String classification) {
        setClassification(classification);
        return this;
    }

    /**
     * <p>
     * The name of the new classifier.
     * </p>
     * 
     * @param name
     *        The name of the new classifier.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the new classifier.
     * </p>
     * 
     * @return The name of the new classifier.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the new classifier.
     * </p>
     * 
     * @param name
     *        The name of the new classifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGrokClassifierRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The grok pattern used by this classifier.
     * </p>
     * 
     * @param grokPattern
     *        The grok pattern used by this classifier.
     */

    public void setGrokPattern(String grokPattern) {
        this.grokPattern = grokPattern;
    }

    /**
     * <p>
     * The grok pattern used by this classifier.
     * </p>
     * 
     * @return The grok pattern used by this classifier.
     */

    public String getGrokPattern() {
        return this.grokPattern;
    }

    /**
     * <p>
     * The grok pattern used by this classifier.
     * </p>
     * 
     * @param grokPattern
     *        The grok pattern used by this classifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGrokClassifierRequest withGrokPattern(String grokPattern) {
        setGrokPattern(grokPattern);
        return this;
    }

    /**
     * <p>
     * Optional custom grok patterns used by this classifier.
     * </p>
     * 
     * @param customPatterns
     *        Optional custom grok patterns used by this classifier.
     */

    public void setCustomPatterns(String customPatterns) {
        this.customPatterns = customPatterns;
    }

    /**
     * <p>
     * Optional custom grok patterns used by this classifier.
     * </p>
     * 
     * @return Optional custom grok patterns used by this classifier.
     */

    public String getCustomPatterns() {
        return this.customPatterns;
    }

    /**
     * <p>
     * Optional custom grok patterns used by this classifier.
     * </p>
     * 
     * @param customPatterns
     *        Optional custom grok patterns used by this classifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGrokClassifierRequest withCustomPatterns(String customPatterns) {
        setCustomPatterns(customPatterns);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getClassification() != null)
            sb.append("Classification: ").append(getClassification()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getGrokPattern() != null)
            sb.append("GrokPattern: ").append(getGrokPattern()).append(",");
        if (getCustomPatterns() != null)
            sb.append("CustomPatterns: ").append(getCustomPatterns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGrokClassifierRequest == false)
            return false;
        CreateGrokClassifierRequest other = (CreateGrokClassifierRequest) obj;
        if (other.getClassification() == null ^ this.getClassification() == null)
            return false;
        if (other.getClassification() != null && other.getClassification().equals(this.getClassification()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getGrokPattern() == null ^ this.getGrokPattern() == null)
            return false;
        if (other.getGrokPattern() != null && other.getGrokPattern().equals(this.getGrokPattern()) == false)
            return false;
        if (other.getCustomPatterns() == null ^ this.getCustomPatterns() == null)
            return false;
        if (other.getCustomPatterns() != null && other.getCustomPatterns().equals(this.getCustomPatterns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClassification() == null) ? 0 : getClassification().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getGrokPattern() == null) ? 0 : getGrokPattern().hashCode());
        hashCode = prime * hashCode + ((getCustomPatterns() == null) ? 0 : getCustomPatterns().hashCode());
        return hashCode;
    }

    @Override
    public CreateGrokClassifierRequest clone() {
        try {
            return (CreateGrokClassifierRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.CreateGrokClassifierRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
