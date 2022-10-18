package controller.Cliente;

import dao.ClienteDAO;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "consultarCliente", urlPatterns = {"/consultarCliente"})
public class consultarCliente extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            int idCliente = Integer.parseInt(request.getParameter("idpet"));

            ClienteDAO clientedao = new ClienteDAO();
            
            request.setAttribute("cliente", clientedao.consultar(idCliente));
        } catch (SQLException | ClassNotFoundException ex) {
            request.setAttribute("mensagem", ex.getMessage());
        }
        
        request.getRequestDispatcher("editarCliente.jsp").forward(request, response);
    }
    }
