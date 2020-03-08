package com.sitech.test;

import java.sql.Connection;

import org.junit.jupiter.api.Test;

import com.sitech.utils.JDBCUtils;

class ConnectionTest {

	@Test
	void test() {
		Connection connection = JDBCUtils.getConnection();
		System.out.println(connection);
	}

}
