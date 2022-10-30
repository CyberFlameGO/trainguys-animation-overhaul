package com.trainguy.animationoverhaul.commands;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.commands.CommandSourceStack;

public class DebugCommands {
    public static void registerDebugCommands(CommandDispatcher<CommandSourceStack> dispatcher){
        CommandModifyParameter.register(dispatcher);
    }
}
