package fiskfille.tf.common.recipe;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import fiskfille.tf.TransformersAPI;
import fiskfille.tf.common.block.TFBlocks;
import fiskfille.tf.common.item.TFItems;
import fiskfille.tf.common.transformer.base.Transformer;

public class TFRecipes
{
    public static void registerRecipes()
    {
        addSmelting();
        addDisplayRecipes();
        addWeaponRecipes();
        addCraftingComponentRecipes();
        addProjectileRecipes();
        addArmorRecipes();

        GameRegistry.addRecipe(new ItemStack(TFItems.transformiumDetector), new Object[] {"IEI", "TRT", "rrr", 'I', Items.iron_ingot, 'E', TFBlocks.energonCrystal, 'T', TFItems.transformium, 'R', Blocks.redstone_block, 'r', Items.redstone});
        GameRegistry.addRecipe(new ItemStack(TFBlocks.transformiumSeed, 1), new Object[] {"TET", "TNT", "DND", 'T', TFBlocks.transformiumBlock, 'E', TFBlocks.energonCube, 'N', Items.nether_star, 'D', Blocks.diamond_block});

        GameRegistry.addShapelessRecipe(new ItemStack(TFItems.energonCrystalPiece, 9), new Object[] {TFBlocks.energonCube});
        GameRegistry.addShapelessRecipe(new ItemStack(TFItems.transformium, 9), new Object[] {TFBlocks.transformiumBlock});

        GameRegistry.addRecipe(new ItemStack(TFBlocks.energonCube, 1), new Object[] {"CCC", "CCC", "CCC", 'C', TFItems.energonCrystalPiece});
        GameRegistry.addRecipe(new ItemStack(TFBlocks.transformiumBlock, 1), new Object[] {"CCC", "CCC", "CCC", 'C', TFItems.transformium});
    }

    private static void addSmelting()
    {
        GameRegistry.addSmelting(TFBlocks.transformiumOre, new ItemStack(TFItems.transformium, 1), 5.0F);
        GameRegistry.addSmelting(TFBlocks.transformiumStone, new ItemStack(TFItems.transformium, 1), 5.0F);
    }

    private static void addWeaponRecipes()
    {
        GameRegistry.addRecipe(new ItemStack(TFItems.skystrikesCrossbow, 1), new Object[] {"EII", "ITC", "ICT", 'E', TFBlocks.energonCrystal, 'I', Items.iron_ingot, 'T', TFItems.transformium, 'C', TFItems.energonCrystalPiece});
        GameRegistry.addRecipe(new ItemStack(TFItems.purgesKatana, 1), new Object[] {"CtC", "TET", "CIC", 'E', TFBlocks.energonCrystal, 'I', Items.iron_ingot, 'T', TFItems.transformium, 'C', TFItems.energonCrystalPiece, 't', TFItems.tankTracks});
        GameRegistry.addRecipe(new ItemStack(TFItems.vurpsSniper, 1), new Object[] {"EI ", "CTG", "CIT", 'E', TFBlocks.energonCrystal, 'I', Items.iron_ingot, 'T', TFItems.transformium, 'C', TFItems.energonCrystalPiece, 'G', new ItemStack(Blocks.stained_glass, 1, 5)});
        GameRegistry.addRecipe(new ItemStack(TFItems.subwoofersBassBlaster, 1), new Object[] {"TIC", " EB", "TIC", 'E', TFBlocks.energonCrystal, 'I', Items.iron_ingot, 'T', TFItems.transformium, 'C', TFItems.energonCrystalPiece, 'B', Blocks.iron_block});
        GameRegistry.addRecipe(new ItemStack(TFItems.cloudtrapsFlamethrower, 1), new Object[] {"CT ", "BET", " IC", 'E', TFBlocks.energonCrystal, 'I', Items.iron_ingot, 'T', TFItems.transformium, 'C', TFItems.energonCrystalPiece, 'B', Blocks.iron_block});
    }

