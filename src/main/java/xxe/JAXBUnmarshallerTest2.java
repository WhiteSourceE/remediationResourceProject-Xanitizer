package xxe;

import org.xml.sax.InputSource;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.sax.SAXSource;
import java.io.StringReader;

public class JAXBUnmarshallerTest2 {

        public String getXml(HttpServletRequest request) {

            String xmlStr = request.getParameter("xmlStr");
            String result = parseWithJAXBUnmarshaller(xmlStr);

            if(result != null) {
                return result;
            }
            return "XML parse error";
        }

        private String parseWithJAXBUnmarshaller(String xmlString)
        {
            try {
                JAXBContext jaxbContext = JAXBContext.newInstance(Object.class);
                Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                Source xmlSource = new SAXSource(new InputSource(new StringReader(xmlString)));
                Object foo = jaxbUnmarshaller.unmarshal(xmlSource);
                return foo.toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
}