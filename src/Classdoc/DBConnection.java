package Classdoc;


import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neeraj
 */

public class DBConnection {

    private static Connection con;
    private static Statement st;

    static {        //CQ1. Static Anonymous Block, Executes only
        try {      //Ones, When class is refered from 1st time
            Properties p = new Properties(); //Used to initialize 
                                                                //static members.
            InputStream in = DBConnection.class.getResourceAsStream(
                    "Settings.properties");
            if (in == null) {
                throw new Error("Inputstream Not Found");
            }
            p.load(in);  //Load settings from property file into p
            String userName = p.getProperty("username");
            String password = p.getProperty("password");
            String url = p.getProperty("url");
            String drivername = p.getProperty("drivername");
            Class.forName(drivername).newInstance();
            con = DriverManager.getConnection(url, userName, password);
            st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            //con.setAutoCommit(false);
            System.out.println("connected");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Unable to Connect " + e.toString());
        }
    }

    public static void close() {
        try {
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Unable to Close" + e.toString());
        }
    }

    public static ResultSet executeQuery(String sql)    //For Select Statement
            throws SQLException {
        ResultSet rs = st.executeQuery(sql);
        return rs;
    }
            //For Insert Update Delete
    public static int executeUpdate(String sql) throws SQLException {
        return st.executeUpdate(sql);
    }
    public static void commit() throws SQLException
    {
        con.commit();  //So that get stored in Database
    }
    ///////////////////////
    public static DefaultTableModel prepareTable(ResultSet rs)
            throws SQLException {
        System.out.println("hey preparetable");
        DefaultTableModel d;
        d = new DefaultTableModel()
        {
            @Override
            public boolean isCellEditable(int r,int c)
            {
                return false;
            }
        };    //Local Variable
        //1. create an array of column names       
        ResultSetMetaData metadata = rs.getMetaData();
        int colCount = metadata.getColumnCount();
        String[ ] colNames = new String[colCount];
        for (int i = 1; i <= colCount; i++) 
        {
            colNames[i - 1] = metadata.getColumnName(i);
        }
        d.setColumnIdentifiers(colNames);
        //now populate the data       
        while (rs.next()) 
        {
            String[ ] rowData = new String[colCount];
            for (int i = 0; i < colCount; i++) {
                rowData[ i ] = rs.getString(i+1);
            }
            d.addRow(rowData);
        }
        return d;
    }   //Fn Close
}  //Class
