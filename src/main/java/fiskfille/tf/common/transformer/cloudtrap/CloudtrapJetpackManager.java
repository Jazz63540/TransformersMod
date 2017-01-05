package fiskfille.tf.common.transformer.cloudtrap;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.Vec3;
import fiskfille.tf.TransformersMod;
import fiskfille.tf.client.particle.TFParticleType;
import fiskfille.tf.client.particle.TFParticles;
import fiskfille.tf.common.network.MessageCloudtrapJetpack;
import fiskfille.tf.common.network.base.TFNetworkManager;
import fiskfille.tf.helper.TFVectorHelper;

/**
 * @author gegy1000
 */
public class CloudtrapJetpackManager
{
    public static Map<EntityPlayer, Boolean> cloudtrapJetpacking = new HashMap<EntityPlayer, Boolean>();

    private static boolean prevJetpacking;

    public static void cloudtrapTick(EntityPlayer player)
    {
        boolean isClientPlayer = TransformersMod.proxy.getPlayer() == player;
        boolean jetpacking = Minecraft.getMinecraft().gameSettings.keyBindJump.getIsKeyPressed() && !player.capabilities.isFlying;

        if (isClientPlayer)
        {
            if (prevJetpacking != jetpacking)
            {
                TFNetworkManager.networkWrapper.sendToServer(new MessageCloudtrapJetpack(player, jetpacking));
                prevJetpacking = jetpacking;
            }
        }
        else
        {
            boolean playerJetpacking = false;
            Boolean playerJetpackingObj = cloudtrapJetpacking.get(player);

            if (playerJetpackingObj != null)
            {
                playerJetpacking = playerJetpackingObj;
            }
            else
            {
                cloudtrapJetpacking.put(player, false);
            }

            jetpacking = playerJetpacking;
        }

        if (jetpacking)
        {
            player.motionY += 0.1F;

            if (player.motionY > 0.6F)
            {
                player.motionY = 0.6F;
            }

            for (int i = 0; i < 20; ++i)
            {
                Random rand = new Random();
                Vec3 coords = TFVectorHelper.getSideCoords(player, 0.15, i > 10, false);
                TFParticles.spawnParticle(TFParticleType.FLAMETHROWER_FLAME, coords.xCoord, coords.yCoord + rand.nextFloat() / 4 - 0.125F, coords.zCoord, rand.nextFloat() / 4 - 0.125F, -0.8F, rand.nextFloat() / 4 - 0.125F);
            }
        }
    }
}
