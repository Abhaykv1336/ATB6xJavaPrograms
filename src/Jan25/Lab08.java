package Jan25;

import java.util.Locale;
import java.util.Scanner;

public class Lab08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String browserName = sc.nextLine();
        browserName = browserName.toLowerCase();

        switch (browserName){
            case "chrome":
                System.out.println("Starting chrome browser");
                //Further code to start chrome
                //Webdriver driver = new chromedriver();  selenium code
                break;

            case "Firefox":
                System.out.println("Starting Firefox browser");
                //Further code to start firefox
                //Webdriver driver = new firefoxdriver();  selenium code
                break;

            case "Edge":
                System.out.println("Starting Edge browser");
                //Further code to start Edge
                //Webdriver driver = new Edgedriver();  selenium code
                break;

            default:
                System.out.println("I have no idea which browser is this");

                sc.close();

        }
    }
}
