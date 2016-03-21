package in.ac.iitb.cse.ssc.data;

import java.util.Set;

public class PatternSet {
	private Set<Pattern> patterns;

	public PatternSet() {

	}

	public PatternSet(PatternSet pSet) {
		for (Pattern p : pSet.patterns)
			addPattern(p);
	}

	public void addPattern(Pattern pat) {
		patterns.add(pat);
	}
}
