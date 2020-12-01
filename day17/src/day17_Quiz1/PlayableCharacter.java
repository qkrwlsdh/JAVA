package day17_Quiz1;

public class PlayableCharacter {
	private String name;
	private int at;
	private int hp;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAt() {
		return at;
	}

	public void setAt(int at) {
		this.at = at;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public PlayableCharacter(String name, int at, int hp) {
		this.name = name;
		this.at = at;
		this.hp = hp;
	}
	@Override
	public String toString() {
		return String.format("%s ) 공격력 : %d, 체력 : %d\n", name, at, hp); 
	}

}
