package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {

    SelenideElement monthInput = $(".react-datepicker__month-select"),
            yearInput = $(".react-datepicker__year-select");

    String dayLocator = ".react-datepicker__day--00";

    public void setDate(String day, String month, String year) {
        monthInput.selectOption(month);
        yearInput.selectOption(year);
        $(dayLocator + day).click();

    }
}
