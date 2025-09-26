package data.enums;

public enum LadaDigit {
    CONTACTS_TITLE("Контакты"),
    ABOUT_US_TITLE("Немного о нас"),
    TEAM_TITLE("Команда"),
    VACANCY_TITLE("Мы ищем таланты"),
    ORGANIZATION_ADDRESS("Тольятти, 445043, ул. Северная, 81 "),
    ORGANIZATION_MAIL("org@ladadigit.io"),
    BACKEND_DEVELOPER("Backend-разработчик (Kotlin)"),
    FRONTEND_DEVELOPER("Frontend-разработчик"),
    DEVOPS("DevOps-инженер"),
    QA_AUTOMATION("QA automation engineer"),
    MARKETING_ANALYST("Маркетинговый аналитик"),
    PRODUCT_MANAGER("Менеджер по продукту "),
    HELLO_MESSAGE("Мы создаем цифровое будущее автомобильной индустрии России");

    private final String value;

    LadaDigit(String value) {
        this.value = value;
    }
    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
