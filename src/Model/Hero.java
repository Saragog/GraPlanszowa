package Model;

public class Hero extends Character{
	
	Inventory inventory;
	
	public Hero()
	{
		name = "Andrzej";
		lvl  = 1;
		life = 90;
		maxLife = 100;
		mana = 90;
		maxMana = 100;
		strength = 20;
		agility = 10;
		intelligence = 20;
		inventory = new Inventory();
	}
	
	public Hero(Hero heroToCopyFrom)
	{
		name = heroToCopyFrom.name;
		lvl = heroToCopyFrom.lvl;
		life = heroToCopyFrom.life;
		maxLife = heroToCopyFrom.maxLife;
		mana = heroToCopyFrom.mana;
		maxMana = heroToCopyFrom.maxMana;
		strength = heroToCopyFrom.strength;
		agility = heroToCopyFrom.agility;
		intelligence = heroToCopyFrom.intelligence;
		inventory = new Inventory(heroToCopyFrom.inventory);
		
	}
	
	// TODO rest
}
