package Assigiment2.baithijp2;



import Assigiment2.Assigiment2.Assigiment2.com.t2108M.companyname.project.enties.Product;

import java.sql.SQLException;
import java.util.List;

    public interface InterProduct {
        public int insert (Product product) throws SQLException;
        public int save (Product product) throws  SQLException;
        public Product select (int BookId) throws SQLException;
        public List<Product> getAll() throws SQLException;
    }

