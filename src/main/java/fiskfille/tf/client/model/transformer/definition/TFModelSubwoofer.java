package fiskfille.tf.client.model.transformer.definition;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import fiskfille.tf.TransformersMod;
import fiskfille.tf.client.model.transformer.ModelChildBase.Biped;
import fiskfille.tf.client.model.transformer.ModelSubwoofer;
import fiskfille.tf.client.model.transformer.stealth.ModelSubwooferStealth;
import fiskfille.tf.client.model.transformer.vehicle.ModelSubwooferVehicle;
import fiskfille.tf.client.model.transformer.vehicle.ModelVehicleBase;

public class TFModelSubwoofer extends TransformerModel
{
    private ModelSubwoofer model;
    private ModelSubwooferVehicle vehicle;
    private ModelSubwooferStealth stealth;

    public TFModelSubwoofer()
    {
        model = new ModelSubwoofer();
        vehicle = new ModelSubwooferVehicle();
        stealth = new ModelSubwooferStealth();
    }

    @Override
    public Biped getMainModel()
    {
        return model;
    }

    @Override
    public ModelVehicleBase getVehicleModel()
    {
        return vehicle;
    }

    @Override
    public Biped getStealthModel()
    {
        return stealth;
    }

    @Override
    public ModelRenderer getLowerArm()
    {
        return model.lowerArmR;
    }

    @Override
    public ModelRenderer getUpperArm()
    {
        return model.shoulderbaseR;
    }

    @Override
    public ModelRenderer getBody()
    {
        return model.chestmain3;
    }

    @Override
    public ModelRenderer getHead()
    {
        return model.head;
    }

    @Override
    public void renderItem(EntityPlayer player, ItemStack stack)
    {
        GL11.glTranslatef(0.05F, -0F, 0.1F);
    }

    @Override
    public void renderCape(EntityPlayer player)
    {
        GL11.glTranslatef(0.18F, 0F, -0.01F);
    }

    @Override
    public void renderFirstPersonArm(EntityPlayer player)
    {
        GL11.glTranslatef(0.1F, 0.0F, 0.15F);
    }

    @Override
    public ResourceLocation getTexture(Entity entity)
    {
        return new ResourceLocation(TransformersMod.modid, "textures/models/subwoofer/subwoofer.png");
    }
}
