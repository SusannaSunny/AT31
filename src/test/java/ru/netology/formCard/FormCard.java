package ru.netology.formCard;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FormCard {
    @BeforeAll
    public static void setUpAll() {
        open("http://localhost:9999/");
    }
    @Test
    public void SuccessfulFormSubmission(){
    $("[data-test-id=name] input").setValue("Краснова Кристина");
    $("[data-test-id=phone] input").setValue("+79998711111");
    $("[data-test-id=agreement]").click();
    $("button.button").click();
    $("[data-test-id=order-success]").shouldHave(Condition.exactText(" Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));

    }
}