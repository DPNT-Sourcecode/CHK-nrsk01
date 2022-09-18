package befaster.solutions.CHK;

import befaster.solutions.CHK.service.CheckoutSolution;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class CheckoutTest {

    private CheckoutSolution checkoutSolution = new CheckoutSolution();

    @Test
    public void test() {
        assertThat(checkoutSolution.checkout("AAAAA"), equalTo(200));
    }
}
