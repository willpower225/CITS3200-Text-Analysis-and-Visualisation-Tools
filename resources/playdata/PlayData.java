package parser;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class PlayData implements Serializable {
	
	/** Name of the play. */
	public String playName;
	
	/** If true, the play is a modern rendition of the play. */
	public boolean isModern;
	
	/** String version of the play containing character lines and stage directions only. */
	public String playString;
	
	/** An array of indices, each index represents a TLN. */
	public ArrayList<Integer> throughLineNumbers;
	
	/** Map of each word that appears in playString to an array of indices, each index is where the word appears in playString. */
	public HashMap<String, ArrayList<Integer>> words;
	
	/** An array of act arrays, each act array contains indices representing the start of a scene in that act. */
	public ArrayList<ArrayList<Integer>> acts;
	
	/** Map of character names to a character data object. */
	public HashMap<String, CharacterData> characters;
	
	/** An array of IndexRange objects, each range represents a stage direction in playString. */
	public ArrayList<IndexRange> stageDirectionRanges;
	
	public PlayData(String name) {
		playName = name;
	}
	
}
