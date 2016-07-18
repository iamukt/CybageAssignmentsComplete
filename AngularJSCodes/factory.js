myApp = angular.module('myApp', []);

myApp.factory('multFact', function(){
		var factory = {};
		factory.multiply = function(a)
		{
			return a*a;
		}
		factory.add = function(a)
		{
			return a + a;
		}
		return factory;
		
});

myApp.service('calcService', function(multFact){
	this.square = function(a)
	{
		return multFact.multiply(a);
	}

	this.add = function(a)
	{
		return multFact.add(a);
	}	
	
});
myApp.controller('controller', function($scope, calcService){
	$scope.square = function()
	{
		 $scope.resultSquare = calcService.square($scope.number);	
	}

	$scope.add = function()
	{
		$scope.resultAdd = calcService.add($scope.number);
	}
});