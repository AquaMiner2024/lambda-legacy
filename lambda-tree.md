.
├── build
│   ├── classes
│   │   └── kotlin
│   │       └── main
│   ├── createMcpToSrg
│   │   └── output.tsrg
│   ├── downloadMCMeta
│   │   └── version.json
│   ├── downloadMcpConfig
│   │   └── output.zip
│   ├── extractSrg
│   │   └── output.srg
│   ├── jarjar
│   │   └── jarJar
│   │       └── metadata.json
│   ├── kotlin
│   │   └── compileKotlin
│   │       ├── cacheable
│   │       │   ├── caches-jvm
│   │       │   │   ├── inputs
│   │       │   │   ├── jvm
│   │       │   │   └── lookups
│   │       │   └── dirty-sources.txt
│   │       ├── classpath-snapshot
│   │       └── local-state
│   │           └── build-history.bin
│   ├── resources
│   │   └── main
│   │       ├── assets
│   │       │   ├── fonts
│   │       │   │   ├── FiraSans-Bold.ttf
│   │       │   │   ├── FiraSans-Italic.ttf
│   │       │   │   ├── FiraSans-Regular.ttf
│   │       │   │   └── OTF.txt
│   │       │   ├── minecraft
│   │       │   │   ├── lambda
│   │       │   │   │   ├── lambda_icon.png
│   │       │   │   │   ├── lambda_map.png
│   │       │   │   │   └── textures
│   │       │   │   │       ├── capes
│   │       │   │   │       │   ├── border.png
│   │       │   │   │       │   ├── contributor.png
│   │       │   │   │       │   └── primary.png
│   │       │   │   │       └── hungeroverlay.png
│   │       │   │   └── shaders
│   │       │   │       ├── post
│   │       │   │       │   ├── esp_outline.json
│   │       │   │       │   ├── grainy_blur.json
│   │       │   │       │   └── kawase_blur_6.json
│   │       │   │       └── program
│   │       │   │           ├── esp_outline.fsh
│   │       │   │           ├── esp_outline.json
│   │       │   │           ├── grainy_blur.fsh
│   │       │   │           ├── grainy_blur.json
│   │       │   │           ├── grainy_blur.vsh
│   │       │   │           ├── kawase_blur.fsh
│   │       │   │           ├── kawase_blur.json
│   │       │   │           └── kawase_blur.vsh
│   │       │   └── shaders
│   │       │       └── menu
│   │       │           ├── bluegrid.fsh
│   │       │           ├── bluenebula.fsh
│   │       │           ├── bluevortex.fsh
│   │       │           ├── cave.fsh
│   │       │           ├── clouds.fsh
│   │       │           ├── doughnuts.fsh
│   │       │           ├── fire.fsh
│   │       │           ├── jupiter.fsh
│   │       │           ├── matrix.fsh
│   │       │           ├── minecraft.fsh
│   │       │           ├── purplegrid.fsh
│   │       │           ├── purplemist.fsh
│   │       │           ├── redglow.fsh
│   │       │           ├── sky.fsh
│   │       │           ├── snake.fsh
│   │       │           ├── space2.fsh
│   │       │           ├── space.fsh
│   │       │           ├── storm.fsh
│   │       │           ├── triangle.fsh
│   │       │           └── vert.vsh
│   │       ├── lambda.png
│   │       ├── LICENSE-Slick2D TrueTypeFont.txt
│   │       ├── mcmod.info
│   │       └── mixins.lambda.json
│   └── tmp
│       └── compileJava
├── build.gradle
├── detekt.yml
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradle.properties
├── gradlew
├── gradlew.bat
├── LICENSE.md
├── logo_ascii.txt
├── README.md
├── run
├── setupWorkspace.sh
└── src
    └── main
        ├── java
        │   └── com
        │       └── lambda
        │           └── mixin
        │               ├── accessor
        │               │   ├── AccessorAnvilChunkLoader.java
        │               │   ├── AccessorEntityFireworkRocket.java
        │               │   ├── AccessorEntity.java
        │               │   ├── AccessorItemTool.java
        │               │   ├── AccessorMinecraft.java
        │               │   ├── AccessorTimer.java
        │               │   ├── gui
        │               │   │   ├── AccessorGuiBossOverlay.java
        │               │   │   ├── AccessorGuiChat.java
        │               │   │   ├── AccessorGuiDisconnected.java
        │               │   │   ├── AccessorGuiEditSign.java
        │               │   │   └── AccessorGuiScreen.java
        │               │   ├── network
        │               │   │   ├── AccessorCPacketChatMessage.java
        │               │   │   ├── AccessorCPacketClientSettings.java
        │               │   │   ├── AccessorCPacketCloseWindow.java
        │               │   │   ├── AccessorCPacketConfirmTransaction.java
        │               │   │   ├── AccessorCPacketPlayerAbilities.java
        │               │   │   ├── AccessorCPacketPlayer.java
        │               │   │   ├── AccessorCPacketResourcePackStatus.java
        │               │   │   ├── AccessorCPacketSpectate.java
        │               │   │   ├── AccessorCPacketUseEntity.java
        │               │   │   ├── AccessorCPacketVehicleMove.java
        │               │   │   ├── AccessorNetHandlerPlayClient.java
        │               │   │   ├── AccessorSPacketChat.java
        │               │   │   ├── AccessorSPacketCloseWindow.java
        │               │   │   ├── AccessorSPacketEntityHeadLook.java
        │               │   │   ├── AccessorSPacketEntity.java
        │               │   │   ├── AccessorSPacketEntityVelocity.java
        │               │   │   ├── AccessorSPacketExplosion.java
        │               │   │   ├── AccessorSPacketMaps.java
        │               │   │   ├── AccessorSPacketPosLook.java
        │               │   │   └── AccessorSPacketWorldBorder.java
        │               │   ├── player
        │               │   │   ├── AccessorEntityPlayerSP.java
        │               │   │   └── AccessorPlayerControllerMP.java
        │               │   └── render
        │               │       ├── AccessorRenderGlobal.java
        │               │       ├── AccessorRenderManager.java
        │               │       ├── AccessorShaderGroup.java
        │               │       └── AccessorViewFrustum.java
        │               ├── baritone
        │               │   └── MixinBaritoneSettings.java
        │               ├── entity
        │               │   ├── MixinEntity.java
        │               │   ├── MixinEntityLivingBase.java
        │               │   ├── MixinEntityLlama.java
        │               │   └── MixinEntityPig.java
        │               ├── gui
        │               │   ├── MixinGuiChat.java
        │               │   ├── MixinGuiContainer.java
        │               │   ├── MixinGuiIngameForge.java
        │               │   ├── MixinGuiIngameMenu.java
        │               │   ├── MixinGuiInventory.java
        │               │   ├── MixinGuiMainMenu.java
        │               │   ├── MixinGuiMultiplayer.java
        │               │   ├── MixinGuiNewChat.java
        │               │   ├── MixinGuiPlayerTabOverlay.java
        │               │   └── MixinGuiScreen.java
        │               ├── MixinElytraSound.java
        │               ├── MixinMinecraft.java
        │               ├── MixinStateImplementation.java
        │               ├── MixinTileEntityBeacon.java
        │               ├── network
        │               │   ├── MixinNetHandlerPlayClient.java
        │               │   └── MixinNetworkManager.java
        │               ├── optifine
        │               │   └── MixinConfig.java
        │               ├── player
        │               │   ├── MixinEntityPlayer.java
        │               │   ├── MixinEntityPlayerSP.java
        │               │   └── MixinPlayerControllerMP.java
        │               ├── render
        │               │   ├── MixinDebugRendererChunkBorder.java
        │               │   ├── MixinEntityRenderer.java
        │               │   ├── MixinFontRenderer.java
        │               │   ├── MixinItemRenderer.java
        │               │   ├── MixinLayerArmorBase.java
        │               │   ├── MixinLayerCape.java
        │               │   ├── MixinLayerElytra.java
        │               │   ├── MixinMapItemRenderer.java
        │               │   ├── MixinModelBiped.java
        │               │   ├── MixinModelBoat.java
        │               │   ├── MixinParticleManager.java
        │               │   ├── MixinRenderGlobal.java
        │               │   ├── MixinRender.java
        │               │   ├── MixinRenderLivingBase.java
        │               │   ├── MixinRenderManager.java
        │               │   ├── MixinRenderPlayer.java
        │               │   ├── MixinTileEntityRendererDispatcher.java
        │               │   ├── MixinTileEntitySignRenderer.java
        │               │   ├── MixinTileRendererDispatcher.java
        │               │   └── MixinVisGraph.java
        │               └── world
        │                   ├── MixinBlockDragonEgg.java
        │                   ├── MixinBlockFluidRenderer.java
        │                   ├── MixinBlock.java
        │                   ├── MixinBlockLiquid.java
        │                   ├── MixinBlockModelRenderer.java
        │                   ├── MixinBlockSoulSand.java
        │                   ├── MixinBlockWeb.java
        │                   ├── MixinGetCollisionBB.java
        │                   ├── MixinItemBlock.java
        │                   └── MixinWorld.java
        ├── kotlin
        │   └── com
        │       └── lambda
        │           └── client
        │               ├── capeapi
        │               │   ├── AbstractUUIDManager.kt
        │               │   ├── DataClasses.kt
        │               │   └── UUIDUtils.kt
        │               ├── command
        │               │   ├── AbstractCommandManager.kt
        │               │   ├── args
        │               │   │   ├── AbstractArg.kt
        │               │   │   ├── ArgIdentifier.kt
        │               │   │   ├── Args.kt
        │               │   │   ├── AutoComplete.kt
        │               │   │   └── FinalArg.kt
        │               │   ├── Args.kt
        │               │   ├── ClientCommand.kt
        │               │   ├── CommandBuilder.kt
        │               │   ├── Command.kt
        │               │   ├── CommandManager.kt
        │               │   ├── commands
        │               │   │   ├── BaritoneCommand.kt
        │               │   │   ├── BindCommand.kt
        │               │   │   ├── ConfigCommand.kt
        │               │   │   ├── CreditsCommand.kt
        │               │   │   ├── EjectCommand.kt
        │               │   │   ├── EntityStatsCommand.kt
        │               │   │   ├── FakeMessageCommand.kt
        │               │   │   ├── FriendCommand.kt
        │               │   │   ├── GenerateWebsiteCommand.kt
        │               │   │   ├── HelpCommand.kt
        │               │   │   ├── LicenseCommand.kt
        │               │   │   ├── MacroCommand.kt
        │               │   │   ├── ModifiedCommand.kt
        │               │   │   ├── NBTCommand.kt
        │               │   │   ├── OpenFolderCommand.kt
        │               │   │   ├── PacketCommand.kt
        │               │   │   ├── PeekCommand.kt
        │               │   │   ├── PlaytimeCommand.kt
        │               │   │   ├── PluginCommand.kt
        │               │   │   ├── PrefixCommand.kt
        │               │   │   ├── SayCommand.kt
        │               │   │   ├── ScaffoldCommand.kt
        │               │   │   ├── SearchCommand.kt
        │               │   │   ├── SeenCommand.kt
        │               │   │   ├── SetBuildingBlockCommand.kt
        │               │   │   ├── SetCommand.kt
        │               │   │   ├── SignBookCommand.kt
        │               │   │   ├── ToggleCommand.kt
        │               │   │   ├── TroubleshootCommand.kt
        │               │   │   ├── VanishCommand.kt
        │               │   │   ├── WaypointCommand.kt
        │               │   │   └── XrayCommand.kt
        │               │   ├── execute
        │               │   │   ├── ExecuteEvent.kt
        │               │   │   ├── ExecuteOption.kt
        │               │   │   └── IExecuteEvent.kt
        │               │   └── utils
        │               │       ├── BlockTypeAlias.kt
        │               │       ├── Exceptions.kt
        │               │       └── Invokable.kt
        │               ├── commons
        │               │   ├── collections
        │               │   │   ├── AliasSet.kt
        │               │   │   ├── CloseableList.kt
        │               │   │   └── NameableSet.kt
        │               │   ├── extension
        │               │   │   ├── Any.kt
        │               │   │   ├── Collection.kt
        │               │   │   ├── Enum.kt
        │               │   │   ├── Map.kt
        │               │   │   ├── Math.kt
        │               │   │   └── String.kt
        │               │   ├── interfaces
        │               │   │   ├── Alias.kt
        │               │   │   ├── DisplayEnum.kt
        │               │   │   └── Nameable.kt
        │               │   └── utils
        │               │       ├── ClassUtils.kt
        │               │       ├── ConnectionUtils.kt
        │               │       ├── MathUtils.kt
        │               │       ├── StringUtils.kt
        │               │       └── SystemUtils.kt
        │               ├── event
        │               │   ├── ClientEvents.kt
        │               │   ├── eventbus
        │               │   │   ├── AbstractAsyncEventBus.kt
        │               │   │   ├── AbstractEventBus.kt
        │               │   │   ├── EventBusImpl.kt
        │               │   │   ├── IAsyncEventBus.kt
        │               │   │   ├── IEventBus.kt
        │               │   │   └── IMultiEventBus.kt
        │               │   ├── events
        │               │   │   ├── AddCollisionBoxToListEvent.kt
        │               │   │   ├── BaritoneCommandEvent.kt
        │               │   │   ├── BaritoneSettingsInitEvent.kt
        │               │   │   ├── BlockBreakEvent.kt
        │               │   │   ├── ChunkDataEvent.kt
        │               │   │   ├── ConnectionEvent.kt
        │               │   │   ├── CriticalsUpdateWalkingEvent.kt
        │               │   │   ├── GuiEvent.kt
        │               │   │   ├── ModuleToggleEvent.kt
        │               │   │   ├── OnUpdateWalkingPlayerEvent.kt
        │               │   │   ├── PacketEvent.kt
        │               │   │   ├── PlayerAttackEvent.kt
        │               │   │   ├── PlayerMoveEvent.kt
        │               │   │   ├── PlayerTravelEvent.kt
        │               │   │   ├── PushOutOfBlocksEvent.kt
        │               │   │   ├── RenderEntityEvent.kt
        │               │   │   ├── RenderOverlayEvent.kt
        │               │   │   ├── RenderRadarEvent.kt
        │               │   │   ├── RenderWorldEvent.kt
        │               │   │   ├── ResolutionUpdateEvent.kt
        │               │   │   ├── RunGameLoopEvent.kt
        │               │   │   ├── ShutdownEvent.kt
        │               │   │   ├── WaypointUpdateEvent.kt
        │               │   │   └── WindowClickEvent.kt
        │               │   ├── ForgeEventProcessor.kt
        │               │   ├── LambdaEventBus.kt
        │               │   ├── LambdaEvents.kt
        │               │   ├── listener
        │               │   │   ├── AbstractListener.kt
        │               │   │   ├── IListener.kt
        │               │   │   └── ListenerImpl.kt
        │               │   └── ListenerManager.kt
        │               ├── gui
        │               │   ├── AbstractLambdaGui.kt
        │               │   ├── clickgui
        │               │   │   ├── component
        │               │   │   │   ├── DownloadPluginButton.kt
        │               │   │   │   ├── ImportPluginButton.kt
        │               │   │   │   ├── ModuleButton.kt
        │               │   │   │   ├── PluginButton.kt
        │               │   │   │   ├── PluginWindow.kt
        │               │   │   │   └── RemotePluginButton.kt
        │               │   │   ├── LambdaClickGui.kt
        │               │   │   └── window
        │               │   │       └── ModuleSettingWindow.kt
        │               │   ├── GuiManager.kt
        │               │   ├── hudgui
        │               │   │   ├── AbstractHudElement.kt
        │               │   │   ├── AbstractLabelHud.kt
        │               │   │   ├── component
        │               │   │   │   └── HudButton.kt
        │               │   │   ├── elements
        │               │   │   │   ├── client
        │               │   │   │   │   ├── BaritoneProcess.kt
        │               │   │   │   │   ├── Bindings.kt
        │               │   │   │   │   ├── ModuleList.kt
        │               │   │   │   │   ├── Username.kt
        │               │   │   │   │   └── WaterMark.kt
        │               │   │   │   ├── combat
        │               │   │   │   │   ├── Armor.kt
        │               │   │   │   │   ├── CombatItemCount.kt
        │               │   │   │   │   └── CrystalDamage.kt
        │               │   │   │   ├── misc
        │               │   │   │   │   ├── CPS.kt
        │               │   │   │   │   ├── FPS.kt
        │               │   │   │   │   ├── MemoryUsage.kt
        │               │   │   │   │   ├── OnlineTime.kt
        │               │   │   │   │   ├── PacketLogViewer.kt
        │               │   │   │   │   ├── Packets.kt
        │               │   │   │   │   ├── Ping.kt
        │               │   │   │   │   ├── Queue2B2T.kt
        │               │   │   │   │   ├── ServerInfo.kt
        │               │   │   │   │   ├── Time.kt
        │               │   │   │   │   └── TPS.kt
        │               │   │   │   ├── player
        │               │   │   │   │   ├── Direction.kt
        │               │   │   │   │   ├── Durability.kt
        │               │   │   │   │   ├── Effects.kt
        │               │   │   │   │   ├── InventoryViewer.kt
        │               │   │   │   │   ├── PlayerModel.kt
        │               │   │   │   │   ├── PlayerSpeed.kt
        │               │   │   │   │   ├── Rotation.kt
        │               │   │   │   │   └── TimerSpeed.kt
        │               │   │   │   └── world
        │               │   │   │       ├── Biome.kt
        │               │   │   │       ├── ChestCounter.kt
        │               │   │   │       ├── ChunkSize.kt
        │               │   │   │       ├── Coordinates.kt
        │               │   │   │       ├── EntityList.kt
        │               │   │   │       ├── Radar.kt
        │               │   │   │       ├── TextRadar.kt
        │               │   │   │       └── WorldTime.kt
        │               │   │   ├── HudElement.kt
        │               │   │   ├── LabelHud.kt
        │               │   │   ├── LambdaHudGui.kt
        │               │   │   └── window
        │               │   │       └── HudSettingWindow.kt
        │               │   ├── mc
        │               │   │   ├── LambdaGuiAntiDisconnect.kt
        │               │   │   ├── LambdaGuiBeacon.kt
        │               │   │   ├── LambdaGuiChat.kt
        │               │   │   ├── LambdaGuiDisconnected.kt
        │               │   │   ├── LambdaGuiIncompat.kt
        │               │   │   ├── LambdaGuiStealButton.kt
        │               │   │   └── LambdaGuiStoreButton.kt
        │               │   └── rgui
        │               │       ├── component
        │               │       │   ├── BindButton.kt
        │               │       │   ├── BooleanSlider.kt
        │               │       │   ├── Button.kt
        │               │       │   ├── CheckButton.kt
        │               │       │   ├── EnumSlider.kt
        │               │       │   ├── SettingButton.kt
        │               │       │   ├── SettingSlider.kt
        │               │       │   ├── Slider.kt
        │               │       │   └── StringButton.kt
        │               │       ├── Component.kt
        │               │       ├── InteractiveComponent.kt
        │               │       ├── WindowComponent.kt
        │               │       └── windows
        │               │           ├── BasicWindow.kt
        │               │           ├── CleanWindow.kt
        │               │           ├── ColorPicker.kt
        │               │           ├── ListWindow.kt
        │               │           ├── SettingWindow.kt
        │               │           └── TitledWindow.kt
        │               ├── LambdaCoreMod.kt
        │               ├── LambdaMod.kt
        │               ├── Loader.kt
        │               ├── manager
        │               │   ├── Manager.kt
        │               │   ├── ManagerLoader.kt
        │               │   └── managers
        │               │       ├── CachedContainerManager.kt
        │               │       ├── ChestCountManager.kt
        │               │       ├── CombatManager.kt
        │               │       ├── FriendManager.kt
        │               │       ├── HotbarManager.kt
        │               │       ├── KamiMojiManager.kt
        │               │       ├── MacroManager.kt
        │               │       ├── MessageManager.kt
        │               │       ├── NetworkManager.kt
        │               │       ├── NotificationManager.kt
        │               │       ├── OnlineTimeManager.kt
        │               │       ├── PacketManager.kt
        │               │       ├── PlayerInventoryManager.kt
        │               │       ├── PlayerPacketManager.kt
        │               │       ├── PluginUpdater.kt
        │               │       ├── TimerManager.kt
        │               │       ├── UUIDManager.kt
        │               │       └── WaypointManager.kt
        │               ├── mixin
        │               │   └── extension
        │               │       ├── Gui.kt
        │               │       ├── Misc.kt
        │               │       ├── Network.kt
        │               │       ├── Player.kt
        │               │       └── Render.kt
        │               ├── module
        │               │   ├── AbstractModule.kt
        │               │   ├── Category.kt
        │               │   ├── Module.kt
        │               │   ├── ModuleManager.kt
        │               │   └── modules
        │               │       ├── chat
        │               │       │   ├── AntiSpam.kt
        │               │       │   ├── AutoExcuse.kt
        │               │       │   ├── AutoQMain.kt
        │               │       │   ├── AutoTPA.kt
        │               │       │   ├── ChatFilter.kt
        │               │       │   ├── ChatTimestamp.kt
        │               │       │   ├── CustomChat.kt
        │               │       │   ├── ExtraChatHistory.kt
        │               │       │   ├── FancyChat.kt
        │               │       │   ├── FriendHighlight.kt
        │               │       │   ├── LambdaMoji.kt
        │               │       │   ├── LoginMessage.kt
        │               │       │   ├── PortalChat.kt
        │               │       │   └── Spammer.kt
        │               │       ├── client
        │               │       │   ├── Baritone.kt
        │               │       │   ├── Capes.kt
        │               │       │   ├── ChatSetting.kt
        │               │       │   ├── ClickGUI.kt
        │               │       │   ├── CommandConfig.kt
        │               │       │   ├── Configurations.kt
        │               │       │   ├── CustomFont.kt
        │               │       │   ├── GuiColors.kt
        │               │       │   ├── HudEditor.kt
        │               │       │   ├── Hud.kt
        │               │       │   ├── MenuShader.kt
        │               │       │   ├── Plugins.kt
        │               │       │   └── Tooltips.kt
        │               │       ├── combat
        │               │       │   ├── AimBot.kt
        │               │       │   ├── AntiDeathScreen.kt
        │               │       │   ├── AntiFriendHit.kt
        │               │       │   ├── AutoArmor.kt
        │               │       │   ├── AutoDisconnect.kt
        │               │       │   ├── AutoEZ.kt
        │               │       │   ├── AutoMend.kt
        │               │       │   ├── AutoOffhand.kt
        │               │       │   ├── AutoTrap.kt
        │               │       │   ├── BedAura.kt
        │               │       │   ├── CombatSetting.kt
        │               │       │   ├── Criticals.kt
        │               │       │   ├── CrystalAura.kt
        │               │       │   ├── CrystalBasePlace.kt
        │               │       │   ├── CrystalESP.kt
        │               │       │   ├── HoleESP.kt
        │               │       │   ├── HoleMiner.kt
        │               │       │   ├── HoleSnap.kt
        │               │       │   ├── KillAura.kt
        │               │       │   ├── MidClickPearl.kt
        │               │       │   ├── Surround.kt
        │               │       │   ├── TotemPopCounter.kt
        │               │       │   └── VisualRange.kt
        │               │       ├── misc
        │               │       │   ├── AntiAFK.kt
        │               │       │   ├── AntiBookKick.kt
        │               │       │   ├── AntiDisconnect.kt
        │               │       │   ├── AntiWeather.kt
        │               │       │   ├── AutoFish.kt
        │               │       │   ├── AutoNametag.kt
        │               │       │   ├── AutoObsidian.kt
        │               │       │   ├── AutoReconnect.kt
        │               │       │   ├── AutoRespawn.kt
        │               │       │   ├── AutoSpawner.kt
        │               │       │   ├── AutoTool.kt
        │               │       │   ├── AutoTunnel.kt
        │               │       │   ├── BeaconSelector.kt
        │               │       │   ├── BlockData.kt
        │               │       │   ├── CoordsLog.kt
        │               │       │   ├── DiscordRPC.kt
        │               │       │   ├── ElytraFix.kt
        │               │       │   ├── EntityTools.kt
        │               │       │   ├── FakeGameMode.kt
        │               │       │   ├── FakePlayer.kt
        │               │       │   ├── LogoutLogger.kt
        │               │       │   ├── MapDownloader.kt
        │               │       │   ├── MidClickFriends.kt
        │               │       │   ├── MountBypass.kt
        │               │       │   ├── NoSoundLag.kt
        │               │       │   ├── NoteBot.kt
        │               │       │   ├── PingSpoof.kt
        │               │       │   ├── SkinFlicker.kt
        │               │       │   ├── StashLogger.kt
        │               │       │   └── TeleportLogger.kt
        │               │       ├── movement
        │               │       │   ├── Anchor.kt
        │               │       │   ├── AntiHunger.kt
        │               │       │   ├── AntiLevitation.kt
        │               │       │   ├── AutoJump.kt
        │               │       │   ├── AutoRemount.kt
        │               │       │   ├── AutoWalk.kt
        │               │       │   ├── BoatFly.kt
        │               │       │   ├── ElytraFastClose.kt
        │               │       │   ├── ElytraFlight2b2t.kt
        │               │       │   ├── ElytraFlight.kt
        │               │       │   ├── ElytraReplace.kt
        │               │       │   ├── EntitySpeed.kt
        │               │       │   ├── FastFall.kt
        │               │       │   ├── Flight.kt
        │               │       │   ├── IceSpeed.kt
        │               │       │   ├── InventoryMove.kt
        │               │       │   ├── Jesus.kt
        │               │       │   ├── NoSlowDown.kt
        │               │       │   ├── Parkour.kt
        │               │       │   ├── Prevent.kt
        │               │       │   ├── SafeWalk.kt
        │               │       │   ├── Speed.kt
        │               │       │   ├── Sprint.kt
        │               │       │   ├── Step.kt
        │               │       │   └── Velocity.kt
        │               │       ├── player
        │               │       │   ├── AntiForceLook.kt
        │               │       │   ├── AutoEat.kt
        │               │       │   ├── Blink.kt
        │               │       │   ├── BlockInteraction.kt
        │               │       │   ├── ChestStealer.kt
        │               │       │   ├── FastBreak.kt
        │               │       │   ├── FastUse.kt
        │               │       │   ├── Freecam.kt
        │               │       │   ├── InventoryManager.kt
        │               │       │   ├── LagNotifier.kt
        │               │       │   ├── NoBreakAnimation.kt
        │               │       │   ├── NoFall.kt
        │               │       │   ├── NoGhostBlocks.kt
        │               │       │   ├── NoGhostItems.kt
        │               │       │   ├── NoPacketKick.kt
        │               │       │   ├── NoSwing.kt
        │               │       │   ├── PacketCancel.kt
        │               │       │   ├── PacketLimiter.kt
        │               │       │   ├── PacketLogger.kt
        │               │       │   ├── PortalGodMode.kt
        │               │       │   ├── Scaffold.kt
        │               │       │   ├── Timer.kt
        │               │       │   ├── TpsSync.kt
        │               │       │   ├── ViewLock.kt
        │               │       │   └── XCarry.kt
        │               │       └── render
        │               │           ├── BossStack.kt
        │               │           ├── Breadcrumbs.kt
        │               │           ├── BreakingESP.kt
        │               │           ├── CameraClip.kt
        │               │           ├── Chams.kt
        │               │           ├── ContainerPreview.kt
        │               │           ├── ESP.kt
        │               │           ├── ExtraTab.kt
        │               │           ├── EyeFinder.kt
        │               │           ├── FreeLook.kt
        │               │           ├── FullBright.kt
        │               │           ├── HungerOverlay.kt
        │               │           ├── ItemModel.kt
        │               │           ├── MapPreview.kt
        │               │           ├── MobOwner.kt
        │               │           ├── Nametags.kt
        │               │           ├── NewChunks.kt
        │               │           ├── NoRender.kt
        │               │           ├── Search.kt
        │               │           ├── SelectionHighlight.kt
        │               │           ├── StorageESP.kt
        │               │           ├── TimeWarp.kt
        │               │           ├── Tracers.kt
        │               │           ├── Trajectories.kt
        │               │           ├── VoidESP.kt
        │               │           ├── WaypointRender.kt
        │               │           ├── Xray.kt
        │               │           └── Zoom.kt
        │               ├── plugin
        │               │   ├── api
        │               │   │   ├── IPluginClass.kt
        │               │   │   ├── PluginHudElement.kt
        │               │   │   ├── Plugin.kt
        │               │   │   ├── PluginLabelHud.kt
        │               │   │   └── PluginModule.kt
        │               │   ├── PluginClassLoader.kt
        │               │   ├── PluginError.kt
        │               │   ├── PluginInfo.kt
        │               │   ├── PluginLoader.kt
        │               │   └── PluginManager.kt
        │               ├── process
        │               │   ├── AutoObsidianProcess.kt
        │               │   └── PauseProcess.kt
        │               ├── setting
        │               │   ├── ConfigManager.kt
        │               │   ├── configs
        │               │   │   ├── AbstractConfig.kt
        │               │   │   ├── AbstractMultiConfig.kt
        │               │   │   ├── IConfig.kt
        │               │   │   ├── NameableConfig.kt
        │               │   │   └── PluginConfig.kt
        │               │   ├── GenericConfigClass.kt
        │               │   ├── GenericConfig.kt
        │               │   ├── groups
        │               │   │   ├── SettingGroup.kt
        │               │   │   └── SettingMultiGroup.kt
        │               │   ├── GuiConfig.kt
        │               │   ├── ModuleConfig.kt
        │               │   └── settings
        │               │       ├── AbstractSetting.kt
        │               │       ├── ImmutableSetting.kt
        │               │       ├── impl
        │               │       │   ├── collection
        │               │       │   │   ├── CollectionSetting.kt
        │               │       │   │   └── MapSetting.kt
        │               │       │   ├── number
        │               │       │   │   ├── DoubleSetting.kt
        │               │       │   │   ├── FloatSetting.kt
        │               │       │   │   ├── IntegerSetting.kt
        │               │       │   │   └── NumberSetting.kt
        │               │       │   ├── other
        │               │       │   │   ├── BindSetting.kt
        │               │       │   │   └── ColorSetting.kt
        │               │       │   └── primitive
        │               │       │       ├── BooleanSetting.kt
        │               │       │       ├── EnumSetting.kt
        │               │       │       └── StringSetting.kt
        │               │       ├── MutableSetting.kt
        │               │       └── SettingRegister.kt
        │               └── util
        │                   ├── BaritoneUtils.kt
        │                   ├── Bind.kt
        │                   ├── CachedValues.kt
        │                   ├── CircularArray.kt
        │                   ├── color
        │                   │   ├── ColorConverter.kt
        │                   │   ├── ColorGradient.kt
        │                   │   ├── ColorHolder.kt
        │                   │   ├── DyeColors.kt
        │                   │   ├── EnumTextColor.kt
        │                   │   └── HueCycler.kt
        │                   ├── combat
        │                   │   ├── CombatUtils.kt
        │                   │   ├── CrystalUtils.kt
        │                   │   └── SurroundUtils.kt
        │                   ├── ConfigUtils.kt
        │                   ├── EnchantmentUtils.kt
        │                   ├── EntityUtils.kt
        │                   ├── FolderUtils.kt
        │                   ├── graphics
        │                   │   ├── AnimationUtils.kt
        │                   │   ├── ESPRenderer.kt
        │                   │   ├── font
        │                   │   │   ├── Alignment.kt
        │                   │   │   ├── CharInfo.kt
        │                   │   │   ├── FontGlyphs.kt
        │                   │   │   ├── FontRenderAdapter.kt
        │                   │   │   ├── GlyphChunk.kt
        │                   │   │   ├── LambdaFontRenderer.kt
        │                   │   │   ├── Style.kt
        │                   │   │   └── TextComponent.kt
        │                   │   ├── GeometryMasks.kt
        │                   │   ├── GlStateUtils.kt
        │                   │   ├── LambdaTessellator.kt
        │                   │   ├── ProjectionUtils.kt
        │                   │   ├── RenderUtils2D.kt
        │                   │   ├── ShaderHelper.kt
        │                   │   ├── texture
        │                   │   │   ├── AbstractTexture.kt
        │                   │   │   ├── MipmapTexture.kt
        │                   │   │   └── TextureUtils.kt
        │                   │   └── VertexHelper.kt
        │                   ├── InfoCalculator.kt
        │                   ├── items
        │                   │   ├── Block.kt
        │                   │   ├── Item.kt
        │                   │   ├── Operation.kt
        │                   │   └── Slot.kt
        │                   ├── KamiCheck.kt
        │                   ├── KeyboardUtils.kt
        │                   ├── math
        │                   │   ├── BoundingBoxUtils.kt
        │                   │   ├── CoordinateConverter.kt
        │                   │   ├── Direction.kt
        │                   │   ├── RotationUtils.kt
        │                   │   ├── Vec2d.kt
        │                   │   ├── Vec2f.kt
        │                   │   ├── Vec3f.kt
        │                   │   └── VectorUtils.kt
        │                   ├── MotionTracker.kt
        │                   ├── MovementUtils.kt
        │                   ├── Quad.kt
        │                   ├── TaskState.kt
        │                   ├── text
        │                   │   ├── Detectors.kt
        │                   │   ├── MessageDetection.kt
        │                   │   ├── MessageSendHelper.kt
        │                   │   ├── RomanNumerals.kt
        │                   │   ├── SpamFilters.kt
        │                   │   └── TextFormatting.kt
        │                   ├── threads
        │                   │   ├── BackgroundJob.kt
        │                   │   ├── BackgroundScope.kt
        │                   │   ├── CoroutineUtils.kt
        │                   │   ├── MainThreadExecutor.kt
        │                   │   └── ThreadSafety.kt
        │                   ├── TimedFlag.kt
        │                   ├── TimeoutFlag.kt
        │                   ├── TimerUtils.kt
        │                   ├── TimeUtils.kt
        │                   ├── TpsCalculator.kt
        │                   ├── WebUtils.kt
        │                   ├── world
        │                   │   ├── Block.kt
        │                   │   ├── Check.kt
        │                   │   ├── Interact.kt
        │                   │   └── PlaceInfo.kt
        │                   └── Wrapper.kt
        └── resources
            ├── assets
            │   ├── fonts
            │   │   ├── FiraSans-Bold.ttf
            │   │   ├── FiraSans-Italic.ttf
            │   │   ├── FiraSans-Regular.ttf
            │   │   └── OTF.txt
            │   ├── minecraft
            │   │   ├── lambda
            │   │   │   ├── lambda_icon.png
            │   │   │   ├── lambda_map.png
            │   │   │   └── textures
            │   │   │       ├── capes
            │   │   │       │   ├── border.png
            │   │   │       │   ├── contributor.png
            │   │   │       │   └── primary.png
            │   │   │       └── hungeroverlay.png
            │   │   └── shaders
            │   │       ├── post
            │   │       │   ├── esp_outline.json
            │   │       │   ├── grainy_blur.json
            │   │       │   └── kawase_blur_6.json
            │   │       └── program
            │   │           ├── esp_outline.fsh
            │   │           ├── esp_outline.json
            │   │           ├── grainy_blur.fsh
            │   │           ├── grainy_blur.json
            │   │           ├── grainy_blur.vsh
            │   │           ├── kawase_blur.fsh
            │   │           ├── kawase_blur.json
            │   │           └── kawase_blur.vsh
            │   └── shaders
            │       └── menu
            │           ├── bluegrid.fsh
            │           ├── bluenebula.fsh
            │           ├── bluevortex.fsh
            │           ├── cave.fsh
            │           ├── clouds.fsh
            │           ├── doughnuts.fsh
            │           ├── fire.fsh
            │           ├── jupiter.fsh
            │           ├── matrix.fsh
            │           ├── minecraft.fsh
            │           ├── purplegrid.fsh
            │           ├── purplemist.fsh
            │           ├── redglow.fsh
            │           ├── sky.fsh
            │           ├── snake.fsh
            │           ├── space2.fsh
            │           ├── space.fsh
            │           ├── storm.fsh
            │           ├── triangle.fsh
            │           └── vert.vsh
            ├── lambda.png
            ├── LICENSE-Slick2D TrueTypeFont.txt
            ├── mcmod.info
            └── mixins.lambda.json

141 directories, 691 files
