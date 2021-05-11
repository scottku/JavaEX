package com.javaex.api.collection.hash;

public class ClassRoom {
	private String subject;
	private String roomName;
	
	public ClassRoom(String subject) {
		this.subject = subject;
	}
	
	public ClassRoom(String subject, String roomName) {
		this.subject = subject;
		this.roomName = roomName;
	}

	// ContainsValue
	// 객체의 동등성 비교를 위한 코드
	@Override
	public int hashCode() {
		return subject.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ClassRoom) {
			ClassRoom other = (ClassRoom)obj;
			return subject.equals(other.subject) && roomName.equals(other.roomName);
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "ClassRoom [subject=" + subject + ", roomName=" + roomName + "]";
	}
	
	
}
