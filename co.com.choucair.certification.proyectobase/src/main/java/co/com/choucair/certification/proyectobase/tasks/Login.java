package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task{
    public static Performable onThePage() {
      return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON),
        Enter.theValue("IngresaTuUsuario").into(ChoucairLoginPage.INPUT_USER),
        Enter.theValue("IngresaTuContraseña").into(ChoucairLoginPage.INPUT_PASSWORD),
        Click.on(ChoucairLoginPage.ENTER_BUTTON)
        );

    }

}
