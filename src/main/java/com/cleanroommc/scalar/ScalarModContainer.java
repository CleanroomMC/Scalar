package com.cleanroommc.scalar;

import net.minecraftforge.fml.common.DummyModContainer;
import net.minecraftforge.fml.common.ModMetadata;

public class ScalarModContainer extends DummyModContainer {
    public ScalarModContainer() {
        super(new ModMetadata(){{
                modId = Tags.MOD_ID;
                version = Tags.MOD_VERSION;
                name = "Scalar";
        }});
    }
}
