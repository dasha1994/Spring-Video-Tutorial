package spring.video.tutorial.jdbc.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import spring.video.tutorial.jdbc.MP3;
import spring.video.tutorial.jdbc.dao.MP3Dao;


import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
@Component("H2Dao")
public class H2Dao implements MP3Dao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    @Override
    public void insert(MP3 mp3) {
        String sql = "INSERT INTO mp3 ( name, author) VALUES (?,?)";
        jdbcTemplate.update(sql, new Object[]{mp3.getName(),mp3.getAuthor()});
    }

    public void insertWithJDBC(MP3 mp3){
        Connection conn = null;

        try{
            Class.forName("org.h2.Driver");
            String url = "jdbc:h2:mem:testdb";
            conn = DriverManager.getConnection(url,"","");
        }catch (ClassNotFoundException e1){
                e1.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String sql = "insert into mp3 (name, author) VALUES (?,?)";

        try{
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1,mp3.getName());
            preparedStatement.setString(2,mp3.getAuthor());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            if(conn != null){
                try{
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    @Override
    public void delete(MP3 mp3) {

    }

    @Override
    public MP3 getMP3ById(int id) {
        return null;
    }

    @Override
    public List<MP3> getMP3ListByName(String name) {
        return null;
    }

    @Override
    public List<MP3> getMP3ListByAuthor(String author) {
        return null;
    }
}
