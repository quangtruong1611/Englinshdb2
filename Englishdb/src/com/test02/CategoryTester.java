/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test02;

import com.dht.services.Utils;
import java.sql.Connection;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author Admin
 */
public class CategoryTester {
    private static Connection conn;
    
    @BeforeClass
    public static void setUp(){
        setConn(Utils.getConn());
    }

    /**
     * @return the conn
     */
    public static Connection getConn() {
        return conn;
    }

    /**
     * @param aConn the conn to set
     */
    public static void setConn(Connection aConn) {
        conn = aConn;
    }
}
