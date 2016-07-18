var myApp = angular.module('module', []);
myApp.controller('controller', function($scope) {
	//var view = this;
	var customer = {
		name: "John Snow",
		demand: "WinterFell"
	}
	$scope.customer = customer;
});