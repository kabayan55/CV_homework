
public class CvMainKabayan {

	static void imageProcessing1() {

		String filename1 = "miffy192*144.jpg";
		String filename2 = "blue1.jpg";
		String filename3 = "blue2.jpg";
		String filename4 = "blue3.jpg";
		String filename5 = "blue4.jpg";
		String filename6 = "blue5.jpg";
		String filename7 = "blue6.jpg";

		MyImage image1, image2, image3, image4, image5, image6, image7;
	
		image1 = JpegFileReader.read(filename1);

		{
		    image2 = Blue1.execute(image1);
		    image3 = Blue2.execute(image1);
		    image4 = Blue3.execute(image1);
		    image5 = Blue4.execute(image1);
		    image6 = Blue5.execute(image1);
		    image7 = Blue6.execute(image1);
		}

		JpegFileWriter.write(filename2, image2);
		JpegFileWriter.write(filename3, image3);
		JpegFileWriter.write(filename4, image4);
		JpegFileWriter.write(filename5, image5);
		JpegFileWriter.write(filename6, image6);
		JpegFileWriter.write(filename7, image7);
	}

	static void imageProcessing2() {

		String filename1 = "blue1.jpg";
		String filename2 = "blue2.jpg";
		String filename3 = "blue3.jpg";
		String filename4 = "blue4.jpg";
		String filename5 = "blue5.jpg";
		String filename6 = "blue6.jpg";

		String filename7 = "tilingblue1.jpg";
		String filename8 = "tilingblue2.jpg";
		String filename9 = "tilingblue3.jpg";
		String filename10 = "tilingblue4.jpg";
		String filename11 = "tilingblue5.jpg";
		String filename12 = "tilingblue6.jpg";


		MyImage image1, image2, image3, image4, image5, image6, image7, image8, image9, image10, image11, image12;
	
		image1 = JpegFileReader.read(filename1);
		image2 = JpegFileReader.read(filename2);
		image3 = JpegFileReader.read(filename3);
		image4 = JpegFileReader.read(filename4);
		image5 = JpegFileReader.read(filename5);
		image6 = JpegFileReader.read(filename6);

		image7 = TilingBlue1.execute(image1); 	
		image8 = TilingBlue1.execute(image2); 	
		image9 = TilingBlue1.execute(image3); 	
		image10 = TilingBlue1.execute(image4);
		image11 = TilingBlue1.execute(image5); 	
		image12 = TilingBlue1.execute(image6); 	

		JpegFileWriter.write(filename7, image7);
		JpegFileWriter.write(filename8, image8);
		JpegFileWriter.write(filename9, image9);
		JpegFileWriter.write(filename10, image10);
		JpegFileWriter.write(filename11, image11);
		JpegFileWriter.write(filename12, image12);

	}

	static void imageProcessing3() {


		String filename1 = "tilingblue1.jpg";
		String filename2 = "tilingblue2.jpg";
		String filename3 = "tilingblue3.jpg";
		String filename4 = "tilingblue4.jpg";
		String filename5 = "tilingblue5.jpg";
		String filename6 = "tilingblue6.jpg";
		String filename7 = "haikei.jpg";
		MyImage image1, image2, image3, image4, image5, image6, image7;
	
		image1 = JpegFileReader.read(filename1);
		image2 = JpegFileReader.read(filename2);
		image3 = JpegFileReader.read(filename3);
		image4 = JpegFileReader.read(filename4);
		image5 = JpegFileReader.read(filename5);
		image6 = JpegFileReader.read(filename6);

		image7 = TilingBlue2.execute(image1,image2,image3,image4,image5,image6);

		JpegFileWriter.write(filename7, image7);

	}


	static void imageProcessing4() {

		String filename1 = "lace1.jpg";
		String filename2 = "lace2.jpg";
		String filename3 = "lace1black.jpg";
		String filename4 = "lace2black.jpg";
		MyImage image1, image2, image3, image4;
	
		image1 = JpegFileReader.read(filename1);
		image2 = JpegFileReader.read(filename2);

		{
		   image3 = Negative.execute(image1);
		   image4 = Negative.execute(image2);
		   
		}

		JpegFileWriter.write(filename3, image3);
		JpegFileWriter.write(filename4, image4);

	}

