/*
 * Copyright (c)  2015, Newtouch
 * All rights reserved. 
 *
 * $id: HiveJdbcClient.java 9552 2015年4月9日 上午10:57:40 WangLijun$
 */
package com.newtouch.watchman.hive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>
 * Title:
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2015
 * </p>
 * <p>
 * Company: Newtouch
 * </p>
 * 
 * @author WangLijun
 * @version 1.0
 */
public class HiveJdbcClient {
	private static String driverName = "org.apache.hadoop.hive.jdbc.HiveDriver";
	private static String url = "jdbc:hive://192.168.203.202:10000/default";
	private static String user = "";
	private static String password = "";
	private static String sql = "";
	private static ResultSet res;
	private static final Logger log = LoggerFactory.getLogger(HiveJdbcClient.class);

	public static void main(String[] args) {
		try {
			Class.forName(driverName);
			System.out.println("------------------------------1");
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("------------------------------2");
			Statement stmt = conn.createStatement();
			System.out.println("------------------------------3");
			String tableName="trace_status";
 
			// 执行“select * query”操作
			sql = "select * from " + tableName;
			System.out.println("Running:" + sql);
			res = stmt.executeQuery(sql);
			System.out.println("执行“select * query”运行结果:");
			while (res.next()) {
				System.out.println(res.getInt(1) + "\t" + res.getString(2));
			}

			// 执行“regular hive query”操作
			sql = "select count(1) from " + tableName;
			System.out.println("Running:" + sql);
			res = stmt.executeQuery(sql);
			System.out.println("执行“regular hive query”运行结果:");
			while (res.next()) {
				System.out.println(res.getString(1));

			}

			conn.close();
			conn = null;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			log.error(driverName + " not found!", e);
			System.exit(1);
		} catch (SQLException e) {
			e.printStackTrace();
			log.error("Connection error!", e);
			System.exit(1);
		}

	}
}
