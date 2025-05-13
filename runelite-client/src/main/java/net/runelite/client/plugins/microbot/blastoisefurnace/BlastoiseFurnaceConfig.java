



package net.runelite.client.plugins.microbot.blastoisefurnace;

import net.runelite.client.config.*;
import net.runelite.client.plugins.microbot.blastoisefurnace.enums.Bars;
import net.runelite.client.plugins.microbot.inventorysetups.InventorySetup;

@ConfigGroup("blastoisefurnace")
@ConfigInformation("Must have Ice Gloves or smiths gloves (i) equiped<br /><br />If not doing gold bars coal bag is required. <br /><br /> Must have stamina and energy potions in bank<br /><br /> Handles Foreman for < 60 Smithing.<br /><br /> If doing gold bars you must have Goldsmiths Gauntlet and bank your coal bag<br /><br />Current version does not support  coffer refill<br /><br />")
public interface BlastoiseFurnaceConfig extends Config {
    @ConfigSection(
            name = "Blast Furnace Settings",
            description = "Blast Furnace Settings",
            position = 0,
            closedByDefault = false
    )
    String bFSettingsSection = "bFSettings";

    default boolean useStamina() {
        return true;
    }



    @ConfigItem(
            keyName = "Bars",
            name = "Bars",
            description = "Bars",
            position = 1,
            section = "bFSettings"
    )
    default Bars getBars() {
        return Bars.STEEL_BAR;
    }

    @ConfigItem(
            keyName = "World",
            name = "World",
            description = "Blast Furnace world",
            position = 2,
            section = "bFSettings"
    )

    default int world() {
        return 358;
    }

    @ConfigItem(
            keyName = "inventorySetup",
            name = "Inventory Setup",
            description = "Inventory setup to use",
            position = 1,
            section = "bFSettings"
    )
    default InventorySetup inventorySetup() {
        return null;
    }


    @ConfigSection(
            name = "Credits",
            description = "Credits",
            position = 2,
            closedByDefault = false
    )
    String Credits = "Credits";
    @ConfigItem(
            keyName = "Credits",
            name = "Credits",
            description = "Credits",
            position = 3,
            section = "Credits"
    )
    default String Credits() {
        return "Created by: Fishy \n\nUpdated by: Acun, Wassuppzzz";
    }
}