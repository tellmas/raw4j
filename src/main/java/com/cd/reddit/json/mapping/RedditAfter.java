package com.cd.reddit.json.mapping;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RedditAfter extends RedditType{
	
	private String after;
	
	public String getAfter() {
		return this.after;
	}
	public void setAfter(String after) {
		this.after = after;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RedditAfter [after=");
		builder.append(this.after);
		builder.append("]");
		return builder.toString();
	}
}
