package com.syntax.class22;

public class WebDriverTester {
    public static void main(String[] args) {
int a=5;
        /*Safari safari=new WebDriver(); //Downcasting

        WebDriver chrome=new Chrome();//upcasting

        WebDriver fireFox=new FireFox();

        WebDriver[] object={safari,chrome,fireFox};
        for(int i=0; i<= object.length; i++){
            object[i].closeBrowser();
            object[i].startBrowser();
            object[i].test();
        }*/



        WebDriver[] browsers={new Chrome(),new Safari(),new FireFox()};
        for (WebDriver value:browsers) {
            value.startBrowser();
           value.test();
            value.closeBrowser();
        }



          /* Chrome chrome=new Chrome();
        FireFox fireFox=new FireFox();
        Safari safari=new Safari();
        WebDriver[] browsers={chrome,fireFox,safari};
        */
        /*
        Creating objects of all Child classes and storing them in an array of
        type Webdriver we can do this bcause upcasting allows us to do this
         */
    }
}
