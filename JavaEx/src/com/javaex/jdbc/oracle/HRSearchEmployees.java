package com.javaex.jdbc.oracle;
import java.util.Scanner;
import java.sql.*;
// Scanner로 키워드 입력
// first_name, last_name 필드 대상 부분 검색
// 이름, 성, email, 전화번호, 입사일 출력
public class HRSearchEmployees {

	public static void main(String[] args) {
		Connection conn = null; // 커넥션
		Statement stmt = null; // 질의문
		ResultSet rs = null; // 결과값
		Scanner scanner = new Scanner(System.in);
		
		try {
			conn = DBConfig.getConnection();
			
			System.out.print("검색어를 입력해 주세요: ");
			String keyword = scanner.next();
			
			String sql = "SELECT first_name, last_name, email, phone_number, hire_date FROM employees WHERE lower(first_name) LIKE '%"+keyword.toLowerCase()+"%' OR lower(last_name) Like '%" + keyword.toLowerCase() + "%'";
			System.out.println("QUERY: " + sql);
			
			stmt = conn.createStatement();
			// 쿼리 수행
			rs = stmt.executeQuery(sql);
			// Loop
			while(rs.next()) {
				String firstName = rs.getString(1);
				String lastName = rs.getString(2);
				String email = rs.getString("email");
				String phoneNumber = rs.getString("phone_number");
				String hireDate = rs.getString("hire_date"); // java.util.Date
				
				// 출력
				System.out.printf("%s %s: %s, %s, %s%n", firstName, lastName, email, phoneNumber, hireDate);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
				scanner.close();
			} catch (Exception e) {
				
			}
		}
	}

}
