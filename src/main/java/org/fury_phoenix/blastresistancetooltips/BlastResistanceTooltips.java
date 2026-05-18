package org.fury_phoenix.blastresistancetooltips;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
    modid = BlastResistanceTooltips.MODID,
    name = "Blast Resistance Tooltips",
    version = "1.0",
    clientSideOnly = true,
    acceptableRemoteVersions = "*",
    acceptableSaveVersions = "*"
)
public class BlastResistanceTooltips {
    public static final String MODID = "blastresistancetooltips";
    public static final Logger LOGGER = LogManager.getLogger(MODID);
}
