package richtercloud.selenium.and.then;

import java.util.function.Function;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 *
 * @author richter
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WebElement webElement0 = null;
        Function<WebDriver, WebElement> function0 = ExpectedConditions.visibilityOf(webElement0);
        Function function1 = ExpectedConditions.visibilityOf(webElement0).<WebElement>andThen(ExpectedConditions.elementToBeClickable(webElement0));
    }
    
}
