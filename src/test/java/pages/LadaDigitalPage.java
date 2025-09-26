package pages;

import com.codeborne.selenide.SelenideElement;
import data.enums.LadaDigit;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class LadaDigitalPage {
    private static final SelenideElement
            contactsButton = $("a[href='#contact']"),
            stackButton = $("a[href='#stack']"),
            aboutUsButton = $("a[href='#about']"),
            teamButton = $("a[href='#team']"),
            vacancyButton = $("a[href='#vacancy']"),
            sendResumeButton = $("a[href='mailto:recruitment@ladadigit.io']"),
            titleOfContactsPage = $("div.t572"),
            titleOfAboutUsPage = $("div.t489"),
            titleOfTeamPage = $("div.t524"),
            titleOfVacancyPage = $("div.t056"),
            blockOfVacancies = $("div.t585"),
            titleOfMainPage = $("div.t-container div.t-animate_started");

    @Step("Открыть главную страницу 'Lada Цифра'")
    public LadaDigitalPage openPageLadaDigit(){
        open("");
        titleOfMainPage.shouldBe(visible, Duration.ofSeconds(5)).shouldHave(text(String.valueOf(LadaDigit.HELLO_MESSAGE)));
        return this;
    }

    @Step("Перейти на страницу 'Контакты'")
    public LadaDigitalPage goToContacts() {
        contactsButton.shouldHave(text("Контакты")).click();
        titleOfContactsPage.shouldHave(text(String.valueOf(LadaDigit.CONTACTS_TITLE)));
        return this;
    }

    @Step("Проверить, что на странице отображаются контакты")
    public void checkContacts() {
        titleOfContactsPage.shouldHave(text(String.valueOf(LadaDigit.ORGANIZATION_ADDRESS)))
                .shouldHave(text(String.valueOf(LadaDigit.ORGANIZATION_MAIL)));
    }

    @Step("Перейти на страницу 'Стек'")
    public LadaDigitalPage goToStack() {
        stackButton.click();
        return this;
    }

    @Step("Перейти на страницу 'О нас'")
    public LadaDigitalPage goToAboutUs() {
        aboutUsButton.shouldHave(text("О нас")).click();
        titleOfAboutUsPage.shouldHave(text(String.valueOf(LadaDigit.ABOUT_US_TITLE)));
        return this;
    }

    @Step("Перейти на страницу 'Команда'")
    public LadaDigitalPage goToTeam() {
        teamButton.shouldHave(text("Команда")).click();
        titleOfTeamPage.shouldHave(text(String.valueOf(LadaDigit.TEAM_TITLE)));
        return this;
    }

    @Step("Перейти на страницу 'Вакансии'")
    public LadaDigitalPage goToVacancy() {
        vacancyButton.shouldHave(text("Вакансии")).click();
        titleOfVacancyPage.shouldHave(text(String.valueOf(LadaDigit.VACANCY_TITLE)));
        return this;
    }
    @Step("Проверка вакансии '{vacancyName}' на наличие в блоке вакансий")
    public LadaDigitalPage vacancyIsExist(String vacancyName) {
        blockOfVacancies.shouldHave(text(vacancyName));
        return this;
    }
    @Step("Проверка наличия кнопки 'Отправить резюме'")
    public LadaDigitalPage checkExistingSendResumeButton() {
        sendResumeButton.scrollTo().shouldHave(text("Отправить резюме"));
        return this;
    }
}
