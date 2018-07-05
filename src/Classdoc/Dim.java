/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classdoc;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Neeraj
 */
public class Dim {
    
    static Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
    static Rectangle winSize = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
    
    public static int getHeight()
    {
        return winSize.height;
    }
    public static int getWidth()
    {
         return dim.width;
    }
    public static DefaultTableModel prepareTable(String ar[])
    {
       //create defaulttablemodel
        DefaultTableModel model=new DefaultTableModel();
        for(int i=0;i<ar.length;i++)
        {
            model.addColumn(ar[i]);
        }
            return model;
    }
     public List addCustomer()
    {
        List<String> ar=new ArrayList<>();
        String sql="select distinct(cname) from customer_details";
        System.out.println(sql);
        try{
        ResultSet rs=DBConnection.executeQuery(sql);
        while(rs.next())
        {
            ar.add(rs.getString("cname"));
        }
        }
        catch(SQLException e)
        {
            System.out.println("railway sqlexception constructor");
        }
        return ar;
    }
    public String[] addCustomerMobileID(String name)
    {
        String ar[]=new String[2];
        String sql=String.format("Select * from customer_details where cname='%s'",name);
        try{
            ResultSet rs=DBConnection.executeQuery(sql);
            if(rs.next())
            {
                ar[0]=rs.getString("mobile_no");
                ar[1]=rs.getString("cid");
            }
        }
        catch(SQLException e)
        {
            System.out.println("sqlexception in addcustomer mobile method railway");
        }
        return ar;

}
public int createInvoice()
{
    int invoice_no=0;
    String sql="insert into new_invoice values()";
    try{
    int result=DBConnection.executeUpdate(sql);
    if(result<=0)
    {
        System.out.println("new_invoice create invoice");
    }
    }
    catch(SQLException e)
    {
        System.out.println("dim createinvoice");
    }
    sql="select max(invoice_no) from new_invoice";
    try{
    ResultSet rs=DBConnection.executeQuery(sql);
    if(rs.next())
    {
        invoice_no=rs.getInt("max(invoice_no)");
    }
    }
    catch(SQLException e)
    {
        System.out.println("create invoice second try");
    }
    return invoice_no;
    }
 
}
