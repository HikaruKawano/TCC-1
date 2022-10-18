<%@page import="model.Pet"%>
<%@page import="java.util.List"%>

<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="shortcut icon" href="img/logo_navegador.jpeg">
    <title>Home</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    <link rel="stylesheet" href="css/style.css">
    <script src="js/jquery-3.6.1.min.js" type="text/javascript"></script>
    <script src="js/listar.js" type="text/javascript"></script>
   
  </head>
  <body id="body">
    <nav class="navbar col-12  navbar-expand-lg navbar-dark" style="z-index: 999;">
        <div class="container-fluid col-11 m-auto">
          <img src="img/LogoComTexto.png" class="Logo col-2" alt="...">
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
              <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="#">Inicio</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">Como ajudar</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="CadastrarPet.jsp">Doar</a>
              </li>
              <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                  Sobre
                </a>
                <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                  <li><a class="dropdown-item" href="#">Contatos</a></li>
                  <li><a class="dropdown-item" href="#">Responsaveis</a></li>
                  <li><a class="dropdown-item" href="formulario.jsp">Cadastro Funcionário</a></li>
                  <li><a class="dropdown-item" href="ListarFuncionario">Lista dos Funcionarios</a></li>
                  <li><hr class="dropdown-divider"></li>
                  <li><a class="dropdown-item" href="razaoSocial.jsp">Razão social</a></li>
                </ul>
              </li>
              <a class="btn btn-primary" href="login_cadastro.jsp" role="button">Entrar</a>
            </ul>
            <form class="d-flex" role="search">
              <input class="form-control me-2" type="search" placeholder="Pesquisar nome do pet..." aria-label="Search">
              <button class="btn-buscar btn-success" type="submit">Buscar</button>
            </form>
              <div class="perfil">
              <img width="40px" src="img/seta.png" alt="alt"/>
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" id="perfil" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                Entrar
              </a>
              <ul class="dropdown-menu" aria-labelledby="perfil">
                  <li><a class="dropdown-item" href="#">Perfil</a></li>
                  <li><a class="dropdown-item" href="configuracoes.jsp">Configurações</a></li>
                  <li><a class="dropdown-item" href="reclamacao.jsp">Relatar um Problema</a></li>
                  <li><hr class="dropdown-divider"></li>
                  <li><a class="dropdown-item" href="razaoSocial.jsp">Sair</a></li>
                </ul>
            </li>
            </div>
          </div>
        </div>
      </nav>    
      <br>
      <div id="carouselExampleIndicators" class="carousel slide col-11" data-bs-ride="true">
        <div class="carousel-indicators ">
          <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
          <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
          <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
        </div>
        <div class="foto_escura"></div>
        <div class="carousel-inner" >
          <div class="carousel-item active">
            <img src="img/cathorroa.jpg" class="d-block w-100" alt="...">   
            <div class="carousel-caption d-none d-md-block">
              <h5>Projeto 4 patas</h5>
              <p>O olhar do seu cachorro e o melhor espelho da grandeza da sua alma.</p>
            </div>       
          </div>
          <div class="carousel-item">
            <img src="img/cathorroa.jpg" class="d-block w-100" alt="...">
            <div class="carousel-caption d-none d-md-block">
              <h5>Projeto 4 patas</h5>
              <p>O olhar do seu cachorro e o melhor espelho da grandeza da sua alma.</p>
            </div>
          </div>
          <div class="carousel-item">
            <img src="img/cathorroa.jpg" class="d-block w-100" alt="...">
            <div class="carousel-caption d-none d-md-block">
              <h5>Projeto 4 patas</h5>
              <p>O olhar do seu cachorro e o melhor espelho da grandeza da sua alma.</p>
            </div>
          </div>
        </div>
        <button class="carousel-control-prev carrossel-icone" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
          <span class="carousel-control-prev-icon" aria-hidden="true"></span>
          <span class="visually-hidden">Previous</span>
        </button>
        <button class="carousel-control-next carrossel-icone" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
          <span class="carousel-control-next-icon" aria-hidden="true"></span>
          <span class="visually-hidden">Next</span>
        </button>
      </div>
      <div class="btn-toolbar mb-3" role="toolbar" aria-label="Toolbar with button groups">
        <div class="btn-group me-2" role="group" aria-label="First group">
          <button type="button" class="btn btn_todos btn-outline" id="todos" value="todos" id="botao " onclick="Click ('todos')">Todos</button>
          <button type="button" class="btn btn-outline" id="cachorro" value="cachorro" onclick="Click ('cachorro')"> Cachorro</button>
          <button type="button" class="btn btn-outline" id="gato" value="gato" onclick="Click ('gato')">Gato    </button>
        </div>
      </div>
      
      <% List<Pet> lista = (List<Pet>) request.getAttribute("pets"); %>
        <%
           for (Pet pet : lista) {
        %>
      <div class="row row-cols-2 row-cols-md-3 col-10">
        <div class="col">
          <div class="card">
              
            <img src="img/c6ccc06e-3425-4f40-aaa2-c92228a086d1.jfif" class="card-img-top" alt="...">
            <div class="card-body">
                <h5 class="card-title"><%= pet.getNomePet()%></h5>
              <p class="card-text"><%= pet.getObservacoes()%></p>
            <!-- Button trigger modal -->
            <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#staticBackdrop">
                <a href="consultarPet?idpet=<%=pet.getIdPet()%>">ver mais</a> 
            </button>        
            </div>
          </div>
        </div>
      </div> 
        <%
           }
        %> 
           <!-- Modal -->   
            <div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
              <div class="modal-dialog">
                <div class="modal-content">
                  <div class="modal-header">
                    <h5 class="modal-title" id="staticBackdropLabel">${pet.idPet}</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                  </div>
                  <div class="modal-body">
                    
                    <img src="imgs/dog 2.jpg" class="img-thumbnail" alt="...">
                    <p class="card-text">Raça: ${pet.racaPet}</p>
                    <p class="card-text">Idade: ${pet.idadePet}</p>
                    <p class="card-text">Espécie: ${pet.especiePet}</p>
                    <p class="card-text">Cores: ${pet.coresPet}</p>
                    <p class="card-text">Sexo: ${pet.sexoPet}</p>
                    <p class="card-text">Porte: ${pet.portePet}</p>
                    <p class="card-text">Observacões: ${pet.observacoes}</p>
                  </div>
      <div class="modal-footer">
        <button class="btn btn-secondary" data-bs-dismiss="modal" >Sair</button>
        <button  class="btn btn-primary"><a href="consultarAdocao">Adotar</a></button>
     </div>
    </div>
   </div>
  </div>  
            
      <nav class="navegar" aria-label="Page navigation example">
        <ul class="pagination">
          <li class="page-item">
            <a  id="BackEnd" class="page-link" href="#" aria-label="Previous">
              <span aria-hidden="true">&laquo;</span>
            </a>
          </li>
          <li class="page-item"><a class="page-link" href="#">1</a></li>
          <li class="page-item"><a class="page-link" href="#">2</a></li>
          <li class="page-item"><a class="page-link" href="#">3</a></li>
          <li class="page-item">
            <a id="BackEnd" class="page-link" href="#" aria-label="Next">
              <span aria-hidden="true">&raquo;</span>
            </a>
          </li>
        </ul>
      </nav>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
    <script src="js/inicial.js" ></script>

    </body>
</html>