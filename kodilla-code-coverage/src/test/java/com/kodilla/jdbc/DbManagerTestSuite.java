package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {

    @Test
    public void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assert.assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String countQuery = "SELECT COUNT(*) FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = 0;
        while(rs.next()) {
            count = rs.getInt("COUNT(*)");
        }
        String sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Zzara', 'Ali')";
        statement.execute(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Otman', 'Use')";
        statement.execute(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Mark', 'Boq')";
        statement.execute(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Uli', 'Wimer')";
        statement.execute(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Oli', 'Kosiv')";
        statement.execute(sql);

        //When
        String sqlQuery = "SELECT * FROM USERS";
        statement = dbManager.getConnection().createStatement();
        rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getInt("ID") +
                    rs.getString("FIRSTNAME") +
                    rs.getString("LASTNAME"));
            counter++;
        }
        int expected = count + 5;
        Assert.assertEquals(expected, counter);
        rs.close();
        statement.close();
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException {

        //Given
        DbManager dbManager = DbManager.getInstance();
        String countQuery = "SELECT USER_ID, COUNT(*) AS POST_NUMBER FROM POSTS GROUP BY USER_ID HAVING COUNT(*) >= 2";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = 0;
        while(rs.next()) {
            count = rs.getInt("USER_ID");
        }
        String sql = "INSERT INTO POSTS (USER_ID, BODY) VALUES (3, 'Test message1 from USER 3')";
        statement.execute(sql);
        sql = "INSERT INTO POSTS (USER_ID, BODY) VALUES (5, 'Test message2 from USER 5')";
        statement.execute(sql);

        //When
        String sqlQuery = "SELECT U.FIRSTNAME , U.LASTNAME, COUNT(*) AS POST_NUMBER FROM USERS U JOIN POSTS P ON U.ID = P.USER_ID GROUP BY P.USER_ID HAVING COUNT(*) >= 2";
        statement = dbManager.getConnection().createStatement();
        rs = statement.executeQuery(sqlQuery);
        int counter = 0;
        while(rs.next()) {
            System.out.println(
                    rs.getString("U.FIRSTNAME") +
                    rs.getString("U.LASTNAME"));
            counter++;
        }

        //Then
        Assert.assertEquals(count, counter);
        rs.close();
        statement.close();

    }

}

