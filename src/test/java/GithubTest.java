import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GithubTest {
    @Test
    void solutionsTest() {

        open("https://github.com/");
        $(".HeaderMenu-nav").$(".HeaderMenu-item", 1)
                .hover();
        $(".HeaderMenu-nav").$(".HeaderMenu-item", 1).$(byText("Enterprises")).click();
        $("html").shouldHave(Condition.text("The AI-powered"));
        sleep(5000);

    }

}
