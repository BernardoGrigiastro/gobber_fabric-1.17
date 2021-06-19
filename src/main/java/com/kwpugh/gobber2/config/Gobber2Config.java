package com.kwpugh.gobber2.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "gobber2")
public class Gobber2Config extends PartitioningSerializer.GlobalData 
{
    public Ores ORES = new Ores();
    public General GENERAL = new General();
    
    @Config(name = "ores")
    public static class Ores implements ConfigData 
    {
		@Comment("\n"
				+"\n"
				+ "***********************"
				+"\nCavesAndCliffsPreview.zip OreGen"
				+"\nONly needs to be true if"
				+"\ndatapack is used"
				+"\n***********************")
		public boolean cacpEnable = false;

	    @Comment("\n"
	    		+"\n"
	    		+ "***********************"    		
	    		+"\nGobber Ore"
	    		+"\n***********************") 
	    public boolean gobberEnable = true;
	    public int gobberVeinSize = 4;
    	public int gobberMaxLevel = 30;
    	public int gobberPerChunk = 20;
    	
        @Comment("\n"
        		+"\n"
        		+ "***********************"
	    		+"\nNether Gobber Ore"
	    		+"\n***********************") 
	    public boolean netherGobberEnable = true;
	    public int netherGobberVeinSize = 9;
    	public int netherGobberMaxLevel = 120;
    	public int netherGobberPerChunk = 25;
    	
        @Comment("\n"
        		+"\n"
        		+ "***********************"
 	    		+"\nEnd Gobber Ore"
 	    		+"\n***********************") 
 	    public boolean endGobberEnable = true;
 	    public int endGobberVeinSize = 9;
     	public int endGobberMaxLevel = 180;
     	public int endGobberPerChunk = 25;
     	
        @Comment("\n"
        		+"\n"
        		+ "***********************"
 	    		+"\nLucky Block"
 	    		+"\n***********************") 
 	    public boolean luckyEnable = true;
 	    public int luckyVeinSize = 4;
     	public int luckyMaxLevel = 120;
     	public int luckyPerChunk = 15;
		public boolean enableExtraLoot = false;
		public boolean enableFortune = false;
    }
    
    @Config(name = "general")
    public static class General implements ConfigData 
    {
    	 @Comment("\n"
    			+"\n"
    	 		+ "***********************"
 	    		+"\nRings"
 	    		+"\n***********************") 
 		public int ringAttractionRange = 8;
 		public int ringMinerCooldown = 120;
 		public int ringMinerRange = 5;
 		public int ringMinerVerticalRange = 4;
 		public boolean ringMinerDelayedBreak = false;
 		public int ringBlinkDistance = 100;
 		public int ringBlinkCooldown = 120;
 		public int ringExplorerCooldown = 240;
 		public int ringExplorerMin = 5000;
		public int ringExplorerMax = 20000;
 		public int ringFarmerRange = 10;
 		public int ringFarmerInterval = 180;
 		public int ringAboveCooldown = 120;
 		public int ringRepairInterval = 90;
 		public double ringDismissalRange = 8;
 		public double ringDismissalVelocity = 0.2D;
 		public double ringDismissalLift = 1.5D;
 		public double ringTravelerLaunch = 3.0;
 		public double ringTravelerCruising = 0.2;
 		
 		 @Comment("\n"
 				+"\n"
 				+ "***********************"
  	    		+"\nMedallions"
  	    		+"\n***********************") 
 		public int medallionExpMultiplier = 5;
		
 		 @Comment("\n"
 				+"\n"
 		 		+ "***********************"
   	    		+"\nStaffs"
   	    		+"\n***********************") 	 
 		public int staffTransformationDurability = 1025;
 		public int staffClearingRange = 11;
 		public int staffSniperCooldown = 240;
 		public int staffFarmerRange = 10;
 		public int staffFarmerInterval = 180;
 		public boolean staffFarmerReplant = true;
 		public boolean staffEnsnarementHotileMobs = false;
		
		@Comment("\n"
				+"\n"
				+ "***********************"
 	    		+"\nTools"
 	    		+"\n***********************")	
		public int swordSniperCooldoown = 240;
		public boolean enableEndHammer5x5 = true;
		public boolean enableEndExcavator5x5 = true;
		public boolean enableTreeAxe = true;
		public int treeAxeDelayTick = 3;
		public boolean enableHammers = true;
		public boolean enableExcavators = true;
		public boolean enablePaxels = true;
	
	   	@Comment("\n"
    			+"\n"
    			+"\n"
    			+"******************************"
    			+"\nBow Durability"
    			+"\n******************************")
    	public int gobberBowDurability = 3800;
	   	public int gobberNetherBowDurability = 5200;
	   	public int gobberEndBowDurability = 8000;

