package com.prajjwal.kafka.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class User {

	private int id;
	private String firstName;
	private String lastName;
}
