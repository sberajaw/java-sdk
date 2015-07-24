/**
 * Copyright 2015 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
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

package com.ibm.watson.developer_cloud.tone_analyzer.v1.model;

import com.google.gson.GsonBuilder;


/**
 * The Scorecard
 */
public class Scorecard {

	public static final Scorecard EMAIL = new Scorecard("email");
	
    /** A description of what this scorecard 
     * is evaluating or how it was obtained. 
     */
    private String description;
    
    /**  Scorecard identifier. */
    private String id;

    
    /**
     * Instantiates a new scorecard.
     *
     * @param id the identifier
     */
    public Scorecard(String id) {
		super();
		this.id = id;
	}

	/**
     * With description.
     *
     * @param description the description
     * @return the Scorecard
     */
    public Scorecard withDescription(final String description) {
        this.description = description;
        return this;
    }

    /**
     * Gets the id.
     *
     * @return     The id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id     The id
     */
    public void setId(final String id) {
        this.id = id;
    }

    /**
     * With id.
     *
     * @param id the id
     * @return the tone trait
     */
    public Scorecard withId(final String id) {
        this.id = id;
        return this;
    }

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getClass().getName() + " "
				+ new GsonBuilder().setPrettyPrinting().create().toJson(this);
	}
}
