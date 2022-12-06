import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  public void zeroRed()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(0);
      }
    }
  }
  public void zeroGreen()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setGreen(0);
      }
    }
  }
  
  
  public void keepOnlyBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setGreen(0);
        pixelObj.setRed(0);
      }
    }
  }
  
  public void clearBlueOverValue(int val)
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        if (pixelObj.getBlue() > val) {
        	pixelObj.setBlue(0);
        }
      }
    }
  }
  
  public void keepOnlyRed()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setGreen(0);
        pixelObj.setBlue(0);
      }
    }
  }
  
  public void keepOnlyGreen()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
        pixelObj.setRed(0);
      }
    }
  }
  
  public void negate()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
    	pixelObj.setGreen(255-pixelObj.getGreen());
        pixelObj.setBlue(255-pixelObj.getBlue());
        pixelObj.setRed(255-pixelObj.getRed());
      }
    }
  }
  
  public int getAverageForColumn( int col )
  {
	int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      Pixel pixelObj = rowArray[col];
      count += (pixelObj.getRed() + pixelObj.getBlue() + pixelObj.getGreen())/3; 
    }
    count = count/(pixels.length);
    return count;
  }
  
  public int getCountRedOverValue(int val)
  {
	int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        if (pixelObj.getRed() > val) {
        	count++;
        }
        
      }
    }
    return count;
  }
  
  public void setRedToHalfValueInTopHalf()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (int r = 0; r<pixels.length/2; r++)
    {
      for (int c = 0; c<pixels[0].length; c++)
      {
    	  Pixel pixelObj = pixels[r][c];
    	  pixelObj.setRed(pixelObj.getRed()/2);
      }
    }
  }
  
  public void round()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
    	pixelObj.setGreen((pixelObj.getGreen()/10)*10);
        pixelObj.setBlue((pixelObj.getBlue()/10)*10);
        pixelObj.setRed((pixelObj.getRed()/10)*10);
      }
    }
  }
  
  public void grayscale()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
    	int color = pixelObj.getGreen() + pixelObj.getRed() + pixelObj.getBlue();
    	color = color/3;
    	pixelObj.setGreen(color);
        pixelObj.setBlue(color);
        pixelObj.setRed(color);
      }
    }
  }
  
  
  public void fixUnderwater()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
    	if (pixelObj.getRed() <25 && pixelObj.getBlue() >160) {
    		pixelObj.setRed(255);
    	}
      }
    }
  }
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  public void mirrorVerticalRightToLeft()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][width - 1 - col];
        rightPixel = pixels[row][col];
        leftPixel.setColor(rightPixel.getColor());
      }
    } 
  }
  
  public void mirrorHorizontal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width; col++)
      {
    	  topPixel = pixels[row][col];  
          bottomPixel = pixels[(pixels.length - 1) - row][col];       
          bottomPixel.setColor(topPixel.getColor());    
      }
    } 
  }
  
  
  
  public void mirrorHorizontalBotToTop()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width; col++)
      {
    	  bottomPixel = pixels[row][col];  
          topPixel = pixels[(pixels.length - 1) - row][col];       
          bottomPixel.setColor(topPixel.getColor());    
      }
    } 
  }
  
  public void mirrorDiagonal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel pixel = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < pixels.length; col++)
      {
    	  pixel = pixels[row][col];
    	  pixel.setColor(pixels[col][row].getColor());
      }
    } 
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        count++;
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
    System.out.print(count);
  }
  
  public void mirrorArms()
  {
    int mirrorPoint = 200;
    Pixel topPixel = null;
    Pixel botPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 170; row < 200; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 100; col < 300; col++)
      {
        count++;
        topPixel = pixels[row][col];      
        botPixel = pixels[mirrorPoint - row + mirrorPoint]                       
                         [col];
        botPixel.setColor(topPixel.getColor());
      }
    }
    System.out.print(count);
  }
  
  public void mirrorGull()
  {
	  int mirrorPoint = 350;
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    int count = 0;
	    Pixel[][] pixels = this.getPixels2D();
	    
	    // loop through the rows
	    for (int row = 230; row < 330; row++)
	    {
	      // loop from 13 to just before the mirror point
	      for (int col = 230; col < mirrorPoint; col++)
	      {
	        count++;
	        leftPixel = pixels[row][col];      
	        rightPixel = pixels[row]                       
	                         [mirrorPoint - col + mirrorPoint];
	        rightPixel.setColor(leftPixel.getColor());
	      }
	    }
	    System.out.print(count);
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  public void copy2(Picture fromPic, 
          int startRow, int startCol)
  {
	  Pixel fromPixel = null;
	  Pixel toPixel = null;
	  Pixel[][] toPixels = this.getPixels2D();
	  Pixel[][] fromPixels = fromPic.getPixels2D();
	  for (int fromRow = 0, toRow = startRow; 
			  fromRow < fromPixels.length &&
			  toRow < toPixels.length; 
			  fromRow++, toRow++)
	  {
		  for (int fromCol = 0, toCol = startCol; 
				  fromCol < fromPixels[0].length/2 &&
				  toCol < toPixels[0].length;  
				  fromCol++, toCol++)
			  {
			  		fromPixel = fromPixels[fromRow][fromCol];
			  		toPixel = toPixels[toRow][toCol];
			  		toPixel.setColor(fromPixel.getColor());
			  }
	  }   
}
  
  public void copy3(Picture fromPic, 
          int startRow, int startCol)
  {
	  Pixel fromPixel = null;
	  Pixel toPixel = null;
	  Pixel[][] toPixels = this.getPixels2D();
	  Pixel[][] fromPixels = fromPic.getPixels2D();
	  for (int fromRow = 0, toRow = startRow; 
			  fromRow < fromPixels.length/2 &&
			  toRow < toPixels.length; 
			  fromRow++, toRow++)
	  {
		  for (int fromCol = 0, toCol = startCol; 
				  fromCol < fromPixels[0].length &&
				  toCol < toPixels[0].length;  
				  fromCol++, toCol++)
			  {
			  		fromPixel = fromPixels[fromRow][fromCol];
			  		toPixel = toPixels[toRow][toCol];
			  		toPixel.setColor(fromPixel.getColor());
			  }
	  }   
}
  
  public void createCollage2()
  {
    Picture flower1 = new Picture("src/images/flower1.jpg");
    Picture flower2 = new Picture("src/images/flower2.jpg");
    this.copy2(flower1,0,0);
    this.copy2(flower2,100,0);
    this.copy2(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy2(flowerNoBlue,300,0);
    this.copy2(flower1,400,0);
    this.copy2(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("src/images/flower1.jpg");
    Picture flower2 = new Picture("src/images/flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  public void createMyCollage()
  {
    Picture flower1 = new Picture("src/images/flower1.jpg");
    Picture flower2 = new Picture("src/images/flower2.jpg");
    this.copy2(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy3(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy3(flowerNoBlue,300,0);
    this.copy2(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  public void chromakey()
  {
    Picture moonSurface = new Picture("src/images/moon-surface.jpg");
    Pixel[][] pixelsMark = this.getPixels2D();
    Pixel[][] pixelsMoon = moonSurface.getPixels2D();
    
    for (int r = 0; r< pixelsMark.length; r++)
    {
      for (int c = 0; c<pixelsMark[0].length; c++)
      {
    	  Pixel pixelObj = pixelsMark[r][c];
    	  if (pixelObj.getBlue() < 85 && (pixelObj.getRed() < 20 || pixelObj.getGreen() <15)) {
    		pixelObj.setColor(pixelsMoon[r][c].getColor());
    	  }
      }
    }
  }
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  public void sineShift()
  {
	Pixel[][] pixels = this.getPixels2D();
    Pixel onePixel = null;
    Pixel temp = null;
    int sine;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
    	double r = (double) row;
    	sine = (int) (Math.sin(r) * 1000000.0);

    	if(sine>0) {
            sine = sine % width;
            for (int t = 0; t<sine; t++) {
    			temp=pixels[row][width-1];
        		for(int i=width-1;i>0;i--)
        		{
           	 		pixels[row][i].setColor(pixels[row][i-1].getColor());
        		}
        		pixels[row][0].setColor(temp.getColor());
    		}
    	}
    	else if (sine<0) {
    		sine = (sine % width)*(-1);
    		for (int t = 0; t<sine; t++) {
    			temp=pixels[row][0];
        		for(int i=0;i<width-1;i++)
        		{
           	 		pixels[row][i].setColor(pixels[row][i+1].getColor());
        		}
        		pixels[row][width-1].setColor(temp.getColor());
    		}
    	} 
    } 
  }
  
  public void radii()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (int r = 0; r<pixels.length; r++)
    {
      for (int c = 0; c<pixels[0].length; c++)
      {
    	  int rand =(int) (Math.random() * 10);
    	  Pixel pixelObj = pixels[r][c];
    	  if ((rand == 8) && (pixelObj.getAverage() == 0.0)){
    		  int x =(int) (Math.random() * 8);
    		  int y =(int) (Math.random() * 8);
    		  if ((x%2 == 0)&&(y%2 == 0)&&(r-x <= pixels.length)&&(c+y <= pixels.length)&&(r-x >= 0)&&(c+y >= 0)) {
    			  Pixel move = pixels[r-x][c+y];
    			  if (move.getAverage() == 255.0) {
    				  pixelObj.setGreen(x);
    				  pixelObj.setBlue(y);
    				  Pixel temp = move;
    				  move.setColor(pixelObj.getColor());
    				  pixelObj.setColor(temp.getColor());
    			  }
    		  }
    		  else if ((x%2 == 1)&&(y%2 == 0)&&(r+x <= pixels.length)&&(c+y <= pixels.length)&&(r+x >= 0)&&(c+y >= 0)) {
    			  Pixel move = pixels[r+x][c+y];
    			  if (move.getAverage() == 255.0) {
    				  pixelObj.setGreen(x);
    				  pixelObj.setBlue(y);
    				  Pixel temp = move;
    				  move.setColor(pixelObj.getColor());
    				  pixelObj.setColor(temp.getColor());
    			  }
    		  }
    		  else if ((x%2 == 0)&&(y%2 == 1)&&(r-x <= pixels.length)&&(c-y <= pixels.length)&&(r-x >= 0)&&(c-y >= 0)) {
    			  Pixel move = pixels[r-x][c-y];
    			  if (move.getAverage() == 255.0) {
    				  pixelObj.setGreen(x);
    				  pixelObj.setBlue(y);
    				  Pixel temp = move;
    				  move.setColor(pixelObj.getColor());
    				  pixelObj.setColor(temp.getColor());
    			  }
    		  }
    		  else if ((x%2 == 1)&&(y%2 == 1)&&(r+x <= pixels.length)&&(c-y <= pixels.length)&&(r+x >= 0)&&(c-y >= 0)) {
    			  Pixel move = pixels[r+x][c-y];
    			  if (move.getAverage() == 255.0) {
    				  pixelObj.setGreen(x);
    				  pixelObj.setBlue(y);
    				  Pixel temp = move;
    				  move.setColor(pixelObj.getColor());
    				  pixelObj.setColor(temp.getColor());
    			  }
    		  }
    	  }
      }
    }
  }
  public void encode(Picture pic) {
	  Pixel[][] bgd_pixels = this.getPixels2D();
	  Pixel[][] pixels = pic.getPixels2D();
	  
	  //SINE_SHIFT
	    Pixel onePixel = null;
	    Pixel temp = null;
	    int sine;
	    int width = pixels[0].length;
	    for (int row = 0; row < pixels.length; row++)
	    {
	    	double r = (double) row;
	    	sine = (int) (Math.sin(r) * 1000000.0);

	    	if(sine>0) {
	            sine = sine % width;
	            for (int t = 0; t<sine; t++) {
	    			temp=pixels[row][width-1];
	        		for(int i=width-1;i>0;i--)
	        		{
	           	 		pixels[row][i].setColor(pixels[row][i-1].getColor());
	        		}
	        		pixels[row][0].setColor(temp.getColor());
	    		}
	    	}
	    	else if (sine<0) {
	    		sine = (sine % width)*(-1);
	    		for (int t = 0; t<sine; t++) {
	    			temp=pixels[row][0];
	        		for(int i=0;i<width-1;i++)
	        		{
	           	 		pixels[row][i].setColor(pixels[row][i+1].getColor());
	        		}
	        		pixels[row][width-1].setColor(temp.getColor());
	    		}
	    	} 
	    } 
	  
	  //RADII
	    
	    for (int r = 0; r<pixels.length; r++)
	    {
	      for (int c = 0; c<pixels[0].length; c++)
	      {
	    	  int rand =(int) (Math.random() * 10);
	    	  Pixel pixelObj = pixels[r][c];
	    	  if ((rand == 8) && (pixelObj.getAverage() == 0.0)){
	    		  int x =(int) (Math.random() * 8);
	    		  int y =(int) (Math.random() * 8);
	    		  if ((x%2 == 0)&&(y%2 == 0)&&(r-x <= pixels.length)&&(c+y <= pixels.length)&&(r-x >= 0)&&(c+y >= 0)) {
	    			  Pixel move = pixels[r-x][c+y];
	    			  if (move.getAverage() == 255.0) {
	    				  pixelObj.setGreen(x);
	    				  pixelObj.setBlue(y);
	    				  Pixel temp1 = move;
	    				  move.setColor(pixelObj.getColor());
	    				  pixelObj.setColor(temp.getColor());
	    			  }
	    		  }
	    		  else if ((x%2 == 1)&&(y%2 == 0)&&(r+x <= pixels.length)&&(c+y <= pixels.length)&&(r+x >= 0)&&(c+y >= 0)) {
	    			  Pixel move = pixels[r+x][c+y];
	    			  if (move.getAverage() == 255.0) {
	    				  pixelObj.setGreen(x);
	    				  pixelObj.setBlue(y);
	    				  Pixel temp1 = move;
	    				  move.setColor(pixelObj.getColor());
	    				  pixelObj.setColor(temp.getColor());
	    			  }
	    		  }
	    		  else if ((x%2 == 0)&&(y%2 == 1)&&(r-x <= pixels.length)&&(c-y <= pixels.length)&&(r-x >= 0)&&(c-y >= 0)) {
	    			  Pixel move = pixels[r-x][c-y];
	    			  if (move.getAverage() == 255.0) {
	    				  pixelObj.setGreen(x);
	    				  pixelObj.setBlue(y);
	    				  Pixel temp1 = move;
	    				  move.setColor(pixelObj.getColor());
	    				  pixelObj.setColor(temp.getColor());
	    			  }
	    		  }
	    		  else if ((x%2 == 1)&&(y%2 == 1)&&(r+x <= pixels.length)&&(c-y <= pixels.length)&&(r+x >= 0)&&(c-y >= 0)) {
	    			  Pixel move = pixels[r+x][c-y];
	    			  if (move.getAverage() == 255.0) {
	    				  pixelObj.setGreen(x);
	    				  pixelObj.setBlue(y);
	    				  Pixel temp1 = move;
	    				  move.setColor(pixelObj.getColor());
	    				  pixelObj.setColor(temp.getColor());
	    			  }
	    		  }
	    	  }
	      }
	    }
	    
	    //ENCODE
	    
	    for (Pixel[] rowArray : bgd_pixels)
	    {
	      for (Pixel background : rowArray)
	      {
	    	  background.setGreen((background.getGreen()/10)*10);
	    	  background.setBlue((background.getBlue()/10)*10);
	    	  background.setRed((background.getRed()/10)*10);
	      }
	    }
	  
	 for (int r = 0; r<bgd_pixels.length; r++) {
		 for(int c = 0; c<bgd_pixels[0].length; c++) {
			 Pixel pixObj = pixels[r][c];
			 Pixel bgdObj = bgd_pixels[r][c];
			 if (pixObj.getRed() == 0) {
				 bgdObj.setGreen(bgdObj.getGreen() + pixObj.getGreen());
				 bgdObj.setBlue(bgdObj.getBlue() + pixObj.getBlue());
				 double average = (bgdObj.getRed() + bgdObj.getGreen() + bgdObj.getBlue())/3.0;
				 while ((double) Math.round(average) > average) {
					 System.out.println(r + " " + c + " Average: " + average + " Rounded: " + Math.round(average)); 
					 bgdObj.setRed(bgdObj.getRed()-1);
					 average = (bgdObj.getRed() + bgdObj.getGreen() + bgdObj.getBlue())/3;
				 }
			 }
			 else {
				 double average = (bgdObj.getRed() + bgdObj.getGreen() + bgdObj.getBlue())/3.0;
				 while ((double) Math.round(average) < average) {
					 System.out.println(r + " " + c + " Average: " + average + " Rounded: " + Math.round(average));
					 bgdObj.setRed(bgdObj.getRed()-1);
					 average = (bgdObj.getRed() + bgdObj.getGreen() + bgdObj.getBlue())/3;
				}
			 }
		 }
	 }
  }
  
  public Picture decode() {
	  Pixel[][] bgd_pixels = this.getPixels2D();
	  int height = bgd_pixels.length;
	  int width = bgd_pixels[0].length;
	  Picture pic = new Picture(height, width);
	  Pixel[][] pixels = pic.getPixels2D();
	 for (int r = 0; r<bgd_pixels.length; r++) {
		 for(int c = 0; c<bgd_pixels[0].length; c++) {
			 Pixel pixObj = pixels[r][c];
			 Pixel bgdObj = bgd_pixels[r][c];
			 double average = (bgdObj.getRed() + bgdObj.getGreen() + bgdObj.getBlue())/3.0;
			 if ((double) Math.round(average) < average) {
				 pixObj.setRed(0);
				 pixObj.setGreen(bgdObj.getGreen() - ((bgdObj.getGreen()/10)*10));
				 pixObj.setBlue(bgdObj.getBlue() - ((bgdObj.getBlue()/10)*10));
			 }
		 }
	 }
	 
	 //DERADII
	 
	 for (int r = 0; r<pixels.length; r++)
	    {
	      for (int c = 0; c<pixels[0].length; c++)
	      {
	    	  Pixel pixelObj = pixels[r][c];
	    	  int red = pixelObj.getRed();
	    	  int green = pixelObj.getGreen();
	    	  int blue = pixelObj.getBlue();    	  
	    	  if ((red == 0)) {
	    		  if ((green%2 == 0)&&(blue%2 == 0)&&(r+green <= pixels.length)&&(c-blue <= pixels.length)&&(r+green >= 0)&&(c-blue >= 0)) {
	    			  Pixel move = pixels[r+green][c-blue];
	    			  if (move.getAverage() == 255.0) {
	    				  pixelObj.setGreen(0);
	    				  pixelObj.setBlue(0);
	    				  Pixel temp = move;
	    				  move.setColor(pixelObj.getColor());
	    				  pixelObj.setColor(temp.getColor());
	    			  }
	    		  }
	    		  else if ((green%2 == 1)&&(blue%2 == 0)&&(r-green <= pixels.length)&&(c-blue <= pixels.length)&&(r-green >= 0)&&(c-blue >= 0)) {
	    			  Pixel move = pixels[r-green][c-blue];
	    			  if (move.getAverage() == 255.0) {
	    				  pixelObj.setGreen(0);
	    				  pixelObj.setBlue(0);
	    				  Pixel temp = move;
	    				  move.setColor(pixelObj.getColor());
	    				  pixelObj.setColor(temp.getColor());
	    			  }
	    		  }
	    		  else if ((green%2 == 0)&&(blue%2 == 1)&&(r+green <= pixels.length)&&(c+blue <= pixels.length)&&(r+green >= 0)&&(c+blue >= 0)) {
	    			  Pixel move = pixels[r+green][c+blue];
	    			  if (move.getAverage() == 255.0) {
	    				  pixelObj.setGreen(0);
	    				  pixelObj.setBlue(0);
	    				  Pixel temp = move;
	    				  move.setColor(pixelObj.getColor());
	    				  pixelObj.setColor(temp.getColor());
	    			 }
	    		  }
	    		  else if ((green%2 == 1)&&(blue%2 == 1)&&(r-green <= pixels.length)&&(c+blue <= pixels.length)&&(r-green >= 0)&&(c+blue >= 0)) {
	    			  Pixel move = pixels[r-green][c+blue];
	    			  if (move.getAverage() == 255.0) {
	    				  pixelObj.setGreen(0);
	    				  pixelObj.setBlue(0);
	    				  Pixel temp = move;
	    				  move.setColor(pixelObj.getColor());
	    				  pixelObj.setColor(temp.getColor());
	    			 }
	    		  }
	    	  }
	      }
	    }
	 
	 
	 //DESINE
	 
	 Pixel onePixel = null;
	    Pixel temp = null;
	    int sine;
	    int width1 = pixels[0].length;
	    for (int row = 0; row < pixels.length; row++)
	    {
	    	double r = (double) row;
	    	sine = (int) (Math.sin(r) * 1000000.0);

	    	if(sine<0) {
	    		sine = (sine % width1)*(-1);
	    		for (int t = 0; t<sine; t++) {
	    			temp=pixels[row][width1-1];
	        		for(int i=width1-1;i>0;i--)
	        		{
	           	 		pixels[row][i].setColor(pixels[row][i-1].getColor());
	        		}
	        		pixels[row][0].setColor(temp.getColor());
	    		}
	    	}
	    	else if (sine>0) {
	    		sine = (sine % width1);
	    		for (int t = 0; t<sine; t++) {
	    			temp=pixels[row][0];
	        		for(int i=0;i<width1-1;i++)
	        		{
	           	 		pixels[row][i].setColor(pixels[row][i+1].getColor());
	        		}
	        		pixels[row][width1-1].setColor(temp.getColor());
	    		}
	    	} 
	    } 
	 
	 
	 
	 return pic;
  }
  
  public void deRadii()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (int r = 0; r<pixels.length; r++)
    {
      for (int c = 0; c<pixels[0].length; c++)
      {
    	  Pixel pixelObj = pixels[r][c];
    	  int red = pixelObj.getRed();
    	  int green = pixelObj.getGreen();
    	  int blue = pixelObj.getBlue();    	  
    	  if ((red == 0)) {
    		  if ((green%2 == 0)&&(blue%2 == 0)&&(r+green <= pixels.length)&&(c-blue <= pixels.length)&&(r+green >= 0)&&(c-blue >= 0)) {
    			  Pixel move = pixels[r+green][c-blue];
    			  if (move.getAverage() == 255.0) {
    				  pixelObj.setGreen(0);
    				  pixelObj.setBlue(0);
    				  Pixel temp = move;
    				  move.setColor(pixelObj.getColor());
    				  pixelObj.setColor(temp.getColor());
    			  }
    		  }
    		  else if ((green%2 == 1)&&(blue%2 == 0)&&(r-green <= pixels.length)&&(c-blue <= pixels.length)&&(r-green >= 0)&&(c-blue >= 0)) {
    			  Pixel move = pixels[r-green][c-blue];
    			  if (move.getAverage() == 255.0) {
    				  pixelObj.setGreen(0);
    				  pixelObj.setBlue(0);
    				  Pixel temp = move;
    				  move.setColor(pixelObj.getColor());
    				  pixelObj.setColor(temp.getColor());
    			  }
    		  }
    		  else if ((green%2 == 0)&&(blue%2 == 1)&&(r+green <= pixels.length)&&(c+blue <= pixels.length)&&(r+green >= 0)&&(c+blue >= 0)) {
    			  Pixel move = pixels[r+green][c+blue];
    			  if (move.getAverage() == 255.0) {
    				  pixelObj.setGreen(0);
    				  pixelObj.setBlue(0);
    				  Pixel temp = move;
    				  move.setColor(pixelObj.getColor());
    				  pixelObj.setColor(temp.getColor());
    			 }
    		  }
    		  else if ((green%2 == 1)&&(blue%2 == 1)&&(r-green <= pixels.length)&&(c+blue <= pixels.length)&&(r-green >= 0)&&(c+blue >= 0)) {
    			  Pixel move = pixels[r-green][c+blue];
    			  if (move.getAverage() == 255.0) {
    				  pixelObj.setGreen(0);
    				  pixelObj.setBlue(0);
    				  Pixel temp = move;
    				  move.setColor(pixelObj.getColor());
    				  pixelObj.setColor(temp.getColor());
    			 }
    		  }
    	  }
      }
    }
  }
  
  public void deSine()
  {
	Pixel[][] pixels = this.getPixels2D();
    Pixel onePixel = null;
    Pixel temp = null;
    int sine;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
    	double r = (double) row;
    	sine = (int) (Math.sin(r) * 1000000.0);

    	if(sine<0) {
    		sine = (sine % width)*(-1);
    		for (int t = 0; t<sine; t++) {
    			temp=pixels[row][width-1];
        		for(int i=width-1;i>0;i--)
        		{
           	 		pixels[row][i].setColor(pixels[row][i-1].getColor());
        		}
        		pixels[row][0].setColor(temp.getColor());
    		}
    	}
    	else if (sine>0) {
    		sine = (sine % width);
    		for (int t = 0; t<sine; t++) {
    			temp=pixels[row][0];
        		for(int i=0;i<width-1;i++)
        		{
           	 		pixels[row][i].setColor(pixels[row][i+1].getColor());
        		}
        		pixels[row][width-1].setColor(temp.getColor());
    		}
    	} 
    } 
  }
  
  public void edgeDetection2(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel topPixel = null;
    Pixel botPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    Color botColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
    
    for (int row = 0; row < pixels.length-1; row++)
    {
      for (int col = 0; 
           col < pixels[0].length; col++)
      {
        topPixel = pixels[row][col];
        botPixel = pixels[row+1][col];
        botColor = botPixel.getColor();
        if (topPixel.colorDistance(botColor) > 
            edgeDist)
          topPixel.setColor(Color.BLACK);
      }
    }
  }
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("src/images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
