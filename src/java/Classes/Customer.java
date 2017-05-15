/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import static java.lang.Integer.parseInt;
import java.util.Collections;

/**
 *
 * @author Enio
 */
public class Customer implements Comparable<Customer> {
    private String id;
    private String cpf;
    private String nome;
    private String active;
    private float total;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    
    @Override
    public int compareTo(Customer customer) {
        if (this.total > customer.total) {
            return -1;
        }
        if (this.total < customer.total) {
            return 1;
        }
        return 0;
    }
   
    
    
}
