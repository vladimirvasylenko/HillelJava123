package homework12.controller;

import homework12.dao.AccountDao;
import homework12.dao.ClientDao;
import homework12.service.AccountService;
import homework12.service.ClientService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ClientServlet extends HttpServlet {
    private final ClientDao clientDao = new ClientDao();
    private final ClientService clientService = new ClientService(clientDao);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("clients", clientService.findAllClients());
        req.getRequestDispatcher("views/clients.jsp").forward(req, resp);
    }
}
