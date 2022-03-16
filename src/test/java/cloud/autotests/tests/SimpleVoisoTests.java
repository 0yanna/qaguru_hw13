package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class SimpleVoisoTests extends TestBase {
    @Test
    @Description("Check if button 'request a demo' exists")
    @DisplayName("Voiso test 1")
    void checkButtonTest() {
        step("Open voiso.com", () -> {
            open ("https://voiso.com/");
        });

        step("Сheck button exists", () -> {
            $(".style_content__fy0dz").should(visible);
        });

        step("Сlick button", () -> {
            $(".style_body__rooPX").$(byText("Request a demo")).click();
           // $("a[href=\"/request-a-demo\"]").click();
        });

        step("Сheck text button exists", () -> {
            $(".style_h2__RKar3.style_black__sVGMk").shouldHave(text("Request a demo"));
        });
    }
    @Test
    @Description("Check if video exists on the main banner")
    @DisplayName("Voiso test 2")
    void checkVideoTest() {
        step("Open voiso.com", () -> {
            open ("https://voiso.com/");
        });

        step("Сheck video exists", () -> {
            $(".style_videoWrapper__p719Y").should(exist);
        });
    }

    @Test
    @Description("Check title of the main page")
    @DisplayName("Voiso test 3")
    void titleTest() {
        step("Open url 'https://voiso.com/'", () ->
                open("https://voiso.com/"));

        step("Page title should have text 'Voiso Call Center Platform'", () -> {
            String expectedTitle = "Voiso Call Center Platform";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Check if blog page exists")
    @DisplayName("Voiso test 4")
    void blogPageTest() {
        step("Open url 'https://voiso.com/'", () ->
                open("https://voiso.com/"));

        step("Click blog", () -> {
            $(".menu").$(byText("Pricing")).click();
        });
        sleep(5000);

        step("Сheck blog page", () -> {
            $(".style_secondary____DnE.style_container__7Y17V ").shouldNotBe(empty);
        });
    }

    @Test
    @Description("Page console log should not have errors")
    @DisplayName("Voiso test 5")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://voiso.com/'", () ->
                open("https://voiso.com/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}
