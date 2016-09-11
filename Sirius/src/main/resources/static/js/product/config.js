materialAdmin
    .config(function ($stateProvider, $urlRouterProvider){

        $stateProvider
        
            //------------------------------
            // product
            //------------------------------


            .state ('product', {
                url: '/product',
                templateUrl: 'layout/product/common'
            })

            .state('product.home', {
                url: '/home',
                templateUrl: 'product/home',
                resolve: {
                    loadPlugin: function($ocLazyLoad) {
                        return $ocLazyLoad.load ([
                            {
                                name: 'css',
                                insertBefore: '#app-level',
                                files: [
                                    'vendors/bower_components/fullcalendar/dist/fullcalendar.min.css',
                                ]
                            },
                            {
                                name: 'vendors',
                                insertBefore: '#app-level-js',
                                files: [
                                    'vendors/sparklines/jquery.sparkline.min.js',
                                    'vendors/bower_components/jquery.easy-pie-chart/dist/jquery.easypiechart.min.js',
                                    'vendors/bower_components/simpleWeather/jquery.simpleWeather.min.js'
                                ]
                            }
                        ])
                    }
                }
            })
            .state('product.table', {
                url: '/table',
                templateUrl: 'product/table',

            })


    });

