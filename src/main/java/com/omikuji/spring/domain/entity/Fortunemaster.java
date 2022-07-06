package com.omikuji.spring.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Fortunemaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 2147483647, nullable = true, unique = false)
	private String unseicode;
	
	@Column(length = 2147483647, nullable = true, unique = false)
	private String unseiname;
	
	@Column(length = 2147483647, nullable = true, unique = false)
	private String renewalwriter;
	
	@Column(length = 2147483647, nullable = true, unique = false)
	private String renewaldate;
	
	@Column(length = 2147483647, nullable = true, unique = false)
	private String unseiwriter;
	
	@Column(length = 2147483647, nullable = true, unique = false)
	private String unseiwritedate;
	
	@Builder
	public Fortunemaster(String unseicode, String unseiname) {
		this.unseicode = unseicode;
		this.unseiname = unseiname;
	}
}
