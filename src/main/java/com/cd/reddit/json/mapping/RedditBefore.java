package com.cd.reddit.json.mapping;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RedditBefore extends RedditType{
	
	private String before;
	
	public String getBefore() {
		return this.before;
	}
	public void setBefore(String before) {
		this.before = before;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RedditBefore [before=");
		builder.append(this.before);
		builder.append("]");
		return builder.toString();
	}
}
