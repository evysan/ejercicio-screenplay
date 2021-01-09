package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target CATEGORY = Target.the("select the category").located(By.xpath("//*[@id='certificaciones']/a"));
    public static final Target INPUT_COURSE = Target.the("search the course").located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("click to search the course").located(By.xpath("//*[@class='btn btn-secondary']"));
    public static final Target NAME_COURSE = Target.the("name of the course").located(By.linkText("Metodolog\u00eda Bancolombia"));
}
