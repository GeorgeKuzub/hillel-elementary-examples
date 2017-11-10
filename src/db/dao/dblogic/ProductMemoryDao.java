package db.dao.dblogic;

import db.dao.domains.Product;
import db.dao.interfaces.Dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductMemoryDao implements Dao<Product> {
    private Map<Integer, Product> products = new HashMap<>();

    @Override
    public boolean create(Product product) {
        products.put(product.getId(), product);
        return true;
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(Product product) {
        create(product);
    }

    @Override
    public void delete(Product product) {
        products.remove(product.getId());
    }

    @Override
    public void deleteAll() {
        products.clear();
    }
}
