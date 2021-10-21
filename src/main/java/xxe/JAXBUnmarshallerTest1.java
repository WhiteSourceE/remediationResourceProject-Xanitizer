package xxe;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import org.xml.sax.InputSource;

public class JAXBUnmarshallerTest1 {

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
                Object foo = jaxbUnmarshaller.unmarshal(new InputSource(new StringReader(xmlString)));
                return foo.toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
}