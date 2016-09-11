/**
 * Created by Ayoub on 08/09/2016.
 */
materialAdmin.factory("productFactory",function($http) {

    var baseURL = "http://localhost:8080/product";
    var productFactory = {};
    productFactory.findAll = function () {

        return $http.get(baseURL + "/products");
    },
        productFactory.findById = function (id) {
            console.log(id);
            return $http.get(baseURL + "?id=" + id);
        },

        productFactory.update = function (product) {
            return $http.put(baseURL, product);

        },
        productFactory.delete = function (id) {

            return $http.delete(baseURL + "?id=" + id);
        },

        productFactory.create = function (product) {

            return $http.post(baseURL, product);
        }
    return productFactory;
});