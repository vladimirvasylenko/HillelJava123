package homework12.controller;

import homework12.dao.ClientDao;
import homework12.dao.StatusDao;
import homework12.service.ClientService;
import homework12.service.StatusService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/statuses")
public class StatusServlet extends HttpServlet{
    private final StatusDao statusDao = new StatusDao();
    private final StatusService statusService = new StatusService(statusDao);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("statuses", statusService.findAllStatuses());
        req.getRequestDispatcher("views/statuses.jsp").forward(req, resp);
    }

}
