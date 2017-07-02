package com.example.ranzer.draxspells.data;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class SimpleSpellDataProvider {

	public static List<SpellItem> spellList;
	public static Map<String, SpellItem> spellMap;

	static {
		spellList = new ArrayList<>();
		spellMap = new HashMap<>();

		addSpell(null, "Fireball", 3, "Evocation", "1 Action", "120 Feet", "S,V,M", "Instantaneous", false,
				"A bright streak flashes from our pointing finger to a point you choose within range and then blossoms with a low roar into an explosion of flame. Each creature in a 20 foot radius sphere centered on that point must make a Dexterity saving throw. A target takes 8d6 fire damage on a failed save, or half as much damage on a successful one.\n\n" +
						"The fire spreads around corners. it ignites flammable objects in the area that aren't being worn or carried.",
				"When you cast this spell using a spell slot of 4th level or higher, the damage increases by 1d6 for each slot level above 3rd",
				"Dex Save", null, "8d6");

		addSpell(null, "Firebolt", 0, "Evocation", "1 Action", "120 Feet", "V, S", "Instantaneous", false,
				"You hurl a mote of fire at a creature or object within range. Make a ranged spell attack against the target. On a hit, the target takes 1d10 fire damage. a flammable object hit by this spe3ll ignites if it isn't being worn ro carried.",
				"This spell's damage increases by 1d10 when you reach 5th level (2d10, 11th level (3d10), and 17h level (4d10)",
				null, "1d20+Prof+Dex", "1d10");

		addSpell(null, "Project Image", 7, "Illusion", "1 Action", "500 miles", "V,S,M", "Concentration, up to 1 day",
				true, "You create an illusory copy of yourself that lasts for the duration, The copy can appear at any location within range that you have seen befor, regardless of intervening obstacles. The illusion looks and sounds like you but is intangible. If the isllusion takes any damage, it disappears, and the spell ends.\n" +
						"you can use your action to move this illusion up to twice your speed, and make it gesture, speak and behave in whatever way you choose. It mimics your mannerisms perfectly.\n" +
						"you can see through its eyes and hear through its ears as if you were in its space. On your turn as a bonus action, you can swithc from using its senses to using your own, or back again. While you are using its senses, you are blinded and deafend in regard to your own surroundinghs.\n" +
						"Phisical interactions with the image reveals it to be an illusion, because things can bass through it. A creature that usis its action to examine the image can determine that it is an aillusion with a successful Inteligence (Investication_ check aginst your spell save DC. If a creature discerns the illlusion for what it is, the creature can see through the image, and any noise it makes sounds hollow tothe creature.",
				null, null, null, null);
	}

	public static void addSpell(String spellID, String name, int level, String school, String castingTime,
								String range, String components, String duration, boolean concentration,
								String description, String higherLevels, String saveDC, String attackBonus,
								String damage) {
		if (spellID == null) {
			spellID = UUID.randomUUID().toString();
		}
		SpellItem spell = new SpellItem(spellID, name, level, school, castingTime, range, components,
				duration, concentration, description, higherLevels, saveDC,
				attackBonus, damage);

		addSpell(spell);
	}

	public static void addSpell(SpellItem spell) {
		spellList.add(spell);
		spellMap.put(spell.getSpellID(), spell);
	}
}
