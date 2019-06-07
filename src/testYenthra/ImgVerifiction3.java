package testYenthra;

//import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

//import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class ImgVerifiction3 {
	public static void main(String[] args) throws Exception {
		//WebDriver driver=new ChromeDriver();
		try {
			// expectedImage = ImageIO.read(new File("C:\\Users\\RUKKUSADHU\\Desktop\\image1.png"));
			//BufferedImage actualImage = ImageIO.read(new File("C:\\Users\\RUKKUSADHU\\Desktop\\image2.png"));
			
			BufferedImage excepted = ImageIO.read(new File("C:\\Users\\RUKKUSADHU\\Desktop\\img1.jpg"));
			BufferedImage actual = ImageIO.read(new File("C:\\Users\\RUKKUSADHU\\Desktop\\img2.jpg"));
			
			ImageDiffer differ=new ImageDiffer();
			ImageDiff diff= differ.makeDiff(excepted, actual);
			
			if(diff.hasDiff()) {
				System.out.println("images are not similar");
			}
			else
			{
				System.out.println("images are similar");
			}
			
			//Assert.assertFalse(diff.hasDiff(),"images are not matching");
		}
		catch(AssertionError e)
		{
			e.printStackTrace();
		}
}
}
