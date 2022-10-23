 rs.getString("dataNascimentoCliente"),<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" href="img/logo_navegador.jpeg">
    <link rel="stylesheet" href="css/formulario.css">
    <title>Cadastro Funcionário</title>
    <script src="js/buscaCep.js" type="text/javascript"></script>
</head>

<body>
    <div class="container">
        <div class="form">
            <form action="CadastrarFuncionario" method="post">
                <div class="form-header">
                    <div class="title">
                        <h1>Cadastrar funcionario</h1>
                    </div>           
                </div>
            <div class="input-group">
                <div class="group-1">
                    <input name="idpessoa" id="idpessoa" type="text" readonly value="${funcionario.idpessoa > 0 ? funcionario.idpessoa : ""}" hidden/>
                
                    <div class="input-box">
                        <label for="nomepessoa">Nome Completo</label>
                        <input id="nomepessoa" type="text" name="nomepessoa" placeholder="Digite seu nome" required  value="${funcionario.nomepessoa}">
                    </div>       
                    <div class="input-box">
                        <label for="cpfpessoa">CPF</label>
                        <input id="cpfpessoa" type="text" name="cpfpessoa" placeholder="Digite seu Cpf" required  value="${funcionario.cpfpessoa}">
                    </div>
                    <div class="input-box">
                        <label for="datanascimentopessoa">Data de Nascimento</label>
                        <input id="datanascimentopessoa" type="date" name="dataNascimentopessoa" required  value="${funcionario.dataNascimentopessoa}">
                    </div>
                    <div class="input-box">
                        <label for="cep">CEP</label>
                        <input id="cep" type="text" name="ceppessoa" placeholder="Digite seu CEP" required  value="${funcionario.ceppessoa}">
                    </div>
                    <div class="input-box">
                        <label for="cidade">Cidade</label>
                        <input id="cidade" type="text" name="cidadepessoa" placeholder=" Digite sua cidade" required  value="${funcionario.cidadepessoa}">
                    </div> 
                    <div class="input-box">
                        <label for="bairro">Bairro</label>
                        <input id="bairro" type="text" name="bairropessoa" placeholder="Digite seu bairro" required  value="${funcionario.bairropessoa}">
                    </div>
                    <div class="input-box">
                        <label for="numero">Número</label>
                        <input id="numero" type="text" name="numeropessoa" placeholder="Digite o número de sua casa" required  value="${funcionario.numeropessoa}">
                     </div> 
                     <div class="input-box">
                        <label for="complemento">Complemento</label>
                        <input id="complemento" type="text" name="complementopessoa" placeholder="Complemento do seu endereço" required  value="${funcionario.complementopessoa}">
                     </div> 
                      <div class="input-box">
                        <label for="uf" name="estadopessoa">Estado</label>
                            <select id="uf">
                                <option value="AC">Acre</option>
                                <option value="AL">Alagoas</option>
                                <option value="AP">Amapá</option>
                                <option value="AM">Amazonas</option>
                                <option value="BA">Bahia</option>
                                <option value="CE">Ceará</option>
                                <option value="DF">Distrito Federal</option>
                                <option value="ES">Espírito Santo</option>
                                <option value="GO">Goiás</option>
                                <option value="MA">Maranhão</option>
                                <option value="MT">Mato Grosso</option>
                                <option value="MS">Mato Grosso do Sul</option>
                                <option value="MG">Minas Gerais</option>
                                <option value="PA">Pará</option>
                                <option value="PB">Paraíba</option>
                                <option value="PR">Paraná</option>
                                <option value="PE">Pernambuco</option>
                                <option value="PI">Piauí</option>
                                <option value="RJ">Rio de Janeiro</option>
                                <option value="RN">Rio Grande do Norte</option>
                                <option value="RS">Rio Grande do Sul</option>
                                <option value="RO">Rondônia</option>
                                <option value="RR">Roraima</option>
                                <option value="SC">Santa Catarina</option>
                                <option value="SP">São Paulo</option>
                                <option value="SE">Sergipe</option>
                                <option value="TO">Tocantins</option>
                            </select>
                    </div>
                     
                </div>
                <div class="group-2"> 
                      <div class="input-box">
                        <label for="telefonepessoa">Celular</label>
                        <input id="telefonepessoa" type="tel" name="telefonepessoa" placeholder="(xx) xxxx-xxxx" required  value="${funcionario.telefonepessoa}">
                    </div>
                    <div class="input-box">
                        <label for="emailpessoa">E-mail</label>
                        <input id="emailpessoa" type="email" name="emailpessoa" placeholder="Digite seu e-mail" required  value="${funcionario.emailpessoa}">
                    </div>                      
                    <div class="input-box">
                        <label for="Fotp">Foto</label>
                        <input id="Foto" type="file" name="Foto" placeholder="" required>
                    </div>
                    <div class="input-box">
                        <label for="cargo">Cargos</label>
                        <input id="cargo" type="text" name="cargo" placeholder="Digite um Cargo" required  value="${funcionario.cargo}">
                    </div>   
                    <div class="input-box">
                        <label for="senhapessoa">Senha</label>
                        <input id="senhapessoa" type="password" name="senhapessoa" placeholder="Digite sua senha" required >
                    </div>
                    <div class="input-box">
                        <label for="senhapessoa">Confirme sua Senha</label>
                        <input id="senhapessoa" type="password" name="senhapessoa" placeholder="Repita sua senha" required >
                    </div>
                </div>
               
            </div>

                <div class="gender-inputs">
                    <div class="gender-title">
                        <h6>Gênero</h6>
                    </div>

                    <div class="gender-group">
                        <div class="gender-input">
                            <input id="generopessoa" type="radio" name="generopessoa" value="Feminino"${funcionario.generopessoa}">
                            <label for="generopessoa">Feminino</label>
                        </div>

                        <div class="gender-input">
                            <input id="generopessoa" type="radio" name="generopessoa" value="Masculino"${funcionario.generopessoa}">
                            <label for="generopessoa">Masculino</label>
                        </div>

                        <div class="gender-input">
                            <input id="generopessoa" type="radio" name="generopessoa" value="Outros" ${funcionario.generopessoa}">
                            <label for="generopessoa">Outros</label>
                        </div>

                        <div class="gender-input">
                            <input id="generopessoa" type="radio" name="generopessoa" value="Prefiro não dizer"${funcionario.generopessoa}">
                            <label for="generopessoa">Prefiro não dizer</label>
                        </div>
                    </div>
                </div>

                <div class="continue-button">
                    <button type="submit">Cadastrar</button>
                </div>
            </form>
        </div>
    </div>
</body>

</html>