package parser;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Shows information about each line of a character in the play
 */
public class CharacterData implements Serializable {
	
	/** Name of the character */
	public String name;
	
	/** Array of IndexRange objects, each range represents a line by the character */
	public ArrayList<IndexRange> lines;
	
	/** Array of IndexRange objects, each range represents when the character is on stage */
	public ArrayList<IndexRange> onStageRanges;
	
	public CharacterData(String name) {
		this.name = name;
	}

}
