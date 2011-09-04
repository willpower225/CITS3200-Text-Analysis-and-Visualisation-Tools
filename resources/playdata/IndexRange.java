package parser;

import java.io.Serializable;

public class IndexRange implements Serializable {
	/** Start index. */
	public int start;
	/** End index. */
	public int end;
	
	/** Creates an IndexRange object between start and end indices. */
	public IndexRange(int start, int end) {
		this.start = start;
		this.end = end;
	}
}
