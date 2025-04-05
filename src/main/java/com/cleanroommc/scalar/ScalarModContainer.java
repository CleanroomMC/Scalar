package com.cleanroommc.scalar;

import net.minecraftforge.fml.common.DummyModContainer;
import net.minecraftforge.fml.common.ModMetadata;

public class ScalarModContainer extends DummyModContainer {
    public ScalarModContainer() {
        super(new ModMetadata(){{
                modId = Reference.MOD_ID;
                version = Reference.VERSION;
                name = "Scalar";
        }});
    }
}
