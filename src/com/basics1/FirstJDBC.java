package com.basics1;

import java.sql.Connection;
import java.sql.Statement;

import com.mysql.cj.jdbc.DatabaseMetaData;
import com.mysql.cj.jdbc.result.ResultSetMetaData;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FirstJDBC {
  
  public FirstJDBC(){
	  Connection connection=null;
	  Statement statement=null;
	  ResultSet resultSet=null;
	  
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      connection  = DriverManager
          .getConnection("jdbc:mysql://localhost/shalini","root","");
      System.out.println(connection);
      statement=(Statement) connection.createStatement();
      String sql="select * from employee";
      resultSet=statement.executeQuery(sql);
      System.out.println(statement);
      System.out.println(resultSet);
      while(resultSet.next()) {
    	  System.out.println(resultSet.getString("empid")+" ");
    	  System.out.println(resultSet.getString("name")+" ");
    	  System.out.println(resultSet.getString(3)+" ");
    	  System.out.println(resultSet.getString("salary")+"\n");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }finally {
    	try {
    		if(resultSet!=null)
    			resultSet.close();
    		if(statement!=null)
    			statement.close();
    		if(connection!=null)
    			connection.close();
    	}catch (Exception e2) {
    		e2.printStackTrace();
    	}
    }
  }
  public void prepareStatementExample(){
	    Connection connection = null;
	    PreparedStatement preparedStatement = null;
	    try {
	      Class.forName("com.mysql.cj.jdbc.Driver"); // load the driver for mysql into JVM
	      connection = DriverManager // jdbc:dbproductname://ipaddress:port/dbname
	          .getConnection("jdbc:mysql://localhost:3306/shalini","root","");
	      System.out.println(connection);
	      String sql="insert into employee(name,age,salary)values(?,?,?)";
	      preparedStatement= connection.prepareStatement(sql);
	      preparedStatement.setString(1, "raja");
	      preparedStatement.setInt(2, 40);
	      preparedStatement.setDouble(3, 456);
	         int ret = preparedStatement.executeUpdate();
	      System.out.println(ret);
	    } catch (Exception e) {
	      e.printStackTrace();
	    }finally {
	      try {
	        if( preparedStatement != null)
	        	 preparedStatement.close();
	        if(connection != null)
	          connection.close();
	      } catch (Exception e2) {
	        e2.printStackTrace();
	      }
	    }
	  }
	  public void dbMetadata(){
	    Connection connection = null;
	    try {
	      Class.forName("com.mysql.cj.jdbc.Driver"); // load the driver for mysql into JVM
	      connection = DriverManager // jdbc:dbproductname://ipaddress:port/dbname
	          .getConnection("jdbc:mysql://localhost:3306/shalini","root","");
	      System.out.println(connection);
	      DatabaseMetaData  dbMetaData = (DatabaseMetaData) connection.getMetaData();
	      System.out.println(dbMetaData.getDatabaseProductName());
	      System.out.println(dbMetaData.getDatabaseProductVersion());
	      System.out.println(dbMetaData.getDatabaseMajorVersion());
	      System.out.println(dbMetaData.getDatabaseMinorVersion());
	    } catch (Exception e) {
	      e.printStackTrace();
	    }finally {
	      try {
	        if(connection != null)
	          connection.close();
	      } catch (Exception e2) {
	        e2.printStackTrace();
	      }
	    }
	  }
	  public void resultsetMetaData(){
	    Connection connection = null;
	    Statement statement = null;
	    ResultSet resultSet = null;
	    try {
	      Class.forName("com.mysql.cj.jdbc.Driver"); // load the driver for mysql into JVM
	      connection = DriverManager // jdbc:dbproductname://ipaddress:port/dbname
	          .getConnection("jdbc:mysql://localhost:3306/shalini","root","");
	      System.out.println(connection);
	      statement = connection.createStatement();
	      String sql = "select * from employee";
	      resultSet = statement.executeQuery(sql);
	      System.out.println(statement);
	      System.out.println(resultSet);
	      ResultSetMetaData resultSetMetaData = (ResultSetMetaData) resultSet.getMetaData();
	      System.out.println(resultSetMetaData.getColumnCount());
	      while(resultSet.next()){
	        System.out.print(resultSet.getString("empid")+resultSetMetaData.getColumnName(1)+resultSetMetaData.getColumnType(1)+"   ");
	        System.out.print(resultSet.getString("name")+resultSetMetaData.getColumnName(2)+resultSetMetaData.getColumnType(2)+"   ");
	        System.out.print(resultSet.getString(3)+resultSetMetaData.getColumnName(3)+resultSetMetaData.getColumnType(3)+"   ");
	        System.out.print(resultSet.getString("salary")+resultSetMetaData.getColumnName(4)+resultSetMetaData.getColumnType(4)+"\n");
	      }
	    
	    } catch (Exception e) {
	      e.printStackTrace();
	    }finally {
	      try {
	        if(resultSet != null)
	          resultSet.close();
	        if(statement != null)
	          statement.close();
	        if(connection != null)
	          connection.close();
	      } catch (Exception e2) {
	        e2.printStackTrace();
	      }
	    }
	  }
	  public static void main(String[] args) {
	    FirstJDBC first = new FirstJDBC();
	    //first.update();
	    //first.delete();
	    //first.dbMetadata();
	   // first.resultsetMetaData();
	    first.prepareStatementExample();
	  }

	}

  


