/**
 * Created by markfredchen on 5/29/15.
 */
'use strict';
angular.module('hcmApp')
    .controller('Oauth2Controller', function ($scope, $location) {
        $scope.requestParam = $location.search();

    });
