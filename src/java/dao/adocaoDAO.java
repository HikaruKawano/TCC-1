package dao;

import utils.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.Adocao;
import model.Pet;

        public class adocaoDAO implements DAOGenerica{
            
      
        private final Connection conexao;
        public adocaoDAO()throws SQLException, ClassNotFoundException  {
         conexao = Conexao.abrirConexao();
        }

    @Override
    public void cadastrar(Object objeto) throws SQLException {
    String sql = "call cadastrarPet(?,?,?,?,?,?,?,?)";
       Adocao adocao = (Adocao) objeto;
        PreparedStatement stmt = null;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.execute();
        } catch (SQLException ex) {
            throw new SQLException("Erro ao cadastrar Adoção");
        } finally {
            Conexao.encerrarConexao(conexao, stmt);
        }
    }

    @Override
    public Object consultar(int codigo) throws SQLException {
        String sql = "select * from pet where idpet = ?";
        Pet pet = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, codigo);
            rs = stmt.executeQuery();
            while (rs.next()) {
                pet = new Pet(rs.getInt("idpet"), rs.getString("nomepet"), rs.getString("racapet"), rs.getString("idadepet"), rs.getString("especiepet"), rs.getString("corespet"),  rs.getString("sexopet"),  rs.getString("portepet"),rs.getString("observacoes"));
            }
        } catch (SQLException ex) {
            throw new SQLException("Erro ao consultar pet");
        } finally {
            Conexao.encerrarConexao(conexao, stmt, rs);
        }
        return pet;
    }    

    @Override
    public List<Object> listar() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void excluir(int codigo) throws SQLException {
        String sql = "delete from Pet where idPet = ?";
        PreparedStatement stmt = null;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, codigo);
            stmt.execute();
        } catch (SQLException ex) {
            throw new SQLException("Erro ao excluir Pet");
        } finally {
            Conexao.encerrarConexao(conexao, stmt);
        }    
    }
}
