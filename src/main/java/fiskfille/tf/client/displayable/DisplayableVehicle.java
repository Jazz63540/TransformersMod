package fiskfille.tf.client.displayable;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import fiskfille.tf.TransformersAPI;
import fiskfille.tf.client.model.transformer.definition.TFModelRegistry;
import fiskfille.tf.client.model.transformer.definition.TransformerModel;
import fiskfille.tf.client.model.transformer.vehicle.ModelVehicleBase;
import fiskfille.tf.common.transformer.base.Transformer;

public class DisplayableVehicle extends Displayable
{
    @Override
    public void render(ItemStack itemstack)
    {
    	bindTexture(getTextureFromStack(itemstack));
        ModelVehicleBase vehicle = getModelFromStack(itemstack);

        if (vehicle != null)
        {
            GL11.glRotatef(mc.thePlayer.ticksExisted * 0.5F, 0.0F, 1.0F, 0.0F);
            GL11.glTranslatef(0.0F, -0.2F, 0.0F);

            float scale = 0.75F;
            GL11.glScalef(scale, scale, scale);
            vehicle.render();
        }
    }

	public ModelVehicleBase getModelFromStack(ItemStack displayItem)
    {
        Transformer transformer = TransformersAPI.getTransformers().get(displayItem.getItemDamage());

        if (transformer != null)
        {
            return TFModelRegistry.getModel(transformer).getVehicleModel();
        }

        return null;
    }
	
    public ResourceLocation getTextureFromStack(ItemStack displayItem)
    {
    	Transformer transformer = TransformersAPI.getTransformers().get(displayItem.getItemDamage());
    	TransformerModel model = TFModelRegistry.getModel(transformer);
    	
        if (model != null)
        {
            return model.getTexture(null);
        }
    	
		return null;
	}

    public float getBlockHeight(ItemStack itemstack)
    {
        int i = itemstack.getItemDamage();

        if (i == 2)
        {
            return 0.85F;
        }

        return 1.0F;
    }
}
