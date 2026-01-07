package com.test;
 
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
 
@Entity
//@DiscriminatorValue("cricketer")
@Table(name="cricketer")
public class Cricketer extends Player{
	private String playerType;
	private String jerseyNumber;
	
	public Cricketer() {
		super();
	}
	public Cricketer(int id, String name, String playerType, String jerseyNumber) {
		super(id,name);
		this.playerType = playerType;
		this.jerseyNumber = jerseyNumber;
	}
	public Cricketer(int id, String name) {
		super(id,name);
	}
	public String getPlayerType() {
		return playerType;
	}
	public void setPlayerType(String playerType) {
		this.playerType = playerType;
	}
	public String getJerseyNumber() {
		return jerseyNumber;
	}
	public void setJerseyNumber(String jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
	@Override
	public String toString() {
		return "Cricketer [playerType=" + playerType + ", jerseyNumber=" + jerseyNumber + "]";
	}
	
}
 
 