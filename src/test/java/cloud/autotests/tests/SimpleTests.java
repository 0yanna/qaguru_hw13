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


public class SimpleTests extends TestBase {
    @Test
    @Description("Check button")
    @DisplayName("Voiso test 1")
    void checkButtonTest() {
        step("Open voiso.com", () -> {
            open ("https://voiso.com/");
        });

        step("Сheck button exists", () -> {
            $(".get-started").should(visible);
        });

        step("Сlick button", () -> {
            $(".links").scrollIntoView(false).click();
           // $("a[href=\"/request-a-demo\"]").click();
        });
        sleep(5000);

        step("Сheck text button exists", () -> {
            $(".form-wrapper").$(byText("Request a demo"));
        });
    }
    @Test
    @Description("Check video exist")
    @DisplayName("Voiso test 2")
    void checkVideoTest() {
        step("Open voiso.com", () -> {
            open ("https://voiso.com/");
        });

        step("Сheck video exists", () -> {
            $(".video").should(exist);
        });
    }

    @Test
    @Description("Check page title")
    @DisplayName("Voiso test 3")
    void titleTest() {
        step("Open url 'https://voiso.com/'", () ->
                open("https://voiso.com/"));

        step("Page title should have text 'Voiso Call Center Platform | Better call outcomes. Always.'", () -> {
            String expectedTitle = "Voiso Call Center Platform | Better call outcomes. Always.";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Menu have blog page")
    @DisplayName("Voiso test 4")
    void blogPageTest() {
        step("Open url 'https://voiso.com/'", () ->
                open("https://voiso.com/"));

        step("Click blog", () -> {
            $(".nav__rightlinks").find(byText("Blog")).click();
        });
        sleep(5000);

        step("Сheck blog page", () -> {
            $(".feed ").shouldNotBe(empty);
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
