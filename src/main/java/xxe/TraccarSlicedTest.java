package xxe;

import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

public class TraccarSlicedTest {

  private DocumentBuilder documentBuilder;
  
  public TraccarSlicedTest() {
    try {
      documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
      decode("userInput");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  protected void decode(String xmlString) throws Exception {
    Document document = documentBuilder.parse(new InputSource(new StringReader(xmlString)));
  }
}
