package com.omikuji.spring.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "fortunemaster")
@Getter
@Setter
public class Fortunemaster {
	
    @Column(name = "unseiname")
	public String unseiname;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "unseicode")
	public String unseicode;
	
	@Column(name = "renewalwriter")
	public String renewalwriter;	
	
	@Column(name = "renewaldate")
	public String renewaldate;	
	
	@Column(name = "unseiwriter")
	public String unseiwriter;	
	
	@Column(name = "unseiwritedate")
	public String unseiwritedate;
}
