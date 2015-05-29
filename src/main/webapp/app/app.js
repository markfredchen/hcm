/**
 * Created by markfredchen on 5/29/15.
 */
'use strict';
angular.module('hcmApp', ['ui.router'])
    .config(function ($urlRouterProvider, $stateProvider) {
        $urlRouterProvider.otherwise('/');
        $stateProvider.state('login', {
            url: '/',
            templateUrl: ''
        })
    });
