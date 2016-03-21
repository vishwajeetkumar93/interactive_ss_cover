package in.ac.iitb.cse.ssc.data;

/**
 * 
 * @author ashish This class represents a labeled instance (pattern) or a
 *         question-answer pair as defined in [1] [1] Guillory, A., & Bilmes, J.
 *         (2010). Interactive Submodular Set Cover. Proceedings of the 27th
 *         International Conference on Machine Learning (ICML-10), 415–422.
 */
public class LabeledInstance {

	private Pattern instance;
	private PatternLabel label;

	public Pattern getInstance() {
		return instance;
	}

	public void setInstance(Pattern instance) {
		this.instance = instance;
	}

	public PatternLabel getLabel() {
		return label;
	}

	public void setLabel(PatternLabel label) {
		this.label = label;
	}

}