      	@Comment("\n"
    			+"\n"
    			+"\n"
    			+"******************************"
    			+"\nGobber Tool Material Stats"
    			+"\n******************************")
    	public int gobberDurability = 3800;
       	public float gobberMiningSpeed = 9.0F;
       	public float gobberAttackDamage = 9.0F;
       	public int gobberMiningLevel = 4;
       	public int gobberEnchantability = 20;
       	
      	@Comment("\n"
    			+"\n"
    			+"\n"
    			+"******************************"
    			+"\nGobber Nether Tool Material Stats"
    			+"\n******************************")
    	public int gobberNetherDurability = 5200;
       	public float gobberNetherMiningSpeed = 12.0F;
       	public float gobberNetherAttackDamage = 9.0F;
       	public int gobberNetherMiningLevel = 5;
       	public int gobberNetherEnchantability = 25;

      	@Comment("\n"
    			+"\n"
    			+"\n"
    			+"******************************"
    			+"\nGobber End Tool Material Stats"
    			+"\n******************************")
      	public boolean unbreakableEndTools = true;
    	public int gobberEndDurability = 8000;
       	public float gobberEndMiningSpeed = 14.0F;
       	public float gobberEndAttackDamage = 9.0F;
       	public int gobberEndMiningLevel = 5;
       	public int gobberEndEnchantability = 30;
       	    
		@Comment("\n"
				+"\n"
				+ "***********************"
 	    		+"\nArmors"
 	    		+"\n***********************")	
		public boolean enableGobberPerks = true;
		public boolean enableNetherPerks = true;
		public boolean enableEndPerks = true;
		public boolean enablePhantomProtection = true;
		
       	@Comment("\n"
    			+"\n"
    			+"\n"
    			+"******************************"
    			+"\nGobber Armor Material Stats"
    			+"\n******************************")
    	public int gobberDurabilityMultiplier = 71;
      	public int gobberArmorEnchantability = 25;
      	public float gobberToughness = 2.5F;
      	public float gobberKnockbackResistance = 0.10F;
       	
       	@Comment("\n"
    			+"\n"
    			+"\n"
    			+"******************************"
    			+"\nGobber Nether Armor Material Stats"
    			+"\n******************************")
       	public int gobberNetherDurabilityMultiplier = 83;
      	public int gobberNetherArmorEnchantability = 30;
      	public float gobberNetherToughness = 2.75F;
      	public float gobberNetherKnockbackResistance = 0.10F; 
       	
       	@Comment("\n"
    			+"\n"
    			+"\n"
    			+"******************************"
    			+"\nGobber End Armor Material Stats"
    			+"\n******************************")
       	public boolean unbreakableEndArmor = true;
       	public int gobberEndDurabilityMultiplier = 100;
      	public int gobberEndArmorEnchantability = 30;
      	public float gobberEndToughness = 3.0F;
      	public float gobberEndKnockbackResistance = 0.30F;  
       	
       	
		@Comment("\n"
				+"\n"
				+ "***********************"
 	    		+"\nEnchantments"
 	    		+"\n***********************")	
		public boolean enableSmithblade = true;
		public int smithbladeAttackAmount = 2 ;
		public int smithbladeMaxLevel = 5;
		public boolean enableRebuffing = true;
		public int rebuffingMaxLevel = 3;
		public boolean enableFasterObsidian = true;
		public boolean enableUntouchable = true;
		public int untouchableDamage = 8;
		public int untouchableMaxLevel = 3;
		public boolean enableQuickUse = true;
		public boolean enableBlinders = true;
		public boolean enableSolidFooting = true;

		@Comment("\n"
				+"\n"
				+ "***********************"
 	    		+"\nStatus Effects"
 	    		+"\n***********************")	
		public int KnowledgeBoostXPPerTick = 1 ;
	
		@Comment("\n"
				+"\n"
				+ "***********************"
 	    		+"\nLoot Chests"
 	    		+"\n***********************")
		public boolean lootEnable = true;
		public float lootChance = .04F;
		
		@Comment("\n"
				+"\n"
				+ "***********************"
 	    		+"\nSpecial Item"
				+"\n"
				+ "\nItem provides a one-time random teleport"
	            +"\nand is consumed after successful teleport."
	            +"\nMin/Max range from world spawn to search"
		    	+"\nItem does NOT have a standard recipe"
		    	+ "\n***********************") 
		public boolean enableSpecialItem = true;
		public int specialItemMin = 20000;
		public int specialItemMax = 75000;
    }
}