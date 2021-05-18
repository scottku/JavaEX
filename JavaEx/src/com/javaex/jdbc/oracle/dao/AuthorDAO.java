package com.javaex.jdbc.oracle.dao;

import java.util.List;

// 설계도
public interface AuthorDAO {
	public List<AuthorVO> getList(); // 단순 SELECT
	public List<AuthorVO> search(String keyword); // Like 검색
	public AuthorVO get(Long id); // PK 가져오기
	public boolean insert(AuthorVO vo); // Insert
	public boolean delete(Long id); // PK로 삭제
	public boolean update(AuthorVO vo); // Update
}
