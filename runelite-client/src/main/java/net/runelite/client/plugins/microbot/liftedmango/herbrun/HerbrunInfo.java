package net.runelite.client.plugins.microbot.liftedmango.herbrun;

import lombok.Getter;
import net.runelite.api.ItemID;

public class HerbrunInfo {
    public static states botStatus;
    public static int selectedSeed;
    public static int seedAmount;

    public enum states {
        GEARING,

        // Trollheim
        TROLLHEIM_TELEPORT,
        TROLLHEIM_WALKING_TO_PATCH,
        TROLLHEIM_HANDLE_PATCH,

        // Catherby
        CATHERBY_TELEPORT,
        CATHERBY_WALKING_TO_PATCH,
        CATHERBY_HANDLE_PATCH,
        CATHERBY_HANDLE_ALLOTMENT_PATCH,
        CATHERBY_HANDLE_ALLOTMENT_PATCH2,
        CATHERBY_HANDLE_FLOWER_PATCH,

        // Morytania
        MORYTANIA_TELEPORT,
        MORYTANIA_WALKING_TO_PATCH,
        MORYTANIA_HANDLE_PATCH,

        // Varlamore
        VARLAMORE_TELEPORT,
        VARLAMORE_WALKING_TO_PATCH,
        VARLAMORE_HANDLE_PATCH,

        // Hosidius
        HOSIDIUS_TELEPORT,
        HOSIDIUS_WALKING_TO_PATCH,
        HOSIDIUS_HANDLE_PATCH,

        // Ardougne
        ARDOUGNE_TELEPORT,
        ARDOUGNE_WALKING_TO_PATCH,
        ARDOUGNE_HANDLE_PATCH,
        ARDOUGNE_HANDLE_ALLOTMENT_PATCH,
        ARDOUGNE_HANDLE_ALLOTMENT_PATCH2,
        ARDOUGNE_HANDLE_FLOWER_PATCH,

        // Falador
        FALADOR_TELEPORT,
        FALADOR_WALKING_TO_PATCH,
        FALADOR_HANDLE_PATCH,
        FALADOR_HANDLE_ALLOTMENT_PATCH,
        FALADOR_HANDLE_ALLOTMENT_PATCH2,
        FALADOR_HANDLE_FLOWER_PATCH,

        // Weiss
        WEISS_TELEPORT,
        WEISS_WALKING_TO_PATCH,
        WEISS_HANDLE_PATCH,

        // Weiss
        HARMONY_TELEPORT,
        HARMONY_WALKING_TO_PATCH,
        HARMONY_HANDLE_PATCH,

        // Guild
        GUILD_TELEPORT,
        GUILD_WALKING_TO_PATCH,
        GUILD_HANDLE_PATCH,

        FINISHED

    }

    @Getter
    public enum seedType {
        AVANTOE_SEED(ItemID.AVANTOE_SEED, ItemID.GRIMY_AVANTOE),
        CADANTINE_SEED(ItemID.CADANTINE_SEED, ItemID.GRIMY_CADANTINE),
        DWARF_WEED_SEED(ItemID.DWARF_WEED_SEED, ItemID.GRIMY_DWARF_WEED),
        GUAM_SEED(ItemID.GUAM_SEED, ItemID.GRIMY_GUAM_LEAF),
        HARRALANDER_SEED(ItemID.HARRALANDER_SEED, ItemID.GRIMY_HARRALANDER),
        IRIT_SEED(ItemID.IRIT_SEED, ItemID.GRIMY_IRIT_LEAF),
        KWUARM_SEED(ItemID.KWUARM_SEED, ItemID.GRIMY_KWUARM),
        LANTADYME_SEED(ItemID.LANTADYME_SEED, ItemID.GRIMY_LANTADYME),
        MARRENTILL_SEED(ItemID.MARRENTILL_SEED, ItemID.GRIMY_MARRENTILL),
        RANARR_SEED(ItemID.RANARR_SEED, ItemID.GRIMY_RANARR_WEED),
        SNAPDRAGON_SEED(ItemID.SNAPDRAGON_SEED, ItemID.GRIMY_SNAPDRAGON),
        TARROMIN_SEED(ItemID.TARROMIN_SEED, ItemID.GRIMY_TARROMIN),
        TOADFLAX_SEED(ItemID.TOADFLAX_SEED, ItemID.GRIMY_TOADFLAX),
        TORSTOL_SEED(ItemID.TORSTOL_SEED, ItemID.GRIMY_TORSTOL);

        private final int itemId;
        private final int herbId;

        seedType(final int _itemId, final int _herbId) {
            itemId = _itemId;
            herbId = _herbId;
        }

    }

