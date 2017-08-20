package net.kodehawa.mantarobot.core.listeners.operations.core;

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;

@FunctionalInterface
public interface InteractiveOperation extends Operation {
    int run(GuildMessageReceivedEvent event);
}