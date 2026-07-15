package de.jakobkruse.tikfinity;

import net.minecraft.commands.Commands;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerPlayer;

import java.util.Arrays;

public class CommandExecutor{
    private final MinecraftServer server;

    public CommandExecutor(MinecraftServer server) {
        this.server = server;
    }

    public void execute(String command) {
        if(command.trim().isEmpty()) {
            return;
        }
        try {
            server.execute(() -> {
                String[] playerNames = server.getPlayerNames();

                if (playerNames.length > 0) {
                    String firstPlayer = playerNames[0];

                    ServerPlayer player = server.getPlayerList().getPlayerByName(firstPlayer);

                    if(player == null) {
                        return;
                    }


                    Commands cm = server.getCommands();
                    if(cm == null) {
                        return;
                    }

                    String[] commands = Arrays.stream(command.split("\n")).map(String::trim).map(cmd -> cmd.startsWith("/") ? cmd : "/" + cmd).toArray(String[]::new);
                    for (String cmd : commands) {
                        cm.performPrefixedCommand(player.createCommandSourceStack(), cmd.trim());
                    }
                }
            });
        } catch (NullPointerException ignored) {

        }

    }
}
