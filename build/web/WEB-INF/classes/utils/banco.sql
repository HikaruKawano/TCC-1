        create table pessoa(
            idPessoa serial not null primary key,
            nomePessoa varchar not null,            
            dataNascimentoPessoa varchar not null,
            cpfPessoa varchar not null,
            enderecoPessoa varchar not null,
            cidadePessoa varchar not null,
            estadoPessoa varchar not null,
            cepPessoa varchar not null,
            telefonePessoa varchar not null,
            emailPessoa varchar not null,
            generoPessoa varchar not null,
            senhaPessoa varchar not null
        );

        create table proprietario(cargo varchar not null) inherits (pessoa);

        create table funcionario(cargo varchar not null) inherits (pessoa);

        create table cliente() inherits (pessoa);

        create table pet(
            idPet serial not null primary key,
            idCliente int not null references cliente(idCliente),
            idFuncionario int not null references funcionario(idFuncionario),
            nomePet varchar not null,
            racaPet varchar not null,
            idadePet varchar not null,
            especiePet varchar not null,
            coresPet varchar not null,
            imgPet varchar not null,
            sexoPet varchar not null,
            portePet varchar not null,
            observacoes varchar not null
        );

        create table Adotar(
            idCliente int not null references cliente(idCliente),
            idFuncionario int not null references funcionario(idFuncionario)
        ) inherits(pet);

        create table cadastroImg(
          codigo serial not null,
          imagem varchar
        );

  
        -- PROCEDURE CADASTRO E CONSULTA DO FUNCIONARIO;


       create or replace procedure cadastrarfuncionario(id_pessoa int, nome_pessoa varchar, data_nascimento_pessoa varchar, cpf_pessoa varchar,  endereco_pessoa varchar, cidade_pessoa varchar, estado_pessoa varchar, cep_pessoa varchar, telefone_pessoa varchar, email_pessoa varchar, genero_pessoa varchar, senha_pessoa varchar, cargo varchar) as $$
            begin
                if id_pessoa > 0 then
                        update funcionario set nomepessoa = nome_pessoa, datanascimentopessoa = data_nascimento_pessoa, cpfpessoa = cpf_pessoa,  enderecopessoa = endereco_pessoa, cidadepessoa = cidade_pessoa, estadopessoa = estado_pessoa, ceppessoa = cep_pessoa, telefonepessoa = telefone_pessoa, emailpessoa = email_pessoa, generopessoa = genero_pessoa, senhapessoa = senha_pessoa, cargo = cargo where idpessoa = id_pessoa;   
                else
                    insert into funcionario values(DEFAULT, nome_pessoa, data_nascimento_pessoa, cpf_pessoa, endereco_pessoa, cidade_pessoa, estado_pessoa, cep_pessoa, telefone_pessoa, email_pessoa, genero_pessoa, senha_pessoa, cargo);
                end if;
            end;
        $$ language plpgsql;

        -- CALL PARA TESTE:
        
        CALL cadastrarfuncionario(0, 'tia', '20/04/1975', '17062006', 'rua 12', 'jales', 'sp', '15700555', '17996337704', 'fiacava123@gmail.com', 'feminino', '1234')


        -- PROCEDURE CADASTRO E CONSULTA DO CLIENTE;

        create or replace procedure cadastrarcliente(id_pessoa int, nome_pessoa varchar, data_nascimento_pessoa varchar, cpf_pessoa varchar, endereco_pessoa varchar, cidade_pessoa varchar, estado_pessoa varchar, cep_pessoa varchar, telefone_pessoa varchar, email_pessoa varchar, genero_pessoa varchar, senha_pessoa varchar) as $$
            begin
                if id_pessoa > 0 then
                        update cliente set nomepessoa = nome_pessoa, datanascimentopessoa = data_nascimento_pessoa, cpfpessoa = cpf_pessoa, enderecopessoa = endereco_pessoa, cidadepessoa = cidade_pessoa, estadopessoa = estado_pessoa, ceppessoa = cep_pessoa, telefonepessoa = telefone_pessoa, emailpessoa = email_pessoa, generopessoa = genero_pessoa, senhapessoa = senha_pessoa where idpessoa = id_pessoa;   
                else
                    insert into cliente values(DEFAULT, nome_pessoa, data_nascimento_pessoa, cpf_pessoa, endereco_pessoa, cidade_pessoa, estado_pessoa, cep_pessoa, telefone_pessoa, email_pessoa, genero_pessoa, senha_pessoa);
                end if;
            end;
        $$ language plpgsql;

        -- CALL PARA TESTE:

        CALL cadastrarcliente(0, 'juca', '17/06/2005', '151515151', 'rua 12', 'jales', 'sp', '15700555', '17996337704', 'fiacava123@gmail.com', 'feminino', '1234')


        -- PROCEDURE CADASTRO E CONSULTA DE PET;

        create or replace procedure cadastrarpet(id_pet int, nome_pet varchar, raca_pet varchar, idade_pet varchar, especie_pet varchar, cores_pet varchar, sexo_pet varchar, porte_pet varchar, observacoes_pet varchar) as $$
            begin
                if id_pet > 0 then
                    update pet set nomePet = nome_pet, racaPet = raca_pet, idadePet = idade_pet, especiePet = especie_pet, coresPet = cores_pet, sexoPet = sexo_pet, portePet = porte_pet, observacoes = observacoes_pet where idPet = id_pet;
                else
                    insert into pet values(default, nome_pet, raca_pet, idade_pet, especie_pet, cores_pet, sexo_pet, porte_pet, observacoes_pet);
                end if;
            end;
        $$ language plpgsql;

        -- CALL PARA TESTE:

        CALL cadastrarPet(1,'ana','vira-lata','2anos', 'gata', 'preto e branco', 'femea', 'pequena', 'linda, cheirosa, carinhosa e obediente');


        -- PROCEDURE DE USUARIO:


        create or replace view usuario as
        select pe.idpessoa as idusuario, pe.emailpessoa as emailusuario, pe.senhapessoa as senhausuario
        from pessoa pe inner join funcionario func on func.idpessoa = pe.idpessoa
        union
        select pe.idpessoa as idusuario, pe.emailpessoa as emailusuario, pe.senhapessoa as senhausuario
        from pessoa pe inner join cliente cli on cli.idpessoa = pe.idpessoa
	union
	select pe.idpessoa as idusuario, pe.emailpessoa as emailusuario, pe.senhapessoa as senhausuario
        from pessoa pe inner join proprietario prop on prop.idpessoa = pe.idpessoa