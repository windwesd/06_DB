package edu.kh.member.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Member implements Serializable {
	
	// 회원 등급 저장 상수
	public static final int COMMON = 0;
	public static final int GOLD = 1;
	public static final int DIAMOND = 2;
	
	// 회원 정보 저장할 필드
	private String name;
	private String phone;
	private int amount;
	private int grade;
	

}
