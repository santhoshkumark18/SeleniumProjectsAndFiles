package hooks;

import driver.DriverInstance;
import io.cucumber.java.*;
import io.cucumber.plugin.event.Node;
import org.openqa.selenium.OutputType;

public class Hooks extends DriverInstance {
    @BeforeStep
    public void beforeStep(Scenario scenario) {
        //System.out.println("Scenario "+scenario.getName());
    }
    @AfterStep
    public void afterStep(Scenario scenario) {
        System.out.println("Scenario "+scenario.isFailed());
    }
    @Before
    public void beforeScenario(Scenario scenario) {
        System.out.println("Scenario "+scenario.getName());
    }
    @After
    public void afterScenario(Scenario scenario) {
        System.out.println("Scenario "+scenario.isFailed());
      byte[] screenShot=  driver.getScreenshotAs(OutputType.BYTES);
      scenario.attach(screenShot,"image/png","screenshot");
    }
}
