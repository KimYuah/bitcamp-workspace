package com.eomcs.pms.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.eomcs.pms.domain.Board;
import com.eomcs.pms.service.BoardService;

@WebServlet("/board/update")
public class BoardUpdateServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    request.setCharacterEncoding("UTF-8");

    // 서블릿 컨텍스트를 request 통해서 알아낸다.
    ServletContext ctx = request.getServletContext();
    // 서버가 시작될 때 @WebListener으로 시작된 DataHandlerListene에서 exx.getAttribute 를 꺼낸다.
    BoardService boardService = (BoardService) ctx.getAttribute("boardService");

    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();

    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta http-equiv=\"Refresh\"content='1;list'>");
    out.println("<title>게시글변경</title></head>");
    out.println("<body>");
    try {
      out.println("<h1>게시물 변경</h1>");

      Board board = new Board();
      board.setNo(Integer.parseInt(request.getParameter("no")));
      board.setTitle(request.getParameter("title"));
      board.setContent(request.getParameter("content"));
      int count = boardService.update(board);

      if (count == 0) {
        out.println("<p>해당 번호의 게시글이 없습니다.</p>");

      } else {
        out.println("<p>게시글을 변경하였습니다.</p>");
      }

    } catch (Exception e) {
      out.printf("<h2>작업 처리 중 오류 발생! - %s</h2>\n", e.getMessage());
      out.printf("<pre>%s</pre>\n", e.getMessage());

      StringWriter errOut = new StringWriter();
      e.printStackTrace(new PrintWriter(errOut));
      out.println("<h3>상세 오류 내용</h3>");
      out.printf("<pre>%s<tre>\n", errOut.toString());
    }

    out.println("</body></html>");
  }
}