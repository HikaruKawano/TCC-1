package controller.Cliente;

import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.servlet.annotation.MultipartConfig;

@MultipartConfig
//o @multiparteConfig é o mais importante pra funcionar então n esquece de colocar animal
@WebServlet(name = "imagem", urlPatterns = {"/imagem"})
public class imagem extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try {

            //Mudar o caminho para o local da pasta q o servidor esta rodadando
            String caminho = "C:/Users/Hikaru/Documents/GitHub/4patas" + "/";
            //Ve se a pasta existe se não existe ele cria
            File diretorio = new File(caminho);
            if (!diretorio.exists()) {
                diretorio.mkdir();
            }

            try {

                Part filePart = request.getPart("imagem");
                String filename = filePart.getSubmittedFileName();

                if (filename == null) {
                    filename = request.getParameter("imagem");
                }

                if (filename != null) {
                    OutputStream os = null;
                    InputStream is = null;

                    File filePath = new File(caminho, filename);

                    if (!filePart.getSubmittedFileName().endsWith(".png") && !filePart.getSubmittedFileName().endsWith(".jpg")) {
                        request.setAttribute("erro", "Seu arquivo não foi aceito");
                    } else {

                        if (!filePath.exists()) {

                            os = new FileOutputStream(filePath);
                            is = filePart.getInputStream();

                            int read = 0;
                            while ((read = is.read()) != -1) {
                                os.write(read);
                            }
                        }
                    }
                } else {
                    filename = null;
                }

                request.setAttribute("nomeImg", filename);
            } catch (FileNotFoundException | NullPointerException ex) {
                Logger.getLogger(imagem.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            request.setAttribute("mensagem", ex.getMessage());
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
