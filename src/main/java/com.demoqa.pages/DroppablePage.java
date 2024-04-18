package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DroppablePage extends BasePage{
    public DroppablePage(WebDriver driver) {
        super(driver);
    }

    @FindBy (id="draggable")
    WebElement dragMe;

    @FindBy (id="droppable")
    WebElement dropHere;

    public DroppablePage actionDragMe() {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragMe,dropHere).perform();
        String text = dropHere.getText();
        if(text.equals("Dropped!")){
            System.out.println("PASS!");
        } else {
            System.out.println("FAIL!");
        }
        return this;
    }

    public DroppablePage actionDragMeBy() {
        Actions actions = new Actions(driver);
        pause(500);

        int xOffset1 = dragMe.getLocation().getX();
        int yOffset1 = dragMe.getLocation().getY();

        int xOffset = dropHere.getLocation().getX();
        int yOffset = dropHere.getLocation().getY();

        xOffset=(xOffset-xOffset1)+50;
        yOffset=(yOffset-yOffset1)+25;

        pause(500);

        actions.dragAndDropBy(dragMe,xOffset,yOffset).perform();

        String text = dropHere.getText();
        if(text.equals("Dropped!")){
            System.out.println("PASS!");
        } else {
            System.out.println("FAIL!");
        }
        return this;

    }
}
