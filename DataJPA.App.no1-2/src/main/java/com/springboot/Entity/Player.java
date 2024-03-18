package com.springboot.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="PLAYER_DTLS")
public class Player {
	
	@Id
	@Column(name="PLAYER_ID")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="PLAYER_NAME")
	private String name;
	
	@Column(name="PLAYER_AGE")
	private Integer age;
	
	@Column(name="LOCATION")
	private String location;


		
	}


}
