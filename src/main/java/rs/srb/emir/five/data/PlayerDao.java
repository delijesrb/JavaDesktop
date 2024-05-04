package rs.srb.emir.five.data;

import rs.srb.emir.five.ColorConverter;
import rs.srb.emir.five.Dao;

import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlayerDao implements Dao<Player> {

    public static final String URL = "jdbc:mysql://localhost:3306/players";
    public static final String USER = "root";
    public static final String PASSWORD = "Zoran2005";

    public List<Player> selectPlayers(){
        List<Player>players = new ArrayList<>();
        try (  Connection connection = DriverManager.getConnection(URL, USER, PASSWORD) ){
           String sqlStatement = "Select * from players";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlStatement);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String colorString = resultSet.getString("color");
                ColorConverter colorConverter = new ColorConverter();
                Color color = colorConverter.toColor(colorString);

                String sport = resultSet.getString("sport");
                Integer years = resultSet.getInt("years");
                Boolean vegetarian = resultSet.getBoolean("vegetarian");
                Player player = new Player(id,name,surname,color,sport,years,vegetarian);
                players.add(player);

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return players;
    }


    public List<String > findColumnNames(){
        List<String> columnNames = new ArrayList<>();
        String sqlQuery = "Select * from players";
        try (Connection connection = DriverManager.getConnection(URL,USER,PASSWORD)){
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            ResultSet resultSet = preparedStatement.executeQuery();
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            int columnCount = resultSetMetaData.getColumnCount();
            for (int i = 1 ; i<columnCount ; i++){
                String columnName = resultSetMetaData.getColumnName(i);
                columnNames.add(columnName);
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return columnNames;
    }

    @Override
    public void update(Player player) {


        String sqlUpdate = """
                UPDATE players
                SET name=?, surname=?,color=?,sport=?,years=?,vegetarian=?
                WHERE id=?
                """;
        try (Connection connection = DriverManager.getConnection(URL,USER,PASSWORD)){
            PreparedStatement preparedStatement = connection.prepareStatement(sqlUpdate);
            preparedStatement.setString(1,player.getName());
            preparedStatement.setString(2, player.getSurname());
            ColorConverter colorConverter = new ColorConverter();
            String color = colorConverter.toColorString(player.getColor());
            preparedStatement.setString(3,color);
            preparedStatement.setString(4,player.getSport());
            preparedStatement.setInt(5,player.getYears());
            preparedStatement.setBoolean(6,player.getVegetarian());
            preparedStatement.setLong(7,player.getId());
            preparedStatement.execute();
            System.out.println("Update successful ");

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }


    }  @Override
    public void delete(Player player) {

    }

    @Override
    public void save(Player player) {

    }
}

