package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    private String username;
    private String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static Login OnThePage(String username, String password) {
        return Tasks.instrumented(Login.class, username, password);
    }


    @Override
    public <T extends Actor> void performAs (T actor){
        actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON),
        Enter.theValue(username).into(ChoucairLoginPage.INPUT_USER),
        Enter.theValue(password).into(ChoucairLoginPage.INPUT_PASSWORD),
        Click.on(ChoucairLoginPage.ENTER_BUTTON));
    }
}
