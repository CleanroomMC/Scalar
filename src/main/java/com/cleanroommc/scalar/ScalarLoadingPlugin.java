package com.cleanroommc.scalar;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.FMLModContainer;
import net.minecraftforge.fml.common.ILanguageAdapter;
import net.minecraftforge.fml.relauncher.FMLSecurityManager;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Map;

public class ScalarLoadingPlugin implements IFMLLoadingPlugin {
    public static Logger LOGGER = LogManager.getLogger("Scalar");

    ScalarLoadingPlugin() {
        try {
            MethodHandles.lookup().findStatic(FMLModContainer.class, "registerLanguageAdapter", MethodType.methodType(Void.class, String.class, ILanguageAdapter.class)).invoke("scala", new ScalaLanguageAdapter());
        } catch (Throwable ex) {
            LOGGER.fatal("Not running on Cleanroom!");
            FMLCommonHandler.instance().exitJava(1, true);
        }
    }
    @Override
    public String[] getASMTransformerClass() {
        return new String[0];
    }

    @Override
    public String getModContainerClass() {
        return "com.cleanroommc.scalar.ScalarModContainer";
    }

    @Nullable
    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {

    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }
}
