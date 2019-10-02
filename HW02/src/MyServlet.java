import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        if(login.equals("vadim")== true && password.equals("123")==true){
            req.getRequestDispatcher("/okay.jsp").forward(req, resp);
        }else{
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
        }
    }
}
