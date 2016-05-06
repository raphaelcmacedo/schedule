angular.module('main').controller('AppointmentController', function($scope, resourceAppointment){
	
	$scope.appointments = [];
	$scope.appointment = {};

	resourceAppointment.query(function(appointments){
		$scope.appointments = appointments;
	}, function(error){
		console.log(error);
	});
	
	$scope.getById = function(){
		var param = {id: document.getElementById("filter").value};
		resourceAppointment.get(param, function(appointment){
			$scope.appointment = appointment;
		}, function(error){
			console.log(error);
		});
		
		
	}
	
});