	static void imageProcessing5() {

	
		String filename1 = "lace1black.jpg";
		String filename2 = "lace2black.jpg";
		String filename3 = "lace1black2.jpg";
		String filename4 = "lace2black2.jpg";

		MyImage image1, image2, image3, image4;
	
		image1 = JpegFileReader.read(filename1);
		image2 = JpegFileReader.read(filename2);

		{
		   image3 = Binalization.execute(image1);
		   image4 = Binalization.execute(image2);
		   
		}

		JpegFileWriter.write(filename3, image3);
		JpegFileWriter.write(filename4, image4);

	}

	static void imageProcessing6() {

		String filename1 = "bibibi.jpg";
		String filename2 = "rainbow.jpg";
		String filename3 = "bibibirainbow.jpg";
	
		MyImage image1, image2, image3, image0;
	
		image1 = JpegFileReader.read(filename1);
		image2 = JpegFileReader.read(filename2);
		
		KMeans kmeans = new KMeans();
		kmeans.clustering(image1, 6);
		image0 = Chromakey.execute(image1, kmeans, 3);
		image3 = Bibibi.execute(image1, image2, image0); 
		JpegFileWriter.write(filename3, image3);

	}

    	static void imageProcessing7() {

		String filename1 = "heartshape.jpg";
		String filename2 = "red.jpg";
		String filename3 = "redheart.jpg";
	
		MyImage image1, image2, image3, image0;
	
		image1 = JpegFileReader.read(filename1);
		image2 = JpegFileReader.read(filename2);
		
		KMeans kmeans = new KMeans();
		kmeans.clustering(image1, 6);
		image0 = Chromakey.execute(image1, kmeans, 3);
		image3 = Heart.execute(image1, image2, image0); 
		JpegFileWriter.write(filename3, image3);

	}


  	static void imageProcessing8() {

		String filename1 = "left1.jpg";
		String filename2 = "left2.jpg";
		String filename3 = "right1.jpg";
		String filename4 = "right2.jpg";
		String filename5 = "center1.jpg";
		String filename6 = "center2.jpg";

		String filename7 = "lace1black2.jpg";
		String filename8 = "lace1black3.jpg";

		String filename9 = "bibibirainbow.jpg";
		String filename10 = "bibibirainbow2.jpg";

		String filename11 = "ribbon1.jpg";
		String filename12 = "ribbon2.jpg";

		MyImage image1, image2, image3, image4, image5, image6, image7, image8, image9, image10, image11, image12;
	
		image1 = JpegFileReader.read(filename1);
		image3 = JpegFileReader.read(filename3);
		image5 = JpegFileReader.read(filename5);

		image7 = JpegFileReader.read(filename7);

		image9 = JpegFileReader.read(filename9);

		image11 = JpegFileReader.read(filename11);
       
		{
		    	image2 = ScaleLeft.execute(image1);
			image4 = ScaleRight.execute(image3);
			image6 = ScaleCenter.execute(image5);

			image8 = ScaleLace1.execute(image7);

			image10 = ScaleBibibi.execute(image9);

			image12 = ScaleRibbon.execute(image11);
		}

		JpegFileWriter.write(filename2, image2);
		JpegFileWriter.write(filename4, image4);
		JpegFileWriter.write(filename6, image6);

		JpegFileWriter.write(filename8, image8);

		JpegFileWriter.write(filename10, image10);

		JpegFileWriter.write(filename12, image12);
	

	}

	static void imageProcessing9() {
		String filename1 = "lace1black3.jpg";
		String filename2 = "haikei.jpg";
		String filename3 = "haikeilace1.jpg";

		MyImage image1, image2, image3, image0;
	
	
		image1 = JpegFileReader.read(filename1);
		image2 = JpegFileReader.read(filename2);

	
		KMeans kmeans = new KMeans();
		kmeans.clustering(image1, 6);
		image0 = Chromakey.execute(image1, kmeans, 3);

		image3 = Lace1.execute(image1, image2, image0); 
		
		JpegFileWriter.write(filename3, image3);

	}
	static void imageProcessing10() {
		String filename1 = "lace2black2.jpg";
		String filename2 = "haikeilace1.jpg";
		String filename3 = "haikeilace2.jpg";

		MyImage image1, image2, image3, image0;
	
	
		image1 = JpegFileReader.read(filename1);
		image2 = JpegFileReader.read(filename2);

		KMeans kmeans = new KMeans();
		kmeans.clustering(image1, 6);
		image0 = Chromakey.execute(image1, kmeans, 3);

		image3 = Lace2.execute(image1, image2, image0); 

		JpegFileWriter.write(filename3, image3);

	}

