/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("src/images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testZeroRed()
  {
    Picture beach = new Picture("src/images/beach.jpg");
    beach.explore();
    beach.zeroRed();
    beach.explore();
  }
  
  public static void testZeroGreen()
  {
    Picture beach = new Picture("src/images/beach.jpg");
    beach.explore();
    beach.zeroGreen();
    beach.explore();
  }
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("src/images/beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyRed()
  {
    Picture beach = new Picture("src/images/beach.jpg");
    beach.explore();
    beach.keepOnlyRed();
    beach.explore();
  }
  
  public static void testKeepOnlyGreen()
  {
    Picture beach = new Picture("src/images/beach.jpg");
    beach.explore();
    beach.keepOnlyGreen();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("src/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("src/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  
  public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("src/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
    Picture caterpillar = new Picture("src/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontalBotToTop();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("src/images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorDiagonal()
  {
    Picture temple = new Picture("src/images/beach.jpg");
    temple.explore();
    temple.mirrorDiagonal();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture snman = new Picture("src/images/snowman.jpg");
    snman.explore();
    snman.mirrorArms();
    snman.explore();
  }
  
  public static void testMirrorGull()
  {
    Picture gull = new Picture("src/images/seagull.jpg");
    gull.explore();
    gull.mirrorGull();
    gull.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("src/images/640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testMyCollage()
  {
    Picture canvas = new Picture("src/images/640x480.jpg");
    canvas.createMyCollage();
    canvas.explore();
  }
  
  public static void testCopy()
  {
    Picture canvas = new Picture("src/images/640x480.jpg");
    canvas.createCollage2();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("src/images/swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("src/images/swan.jpg");
    swan.edgeDetection2(10);
    swan.explore();
  }
  
  public static void testNegate()
  {
    Picture beach = new Picture("src/images/beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }
  
  public static void testGrayscale()
  {
    Picture beach = new Picture("src/images/beach.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
  }
  
  public static void testSetRedToHalfValueInTopHalf()
  {
    Picture beach = new Picture("src/images/beach.jpg");
    beach.explore();
    beach.setRedToHalfValueInTopHalf();
    beach.explore();
  }
  
  public static void testGetCountRedOverValue(int val)
  {
    Picture beach = new Picture("src/images/beach.jpg");
    beach.explore();
    System.out.println(beach.getCountRedOverValue(val));
  }
  
  public static void testGetAverageForColumn( int val )
  {
    Picture beach = new Picture("src/images/beach.jpg");
    beach.explore();
    System.out.println(beach.getAverageForColumn(val));
  }
  
  public static void testFixUnderwater()
  {
    Picture water = new Picture("src/images/water.jpg");
    water.explore();
    water.fixUnderwater();
    water.explore();
  }
  
  public static void testChromakey()
  {
    Picture mark = new Picture("src/images/blue-mark.jpg");
    mark.explore();
    mark.chromakey();
    mark.explore();
  }
  
  public static void testClearBlueOverValue(int val)
  {
    Picture water = new Picture("src/images/beach.jpg");
    water.explore();
    water.clearBlueOverValue(val);
    water.explore();
  }
  
  public static void testEncodeAndDecode()

  {

    Picture pic = new Picture("src/images/msg.jpg");
    Picture bgd = new Picture("src/images/redMotorcycle.jpg");
    pic.explore();
    bgd.encode(pic);
    bgd.explore();
    Picture result = bgd.decode();
    result.explore();
  }
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
	//testZeroGreen();
	//testZeroRed();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
	//testMirrorVerticalRightToLeft();
	//testMirrorHorizontal();
	//testMirrorHorizontalBotToTop();
    //testMirrorTemple();
    //testMirrorArms();
	//testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
	//testMyCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}