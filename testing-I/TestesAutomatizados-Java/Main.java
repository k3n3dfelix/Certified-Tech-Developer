package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.saucedemo.com");

        WebElement campoUsuario = driver.findElement(By.id("user-name"));
        campoUsuario.sendKeys("standard_user");

        WebElement campoSenha = driver.findElement(By.id("password"));
        campoSenha.sendKeys("secret_sauce");

        WebElement botaoLogin = driver.findElement(By.id("login-button"));
        botaoLogin.click();

        WebElement adicionarCarrinho = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        adicionarCarrinho.click();


        WebElement acessarCarrinho = driver.findElement(By.cssSelector("#shopping_cart_container > a"));
        acessarCarrinho.click();

        WebElement botaoCheckout = driver.findElement(By.id("checkout"));
        botaoCheckout.click();

        WebElement campoNome = driver.findElement(By.id("first-name"));
        campoNome.sendKeys("Tiago");

        WebElement campoSobrenome = driver.findElement(By.id("last-name"));
        campoSobrenome.sendKeys("Gomes");

        WebElement campoCep = driver.findElement(By.id("postal-code"));
        campoCep.sendKeys("12345");

        WebElement botaoContinue = driver.findElement(By.id("continue"));
        botaoContinue.click();

        WebElement botaoFinalizar = driver.findElement(By.id("finish"));
        botaoFinalizar.click();





    }
}