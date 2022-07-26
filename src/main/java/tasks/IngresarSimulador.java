package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.By;

import java.awt.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarSimulador implements Task {
    private String nombre;String nombre2; String correo; String mes; String año; String dia; String marcacelular; String modelo; String os; String contraseña;
    public  IngresarSimulador(String nombre,String nombre2, String correo, String mes, String año, String dia, String marcacelular, String modelo, String os, String contraseña){
        this.nombre=nombre;
        this.nombre2=nombre2;
        this.correo=correo;
        this.mes=mes;
        this.año=año;
        this.dia=dia;
        this.marcacelular=marcacelular;
        this.modelo=modelo;
        this.os=os;
        this.contraseña=contraseña;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(

                    Enter.theValue(nombre).into(By.id("firstName")),
                    Enter.theValue(nombre2).into(By.id("lastName")),
                    Enter.theValue(correo).into(By.id("email")),
                    Enter.theValue(mes).into(By.id("birthMonth")),
                    Enter.theValue(dia).into(By.id("birthDay")),
                    Enter.theValue(año).into(By.id("birthYear")),
                    Click.on(By.cssSelector(".btn.btn-blue")),
                    Click.on(By.id("city")),
                    Click.on(By.id("zip")),
                    Click.on(By.cssSelector(".btn.btn-blue")),
                    Click.on(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span")),
                    Enter.theValue(marcacelular).into(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]")),
                    Click.on(By.id("ui-select-choices-row-6-0")),
                    Click.on(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span")),
                    Enter.theValue(modelo).into(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]")),
                    Click.on(By.id("ui-select-choices-row-7-0")),
                    Click.on(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span/span[1]")),
                    Enter.theValue(os).into(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]")),
                    Click.on(By.id("ui-select-choices-row-8-0")),
                    Click.on(By.cssSelector(".btn.btn-blue")),
                    Enter.theValue(contraseña).into(By.id("password")),
                    Enter.theValue(contraseña).into(By.id("confirmPassword")),
                    Click.on(By.id("termOfUse")),
                    Click.on(By.id("privacySetting")),
                    Click.on(By.cssSelector(".btn.btn-blue"))




            );





    }
    public static Performable conDescripcion(String nombre,String nombre2, String correo, String mes, String año, String dia, String marcacelular, String modelo, String os, String contraseña) {
        return instrumented(IngresarSimulador.class,nombre,nombre2,correo,mes,año,dia,marcacelular,modelo,os,contraseña);
    }
}