    @Getter
    public enum allotmentSeedType {
        POTATO_SEED(ItemID.POTATO_SEED, ItemID.POTATO),
        ONION_SEED(ItemID.ONION_SEED, ItemID.ONION),
        CABBAGE_SEED(ItemID.CABBAGE_SEED, ItemID.CABBAGE),
        TOMATO_SEED(ItemID.TOMATO_SEED, ItemID.TOMATO),
        SWEETCORN_SEED(ItemID.SWEETCORN_SEED, ItemID.SWEETCORN),
        STRAWBERRY_SEED(ItemID.STRAWBERRY_SEED, ItemID.STRAWBERRY),
        WATERMELON_SEED(ItemID.WATERMELON_SEED, ItemID.WATERMELON),
        SNAPE_GRASS_SEED(ItemID.SNAPE_GRASS_SEED, ItemID.SNAPE_GRASS);

        private final int itemId;
        private final int allotmentId;

        allotmentSeedType(final int _itemId, final int _allotmentId) {
            itemId = _itemId;
            allotmentId = _allotmentId;
        }

    }

    @Getter
    public enum flowerSeedType {
        MARIGOLD_SEED(ItemID.MARIGOLD_SEED, ItemID.MARIGOLDS),
        ROSEMARY_SEED(ItemID.ROSEMARY_SEED, ItemID.ROSEMARY),
        NASTURTIUM_SEED(ItemID.NASTURTIUM_SEED, ItemID.NASTURTIUMS),
        WOAD_SEED(ItemID.WOAD_SEED, ItemID.WOAD_LEAF),
        LIMPWURT_SEED(ItemID.LIMPWURT_SEED, ItemID.LIMPWURT_ROOT),
        WHITE_LILY_SEED(ItemID.WHITE_LILY_SEED, ItemID.WHITE_LILY);


        private final int itemId;
        private final int flowerId;

        flowerSeedType(final int _itemId, final int _flowerId) {
            itemId = _itemId;
            flowerId = _flowerId;
        }

    }


    @Getter
    public enum bucketType {
        ULTRACOMPOST(ItemID.ULTRACOMPOST, 8),
        BOTTOMLESS_COMPOST_BUCKET(ItemID.BOTTOMLESS_COMPOST_BUCKET, 1);

        private final int itemId;
        private final int quantity;

        bucketType(final int _itemId,
                   final int _quantity) {
            itemId = _itemId;
            quantity = _quantity;
        }
    }

    @Getter
    public enum trollheimTeleport {
        STONY_BASALT(ItemID.STONY_BASALT, 1),
        TROLLHEIM_TAB(ItemID.TROLLHEIM_TELEPORT, 1);

        private final int itemId;
        private final int quantity;

        trollheimTeleport(final int _itemId,
                   final int _quantity) {
            itemId = _itemId;
            quantity = _quantity;
        }
    }

    @Getter
    public enum herbType {
        KWUARM(ItemID.KWUARM_SEED),
        AVANTO(ItemID.AVANTOE_SEED),
        WILLOW_LOGS(ItemID.WILLOW_LOGS),
        TEAK_LOGS(ItemID.TEAK_LOGS),
        MAPLE_LOGS(ItemID.MAPLE_LOGS),
        MAHOGANY_LOGS(ItemID.MAHOGANY_LOGS),
        YEW_LOGS(ItemID.YEW_LOGS),
        MAGIC_LOGS(ItemID.MAGIC_LOGS),
        REDWOOD_LOGS(ItemID.REDWOOD_LOGS);

        private final int itemId;

        herbType(final int _itemId) {
            itemId = _itemId;
        }

    }

    @Getter
    public enum cloak {
        ARDOUGNE_CLOAK_1(ItemID.ARDOUGNE_CLOAK_1),
        ARDOUGNE_CLOAK_2(ItemID.ARDOUGNE_CLOAK_2),
        ARDOUGNE_CLOAK_3(ItemID.ARDOUGNE_CLOAK_3),
        ARDOUGNE_CLOAK_4(ItemID.ARDOUGNE_CLOAK_4);

        private final int itemId;

        cloak(final int _itemId) {
            itemId = _itemId;
        }

    }

    @Getter
    public enum ring {
        EXPLORERS_RING_1(ItemID.EXPLORERS_RING_1),
        EXPLORERS_RING_2(ItemID.EXPLORERS_RING_2),
        EXPLORERS_RING_3(ItemID.EXPLORERS_RING_3),
        EXPLORERS_RING_4(ItemID.EXPLORERS_RING_4);

        private final int itemId;

        ring(final int _itemId) {
            itemId = _itemId;
        }

    }
}