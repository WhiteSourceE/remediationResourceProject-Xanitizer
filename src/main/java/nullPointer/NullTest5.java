package nullPointer;

import javax.servlet.http.HttpServletRequest;

public class NullTest5 {

    private void unsafe(HttpServletRequest request) {
        System.out.println(getParameter(request, "persona").toString());
    }

    private Object getParameter(HttpServletRequest request, String parameterName) {
        if (parameterName.equals("persona")) {
            return null;
        } else {
            return "Me";
        }
    }
}
