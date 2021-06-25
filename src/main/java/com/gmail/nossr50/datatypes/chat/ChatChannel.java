package com.gmail.nossr50.datatypes.chat;

import com.gmail.nossr50.locale.LocaleLoader;
import org.jetbrains.annotations.Nullable;

public enum ChatChannel {
    ADMIN("Commands.AdminChat.On", "Commands.AdminChat.Off"),
    PARTY("Commands.Party.Chat.On", "Commands.Party.Chat.Off"),
    PARTY_OFFICER(null, null),
    NONE(null, null);

    private final String enabledMessage;
    private final String disabledMessage;

    ChatChannel(@Nullable String enabledMessage, @Nullable String disabledMessage) {
        this.enabledMessage  = enabledMessage;
        this.disabledMessage = disabledMessage;
    }

    public @Nullable String getEnabledMessage() {
        return enabledMessage != null ? LocaleLoader.getString(enabledMessage) : null;
    }

    public @Nullable String getDisabledMessage() {
        return disabledMessage != null ? LocaleLoader.getString(disabledMessage) : null;
    }
}