	static void imageProcessing11() {

		String filename1 = "redheart.jpg";
		String filename2 = "haikeilace2.jpg";
		String filename3 = "haikeiheart.jpg";
	
		MyImage image1, image2, image3, image0;
	
		image1 = JpegFileReader.read(filename1);
		image2 = JpegFileReader.read(filename2);
		
		KMeans kmeans = new KMeans();
		kmeans.clustering(image1, 6);
		image0 = Chromakey.execute(image1, kmeans, 3);
		image3 = Heart2.execute(image1, image2, image0); 
		JpegFileWriter.write(filename3, image3);

	}
	static void imageProcessing12() {

		String filename1 = "east.jpg";
		String filename2 = "east2.jpg";

		MyImage image1, image2,image0;
	
		image1 = JpegFileReader.read(filename1);

		KMeans kmeans = new KMeans();
		kmeans.clustering(image1, 6);
		image0 = Chromakey.execute(image1, kmeans, 3);

		image2 = East1.execute(image1,image0); 

		JpegFileWriter.write(filename2, image2);

	}
	static void imageProcessing13() {

		String filename1 = "east2.jpg";
		String filename2 = "east3.jpg";
		MyImage image1, image2;
	
		image1 = JpegFileReader.read(filename1);

		 image2 = SpaceFiltering.execute(image1);	
	
		JpegFileWriter.write(filename2, image2);

	}

	static void imageProcessing14() {

		String filename1 = "east3.jpg";
		String filename2 = "haikeiheart.jpg";

		String filename3 = "haikeieast.jpg";

		MyImage image1, image2, image3, image0;
	
	
		image1 = JpegFileReader.read(filename1);
		image2 = JpegFileReader.read(filename2);

		KMeans kmeans = new KMeans();
		kmeans.clustering(image1, 6);
		image0 = Chromakey.execute(image1, kmeans, 3);

		image3 = East2.execute(image1, image2, image0); 

		JpegFileWriter.write(filename3, image3);

	}



	static void imageProcessing15() {

		String filename1 = "left2.jpg";
		String filename2 = "haikeieast.jpg";

		String filename3 = "haikeileft.jpg";

		MyImage image1, image2, image3, image0;
	
	
		image1 = JpegFileReader.read(filename1);
		image2 = JpegFileReader.read(filename2);

		KMeans kmeans = new KMeans();
		kmeans.clustering(image1, 6);
		image0 = Chromakey.execute(image1, kmeans, 3);

		image3 = YellowLeft.execute(image1, image2, image0); 

		JpegFileWriter.write(filename3, image3);

	}
 
	static void imageProcessing16() {

		String filename1 = "right2.jpg";
		String filename2 = "haikeileft.jpg";

		String filename3 = "haikeiright.jpg";

		MyImage image1, image2, image3, image0;
	
	
		image1 = JpegFileReader.read(filename1);
		image2 = JpegFileReader.read(filename2);

		KMeans kmeans = new KMeans();
		kmeans.clustering(image1, 6);
		image0 = Chromakey.execute(image1, kmeans, 3);

		image3 = CyanRight.execute(image1, image2, image0); 

		JpegFileWriter.write(filename3, image3);

	}


        static void imageProcessing17() {

		String filename1 = "aquablue.jpg";
		String filename2 = "ribbon2.jpg";

		String filename3 = "ribbon3.jpg";

		MyImage image1, image2, image3;
	
	
		image1 = JpegFileReader.read(filename1);
		image2 = JpegFileReader.read(filename2);

		image3 = Tiling.execute(image1, image2); 	

		JpegFileWriter.write(filename3, image3);

	}

