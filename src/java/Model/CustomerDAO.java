/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import ConnectionFactory.ConnectionFactory;
import Classes.Customer;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Enio
 */
public class CustomerDAO {
     public void gravar (Customer customer) throws SQLException, IOException,Exception{
        Connection connection;
        connection = ConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            

            ps = connection.prepareStatement("Insert into tb_customer_account"
                    + " (id_customer,cpf_cnpj,nm_customer,is_active,vl_total)"
                    + "     values(?,?,?,?,?)");
            
            ps.setInt(1,Integer.parseInt(customer.getId()));
            System.out.println("VALORRR:"+customer.getId());
            ps.setInt(2,Integer.parseInt(customer.getCpf()));
            ps.setString(3,customer.getNome());
            ps.setBoolean(4, Boolean.valueOf(customer.getActive()));
            ps.setFloat(5, customer.getTotal());
            ps.execute();
            

           

            
        }  finally {

            if (ps != null) {
                ps.close();
            }

            if (rs != null) {
                rs.close();
            }

            connection.close();
        }
                      
    }
     
    public float media() throws Exception{
        
        Connection connection;
        connection = ConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        
        ResultSet rs = null;
        
        float media;
        try {
            
            ps = connection.prepareStatement("select avg(vl_total) from tb_customer_account  where vl_total>560 and id_customer>=1500 and id_customer<=2700;");
             
            //ps.setString(1,"560");
            rs = ps.executeQuery();
            if(rs != null && rs.next()){
                
            }
            
            media=rs.getFloat("avg(vl_total)");
        }  finally {

            if (ps != null) {
                ps.close();
            }

            if (rs != null) {
                rs.close();
            }

            connection.close();
        }    
        
        return media;
    } 
    
    public List<Customer> getListagem() throws Exception{
        Connection connection;
        connection = ConnectionFactory.getInstance().getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Customer> customers= null;
        try {            
            ps = connection.prepareStatement("select * from tb_customer_account  where vl_total>560 and id_customer>=1500 and id_customer<=2700");
                
            rs = ps.executeQuery();
            
            
            customers= new ArrayList<Customer>();
            
            //arrumar aqui
            while (rs.next()) {
                Customer cus = new Customer();
                cus.setId(rs.getString("id_customer"));
                cus.setCpf(rs.getString("cpf_cnpj"));
                cus.setNome(rs.getString("nm_customer"));
                cus.setActive(rs.getString("is_active"));
                cus.setTotal(rs.getFloat("vl_total"));
                customers.add(cus);
                
            }
            
            
            Collections.sort(customers);
            
            
            rs.close();            
        }  finally {

            if (ps != null) {
                ps.close();
            }

            if (rs != null) {
                rs.close();
            }

            connection.close();
        }    
        
        return customers;
    }
    
    
}
