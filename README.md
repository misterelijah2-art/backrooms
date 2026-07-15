# The Backrooms - Fabric 1.21.1 Mod

A Fabric mod for Minecraft 1.21.1 that adds the Backrooms — a liminal horror dimension with multiple stages, unique entities, blocks, and atmosphere.

## Levels

| Level | Name | Fog Color | Entities |
|---|---|---|---|
| Level 0 | The Lobby | Warm Yellow | Smiler |
| Level 1 | Habitable Zone | Gray | Smiler, Hound |
| Level 2 | Pipe Dreams | Dark Gray | Hound, Smiler |
| Level 3 | Electrical Station | Near Black | Smiler, Hound |
| Level 4 | Abandoned Office | Dark Teal | Partygoer, Smiler |
| Level 5 | Terror Hotel | Deep Red | Partygoer, Deathrat, Smiler |
| Poolrooms | The Poolrooms | Pale Blue | Hound |

## Entities

- **Smiler** — invisible in light, appears in darkness. Fast and deadly.
- **Partygoer** — applies Nausea + Slowness on hit. Tanky.
- **The Hound** — extremely fast pack hunter. Low health.
- **Deathrat** — tiny, swarms in groups. Applies Poison + Hunger.

## Items

- **Almond Water** — heals, gives speed and saturation. Found in the Backrooms.
- **Backrooms Map** — lore item.
- **Royal Ration** — food item dropped by Partygoers.
- **Liquid Pain** — rare lore item.
- **Level Key** — rare drop from Partygoers.

## Blocks

All Backrooms-themed blocks: moist carpet, mono wallpaper, fluorescent lights, concrete pillars, rusty pipes, steam vents, electrical boxes, office tiles, pool tiles, wet carpet (slows players), and Noclip Portals (step on to teleport to a level).

## Effects

- **Noclip** — allows passing through blocks (spectator-like).
- **Paranoia** — plays random ambient scraping sounds.
- **Backrooms Sickness** — harmful status effect.

## How to Enter

Place a `portal_level_0` block and step on it to be transported to Level 0. Each subsequent level has its own portal block.

## Building

```bash
./gradlew build
```

## TODO / Next Steps

- [ ] Custom textures for all blocks and entities
- [ ] Sound files (`.ogg`) for all ambient/entity sounds
- [ ] GeckoLib animated entity models
- [ ] Procedural room generation using structure templates
- [ ] Level-specific ambiance music
- [ ] Sanity system
- [ ] Custom HUD overlay (fog, flickering)
