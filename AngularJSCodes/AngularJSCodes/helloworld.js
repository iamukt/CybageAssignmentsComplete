var module = angular.module('module', []);

module.controller('controller', function($scope){
	var countries = [
	{name : "India"},
	{name : "USA"},
	{name : "MEXICO"},
	{name : "Poland"} 
	];
	
	$scope.student = {
		firstname: "mahesh",
		lastname: "parmar",
		fullname2 : this.firstname+" "+this.lastname,
		/*dummyvar: (function () {
			
		}()),*/
		fullname: function() {
			var studentObject;
			studentObject = $scope.student;
			return studentObject.firstname;
		}
		
	};
	$scope.countries = countries;
	$scope.message = 'welcome to the world of Angular JS';

	$scope.friends = [
    {name: 'John',   phone: '555-1212',  age: 10},
    {name: 'Mary',   phone: '555-9876',  age: 19},
    {name: 'Mike',   phone: '555-4321',  age: 21},
    {name: 'Adam',   phone: '555-5678',  age: 35},
    {name: 'Julie',  phone: '555-8765',  age: 29}
  ];


});

