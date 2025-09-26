package tests;


import data.enums.LadaDigit;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@DisplayName("Проверка функциональности главной страницы")
public class LadaDigitalTests extends RemoteTestBase {

    @Test
    @Tag("lada")
    @DisplayName("Проверка страницы с контактами организации")
    void checkOrganizationContactsPage (){
        ladaDigitalPage
                .openPageLadaDigit()
                .goToContacts()
                .checkContacts();
    }
    @Test
    @Tag("lada")
    @DisplayName("Проверка страницы с информацией об организации")
    void checkOrganizationAboutUsPage (){
        ladaDigitalPage
                .openPageLadaDigit()
                .goToAboutUs();
    }
    @Test
    @Tag("lada")
    @DisplayName("Проверка страницы с командой организации")
    void checkOrganizationTeamPage (){
        ladaDigitalPage
                .openPageLadaDigit()
                .goToTeam();
    }

    @Test
    @Tag("lada")
    @DisplayName("Проверка страницы с вакансиями организации")
    void checkOrganizationVacancyPage (){
        ladaDigitalPage
                .openPageLadaDigit()
                .goToVacancy()
                .vacancyIsExist(String.valueOf(LadaDigit.BACKEND_DEVELOPER))
                .vacancyIsExist(String.valueOf(LadaDigit.FRONTEND_DEVELOPER))
                .vacancyIsExist(String.valueOf(LadaDigit.DEVOPS))
                .vacancyIsExist(String.valueOf(LadaDigit.QA_AUTOMATION))
                .vacancyIsExist(String.valueOf(LadaDigit.MARKETING_ANALYST))
                .vacancyIsExist(String.valueOf(LadaDigit.PRODUCT_MANAGER));
    }
    @Test
    @Tag("lada")
    @DisplayName("Проверка наличия на странице кнопки 'Отправить резюме'")
    void checkSubmitResumeIsPresentOnPage (){
        ladaDigitalPage
                .openPageLadaDigit()
                .checkExistingSendResumeButton();
    }
}
