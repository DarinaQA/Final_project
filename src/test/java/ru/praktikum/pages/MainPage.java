package ru.praktikum.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private final SelenideElement logoutButton = $("button.btnSmall[type='button']");

    public void checkUserIsLoggedIn() {
        logoutButton.shouldBe(visible);
    }

    public boolean isLogoutButtonVisible() {
        return logoutButton.exists();
    }

    public void clickLogoutButton() {
        logoutButton.click();
    }
}