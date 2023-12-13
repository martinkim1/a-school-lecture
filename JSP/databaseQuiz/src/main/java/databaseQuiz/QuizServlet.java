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
        "데이터는 현실 세계에서 관찰 또는 수집의 결과로 나타난 사실이다.",
        "수집된 데이터를 저장했다가 필요할 때 제공하는 역할은 정보 시스템의 핵심인 데이터베이스가 담당한다."
    };

    private static final String[] answers = {"데이터", "데이터베이스"};

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
