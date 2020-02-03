/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import com.mysql.jdbc.Connection;
import connectionBD.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.ClimbingStatistics;

/**
 *
 * @author Marcello
 */
public class ProdutoDAO {

    public void create(ClimbingStatistics p) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO climbing (date1, route, attempted, succeeded, successPercentage) VALUES(?,?,?,?,?)");
            stmt.setString(1, p.getDate1());
            stmt.setString(2, p.getRoute());
            stmt.setString(3, p.getAttempted());
            stmt.setString(4, p.getSucceeded());
            stmt.setString(5, p.getSuccessPercentage());

            stmt.executeUpdate();

        } catch (SQLException ex) {

        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public List<ClimbingStatistics> read() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<ClimbingStatistics> climbings = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM climbing");
            rs = stmt.executeQuery();

            while (rs.next()) {

                ClimbingStatistics climbing = new ClimbingStatistics();

                climbing.setDate1(rs.getString("date1"));
                climbing.setRoute(rs.getString("route"));
                climbing.setAttempted(rs.getString("attempted"));
                climbing.setSucceeded(rs.getString("succeeded"));
                climbing.setSuccessPercentage(rs.getString("successPercentage"));

                climbings.add(climbing);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Exibir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return climbings;
    }

}
