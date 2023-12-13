// QuizServlet.java
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/quiz")
public class QuizServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private static final String[] questions = {
        "�����ʹ� ���� ���迡�� ���� �Ǵ� ������ ����� ��Ÿ�� ����̴�.",
        "������ �����͸� �����ߴٰ� �ʿ��� �� �����ϴ� ������ ���� �ý����� �ٽ��� �����ͺ��̽��� ����Ѵ�."
    };

    private static final String[] answers = {"������", "�����ͺ��̽�"};

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int questionIndex = (int) (Math.random() * questions.length);

        String question = questions[questionIndex];

        request.setAttribute("question", question);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userAnswer = request.getParameter("answer");
        int questionIndex = Integer.parseInt(request.getParameter("questionIndex"));

        String correctAnswer = answers[questionIndex];

        boolean isCorrect = userAnswer.equalsIgnoreCase(correctAnswer);

        request.setAttribute("isCorrect", isCorrect);
        request.setAttribute("correctAnswer", correctAnswer);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
