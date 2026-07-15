
# TikFinity Connector

A Minecraft Java 26.2 Fabric mod that connects your TikTok stream to Minecraft using [TikFinity](https://tikfinity.zerody.one/)!

## Installation

### Fabric

Install Minecraft Java 26.2 and Fabric Loader 0.19.3 or newer ([official installation guide](https://fabricmc.net/use/installer/)). Java 25 is required when building the mod.

### Fabric API

Install [Fabric API](https://modrinth.com/mod/fabric-api).

### Cloth Config

Cloth Config is a helper mod used by tikfinity. You need to download and install that alongside the tikfinity mod

[Link](https://modrinth.com/mod/cloth-config)

### Tikfinity Connector

This is the main mod. Download the latest `tikfinity-x.y.z.jar` from the GitHub releases (not the sources JAR), or build it with `./gradlew build` and use the JAR in `build/libs`.

### (Optional) Mod Menu

For easier configuration, you can also install Mod Menu.

[Link](https://modrinth.com/mod/modmenu)

## Usage

### Prerequisites

Make sure you have completed the Installation section and have an account on [TikFinity](https://tikfinity.zerody.one).

Then start Minecraft and join any single player world. This mod will not work on a server yet. Use the [ServerTap](https://servertap.io/) plugin instead.

### Setup

Visit [TikFinity](https://tikfinity.zerody.one) and go to Setup -> Minecraft Connection and enter the following:

IP: 127.0.0.1

Port: 4567

The password is only used for the ServerTap plugin and does not matter.

Click "Test Connection" and it should show this:

```
Connection successfully established!

Server Name: TikFinity Mod
Server Version: 26.2
```

## Configuration

For now, you can only change the port for the web-server (defaults to 4567).

This is the easiest with the mod menu mod, but can also be manually edited using the config file at `config/tikfinity.toml` in the instance folder.

# Troubleshooting

## Connection failed

- Is the mod installed and shown inside of mod menu?

- Have you joined a world?

- Is the port correct? Default: 4567

## Not listed here?

Join the [Discord](https://discord.gg/TCPeS356TD)
