package GA.Replacement;

import java.util.List;
import GA.Population;
import GA.Individual.Individual;

public interface Replacement {

	void replace(Population creatures, List<Individual> parents,
			List<Individual> children);
	
}
