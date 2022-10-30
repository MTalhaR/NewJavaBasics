package com.syntax.class23;

public interface WebDriverTester {
    /*
    Create a WebDriver Interface that will have the following unimplemented behaviour:
    openBrowser(), closeBrowser(), maximizeWindow(), findElement(). Create 2 classes that implements
    WebDriver interface: ChromeDriver and FirefoxDriver.
     */

    public static void main(String[] args) {
        WebDriver[] array={new ChromeDriver(),new FirefoxDriver()};
                for (WebDriver arr:array){
                    arr.findElement();
                    arr.maximizeWindow();
                    arr.openBrowser();
                    arr.closeBrowser();
                }
        }
    }

interface WebDriver{
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("Open the Chrome Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close the Chrome Browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize the Chrome Browser");
    }

    @Override
    public void findElement() {
        System.out.println("Find the element in the Chrome Browser");
    }
}
class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open the Firefox Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close the Firefox Browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize the Firefox Browser");
    }

    @Override
    public void findElement() {
        System.out.println("Find the element in the Firefox Browser");
    }
}
