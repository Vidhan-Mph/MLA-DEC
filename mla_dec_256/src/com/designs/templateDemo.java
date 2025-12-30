package com.designs;

abstract class TemplateMethods{
	abstract public void players();
	abstract public void playerInfo();
	public final void completeTeam() {
		this.players();
		this.playerInfo();
	}
}

class PlayerInfoImpl extends TemplateMethods{

	@Override
	public void players() {
		System.out.println("Players in PlayerInfoImpl");
		
	}

	@Override
	public void playerInfo() {
		System.out.println("PlayerInfo in PlayerInfoImpl");
		
	}
	
}

class PlayerImpl extends TemplateMethods{

	@Override
	public void players() {
		System.out.println("Player in PlayerImpl");
		
	}

	@Override
	public void playerInfo() {
		System.out.println("PlayerInfo in PlayerImpl");
		
	}
	
}

public class templateDemo {

	public static void main(String[] args) {
		TemplateMethods obj1 = new PlayerInfoImpl();
		TemplateMethods obj2 = new PlayerImpl();
		
		obj1.completeTeam();
		obj2.completeTeam();
	}

}
