package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UnitTesting {

	
	public String caso1(int numero1,int numero2) {
		String num1= String.valueOf(numero1);
		String num2= String.valueOf(numero2);		
		
		//direcci�n del geckodriver.exe
				System.setProperty("webdriver.gecko.driver","D:\\ARCHIVOS\\CIENCIA DE LA COMPUTACION\\EclipseWorkSpace\\geckodriver-v0.28.0-win64\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
			      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
			      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			      
			      //manda a navegar en internet a la direccion siguiente
			      driver.navigate().to("http://www.calculator.net/");
			      
			      //Maximiza la ventana
			      driver.manage().window().maximize();
			      
			      // Click en math calculator
			      driver.findElement(By.xpath("//*[@id=\"contentout\"]/table/tbody/tr/td[3]/div[2]/a")).click();
			      
			      // Click en percent calculator
			      driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[2]/tbody/tr/td/div[3]/a")).click();
			      
			      // Entra un valor en el primer espacio
			      driver.findElement(By.id("cpar1")).sendKeys(num1);
			      
			      // Entra un valor en el segundo espacio
			      driver.findElement(By.id("cpar2")).sendKeys(num2);
			      
			      // Click en el boton calcular
			      driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[1]/tbody/tr[2]/td/input[2]")).click();
			      
			      //Saca el resultado del xpath correspondiente
			      String result = driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();

			      //Lo imprime en consola
			      System.out.println(" The Result is " + result);
			      return result;
			      
			      //Close the Browser.
			      //driver.close();
	}

	public String caso1(String num1,int numero2) {
		String num2= String.valueOf(numero2);		
		
		//direcci�n del geckodriver.exe
				System.setProperty("webdriver.gecko.driver","D:\\ARCHIVOS\\CIENCIA DE LA COMPUTACION\\EclipseWorkSpace\\geckodriver-v0.28.0-win64\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
			      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
			      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			      
			      //manda a navegar en internet a la direccion siguiente
			      driver.navigate().to("http://www.calculator.net/");
			      
			      //Maximiza la ventana
			      driver.manage().window().maximize();
			      
			      // Click en math calculator
			      driver.findElement(By.xpath("//*[@id=\"contentout\"]/table/tbody/tr/td[3]/div[2]/a")).click();
			      
			      // Click en percent calculator
			      driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[2]/tbody/tr/td/div[3]/a")).click();
			      
			      // Entra un valor en el primer espacio
			      driver.findElement(By.id("cpar1")).sendKeys(num1);
			      
			      // Entra un valor en el segundo espacio
			      driver.findElement(By.id("cpar2")).sendKeys(num2);
			      
			      // Click en el boton calcular
			      driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[1]/tbody/tr[2]/td/input[2]")).click();
			      
			      //Saca el resultado del xpath correspondiente
			      String result = driver.findElement(By.xpath("/html/body/div[3]/div[1]/p[2]/font")).getText();

			      //Lo imprime en consola
			      System.out.println(" The Result is " + result);
			      return result;
			      
			      //Close the Browser.
			      //driver.close();
	}

	
	public String caso1(int numero1,String num2) {
		String num1= String.valueOf(numero1);
		
		//direcci�n del geckodriver.exe
				System.setProperty("webdriver.gecko.driver","D:\\ARCHIVOS\\CIENCIA DE LA COMPUTACION\\EclipseWorkSpace\\geckodriver-v0.28.0-win64\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
			      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
			      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			      
			      //manda a navegar en internet a la direccion siguiente
			      driver.navigate().to("http://www.calculator.net/");
			      
			      //Maximiza la ventana
			      driver.manage().window().maximize();
			      
			      // Click en math calculator
			      driver.findElement(By.xpath("//*[@id=\"contentout\"]/table/tbody/tr/td[3]/div[2]/a")).click();
			      
			      // Click en percent calculator
			      driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[2]/tbody/tr/td/div[3]/a")).click();
			      
			      // Entra un valor en el primer espacio
			      driver.findElement(By.id("cpar1")).sendKeys(num1);
			      
			      // Entra un valor en el segundo espacio
			      driver.findElement(By.id("cpar2")).sendKeys(num2);
			      
			      // Click en el boton calcular
			      driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[1]/tbody/tr[2]/td/input[2]")).click();
			      
			      //Saca el resultado del xpath correspondiente
			      String result = driver.findElement(By.xpath("/html/body/div[3]/div[1]/p[2]/font")).getText();

			      //Lo imprime en consola
			      System.out.println(" The Result is " + result);
			      return result;
			      
			      //Close the Browser.
			      //driver.close();
	}
	
	
	public String caso1(String num1,String num2) {	
		
		//direcci�n del geckodriver.exe
				System.setProperty("webdriver.gecko.driver","D:\\ARCHIVOS\\CIENCIA DE LA COMPUTACION\\EclipseWorkSpace\\geckodriver-v0.28.0-win64\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
			      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
			      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			      
			      //manda a navegar en internet a la direccion siguiente
			      driver.navigate().to("http://www.calculator.net/");
			      
			      //Maximiza la ventana
			      driver.manage().window().maximize();
			      
			      // Click en math calculator
			      driver.findElement(By.xpath("//*[@id=\"contentout\"]/table/tbody/tr/td[3]/div[2]/a")).click();
			      
			      // Click en percent calculator
			      driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[2]/tbody/tr/td/div[3]/a")).click();
			      
			      // Entra un valor en el primer espacio
			      driver.findElement(By.id("cpar1")).sendKeys(num1);
			      
			      // Entra un valor en el segundo espacio
			      driver.findElement(By.id("cpar2")).sendKeys(num2);
			      
			      // Click en el boton calcular
			      driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[1]/tbody/tr[2]/td/input[2]")).click();
			      
			      //Saca el resultado del xpath correspondiente
			      String result = driver.findElement(By.xpath("/html/body/div[3]/div[1]/p[2]/font")).getText();

			      //Lo imprime en consola
			      System.out.println(" The Result is " + result);
			      return result;
			      
			      //Close the Browser.
			      //driver.close();
	}	
	
	
	public String caso2() {
		//direcci�n del geckodriver.exe
		System.setProperty("webdriver.gecko.driver","D:\\ARCHIVOS\\CIENCIA DE LA COMPUTACION\\EclipseWorkSpace\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //manda a navegar en internet a la direccion siguiente
	      driver.navigate().to("http://www.calculator.net/");
	      
	      //Maximiza la ventana
	      driver.manage().window().maximize();
	      
	      // Click en math calculator
	      driver.findElement(By.xpath("//*[@id=\"contentout\"]/table/tbody/tr/td[3]/div[2]/a")).click();
	      
	      // Click en scientific calculator
	      driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[2]/tbody/tr/td/div[1]/a")).click();
	      
	      // Click en el boton 8
	      driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/table/tbody/tr/td/div[3]/div[1]/span[2]")).click();
	      
	      // Click en el boton +
	      driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/table/tbody/tr/td/div[3]/div[1]/span[4]")).click();

	      // Click en el boton 4
	      driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/table/tbody/tr/td/div[3]/div[2]/span[1]")).click();
	      
	      // Click en el boton 0
	      driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/table/tbody/tr/td/div[3]/div[4]/span[1]")).click();
	      
	      
	      //Saca el resultado del xpath correspondiente
	      String result = driver.findElement(By.xpath("//*[@id=\"sciOutPut\"]")).getText();

	      //Lo imprime en consola
	      System.out.println(" The Result is " + result);
	    

	      // Click en el boton =
	      driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/table/tbody/tr/td/div[3]/div[5]/span[4]")).click();

	      return result;
	      
	      //Close the Browser.
	      //driver.close();
	}
	
	public String caso3(int numero1,int numero2) {
			String num1= String.valueOf(numero1);
			String num2= String.valueOf(numero2);	
			
		//direcci�n del geckodriver.exe
		  System.setProperty("webdriver.gecko.driver","D:\\ARCHIVOS\\CIENCIA DE LA COMPUTACION\\EclipseWorkSpace\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
	      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //manda a navegar en internet a la direccion siguiente
	      driver.navigate().to("http://www.calculator.net/");
	      
	      //Maximiza la ventana
	      driver.manage().window().maximize();
	      
	      // Click en math calculator
	      driver.findElement(By.xpath("//*[@id=\"contentout\"]/table/tbody/tr/td[3]/div[2]/a")).click();
	      
	      // Click en binary calculator
	      driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[2]/tbody/tr/td/div[7]/a")).click();

	      // Click en el boton Clear
	      driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[1]/tbody/tr[2]/td/img")).click();
	      
	      // Entra un valor en el primer espacio
	      driver.findElement(By.id("number1")).sendKeys(num1);
	      
	      // Entra un valor en el segundo espacio
	      driver.findElement(By.id("number2")).sendKeys(num2);
	      
	      // Click en el boton Calcular
	      driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[1]/tbody/tr[2]/td/input[2]")).click();
	      
	      //Saca el resultado del xpath correspondiente
	      String result = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/font/b")).getText();

	      //Lo imprime en consola
	      System.out.println(" The Result is " + result);

	      return result;
	      //Close the Browser.
	      //driver.close();
	}
	
	public static void main(String[] args) {
		//caso1(8,10);
		
	}
}
