angular.module('rest',['ngResource'])
.factory('resourceAppointment',function($resource){

	return $resource('api/appointments/:id',null,{
		update:{
			method:'PUT'
		}
	});

});