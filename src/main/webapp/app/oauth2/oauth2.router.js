/**
 * Created by markfredchen on 5/29/15.
 */
'use strict';
angular.module('hcmApp')
    .config(function($stateProvider){
        $stateProvider.state('oauth2', {
            url: '/oauth2.do',
            templateUrl: './app/oauth2/oauth2.tpl.html',
            controller: 'Oauth2Controller'
        })
    });
