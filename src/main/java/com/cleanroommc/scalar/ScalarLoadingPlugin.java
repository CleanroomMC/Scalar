package com.cleanroommc.scalar;

import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.ILanguageAdapter;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.util.Map;

public class ScalarLoadingPlugin implements IFMLLoadingPlugin {
    public static Logger LOGGER = LogManager.getLogger("Scalar");

    public ScalarLoadingPlugin() {
        try {
            Class.forName("com.cleanroommc.loader.LanguageAdapterRegistry").getDeclaredMethod("registerLanguageAdapter", String.class, ILanguageAdapter.class).invoke(null, "scala", new ScalaLanguageAdapter());
        } catch (Throwable ex) {
            LOGGER.fatal("Scalar was loaded in non-Cleanroom environment. This shouldn't be possible, please re-download the mod file.");
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
