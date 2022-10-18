package dao;

import utils.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class proprietarioDAO implements DAOGenerica {
    
    private final Connection conexao;
    
        public proprietarioDAO()throws SQLException, ClassNotFoundException  {
         conexao = Conexao.abrirConexao();
         
    }

    @Override
    public void cadastrar(Object objeto) throws SQLException {
        String sql = "call CadastrarProprietario(?,?,?,?,?,?,?,?)";
     
    }

    @Override
    public Object consultar(int codigo) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Object> listar() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void excluir(int codigo) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
