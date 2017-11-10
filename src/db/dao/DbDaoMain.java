package db.dao;

import db.dao.dblogic.ProductDbDao;
import db.dao.domains.Product;
import db.dao.interfaces.Dao;

public class DbDaoMain {
    public static void main(String[] args) {
        Dao<Product> productDAO = new ProductDbDao();
        productDAO.create(new Product(1, "aaa", "bbb", 10));
        productDAO.create(new Product(2, "aaa", "bbb", 20));
        productDAO.create(new Product(3, "aaa", "bbb", 30));
        productDAO.create(new Product(4, "aaa", "bbb", 40));
        workWithProducts(productDAO);
    }

    private static void workWithProducts(Dao<Product> productDAO) {
        Product product = productDAO.findById(3);
        System.out.println("id = 3:" + product);
        product.setName("Crocodile");
        productDAO.update(product);
        System.out.println("after croco update: " + productDAO.findAll());
        productDAO.delete(product);
        productDAO.create(new Product(5, "Giraffe", "African animal", 111111));
        System.out.println("after croco delete and giraffe insert: " + productDAO.findAll());
    }
}