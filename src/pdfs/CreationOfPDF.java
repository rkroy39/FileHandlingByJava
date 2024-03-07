package pdfs;

import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;

public class CreationOfPDF {

	public static void main(String[] args) throws IOException {
		PDDocument pdfdoc= new PDDocument();  
		pdfdoc.addPage(new PDPage());  
		//path where the PDF file will be store 
		PDPage page=pdfdoc.getPage(0);
		PDPageContentStream contentStream = new PDPageContentStream(pdfdoc, page);
		contentStream.beginText();
	    contentStream.setFont(new PDType1Font(Standard14Fonts.FontName.TIMES_ROMAN), 24);
		String s="This is first pdf created at 28 2 2024";
		contentStream.showText(s);
		contentStream.endText();
		contentStream.close();
		pdfdoc.save("C:\\Users\\Lenovo\\Desktop\\Java PDF\\first.pdf");  
		//prints the message if the PDF is created successfully   
		System.out.println("PDF created");  
		//closes the document  
		pdfdoc.close(); 
	}
	
}
