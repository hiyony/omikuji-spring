package com.omikuji.spring.form;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Range;


public class InputForm {
	
	@NotBlank(message = "誕生日を入力してください！")
	@Range(min=1, max=8)
	private String birthday;

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

}
