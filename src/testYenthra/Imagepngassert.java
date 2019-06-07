package testYenthra;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class Imagepngassert {
	public class ImgVerifiction3 {
		public void main(String[] args) throws Exception {
			//WebDriver driver=new ChromeDriver();
			try {
				// expectedImage = ImageIO.read(new File("C:\\Users\\RUKKUSADHU\\Desktop\\image1.png"));
				//BufferedImage actualImage = ImageIO.read(new File("C:\\Users\\RUKKUSADHU\\Desktop\\image2.png"));
				
				BufferedImage excepted = ImageIO.read(new File("C:\\Users\\RUKKUSADHU\\Desktop\\img.png"));
				BufferedImage actual = ImageIO.read(new File("C:\\Users\\RUKKUSADHU\\Desktop\\pngimage.png"));
				
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
}
