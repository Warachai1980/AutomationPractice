import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/userMgtRunner.html",
                "rerun:target/failed-scenarios/userMgtRunner.txt"},
        features = "src/main/resources/features/userMgt.feature",
        glue = {"steps"},
        stepNotifications = true,
        dryRun = false// true = not open browser  , false = open browser
)
public class UserMgtRunner {
}
