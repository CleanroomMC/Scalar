package com.cleanroommc.scalar;

import net.minecraftforge.fml.common.DummyModContainer;
import net.minecraftforge.fml.common.ModMetadata;

import java.util.List;

public class ScalarModContainer extends DummyModContainer {
    public ScalarModContainer() {
        super(new ModMetadata(){{
                modId = "scalar";
                version = "1.0.0";
                name = "Scalar Legacy";
                description = "Scala language adapter provider ships Scala 2.11, supports legacy Forge mods";
                url = "https://github.com/CleanroomMC/Scalar";
                authorList = List.of("CleanroomMC", "kappa_maintainer");
        }});
    }
}
