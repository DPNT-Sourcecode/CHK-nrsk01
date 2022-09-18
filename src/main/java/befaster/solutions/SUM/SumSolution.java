package befaster.solutions.SUM;

import befaster.runner.SolutionNotImplementedException;

import java.security.InvalidParameterException;

@SuppressWarnings("unused")
public class SumSolution {

    public int compute(int x, int y) {
        if ( (x < 0 || x > 1000) || (y < 0 || y > 1000)) {
            throw new InvalidParameterException("Values must be between 0 and 1000!");
        }
        return x + y;
    }

}
