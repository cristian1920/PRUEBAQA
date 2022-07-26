package stepdefinitions;


import cucumber.api.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.IngresarSimulador;
import userinterfaces.HomePage;

import java.util.List;

public class PruebaSteps {
    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor= Actor.named("QA");
    private HomePage homePage=new HomePage();
    @Dado("^realizar todo el formulario hasta crear un usuario nuevo$")
    public void realizarTodoElFormularioHastaCrearUnUsuarioNuevo() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homePage));

    }


    @Cuando("^Seleccionar dato del usuario$")
    public void SeleccionarDatoDelUsuario(String tipocredito) {


    }

    @Entonces("^realiza la creacion del usuario$")
    public void RealizaLaCreacionDelUsuario() {

    }

    @Cuando("^Seleccionar datos del usuario$")
    public void SeleccionarDatosDelUsuario(List<String>datos) {
        String nombre = datos.get(0);
        String nombre2 = datos.get(1);
        String correo= datos.get(2);
        String mes= datos.get(3);
        String año= datos.get(4);
        String dia= datos.get(5);
        String marcacelular= datos.get(6);
        String modelo= datos.get(7);
        String os= datos.get(8);
        String contraseña= datos.get(9);
        System.out.println(nombre);
        System.out.println(nombre2);
        System.out.println(correo);
        System.out.println(mes);
        System.out.println(año);
        System.out.println(dia);
        System.out.println(marcacelular);
        System.out.println(modelo);
        System.out.println(os);
        System.out.println(contraseña);
        actor.wasAbleTo(Open.url("https://utest.com/signup/personal"));
        actor.wasAbleTo(
                IngresarSimulador.conDescripcion(nombre,nombre2,correo,mes,año,dia,marcacelular,modelo,os,contraseña)
        );

    }

}
