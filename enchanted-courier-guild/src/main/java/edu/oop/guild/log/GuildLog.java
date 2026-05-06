package edu.oop.guild.log;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GuildLog {
	private static GuildLog log = null;
	private List<String> entries;
	
	public static GuildLog getInstance() {
		if (log == null) {
			log = new GuildLog();
		}
		return log;
	}

	public GuildLog() {
		this.entries = new ArrayList<>();
	}

	public List<String> entries() {
		return Collections.unmodifiableList(entries);
	}

	public Integer size() {
		return entries.size();
	}

	public void record(String string) {
		if (string == null) {
			throw new NullPointerException("Must have something to record");
		}
		entries.add(string);
		
	}

	public void clear() {
		entries.clear();
		
	}

}