	static void imageProcessing18() {

		String filename1 = "ribbon3.jpg";
		String filename2 = "center2.jpg";
		String filename3 = "centerribbon.jpg";
	
		MyImage image1, image2, image3, image0;
	
		image1 = JpegFileReader.read(filename1);
		image2 = JpegFileReader.read(filename2);
		
		KMeans kmeans = new KMeans();
		kmeans.clustering(image1, 6);
		image0 = Chromakey.execute(image1, kmeans, 3);
		image3 = Ribbon.execute(image1, image2, image0); 
		JpegFileWriter.write(filename3, image3);

	}
	static void imageProcessing19() {

		String filename1 = "aquablue2.jpg";
		String filename2 = "skirt1.jpg";
		String filename3 = "skirt2.jpg";
	
		MyImage image1, image2, image3;
	
		image1 = JpegFileReader.read(filename1);
		image2 = JpegFileReader.read(filename2);
	
		image3 = TilingSkirt.execute(image1, image2); 
		JpegFileWriter.write(filename3, image3);

	}
	static void imageProcessing20() {

		String filename1 = "skirt2.jpg";
		String filename2 = "centerribbon.jpg";
		String filename3 = "centerskirt.jpg";
	
		MyImage image1, image2, image3, image0;
	
		image1 = JpegFileReader.read(filename1);
		image2 = JpegFileReader.read(filename2);
		
		KMeans kmeans = new KMeans();
		kmeans.clustering(image1, 6);
		image0 = Chromakey.execute(image1, kmeans, 3);
		image3 = Skirt.execute(image1, image2, image0); 
		JpegFileWriter.write(filename3, image3);

	}

 
	static void imageProcessing21() {

		String filename1 = "centerskirt.jpg";
		String filename2 = "haikeiright.jpg";

		String filename3 = "haikeicenter.jpg";

		MyImage image1, image2, image3, image0;
	
	
		image1 = JpegFileReader.read(filename1);
		image2 = JpegFileReader.read(filename2);

		KMeans kmeans = new KMeans();
		kmeans.clustering(image1, 6);
		image0 = Chromakey.execute(image1, kmeans, 3);

		image3 = Center.execute(image1, image2, image0); 

		JpegFileWriter.write(filename3, image3);

	}
	static void imageProcessing22() {

		String filename1 = "arrow.jpg";
		String filename2 = "haikeicenter.jpg";

		String filename3 = "haikeiarrow.jpg";

		MyImage image1, image2, image3, image0;
	
	
		image1 = JpegFileReader.read(filename1);
		image2 = JpegFileReader.read(filename2);

		KMeans kmeans = new KMeans();
		kmeans.clustering(image1, 6);
		image0 = Chromakey.execute(image1, kmeans, 3);

		image3 = Arrow.execute(image1, image2, image0); 

		JpegFileWriter.write(filename3, image3);

	}



	static void imageProcessing23() {

		String filename1 = "bibibirainbow2.jpg";
		String filename2 = "haikeiarrow.jpg";
		String filename3 = "haikeibibibi.jpg";
	
		MyImage image1, image2, image3, image0;
	
		image1 = JpegFileReader.read(filename1);
		image2 = JpegFileReader.read(filename2);
		
		KMeans kmeans = new KMeans();
		kmeans.clustering(image1, 6);
		image0 = Chromakey.execute(image1, kmeans, 3);
		image3 = Bibibi2.execute(image1, image2, image0); 
		JpegFileWriter.write(filename3, image3);

	}





	public static void main(String args[]) {

	    //imageProcessing1();
	    //imageProcessing2();
	    //imageProcessing3();
	    //imageProcessing4();
	    //imageProcessing5();
	    //imageProcessing6();
	    //imageProcessing7();
	    //imageProcessing8();
	    //imageProcessing9();
	    //imageProcessing10();
	    //imageProcessing11();
	    //imageProcessing12();
	    //imageProcessing13();
	    //imageProcessing14();
	    //imageProcessing15();
	    //imageProcessing16();
	    //imageProcessing17();
	    //imageProcessing18();
	    //imageProcessing19();
	    //imageProcessing20();
	    //imageProcessing21();
	    //imageProcessing22();
	    imageProcessing23();
	  
	}
}
