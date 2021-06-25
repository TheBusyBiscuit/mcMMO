package com.gmail.nossr50.datatypes.json;

import org.jetbrains.annotations.NotNull;

import com.gmail.nossr50.locale.LocaleLoader;
import com.gmail.nossr50.util.text.StringUtils;

public enum McMMOWebLink {
    WEBSITE("JSON.URL.Website", "https://www.mcmmo.org"),
    DISCORD("JSON.URL.Discord", "https://discord.gg/mcMMO"),
    PATREON("JSON.URL.Patreon", "http://patreon.mcmmo.org"),
    SPIGOT("JSON.URL.Spigot", "http://spigot.mcmmo.org"),
    HELP_TRANSLATE("JSON.URL.Translation", "https://translate.mcmmo.org/"),
    WIKI("JSON.URL.Wiki", "https://www.mcmmo.org/wiki/");

    private final String localePath;
    private final String url;

    McMMOWebLink(@NotNull String localePath, @NotNull String url) {
        this.localePath = localePath;
        this.url = url;
    }

    public @NotNull String getUrl() {
        return url;
    }

    public @NotNull String getNiceTitle() {
        return StringUtils.getCapitalized(name());
    }

    public @NotNull String getLocaleDescription() {
        return LocaleLoader.getString(localePath);
    }
}
