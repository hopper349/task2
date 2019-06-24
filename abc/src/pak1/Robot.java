package pak1;

import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;
import com.google.common.collect.Table.Cell;
import com.thoughtworks.selenium.Wait;
import com.thoughtworks.selenium.webdriven.commands.KeyEvent;

public class Robot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * WebDriver driver; System.setProperty("webdriver.chrome.driver",
		 * "D:\\ecliipse\\chromedriver_win32\\chromedriver.exe"); driver= new
		 * ChromeDriver();
		 * driver.get("http://the-internet.herokuapp.com/dynamic_loading");
		 * driver.findElement(By.linkText("Example 1: Element on page that is hidden")).
		 * click(); driver.findElement(By.xpath("//*[@id='start']/button")).click();
		 */
		
		
		FileInputStream ir= new FileInputStream(new File("C:\\Users\\dipanshu.saini\\Desktop\\TestData.xlsx"));
		XSSFWorkbook wb= new XSSFWorkbook(ir);
		Sheet s=wb.getSheet("Sheet1");
		int rcount=s.getLastRowNum()-s.getFirstRowNum();
		Row rr= s.getRow(0);
		Row r= s.createRow(rcount+1);
		/*
		 * for(int i=1;i<rcount+1;i++) { // Row row= s.getRow(i); int
		 * ccount=s.getRow(i).getLastCellNum(); for(int j=0;j<ccount;j++) {
		 * System.out.print(s.getRow(i).getCell(j).getStringCellValue()+ " "); }
		 * System.out.println(); }
		 */
		
		String data[]= {"pager7","pass7"};
		
		for(int i=0;i<rr.getLastCellNum();i++) {
			org.apache.poi.ss.usermodel.Cell cell= r.createCell(i);
			cell.setCellValue(data[i]);
			}
		ir.close();
		
		FileOutputStream fo=new FileOutputStream(new File("C:\\Users\\dipanshu.saini\\Desktop\\TestData.xlsx"));	
		wb.write(fo);
		fo.close();
		
		/*
		 * FluentWait<WebDriver> wait= new FluentWait<WebDriver>(driver)
		 * .withTimeout(10,TimeUnit.SECONDS) .pollingEvery(10,TimeUnit.SECONDS)
		 * .ignoring(NoSuchElementException.class);
		 * 
		 * WebElement hello= wait.until(new Function<WebDriver,WebElement>(){ public
		 * WebElement apply(WebDriver driver) { return
		 * driver.findElement(By.id("finish")); } });
		 */

		
		/*
		 * WebDriverWait wait= new WebDriverWait(driver,10);
		 *  WebElement hello=
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
		 */
		
		/*
		 * Thread.sleep(3000); driver.quit();
		 */
		/*
		 * java.awt.Robot robot= new java.awt.Robot(); StringSelection str= new
		 * StringSelection("C:\\Users\\dipanshu.saini\\Desktop\\PAN.txt");
		 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		 * robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
		 * robot.keyPress(java.awt.event.KeyEvent.VK_V);
		 * 
		 * robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
		 * robot.keyRelease(java.awt.event.KeyEvent.VK_V);
		 * robot.keyPress(java.awt.event.KeyEvent.VK_TAB);
		 * robot.keyPress(java.awt.event.KeyEvent.VK_TAB);
		 * robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
		 */	}
}

