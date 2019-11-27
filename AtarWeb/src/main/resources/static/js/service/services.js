
app.service('ClienteCRUDService', ['$http', function ($http) {

    this.addCliente = function addUser(cliente) {   
        return $http({
            method: 'POST',
            url: 'http://vps17465.publiccloud.com.br:8080/AtarWeb/atar/cadastrar-cliente',
            data: {
            	nome : cliente.nome,
            	endereco : cliente.endereco,
                telefone : cliente.telefone
                
            }
        });
    }
    
    this.updateCliente = function addClie(cliente) {   
        return $http({
            method: 'POST',
            url: 'http://vps17465.publiccloud.com.br:8080/AtarWeb/atar/cadastrar-cliente/alterar',
            data: {
            	nome : cliente.nome,
            	endereco : cliente.endereco,
            	telefone : cliente.telefone,
            	id : cliente.id
            }
        });
    }

    this.getAllClientes = function getAllClientes() {
        return $http({
            method: 'GET',
            url: 'http://vps17465.publiccloud.com.br:8080/AtarWeb/atar/cadastrar-cliente/listar-cliente'
        });
    } 

    this.deleteCliente = function deleteCliente(cliente) {
  	  return $http({
            method: 'POST',
            url: 'http://vps17465.publiccloud.com.br:8080/AtarWeb/atar/cadastrar-cliente/excluir',
            data: {
            	id : cliente.id
            }
        });
  }

}]);