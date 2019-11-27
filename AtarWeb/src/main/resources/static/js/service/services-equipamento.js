
app.service('EquipamentoCRUDService', ['$http', function ($http) {

    this.addEquipamento = function addEquip(equipamento) {   
        return $http({
            method: 'POST',
            url: 'http://vps17465.publiccloud.com.br:8080/AtarWeb/atar/cadastrar-equipamento',
            data: {
            	marca : equipamento.marca,
            	modelo : equipamento.modelo            	
            }
        });
    }

    this.updateEquipamento = function addEquip(equipamento) {   
        return $http({
            method: 'POST',
            url: 'http://vps17465.publiccloud.com.br:8080/AtarWeb/atar/cadastrar-equipamento/alterar',
            data: {
            	marca : equipamento.marca,
            	modelo : equipamento.modelo,
            	id : equipamento.id
            }
        });
    }
    
    this.getAllEquipamentos = function getAllEquipamentos() {
        return $http({
            method: 'GET',
            url: 'http://vps17465.publiccloud.com.br:8080/AtarWeb/atar/cadastrar-equipamento/listar-equipamento'
        });
    } 
    
    this.deleteEquipamento = function deleteEquipamento(equipamento) {
  	  return $http({
            method: 'POST',
            url: 'http://vps17465.publiccloud.com.br:8080/AtarWeb/atar/cadastrar-equipamento/excluir',
            data: {
            	id : equipamento.id
            }
        });
    }



}]);