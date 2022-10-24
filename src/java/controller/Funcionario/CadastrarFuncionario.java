package controller.Funcionario;

import model.Funcionario;
import dao.FuncionarioDAO;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@MultipartConfig
@WebServlet(name = "CadastrarFuncionario", urlPatterns = {"/CadastrarFuncionario"})
public class CadastrarFuncionario extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        try {
            int idFuncionario = request.getParameter("idpessoa").isEmpty() 
                    ? 0 : Integer.parseInt(request.getParameter("idpessoa"));
            
            request.getRequestDispatcher("imagem").include(request, response);
            String imagem = (String) request.getAttribute("nomeImg");
            
            String nomePessoa = request.getParameter("nomepessoa");            
            String cpfPessoa = request.getParameter("cpfpessoa");
            String dataNascimentoPessoa = request.getParameter("dataNascimentopessoa");
            String cepPessoa = request.getParameter("ceppessoa");            
            String cidadePessoa = request.getParameter("cidadepessoa");
            String bairroPessoa = request.getParameter("bairropessoa");
            String ruaPessoa = request.getParameter("ruapessoa");
            String numeroPessoa = request.getParameter("numeropessoa");
            String complementoPessoa = request.getParameter("complementopessoa");
            String estadoPessoa = request.getParameter("estadopessoa");          
            String telefonePessoa = request.getParameter("telefonepessoa");
            String emailPessoa = request.getParameter("emailpessoa");
            String generoPessoa = request.getParameter("generopessoa"); 
            String senhaPessoa = request.getParameter("senhapessoa");
            String cargo = request.getParameter("cargo");
            
            Funcionario funcionario = new Funcionario(idFuncionario, imagem, nomePessoa, cpfPessoa,  dataNascimentoPessoa, cepPessoa, 
            cidadePessoa, bairroPessoa, ruaPessoa, numeroPessoa, complementoPessoa, estadoPessoa,  telefonePessoa, emailPessoa, generoPessoa, 
            senhaPessoa, "funcionario", cargo);

            
            FuncionarioDAO FuncionarioDAO = new FuncionarioDAO();
            
            FuncionarioDAO.cadastrar(funcionario);
            request.setAttribute("mensagem", "Gravado com sucesso!");

        } catch (SQLException | ClassNotFoundException ex) {
            request.setAttribute("mensagem", ex.getMessage());
        }
        
        request.getRequestDispatcher("ListarFuncionario").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}