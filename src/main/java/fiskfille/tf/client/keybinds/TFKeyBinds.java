package fiskfille.tf.client.keybinds;

import cpw.mods.fml.client.registry.ClientRegistry;
import org.lwjgl.input.Keyboard;

public class TFKeyBinds
{
    public static TFKeyBinding keyBindingTransform1 = new TFKeyBinding("Transform-Alt-1", Keyboard.KEY_C);
    public static TFKeyBinding keyBindingTransform2 = new TFKeyBinding("Transform-Alt-2", Keyboard.KEY_F);
    public static TFKeyBinding keyBindingNitro = new TFKeyBinding("Nitro Boost", Keyboard.KEY_X);
    public static TFKeyBinding keyBindingBrake = new TFKeyBinding("Brake", Keyboard.KEY_Z);
    public static TFKeyBinding keyBindingZoom = new TFKeyBinding("Aim", Keyboard.KEY_B);
    public static TFKeyBinding keyBindingStealthMode = new TFKeyBinding("Stealth Force Mode", Keyboard.KEY_V);
    public static TFKeyBinding keyBindingVehicleFirstPerson = new TFKeyBinding("Vehicle First Person", Keyboard.KEY_G);
    public static TFKeyBinding keyBindingViewFront = new TFKeyBinding("View Vehicle Front", Keyboard.KEY_R);

    public static void register()
    {
        ClientRegistry.registerKeyBinding(keyBindingTransform1);
        ClientRegistry.registerKeyBinding(keyBindingTransform2);
        ClientRegistry.registerKeyBinding(keyBindingStealthMode);
        ClientRegistry.registerKeyBinding(keyBindingNitro);
        ClientRegistry.registerKeyBinding(keyBindingBrake);
        ClientRegistry.registerKeyBinding(keyBindingZoom);
        ClientRegistry.registerKeyBinding(keyBindingVehicleFirstPerson);
        ClientRegistry.registerKeyBinding(keyBindingViewFront);
    }
}
