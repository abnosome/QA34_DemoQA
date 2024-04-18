package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.PracticeFormPage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeFormTest extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getForms();
        new SidePanel(driver).selectPracticeForm();
    }

    @Test
    public void createStudentAccount(){
        new PracticeFormPage(driver).hideIFrames();
        //enter personal data
        new PracticeFormPage(driver)
                .enterPersonalData("Olga","Buch","OljaBu@gm.com","1234555670")
        //select gender(radio button)
                .selectGender("Male")
        //enter birthday
               .enterBirthday("11 Juli 1989")
        //enter subjects
               .enterSubjects(new String[]{"Maths","Chemistry"})
        //select hobby(check box)
                .selectHobby(new String[]{"Sports","Reading"})
                .uploadFile("C:/Tools/blueberry.jpg")
        //select state
                .selectState("NCR")
        //select city
                .selectCity("Delhi")
        //click on submit button
                .clickOnSubmit()
                .verifySuccessTitle("Thanks for submitting the form");
        //assert student form is appearing

    }
}
