package com.cleanroommc.scalar;

import com.google.common.eventbus.EventBus;
import net.minecraftforge.fml.common.DummyModContainer;
import net.minecraftforge.fml.common.LoadController;
import net.minecraftforge.fml.common.ModMetadata;

public class ScalarModContainer extends DummyModContainer {
    public ScalarModContainer() {
        super(new ModMetadata(){{
                modId = Reference.MOD_ID;
                version = Reference.VERSION;
                name = "Scalar";
        }});
    }

    @Override
    public boolean registerBus(EventBus bus, LoadController controller) {
        return true;
    }

}
