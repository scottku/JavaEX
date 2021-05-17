package com.javaex.jdbc.oracle;

import java.sql.*;
import java.util.Scanner;

// PreparedStatement를 활용한 급여 검색 프로그램
// 사용자로부터 최소 급여와 최대 급여를 입력
// 범위 내에 속하는 사원의 목록 출력

public class HRSalaryPstmt {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("최소 급여: ");
		int minSalary = sc.nextInt();
		System.out.println("최대 급여: ");
		int maxSalary = sc.nextInt();
		
		if (minSalary > maxSalary) {
			// 값을 뒤집어준다
			int temp = minSalary;
			minSalary = maxSalary;
			maxSalary = temp;
		}
		sc.close();
		
		try {
			conn = DBConfig.getConnection();
			// 실행 계획 준비
			String template = "SELECT first_name||' '||last_name as name, salary" +
							" FROM employees WHERE salary BETWEEN ? AND ?"; // 동적으로 연결할 데이터 영역에 ? 표시
			pstmt = conn.prepareStatement(template);
			// 동적 데이터 바인딩
			pstmt.setInt(1,minSalary);
			pstmt.setInt(2, maxSalary);
			// 쿼리 수행
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String name = rs.getString(1);
				int salary = rs.getInt(2);
				
				// 출력
				System.out.printf("%s - %d%n", name, salary);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
				rs.close();
			} catch (Exception e) {
				
			}
		}
		
	}

}
