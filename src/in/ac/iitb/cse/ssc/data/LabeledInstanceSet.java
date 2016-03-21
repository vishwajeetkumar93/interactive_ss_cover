package in.ac.iitb.cse.ssc.data;

import java.util.Set;

/**
 * This class represents a set of labeled instances (patterns) or a set of
 * question-answer pairs as defined in [1] [1] Guillory, A., & Bilmes, J.
 * (2010). Interactive Submodular Set Cover. Proceedings of the 27th
 * International Conference on Machine Learning (ICML-10), 415–422.
 * 
 * @author ashish
 *
 */

public class LabeledInstanceSet {
	private Set<LabeledInstance> labeledInstances;

	public void addInstance(LabeledInstance instance) {
		labeledInstances.add(instance);
	}

}
