import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import cucumber.api.CucumberOptions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@CucumberOptions(features = "classpath:features")
class IntTest {

    @Test
    void testParallel() throws Exception {
        System.setProperty("mock.env", "karateTesting");
        Results results = Runner.parallel(getClass(), 5);
        generateReport(results.getReportDir());
        assertEquals(0, results.getFailCount(), results.getErrorMessages());
    }

    private void generateReport(String reportDir) {
    }

}
