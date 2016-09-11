/**
 * Created by Ayoub on 08/09/2016.
 */

materialAdmin
    .controller('product-table', function($filter, $scope, ngTableParams, productFactory) {

function init(){
    $scope.products=[];
    productFactory.findAll().success(function(data)
    {
        Array.prototype.push.apply($scope.products,data);
        $scope.table.reload();
        console.log("products: ");
        console.log($scope.products);
    });
};
        init();

        $scope.table= this.table = new ngTableParams({
            page: 1,            // show first page
            count: 5 ,         // count per page
            sorting: {
                name: 'asc'     // initial sorting
            }
        }, {
            total: $scope.products.length, // length of data
            getData: function ($defer, params) {
                console.log("update datsa");
                params.total($scope.products.length);
                console.log("order: "+params.orderBy());
                console.log("filter: bellow");
                console.log(params.filter());

                $defer.resolve($scope.products.slice((params.page() - 1) * params.count(), params.page() * params.count()));
            }
        });





    });
