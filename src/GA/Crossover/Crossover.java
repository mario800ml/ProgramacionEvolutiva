package GA.Crossover;

import java.util.List;
import GA.Individual.Individual;

public interface Crossover {

	List<Individual> crossover(List<Individual> parents);
	
}
