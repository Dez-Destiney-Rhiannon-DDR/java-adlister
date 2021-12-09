package com.codeup.adlister.dao;

<<<<<<< HEAD
import com.codeup.adlister.Config;
=======

import com.codeup.adlister.Config;

>>>>>>> 131eabf3bb890b0653a2f4ac2a0a6dc267ea7bc7
import com.codeup.adlister.models.Ad;
import com.mysql.cj.jdbc.Driver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection = null;

    public MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                config.getUrl(),
<<<<<<< HEAD
                config.getUsername(),
=======

                config.getUsername(),

>>>>>>> 131eabf3bb890b0653a2f4ac2a0a6dc267ea7bc7
                config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    @Override
<<<<<<< HEAD
=======

>>>>>>> 131eabf3bb890b0653a2f4ac2a0a6dc267ea7bc7
    public List<Ad> all() { //retrieving all ads, refactored to use prepared statements
        Statement stmt = null;
        ResultSet resultSet = null;
        String myQuery = "SELECT * FROM mangas";
        try {
            PreparedStatement statement = connection.prepareStatement(myQuery);
            resultSet = statement.executeQuery();
            return createAdsFromResults(resultSet);
<<<<<<< HEAD
=======

>>>>>>> 131eabf3bb890b0653a2f4ac2a0a6dc267ea7bc7
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving all ads.", e);
        }
    }

    @Override
<<<<<<< HEAD
=======

>>>>>>> 131eabf3bb890b0653a2f4ac2a0a6dc267ea7bc7
    public Long insert(Ad ad) { //Inserting ad into db, refactored to use prepared statements
        try {
            String sql = "INSERT INTO mangas(user_id, title, description) VALUES (?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
<<<<<<< HEAD
=======

>>>>>>> 131eabf3bb890b0653a2f4ac2a0a6dc267ea7bc7
            stmt.setLong(1, ad.getUserId());
            stmt.setString(2, ad.getTitle());
            stmt.setString(3, ad.getDescription());
            stmt.executeUpdate();
<<<<<<< HEAD
            ResultSet generatedIdResultSet = stmt.getGeneratedKeys();
            generatedIdResultSet.next(); /* allows user input to actually be POSTED to ads */
            return generatedIdResultSet.getLong(1);
=======

            ResultSet generatedIdResultSet = stmt.getGeneratedKeys();
            generatedIdResultSet.next(); /* allows user input to actually be POSTED to ads */
            return generatedIdResultSet.getLong(1);
          
>>>>>>> 131eabf3bb890b0653a2f4ac2a0a6dc267ea7bc7
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new ad.", e);
        }
    }

<<<<<<< HEAD
=======

>>>>>>> 131eabf3bb890b0653a2f4ac2a0a6dc267ea7bc7
    private String createInsertQuery(Ad ad) {
        return "INSERT INTO ads(user_id, title, description) VALUES "
            + "(" + ad.getUserId() + ", "
            + "'" + ad.getTitle() +"', "
            + "'" + ad.getDescription() + "')";
    }

<<<<<<< HEAD
=======

>>>>>>> 131eabf3bb890b0653a2f4ac2a0a6dc267ea7bc7
    private Ad extractAd(ResultSet rs) throws SQLException {
        return new Ad(
            rs.getLong("id"),
            rs.getLong("user_id"),
            rs.getString("title"),
            rs.getString("description")
        );
    }

    private List<Ad> createAdsFromResults(ResultSet rs) throws SQLException {
        List<Ad> ads = new ArrayList<>();
        while (rs.next()) {
            ads.add(extractAd(rs));
        }
        return ads;
    }
}
