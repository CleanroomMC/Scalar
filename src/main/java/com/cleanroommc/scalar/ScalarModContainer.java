package com.cleanroommc.scalar;

import net.minecraftforge.fml.common.DummyModContainer;
import net.minecraftforge.fml.common.ModMetadata;
import com.cleanroommc.scalar.Tags;

public class ScalarModContainer extends DummyModContainer {
    private static final ModMetadata md = new ModMetadata();
    static {
        md.modId = Tags.MOD_ID;
        md.version = Tags.MOD_VERSION;
        md.name = "Scalar";
    }
    ScalarModContainer() {
        super(md);
    }
}
