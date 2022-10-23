package dao;

import model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.Conexao;
        
        public class ClienteDAO implements DAOGenerica{
            
      
        private final Connection conexao;
        public ClienteDAO()throws SQLException, ClassNotFoundException  {
         conexao = Conexao.abrirConexao();
        }

    @Override
    public void cadastrar(Object objeto) throws SQLException {
    String sql = "call cadastrarcliente(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
       Cliente cliente = (Cliente) objeto;
        PreparedStatement stmt = null;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, cliente.getIdCliente());
            stmt.setString(2, cliente.getNomePessoa());
            stmt.setString(3,cliente.getCpfPessoa());
            stmt.setString(4, cliente.getDataNascimentoPessoa());  
            stmt.setString(5, cliente.getCepPessoa());
            stmt.setString(6, cliente.getCidadePessoa());
            stmt.setString(7, cliente.getBairroPessoa()); 
            stmt.setString(8, cliente.getNumeroPessoa());
            stmt.setString(9, cliente.getComplementoPessoa());
            stmt.setString(10, cliente.getEstadoPessoa());
            stmt.setString(11, cliente.getTelefonePessoa());
            stmt.setString(12, cliente.getEmailPessoa());
            stmt.setString(13, cliente.getGeneroPessoa());
            stmt.setString(14,cliente.getSenhaPessoa());
            stmt.setString(15,cliente.getLogouPessoa());
            
            stmt.execute();
        } catch (SQLException ex) {
            throw new SQLException("Erro ao gravar cliente");
            } finally {
            Conexao.encerrarConexao(conexao, stmt);
        }
    }

    @Override
    public void excluir(int idCliente) throws SQLException {
        String sql = "delete from cliente where idcliente = ?";
        PreparedStatement stmt = null;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idCliente);
            stmt.execute();
        } catch (SQLException ex) {
            throw new SQLException("Erro ao excluir Cliente");
        } finally {
            Conexao.encerrarConexao(conexao, stmt);
        }
    }

    public Object adotar(int codigoCliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Object> listar() throws SQLException {
        String sql = "select * from cliente";
                        PreparedStatement stmt = null;
                        ResultSet rs = null;
                        List<Object> lista = new ArrayList<>();
                         try {
                            stmt = conexao.prepareStatement(sql);
                            rs = stmt.executeQuery();
                            while (rs.next()) {
                               Cliente cliente = new Cliente(rs.getInt("idCliente"), rs.getString("nomeCliente"), rs.getString("dataNascimentoCliente"), rs.getString("cepCliente"), rs.getString("cidadeCliente"), rs.getString("bairroCliente"), rs.getString("numeroCliente"), rs.getString("complementoCliente"), rs.getString("estadoCliente"), rs.getString("telefoneCliente"), rs.getString("emailCliente"),  rs.getString("generoCliente"));
                              lista.add(cliente);
                                }
                            } catch (SQLException ex) {
                                throw new SQLException("Erro ao listar ");
                            } finally {
                                Conexao.encerrarConexao(conexao, stmt, rs);
                            }
                              return lista;       
    }

    @Override
    public Object consultar(int codigo) throws SQLException {
        String sql = "select * from cliente where idcliente = ?";
                       Cliente cliente = null;
                       PreparedStatement stmt = null;
                       ResultSet rs = null;
                       try {
                           stmt = conexao.prepareStatement(sql);
                           stmt.setInt(1, codigo);
                           rs = stmt.executeQuery();
                           while (rs.next()) {
                                cliente = new Cliente(rs.getInt("idpessoa"), rs.getString("nomepessoa"), rs.getString("ceppessoa"), rs.getString("cidadepessoa"), rs.getString("bairropessoa"), rs.getString("numeropessoa"), rs.getString("complementopessoa"), rs.getString("estadopessoa"), rs.getString("telefonepessoa"), rs.getString("emailpessoa"),  rs.getString("generopessoa"), rs.getString("senhapessoa"));
                           }
                       } catch (SQLException ex) {
                           throw new SQLException("Erro ao consultar cliente");
                       } finally {
                           Conexao.encerrarConexao(conexao, stmt, rs);
                       }
                       return cliente; 
    }
    }

    
        
       
        
        
