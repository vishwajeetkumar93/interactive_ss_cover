package in.ac.iitb.cse.ssc.greedy;

import in.ac.iitb.cse.ssc.data.LabeledInstance;
import in.ac.iitb.cse.ssc.data.PatternSet;

/**
 * 
 * @author ashish This class models the objective gain as the difference in the
 *         combined objective value for current pattern set and that for the
 *         current pattern set and a new labeled pattern [1]. [1] Guillory, A.,
 *         & Bilmes, J. (2010). Interactive Submodular Set Cover. Proceedings of
 *         the 27th International Conference on Machine Learning (ICML-10),
 *         415–422.
 */
public class ObjectiveGain {

	private PatternSet patternSet;
	private LabeledInstance labeledInstance;

	public double computeGain() {
		double currentObjective = new CombinedObjective(patternSet).evaluate();
		PatternSet newSet = new PatternSet(patternSet);
		newSet.addPattern(labeledInstance.getInstance());
		double newObjective = new CombinedObjective(newSet).evaluate();
		return newObjective - currentObjective;
	}
}
