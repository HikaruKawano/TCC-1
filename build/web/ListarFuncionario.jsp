<%@page import="model.Funcionario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="img/logo_navegador.jpeg">
        <title>Funcionários</title>
    </head>
    <body>
    <div>
        <h1>Funcionarios</h1>
        
        <div>
        <hr/>
        <a href="NovoFuncionario">Novo</a>
        <a href="index.jsp">Voltar</a>
        <hr/>
        <% List<Funcionario> lista = (List<Funcionario>) request.getAttribute("funcionarios"); %>
        <table>
            <thead>
                <tr>
                    <th>Nome</th>
                    <th>CPF</th>
                    <th>Email</th>
                    <th>Gênero</th>
                    <th>Cargo</th>
                </tr>
            </thead>
            <tbody>
                <%
                    for (Funcionario funcionario : lista) {
                %>
                <tr>
                    <td><%= funcionario.getNomePessoa()%></td>
                    <td><%= funcionario.getCpfPessoa()%></td>
                    <td><%= funcionario.getEmailPessoa()%></td>
                    <td><%= funcionario.getGeneroPessoa()%></td>
                    <td><%= funcionario.getCargo()%></td>
                    <td><a href="consultaFuncionario?idpessoa=<%= funcionario.getIdFuncionario()%>">Alterar</a></td>
                    <td><a href="excluirFuncionario?idpessoa=<%= funcionario.getIdFuncionario()%>">Excluir</a></td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>
      </div>
    </div>
    </body>
</html>
