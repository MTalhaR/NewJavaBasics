package G12Project2;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface TakeScreenshot{
    void getScreenshot();
}
interface RemoteWebDriver extends WebDriver, TakeScreenshot{
    void navigate();
}
class ChromeDriver implements RemoteWebDriver{
    @Override
    public void open() { System.out.println("Open Chrome Browser"); }

    @Override
    public void close() { System.out.println("Close Chrome Browser"); }

    @Override
    public String getTitle() {
        return "Title of Chrome Browser"; }

    @Override
    public void getScreenshot() {
        System.out.println("Take screenshot of Chrome Browser");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate in Chrome Browser");
    }
}
class FirefoxDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Open Firefox Browser");
    }

    @Override
    public void close() {
        System.out.println("Close Firefox Browser");
    }

    @Override
    public String getTitle() { return "Title of Firefox Browser"; }

    @Override
    public void getScreenshot() {
        System.out.println("Take screenshot of Firefox Browser");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate in Firefox Browser");
    }
}
class SafariDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Open Safari Browser");
    }

    @Override
    public void close() {
        System.out.println("Open Safari Browser");
    }

    @Override
    public String getTitle() { return "Title of Safari Browser"; }

    @Override
    public void getScreenshot() {
        System.out.println("Take screenshot of Safari Browser");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate in Safari Browser");
    }
}
class TestWebDriver{
    public static void main(String[] args) {
        RemoteWebDriver[] arr={new ChromeDriver(),new FirefoxDriver(),new SafariDriver()};
        for (RemoteWebDriver obj:arr){
            obj.open();
            obj.close();
            System.out.println(obj.getTitle());
            obj.getScreenshot();
            obj.navigate();
        }
    }
}

/*interface TakeScreenshot extends RemoteWebDriver{
    void getScreenshot();
}
interface RemoteWebDriver extends WebDriver{
    void navigate();
}*/