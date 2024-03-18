  package com.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CRICKET PLAYER")
  public class Player {
	
	@Id
	@Column(name="PLAYER_ID")
	private Integer PlayerId;
	
	@Column(name="PLAYER_NAME")
	private String PlayerName;
	
	@Column(name="PLAYER_AGE")
	private Integer PlayerAge;
	
 
	private String PlayerLocation;

	public Integer getPlayerId() {
		return PlayerId;
	}
 
	public void setPlayerId(Integer playerId) {
		PlayerId = playerId;
	}

	public String getPlayerName() {
		return PlayerName;
	}

	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}

	public Integer getPlayerAge() {
		return PlayerAge;
	}

	public void setPlayerAge(Integer playerAge) {
		PlayerAge = playerAge;
	}

	public String getPlayerLocation() {
		return PlayerLocation;
	}

	public void setPlayerLocation(String playerLocation) {
		PlayerLocation = playerLocation;
	}

	@Override
	public String toString() {
		return "Player [PlayerId=" + PlayerId + ", PlayerName=" + PlayerName + ", PlayerAge=" + PlayerAge
				+ ", PlayerLocation=" + PlayerLocation + "]";
	}

}
