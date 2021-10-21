package xxe;

import javax.servlet.http.HttpServletRequest;
import org.w3c.dom.Document;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.*;
import java.io.File;

public class SaxParserFactoryTest1 {

    public String getXml(HttpServletRequest request) {
        String xmlStr = request.getParameter("xmlStr");
        Document doc = unsafe(xmlStr);

        if (doc != null) {
            return doc.getElementsByTagName("foo").item(0).getTextContent();
        } else {
            return "XML error";
        }
    }

    private Document unsafe(String xmlString)
    {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser builder;
        try {
            builder = factory.newSAXParser();
            builder.parse(new File(xmlString), new DefaultHandler());

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}