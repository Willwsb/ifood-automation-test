package ifoodtest;

import java.awt.List;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import junit.framework.Assert;

public class Testifood {

	@Test
	public void CadastroOK() throws MalformedURLException {
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("deviceName", "emulator-5554");
	    desiredCapabilities.setCapability("automationName", "UiAutomator2");
	    desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\willw\\eclipse-workspace\\ifoodtest\\src\\main\\resources\\ifood-test.apk");
	    
	    
	    AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    
	    //Log in to the app
	    //write email
	    MobileElement campoEmail = driver.findElement(By.xpath("//android.widget.EditText[@text = 'E-mail']"));
	    campoEmail.sendKeys("teste@teste.com");
	    //write password
	    MobileElement password = driver.findElement(By.xpath("//android.widget.EditText[@text = 'Senha']"));
	    password.sendKeys("123456");
	    //Click on Entrar
	    driver.findElement(By.xpath("//android.widget.TextView[@text = 'Entrar']")).click();
	    
	    //write Codigo
	    MobileElement campoCodigo = driver.findElement(By.xpath("//android.widget.EditText[@content-desc = 'codigo']"));
	    campoCodigo.sendKeys("0000001"); 
	    //write Aluno
	    MobileElement campoAluno = driver.findElement(By.xpath("//android.widget.EditText[@content-desc = 'aluno']"));
	    campoAluno.sendKeys("Will");  
	    //Click on Salvar
	    driver.findElement(By.xpath("//android.widget.TextView[@text = 'Salvar']")).click();
	    
	    //Check Results
	    String botaoSalvo =  driver.findElement(By.xpath("//android.widget.TextView[@text = '0000001 - Will']")).getText();
	    Assert.assertEquals("0000001 - Will", botaoSalvo);
	    
	    driver.quit();
	  
	}

	@Test
	public void CadastroDuplicado() throws MalformedURLException {
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("deviceName", "emulator-5554");
	    desiredCapabilities.setCapability("automationName", "UiAutomator2");
	    desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\willw\\eclipse-workspace\\ifoodtest\\src\\main\\resources\\ifood-test.apk");
	    
	    
	    AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    
	    //Log in to the app
	    //write email
	    MobileElement campoEmail = driver.findElement(By.xpath("//android.widget.EditText[@text = 'E-mail']"));
	    campoEmail.sendKeys("teste@teste.com");
	    //write password
	    MobileElement password = driver.findElement(By.xpath("//android.widget.EditText[@text = 'Senha']"));
	    password.sendKeys("123456");
	    //Click on Entrar
	    driver.findElement(By.xpath("//android.widget.TextView[@text = 'Entrar']")).click();
	    
	    //write Codigo
	    MobileElement campoCodigo = driver.findElement(By.xpath("//android.widget.EditText[@content-desc = 'codigo']"));
	    campoCodigo.sendKeys("1"); 
	    //write Aluno
	    MobileElement campoAluno = driver.findElement(By.xpath("//android.widget.EditText[@content-desc = 'aluno']"));
	    campoAluno.sendKeys("1");  
	    //Click on Salvar
	    driver.findElement(By.xpath("//android.widget.TextView[@text = 'Salvar']")).click();
	    
	    //write Codigo
	    MobileElement campoCodigo1 = driver.findElement(By.xpath("//android.widget.EditText[@content-desc = 'codigo']"));
	    campoCodigo1.sendKeys("1"); 
	    //write Aluno
	    MobileElement campoAluno1 = driver.findElement(By.xpath("//android.widget.EditText[@content-desc = 'aluno']"));
	    campoAluno1.sendKeys("1");  
	    //Click on Salvar
	    driver.findElement(By.xpath("//android.widget.TextView[@text = 'Salvar']")).click();
	    
	    //Check Results
	    String botaoSalvo =  driver.findElement(By.xpath("//android.widget.TextView[@text = 'Já existe um aluno com este código!']")).getText();
	    Assert.assertEquals("Já existe um aluno com este código!", botaoSalvo);
	    
	    driver.quit();
	  
	}
	
	@Test
	public void CadastroNaoPreenchido() throws MalformedURLException {
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("deviceName", "emulator-5554");
	    desiredCapabilities.setCapability("automationName", "UiAutomator2");
	    desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\willw\\eclipse-workspace\\ifoodtest\\src\\main\\resources\\ifood-test.apk");
	    
	    
	    AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    
	    //Log in to the app
	    //write email
	    MobileElement campoEmail = driver.findElement(By.xpath("//android.widget.EditText[@text = 'E-mail']"));
	    campoEmail.sendKeys("teste@teste.com");
	    //write password
	    MobileElement password = driver.findElement(By.xpath("//android.widget.EditText[@text = 'Senha']"));
	    password.sendKeys("123456");
	    //Click on Entrar
	    driver.findElement(By.xpath("//android.widget.TextView[@text = 'Entrar']")).click();
	    
	    //write Codigo
	    MobileElement campoCodigo = driver.findElement(By.xpath("//android.widget.EditText[@content-desc = 'codigo']"));
	    campoCodigo.sendKeys("0000001"); 
	    //Click on Salvar
	    driver.findElement(By.xpath("//android.widget.TextView[@text = 'Salvar']")).click();
	    
	    //Check Results
	    String botaoSalvo =  driver.findElement(By.id("android:id/alertTitle")).getText();
	    Assert.assertEquals("Os campos devem ser preenchidos!", botaoSalvo);
	    
	    driver.quit();
	  
	}
}
