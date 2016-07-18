//Module
var myApp = angular.module("myModule",[]);

myApp.controller("myController",function ($scope) {
	var employee = {
		name: "Arya",
		lastname: "Stark"
	};
	$scope.message = "angular Js Intro";
	$scope.employee = employee;
});