package com.omikuji.spring.domain.dto;

import com.omikuji.spring.domain.entity.Fortunemaster;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class FortunemasterDto {
	private String unseicode;
	private String unseiname;
	private String renewalwriter;
	private String renewaldate;
	private String unseiwriter;
	private String unseiwritedate;
	
	public Fortunemaster toEntity() {
		Fortunemaster build = Fortunemaster.builder()
				.unseicode(unseicode)
				.unseiname(unseiname)
				.build();
		
		return build;
	}
	
	@Builder
	public FortunemasterDto(String unseicode, String unseiname, 
				String renewalwriter, String renewaldate, String unseiwriter, String unseiwritedate) {
		this.unseicode = unseicode;
		this.unseiname = unseiname;
		this.renewalwriter = renewalwriter;
		this.renewaldate = renewaldate;
		this.unseiwriter = unseiwriter;
		this.unseiwritedate = unseiwritedate;
	}
}
