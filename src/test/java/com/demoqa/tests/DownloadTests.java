package com.demoqa.tests;

import com.demoqa.pages.BrokenLinksImagesPage;
import com.demoqa.pages.DownloadPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DownloadTests extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getElements();
        new SidePanel(driver).selectDownload();
    }

    @Test
    public void downloadTest() {
        new DownloadPage(driver).hideIFrames();
        new DownloadPage(driver).download();
    }
}