    private static void addCraftingComponentRecipes()
    {
        GameRegistry.addRecipe(new ItemStack(TFItems.transformiumArmorMolds, 1, 0), new Object[] {"TTT", "T T", 'T', TFItems.transformium});
        GameRegistry.addRecipe(new ItemStack(TFItems.transformiumArmorMolds, 1, 1), new Object[] {"T T", "TTT", "TTT", 'T', TFItems.transformium});
        GameRegistry.addRecipe(new ItemStack(TFItems.transformiumArmorMolds, 1, 2), new Object[] {"TTT", "T T", "T T", 'T', TFItems.transformium});
        GameRegistry.addRecipe(new ItemStack(TFItems.transformiumArmorMolds, 1, 3), new Object[] {"T T", "T T", 'T', TFItems.transformium});
        GameRegistry.addRecipe(new ItemStack(TFItems.standardEngine, 1), new Object[] {"PRP", "BIB", 'P', Blocks.piston, 'R', Items.redstone, 'I', Items.iron_ingot, 'B', Blocks.iron_block});
        GameRegistry.addRecipe(new ItemStack(TFItems.jetTurbine, 1), new Object[] {"IIB", " JR", "IIB", 'I', Items.iron_ingot, 'B', Blocks.iron_block, 'J', Blocks.iron_bars, 'R', Items.redstone});
        GameRegistry.addRecipe(new ItemStack(TFItems.jetThruster, 1), new Object[] {"IIB", "xRJ", "IIB", 'I', Items.iron_ingot, 'B', Blocks.iron_block, 'J', Blocks.iron_bars, 'R', Items.redstone, 'x', Blocks.redstone_block});
        GameRegistry.addRecipe(new ItemStack(TFItems.ahd2JetWing, 1), new Object[] {"II ", "TII", 'I', Items.iron_ingot, 'T', TFItems.transformium});
        GameRegistry.addRecipe(new ItemStack(TFItems.ahd2JetCockpit, 1), new Object[] {"BG ", "BBI", 'B', Blocks.iron_block, 'I', Items.iron_ingot, 'G', new ItemStack(Blocks.stained_glass, 1, 4)});
        GameRegistry.addRecipe(new ItemStack(TFItems.t50JetWing, 1), new Object[] {"  I", " II", "IIT", 'I', Items.iron_ingot, 'T', TFItems.transformium});
        GameRegistry.addRecipe(new ItemStack(TFItems.t50JetCockpit, 1), new Object[] {"GIT", 'T', TFItems.transformium, 'I', Items.iron_ingot, 'G', new ItemStack(Blocks.stained_glass_pane, 1, 5)});
        GameRegistry.addRecipe(new ItemStack(TFItems.tankTracks, 1), new Object[] {"LLL", "I I", "LLL", 'I', Items.iron_ingot, 'L', Items.leather});
        GameRegistry.addRecipe(new ItemStack(TFItems.tankTurret, 1), new Object[] {"  D", "IIB", 'I', Items.iron_ingot, 'B', Blocks.iron_block, 'D', new ItemStack(Items.dye, 1, 0)});
        GameRegistry.addRecipe(new ItemStack(TFItems.carWheel, 1), new Object[] {"DLD", "LIL", "DLD", 'I', Items.iron_ingot, 'L', Items.leather, 'D', Items.dye});
        GameRegistry.addRecipe(new ItemStack(TFItems.smallThruster, 1), new Object[] {"III", " JR", "III", 'I', Items.iron_ingot, 'J', Blocks.iron_bars, 'R', Items.redstone});
    }

    private static void addDisplayRecipes()
    {
        GameRegistry.addRecipe(new ItemStack(TFBlocks.displayPillar, 1), new Object[] {" - ", "SWS", '-', Blocks.stone_slab, 'S', Blocks.stone, 'W', Blocks.cobblestone_wall});
        GameRegistry.addRecipe(new ItemStack(TFBlocks.displayStation, 1), new Object[] {" L ", " I ", "-I-", '-', new ItemStack(Blocks.stone_slab, 1, 0), 'I', Items.iron_ingot, 'L', Blocks.redstone_lamp});
        GameRegistry.addRecipe(new RecipesDisplayItems());

        int i = 0;

        for (Transformer transformer : TransformersAPI.getTransformers())
        {
            GameRegistry.addShapelessRecipe(new ItemStack(TFItems.displayVehicle, 1, i), new Object[] {transformer.getHelmet(), transformer.getChestplate(), transformer.getLeggings(), transformer.getBoots()});
            ++i;
        }
    }

    private static void addProjectileRecipes()
    {
        GameRegistry.addRecipe(new ItemStack(TFItems.missile, 4), new Object[] {"T  ", " I ", "  E", 'I', Items.iron_ingot, 'T', Blocks.tnt, 'E', TFItems.smallThruster});
        GameRegistry.addRecipe(new ItemStack(TFItems.tankShell, 4), new Object[] {"IIT", 'I', Items.iron_ingot, 'T', Items.gunpowder});
    }

