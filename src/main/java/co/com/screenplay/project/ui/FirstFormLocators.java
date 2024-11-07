package co.com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FirstFormLocators extends PageObject {

    public static final Target LINK_PAGE_RECRUITMENT = Target.the("Linktext for page recruitment")
            .located(By.xpath("//span[normalize-space()='Recruitment']"));

    public static final Target BUTTON_ADD_CANDIDATE = Target.the("Button for add user")
            .located(By.xpath("//button[normalize-space()='Add']"));

    public static final Target FIRST_NAME = Target.the("First name user")
            .located(By.name("firstName"));

    public static final Target MIDDLE_NAME = Target.the("Middle name user")
            .located(By.name("middleName"));

    public static final Target LAST_NAME = Target.the("Last name user")
            .located(By.name("lastName"));

    public static final Target SELECT_VACANCY = Target.the("Select Vacancy list")
            .located(By.className("oxd-select-wrapper"));

    public static final Target PAYROLL_ADMINISTRATOR_OPTION = Target.the("Payroll Administrator option")
            .located(By.xpath("//div[@class='oxd-select-wrapper']//*[text()='Payroll Administrator']"));

    public static final Target EMAIL = Target.the("email user")
            .located(By.xpath("//label[text()='Email']/ancestor::div[contains(@class, 'oxd-input-group')]//input[@placeholder='Type here']"));

    public static final Target PHONE_NUMBER = Target.the("phone number user")
            .located(By.xpath("//label[text()='Contact Number']/ancestor::div[contains(@class, 'oxd-input-group')]//input[@placeholder='Type here']"));

    public static final Target KEYWORDS = Target.the("keywords")
            .located(By.xpath("//input[@placeholder='Enter comma seperated words...']"));

    public static final Target NOTES = Target.the("Notes")
            .located(By.xpath("//textarea[@placeholder='Type here']"));

    public static final Target CHECK_CONSENT = Target.the("Check")
            .located(By.className("oxd-checkbox-input"));

    public static final Target BUTTON_SAVE = Target.the("Button save")
            .located(By.xpath("//button[normalize-space()='Save']"));

}
