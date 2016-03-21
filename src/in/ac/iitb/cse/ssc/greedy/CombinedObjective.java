package in.ac.iitb.cse.ssc.greedy;

import in.ac.iitb.cse.ssc.data.PatternSet;

/**
 * 
 * @author ashish This class models the combined objective as described in [1].
 *         Refer to F_{\alpha}(\cap{S})
 * 
 *         [1] Guillory, A., & Bilmes, J. (2010). Interactive Submodular Set
 *         Cover. Proceedings of the 27th International Conference on Machine
 *         Learning (ICML-10), 415–422.
 */
public class CombinedObjective {

	private PatternSet patternSet;

	public CombinedObjective(PatternSet patterns) {
		patternSet = patterns;
	}

	public double evaluate() {
		return 0.0;
	}
}
