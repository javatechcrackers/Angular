var myapp = angular.module("myModule", []);


myapp.controller("myctrl", function($scope,$rootScope){
	 $scope.name="Ravi";
	 $scope.designation = "Analyst";
	 $rootScope.company1="PFG";

});


myapp.controller("myctrl2", function($scope,$rootScope){
	 $scope.name="Ravi Katiyar";
	 $scope.designation = "Analyst";
	 $rootScope.company2="igate";

});