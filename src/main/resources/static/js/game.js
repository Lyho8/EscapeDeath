var app = angular.module('game', ['ngSanitize', 'ngRoute']);

app.controller('roomCtrl', function($scope, $http, $sce) {
    $http.get("/rooms")
    .then(function(response) {
    	$scope.rooms = '<div class="buttons">'
    	var rooms = response.data
    	for(var i=0; i<rooms.length; ++i){
    		$scope.rooms += '<a class="button is-info">'+rooms[i].name+'</a>'
    	}
    	$scope.rooms += '</div>'
    	$sce.trustAsHtml($scope.rooms)
        //$scope.rooms = response.data;
    });
});