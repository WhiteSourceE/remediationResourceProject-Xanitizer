package nullPointer;

import javax.servlet.http.HttpServletRequest;

public class NullTest3 {

    private void unsafe(HttpServletRequest request) {
        Object obj = request.getParameter("persona");
        System.out.println(obj.toString());
    }
}
