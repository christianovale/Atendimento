<html ng-app="crudAtendimento">
<head>
    <script type="text/javascript" src="js/angular.min.js"></script>
	<script type="text/javascript"  src="js/angular-resource.min.js"></script>
    <script type="text/javascript"  src="js/angular.min.js.map"></script>
    <script type="text/javascript"  src="js/angular-resource.min.js.map"></script>
	<script type="text/javascript"  src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
	<script type="text/javascript"  src="js/controller.js"></script>
	<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" >
	
</head>
	<body>
		<div ng-controller="AtendimentoController" class="well" style="width: 700px; margin-top: 60px; margin-left: auto; margin-right: auto;">
			<table>
				<tr class="row">
				<td class="col-xs-2"> <button class="btn btn-default" ng-click="novo()">Novo</button> </td>
				<td class="col-xs-3"> <button class="btn btn-default" ng-click="salvar()">Salvar</button> </td>
				<td class="col-xs-2"> <button class="btn btn-default" ng-click="editar()">Editar</button> </td>
				<td class="col-xs-4"> <button class="btn btn-default" ng-click="exlcuir()">Excluir</button> </td>
				</tr>
			</table>
			
			<hr/>
			
			<form name="atendimentoForm" class="form-inline">
				<table>
					<tr class="row"> 
						<td class="col-xs-2">Protocolo:</td>
						<td class="col-xs-3"><input type="text" style="width: 100px;" ng-model="atendimento.protocolo"/> </td>
					</tr>
					<tr class="row"> 
						<td class="col-xs-2">Nome Cliente:</td>
						<td class="col-xs-3"><input type="text" style="width: 100px;" ng-model="atendimento.nomeCliente"/> </td>
					</tr>
					<tr class="row"> 
						<td class="col-xs-2">Detalhamento:</td>
						<td class="col-xs-3"><input type="text" style="width: 100px;" ng-model="atendimento.detalhamento"/> </td>
					</tr>
					<tr class="row"> 
						<td class="col-xs-2">Nota Atendimento:</td>
						<td class="col-xs-3"> <select name="selectFacilityId" ng-model="atendimento.atendimentoEnum">
							<option value="">Selcione</option>
							<option value="Excelente">Excelente</option>
							<option value="Otimo">Otimo</option>
							<option value="Bom">Bom</option>
							<option value="Ruim">Ruim</option>
							</select> </td>
					</tr>
				</table>
			</form>
			
			<hr/>
			
			<input type="text" class="form-control" ng-model="criterio" placeholder="O que está procurando?"/><br/>
			
			<table class="table table-striped">
				<tr>
					<th>Nome Cliente</th>
					<th> Protocolo </th>
					<th>Detalhamento</th>
					<th>Nota Atendimento</th>
				</tr>
				<tr ng-repeat="atendimento in atendimentos | filter:criterio" ng-click="seleciona(atendimento)">
					<td>{{atendimento.nomeCliente}}</td>
					<td>{{atendimento.protocolo}}</td>
					<td>{{atendimento.detalhamento}}</td>
					<td>{{atendimento.atendimentoEnum}}</td>
				</tr>
			</table>
			

		
		</div>
	</body>
</html>
