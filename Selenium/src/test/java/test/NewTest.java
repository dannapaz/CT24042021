package test;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void Test() {
			String exePath = Paths.get("").toAbsolutePath().toString()+File.separator + "driver" +File.separator;//Setear el la ruta de nuestro chromedriver
			System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe");//Agregando la propiedad de la ruta del chrome driver 
			WebDriver driver = new ChromeDriver();//Inicializando nuestro chrome driver
			driver.get("https://www.google.com");
		}
  
}
