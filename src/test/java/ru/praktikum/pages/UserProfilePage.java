package ru.praktikum.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class UserProfilePage {

    public void verifyAdIsVisible(String adTitle) {
        SelenideElement adElement = $("h2.h2");
        adElement.scrollTo().shouldBe(visible);
    }

    public void clickEditButtonForAd(String adTitle) {
        $x("//h3[contains(text(),'" + adTitle + "')]/following::button[contains(text(), 'Редактировать')]").click();
    }

    public void clickDeleteButtonForAd(String adTitle) {
        $x("//h3[contains(text(),'" + adTitle + "')]/following::button[contains(text(), 'Удалить')]").click();
    }

    public void verifyAdIsDisappeared(String adTitle) {
        $(byText(adTitle)).should(disappear);
    }
}