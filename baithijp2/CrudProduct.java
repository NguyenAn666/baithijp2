package Assigiment2.baithijp2;

import Assigiment2.Assigiment2.Assigiment2.com.t2108M.companyname.project.connection.MssqlConnection;
import Assigiment2.Assigiment2.Assigiment2.com.t2108M.companyname.project.enties.Product;
import Assigiment2.baithijp2.InterProduct;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CrudProduct implements InterProduct {

    Connection connection = MssqlConnection.getMssqlConnection();
    public static final String SQL_INSERT = "insert into product values(?,?,?,?)";
    private static final String SQL_SAVE = "update product set name = ?,author = ?,price =? "+"where id = ?";
    private static final String SQL_SELECT = "select * from product";


    public CrudProduct() throws SQLException, ClassNotFoundException {
    }

    @Override
    public int insert(Product product) throws SQLException {
        if (product.getBookName()==null) {
            return 0;
        }
        PreparedStatement preparedStatement = null;
        int result=0;
        preparedStatement = connection.prepareStatement(SQL_INSERT);
        preparedStatement.setInt(1,product.getBookId());
        preparedStatement.setString(2,product.getBookName());
        preparedStatement.setString(3,product.getAuthor());
        preparedStatement.setInt(4, (int) product.getPrice());
        result = preparedStatement.executeUpdate();
        return result;
    }

    @Override
    public int save(Product product) throws SQLException {
        if (product.getBookName()==null) {
            return 0;
        }
        PreparedStatement preparedStatement = null;
        int result = 0;
        preparedStatement = connection.prepareStatement(SQL_SAVE);
        preparedStatement.setInt(1,product.getBookId());
        preparedStatement.setString(2,product.getBookName());
        preparedStatement.setString(3,product.getAuthor());
        preparedStatement.setInt(4, (int) product.getPrice());
        result = preparedStatement.executeUpdate();
        return result;

    }

    @Override
    public Product select(int BookId) throws SQLException {
        return null;
    }

    @Override
    public List<Product> getAll() throws SQLException {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Product> product = new ArrayList<>();
        preparedStatement = connection.prepareStatement(SQL_SELECT);
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            int id =  resultSet.getInt("BookId");
            String name =  resultSet.getString("BookName");
            String author=   resultSet.getString("Author");
            int price=  resultSet.getInt("Price");
            System.out.println("BookId: " + id + " BookName : "+ name+ " Author : "+ author+ " Price : " + price);
        }
        return product;
    }
}