    private static void addArmorRecipes()
    {
        GameRegistry.addRecipe(new ItemStack(TFItems.skystrikeHelmet, 1), new Object[] {"III", "b*b", '*', new ItemStack(TFItems.transformiumArmorMolds, 1, 0), 'I', Items.iron_ingot, 'b', new ItemStack(Items.dye, 1, 0)});
        GameRegistry.addRecipe(new ItemStack(TFItems.skystrikeChestplate, 1), new Object[] {"WCW", "w*w", "TrT", '*', new ItemStack(TFItems.transformiumArmorMolds, 1, 1), 'C', TFItems.ahd2JetCockpit, 'W', TFItems.ahd2JetWing, 'r', new ItemStack(Items.dye, 1, 1), 'w', new ItemStack(Items.dye, 1, 15), 'I', Items.iron_ingot, 'T', TFItems.jetTurbine});
        GameRegistry.addRecipe(new ItemStack(TFItems.skystrikeLeggings, 1), new Object[] {" r ", "w*w", "I I", '*', new ItemStack(TFItems.transformiumArmorMolds, 1, 2), 'w', new ItemStack(Items.dye, 1, 15), 'r', new ItemStack(Items.dye, 1, 1), 'I', Items.iron_ingot});
        GameRegistry.addRecipe(new ItemStack(TFItems.skystrikeBoots, 1), new Object[] {"w*w", "I I", '*', new ItemStack(TFItems.transformiumArmorMolds, 1, 3), 'T', TFItems.jetTurbine, 'w', new ItemStack(Items.dye, 1, 15), 'I', Items.iron_ingot});

        GameRegistry.addRecipe(new ItemStack(TFItems.purgeHelmet, 1), new Object[] {"IGI", "I*I", "IbI", '*', new ItemStack(TFItems.transformiumArmorMolds, 1, 0), 'I', Items.iron_ingot, 'G', Items.gold_ingot, 'b', new ItemStack(Items.dye, 1, 0)});
        GameRegistry.addRecipe(new ItemStack(TFItems.purgeChestplate, 1), new Object[] {"WTW", "G*G", " r ", '*', new ItemStack(TFItems.transformiumArmorMolds, 1, 1), 'W', TFItems.tankTracks, 'T', TFItems.tankTurret, 'r', new ItemStack(Items.dye, 1, 1), 'G', Items.gold_ingot});
        GameRegistry.addRecipe(new ItemStack(TFItems.purgeLeggings, 1), new Object[] {"I*I", "r r", '*', new ItemStack(TFItems.transformiumArmorMolds, 1, 2), 'r', new ItemStack(Items.dye, 1, 1), 'I', Items.iron_ingot});
        GameRegistry.addRecipe(new ItemStack(TFItems.purgeBoots, 1), new Object[] {"r*r", "b b", '*', new ItemStack(TFItems.transformiumArmorMolds, 1, 3), 'b', new ItemStack(Items.dye, 1, 0), 'r', new ItemStack(Items.dye, 1, 1)});

        GameRegistry.addRecipe(new ItemStack(TFItems.vurpHelmet, 1), new Object[] {"bIb", "I*I", "gGg", '*', new ItemStack(TFItems.transformiumArmorMolds, 1, 0), 'I', Items.iron_ingot, 'G', new ItemStack(Blocks.stained_glass_pane, 1, 5), 'g', new ItemStack(Items.dye, 1, 7), 'b', new ItemStack(Items.dye, 1, 0)});
        GameRegistry.addRecipe(new ItemStack(TFItems.vurpChestplate, 1), new Object[] {"WEW", "s*s", " l ", '*', new ItemStack(TFItems.transformiumArmorMolds, 1, 1), 'W', TFItems.carWheel, 'E', TFItems.standardEngine, 's', new ItemStack(Items.dye, 1, 7), 'l', new ItemStack(Items.dye, 1, 10)});
        GameRegistry.addRecipe(new ItemStack(TFItems.vurpLeggings, 1), new Object[] {"s*s", "lsl", "W W", '*', new ItemStack(TFItems.transformiumArmorMolds, 1, 2), 's', new ItemStack(Items.dye, 1, 7), 'l', new ItemStack(Items.dye, 1, 10), 'W', TFItems.carWheel});
        GameRegistry.addRecipe(new ItemStack(TFItems.vurpBoots, 1), new Object[] {"s*s", '*', new ItemStack(TFItems.transformiumArmorMolds, 1, 3), 's', new ItemStack(Items.dye, 1, 7)});

        GameRegistry.addRecipe(new ItemStack(TFItems.subwooferHelmet, 1), new Object[] {"byb", "I*I", "IGI", '*', new ItemStack(TFItems.transformiumArmorMolds, 1, 0), 'I', Items.iron_ingot, 'G', new ItemStack(Blocks.stained_glass_pane, 1, 3), 'b', new ItemStack(Items.dye, 1, 4), 'y', new ItemStack(Items.dye, 1, 11)});
        GameRegistry.addRecipe(new ItemStack(TFItems.subwooferChestplate, 1), new Object[] {"W*W", "bGb", "WEW", '*', new ItemStack(TFItems.transformiumArmorMolds, 1, 1), 'W', TFItems.carWheel, 'E', TFItems.standardEngine, 'b', new ItemStack(Items.dye, 1, 4), 'G', new ItemStack(Blocks.stained_glass_pane, 1, 3)});
        GameRegistry.addRecipe(new ItemStack(TFItems.subwooferLeggings, 1), new Object[] {"b*b", "y y", '*', new ItemStack(TFItems.transformiumArmorMolds, 1, 2), 'b', new ItemStack(Items.dye, 1, 4), 'y', new ItemStack(Items.dye, 1, 11)});
        GameRegistry.addRecipe(new ItemStack(TFItems.subwooferBoots, 1), new Object[] {"b*b", '*', new ItemStack(TFItems.transformiumArmorMolds, 1, 3), 'b', new ItemStack(Items.dye, 1, 4)});

        GameRegistry.addRecipe(new ItemStack(TFItems.cloudtrapHelmet, 1), new Object[] {"bbb", "b*b", "IGI", '*', new ItemStack(TFItems.transformiumArmorMolds, 1, 0), 'I', Items.iron_ingot, 'G', new ItemStack(Blocks.stained_glass_pane, 1, 5), 'b', new ItemStack(Items.dye, 1, 0)});
        GameRegistry.addRecipe(new ItemStack(TFItems.cloudtrapChestplate, 1), new Object[] {"WpW", "g*g", " C ", '*', new ItemStack(TFItems.transformiumArmorMolds, 1, 1), 'W', TFItems.t50JetWing, 'C', TFItems.t50JetCockpit, 'p', new ItemStack(Items.dye, 1, 5), 'g', new ItemStack(Items.dye, 1, 7)});
        GameRegistry.addRecipe(new ItemStack(TFItems.cloudtrapLeggings, 1), new Object[] {"b b", "g*g", '*', new ItemStack(TFItems.transformiumArmorMolds, 1, 2), 'b', new ItemStack(Items.dye, 1, 0), 'g', new ItemStack(Items.dye, 1, 7)});
        GameRegistry.addRecipe(new ItemStack(TFItems.cloudtrapBoots, 1), new Object[] {"s*s", "T T", '*', new ItemStack(TFItems.transformiumArmorMolds, 1, 3), 's', new ItemStack(Items.dye, 1, 7), 'T', TFItems.jetThruster});



        //      GameRegistry.addRecipe(new ItemStack(TFItems.cloudtrapHelmet, 1), new Object[] {" b ", "I*I", " t ", '*', new ItemStack(TFItems.transformiumArmorMolds, 1, 0), 'I', Items.iron_ingot, 't', new ItemStack(Items.dye, 1, 0), 'b', new ItemStack(Items.dye, 1, 10)});
        //      GameRegistry.addRecipe(new ItemStack(TFItems.cloudtrapChestplate, 1), new Object[] {"rwr", "W*W", " C ", '*', new ItemStack(TFItems.transformiumArmorMolds, 1, 1), 'C', TFItems.t50JetCockpit, 'W', TFItems.t50JetWing, 'r', new ItemStack(Items.dye, 1, 10), 'w', new ItemStack(Items.dye, 1, 12)});
        //      GameRegistry.addRecipe(new ItemStack(TFItems.cloudtrapLeggings, 1), new Object[] {" b ", "w*w", '*', new ItemStack(TFItems.transformiumArmorMolds, 1, 2), 'w', new ItemStack(Items.dye, 1, 12), 'b', new ItemStack(Items.dye, 1, 10)});
        //      GameRegistry.addRecipe(new ItemStack(TFItems.cloudtrapBoots, 1), new Object[] {" g ", "b*b", "T T", '*', new ItemStack(TFItems.transformiumArmorMolds, 1, 3), 'T', TFItems.jetThruster, 'b', new ItemStack(Items.dye, 1, 12), 'g', new ItemStack(Items.dye, 1, 10)});
    }
}