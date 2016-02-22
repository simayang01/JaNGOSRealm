package eu.jangos.realm.model.characters;
// Generated 19-f�vr.-2016 21:17:55 by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Characters generated by hbm2java
 */
public class Characters implements java.io.Serializable {

    private int guid;
    private GuildRank guildRank;
    private ItemInstance itemInstance;
    private int fkAccount;
    private String name;
    private byte race;
    private byte fkDbcClass;
    private byte gender;
    private byte level;
    private int xp;
    private int money;
    private float positionX;
    private float positionY;
    private float positionZ;
    private int fkDbcMap;
    private float orientation;
    private byte online;
    private byte cinematic;
    private int totaltime;
    private int leveltime;
    private long logoutTime;
    private float restBonus;
    private int resettalentsCost;
    private long resettalentsTime;
    private float transX;
    private float transY;
    private float transZ;
    private float transO;
    private long fkTransguid;
    private boolean stableSlots;
    private int fkDbcZone;
    private long deathExpireTime;
    private String fkDbcTaxiPath;
    private int honorHighestRank;
    private int honorStanding;
    private float storedHonorRating;
    private int storedDishonorableKills;
    private int storedHonorableKills;
    private int fkDbcWatchedFaction;
    private short drunk;
    private int health;
    private int power1;
    private int power2;
    private int power3;
    private int power4;
    private int power5;
    private int fkAmmoId;
    private boolean deleted;
    private Date deleteDate;
    private Byte skin;
    private Byte face;
    private Byte hairstyle;
    private Byte haircolor;
    private Byte facialhair;
    private Byte unknownByte;
    private Byte bankbagslot;
    private Byte resttype;
    private Byte changename;
    private Byte resetspell;
    private Byte resettalents;
    private Byte charcustom;
    private Byte groupleader;
    private Byte afk;
    private Byte dnd;
    private Byte gm;
    private Byte ghost;
    private Byte resting;
    private Byte unknown7;
    private Byte ffapvp;
    private Byte contestedpvp;
    private Byte inpvp;
    private Byte hidehelm;
    private Byte hidecloak;
    private Byte partialplaytime;
    private Byte noplaytime;
    private Byte unknown15;
    private Byte unknown16;
    private Byte sanctuary;
    private Byte taxibenchmark;
    private Byte pvptimer;
    private Byte gmon;
    private Byte gmaccepttickets;
    private Byte gmacceptwhispers;
    private Byte gmtaxicheat;
    private Byte gminvisible;
    private Byte gmchat;
    private Byte gmauctionneutral;
    private Byte gmauctionenemy;
    private Byte pvpdeath;
    private String note;
    private String officernote;
    private float homeX;
    private float homeY;
    private float homeZ;
    private float homeOrientation;
    private int homeFkDbcMap;
    private int homeFkDbcZone;   
    private Set mailsForFkFrom = new HashSet(0);
    private Set skillses = new HashSet(0);
    private Set itemInstances = new HashSet(0);
    private Set guildEventsesForFkEventReceiver = new HashSet(0);
    private Set mailsForFkTo = new HashSet(0);
    private Set reputations = new HashSet(0);
    private Set spells = new HashSet(0);
    private Set socialsForFkOwner = new HashSet(0);
    private Set socialsForFkRelation = new HashSet(0);
    private Set whispersesForFkFrom = new HashSet(0);
    private Set actionbars = new HashSet(0);
    private Set guildEventsesForFkEventSender = new HashSet(0);
    private Set tickets = new HashSet(0);
    private Set whispersesForFkTo = new HashSet(0);

    public Characters() {
    }

    public Characters(int guid, int fkAccount, String name, byte race, byte fkDbcClass, byte gender, byte level, int xp, int money, float positionX, float positionY, float positionZ, int fkDbcMap, float orientation, byte online, byte cinematic, int totaltime, int leveltime, long logoutTime, float restBonus, int resettalentsCost, long resettalentsTime, float transX, float transY, float transZ, float transO, long fkTransguid, boolean stableSlots, int fkDbcZone, long deathExpireTime, int honorHighestRank, int honorStanding, float storedHonorRating, int storedDishonorableKills, int storedHonorableKills, int fkDbcWatchedFaction, short drunk, int health, int power1, int power2, int power3, int power4, int power5, int fkAmmoId, float homeX, float homeY, float homeZ, float homeOrientation, int homeFkDbcMap, int homeFkDbcZone) {
        this.guid = guid;
        this.fkAccount = fkAccount;
        this.name = name;
        this.race = race;
        this.fkDbcClass = fkDbcClass;
        this.gender = gender;
        this.level = level;
        this.xp = xp;
        this.money = money;
        this.positionX = positionX;
        this.positionY = positionY;
        this.positionZ = positionZ;
        this.fkDbcMap = fkDbcMap;
        this.orientation = orientation;
        this.online = online;
        this.cinematic = cinematic;
        this.totaltime = totaltime;
        this.leveltime = leveltime;
        this.logoutTime = logoutTime;
        this.restBonus = restBonus;
        this.resettalentsCost = resettalentsCost;
        this.resettalentsTime = resettalentsTime;
        this.transX = transX;
        this.transY = transY;
        this.transZ = transZ;
        this.transO = transO;
        this.fkTransguid = fkTransguid;
        this.stableSlots = stableSlots;
        this.fkDbcZone = fkDbcZone;
        this.deathExpireTime = deathExpireTime;
        this.honorHighestRank = honorHighestRank;
        this.honorStanding = honorStanding;
        this.storedHonorRating = storedHonorRating;
        this.storedDishonorableKills = storedDishonorableKills;
        this.storedHonorableKills = storedHonorableKills;
        this.fkDbcWatchedFaction = fkDbcWatchedFaction;
        this.drunk = drunk;
        this.health = health;
        this.power1 = power1;
        this.power2 = power2;
        this.power3 = power3;
        this.power4 = power4;
        this.power5 = power5;
        this.fkAmmoId = fkAmmoId;
        this.homeX = homeX;
        this.homeY = homeY;
        this.homeZ = homeZ;
        this.homeOrientation = homeOrientation;
        this.homeFkDbcMap = homeFkDbcMap;
        this.homeFkDbcZone = homeFkDbcZone;
    }

    public Characters(int guid, GuildRank guildRank, ItemInstance itemInstance, int fkAccount, String name, byte race, byte fkDbcClass, byte gender, byte level, int xp, int money, float positionX, float positionY, float positionZ, int fkDbcMap, float orientation, byte online, byte cinematic, int totaltime, int leveltime, long logoutTime, float restBonus, int resettalentsCost, long resettalentsTime, float transX, float transY, float transZ, float transO, long fkTransguid, boolean stableSlots, int fkDbcZone, long deathExpireTime, String fkDbcTaxiPath, int honorHighestRank, int honorStanding, float storedHonorRating, int storedDishonorableKills, int storedHonorableKills, int fkDbcWatchedFaction, short drunk, int health, int power1, int power2, int power3, int power4, int power5, int fkAmmoId, boolean deleted, Date deleteDate, Byte skin, Byte face, Byte hairstyle, Byte haircolor, Byte facialhair, Byte unknownByte, Byte bankbagslot, Byte resttype, Byte changename, Byte resetspell, Byte resettalents, Byte charcustom, Byte groupleader, Byte afk, Byte dnd, Byte gm, Byte ghost, Byte resting, Byte unknown7, Byte ffapvp, Byte contestedpvp, Byte inpvp, Byte hidehelm, Byte hidecloak, Byte partialplaytime, Byte noplaytime, Byte unknown15, Byte unknown16, Byte sanctuary, Byte taxibenchmark, Byte pvptimer, Byte gmon, Byte gmaccepttickets, Byte gmacceptwhispers, Byte gmtaxicheat, Byte gminvisible, Byte gmchat, Byte gmauctionneutral, Byte gmauctionenemy, Byte pvpdeath, String note, String officernote, float homeX, float homeY, float homeZ, float homeOrientation, int homeFkDbcMap, int homeFkDbcZone, Set mailsForFkFrom, Set skillses, Set itemInstances, Set guildEventsesForFkEventReceiver, Set mailsForFkTo, Set reputations, Set spells, Set socialsForFkOwner, Set socialsForFkRelation, Set whispersesForFkFrom, Set actionbars, Set guildEventsesForFkEventSender, Set tickets, Set whispersesForFkTo) {
        this.guid = guid;
        this.guildRank = guildRank;
        this.itemInstance = itemInstance;
        this.fkAccount = fkAccount;
        this.name = name;
        this.race = race;
        this.fkDbcClass = fkDbcClass;
        this.gender = gender;
        this.level = level;
        this.xp = xp;
        this.money = money;
        this.positionX = positionX;
        this.positionY = positionY;
        this.positionZ = positionZ;
        this.fkDbcMap = fkDbcMap;
        this.orientation = orientation;
        this.online = online;
        this.cinematic = cinematic;
        this.totaltime = totaltime;
        this.leveltime = leveltime;
        this.logoutTime = logoutTime;
        this.restBonus = restBonus;
        this.resettalentsCost = resettalentsCost;
        this.resettalentsTime = resettalentsTime;
        this.transX = transX;
        this.transY = transY;
        this.transZ = transZ;
        this.transO = transO;
        this.fkTransguid = fkTransguid;
        this.stableSlots = stableSlots;
        this.fkDbcZone = fkDbcZone;
        this.deathExpireTime = deathExpireTime;
        this.fkDbcTaxiPath = fkDbcTaxiPath;
        this.honorHighestRank = honorHighestRank;
        this.honorStanding = honorStanding;
        this.storedHonorRating = storedHonorRating;
        this.storedDishonorableKills = storedDishonorableKills;
        this.storedHonorableKills = storedHonorableKills;
        this.fkDbcWatchedFaction = fkDbcWatchedFaction;
        this.drunk = drunk;
        this.health = health;
        this.power1 = power1;
        this.power2 = power2;
        this.power3 = power3;
        this.power4 = power4;
        this.power5 = power5;
        this.fkAmmoId = fkAmmoId;
        this.deleted = deleted;
        this.deleteDate = deleteDate;
        this.skin = skin;
        this.face = face;
        this.hairstyle = hairstyle;
        this.haircolor = haircolor;
        this.facialhair = facialhair;
        this.unknownByte = unknownByte;
        this.bankbagslot = bankbagslot;
        this.resttype = resttype;
        this.changename = changename;
        this.resetspell = resetspell;
        this.resettalents = resettalents;
        this.charcustom = charcustom;
        this.groupleader = groupleader;
        this.afk = afk;
        this.dnd = dnd;
        this.gm = gm;
        this.ghost = ghost;
        this.resting = resting;
        this.unknown7 = unknown7;
        this.ffapvp = ffapvp;
        this.contestedpvp = contestedpvp;
        this.inpvp = inpvp;
        this.hidehelm = hidehelm;
        this.hidecloak = hidecloak;
        this.partialplaytime = partialplaytime;
        this.noplaytime = noplaytime;
        this.unknown15 = unknown15;
        this.unknown16 = unknown16;
        this.sanctuary = sanctuary;
        this.taxibenchmark = taxibenchmark;
        this.pvptimer = pvptimer;
        this.gmon = gmon;
        this.gmaccepttickets = gmaccepttickets;
        this.gmacceptwhispers = gmacceptwhispers;
        this.gmtaxicheat = gmtaxicheat;
        this.gminvisible = gminvisible;
        this.gmchat = gmchat;
        this.gmauctionneutral = gmauctionneutral;
        this.gmauctionenemy = gmauctionenemy;
        this.pvpdeath = pvpdeath;
        this.note = note;
        this.officernote = officernote;
        this.homeX = homeX;
        this.homeY = homeY;
        this.homeZ = homeZ;
        this.homeOrientation = homeOrientation;
        this.homeFkDbcMap = homeFkDbcMap;
        this.homeFkDbcZone = homeFkDbcZone;        
        this.mailsForFkFrom = mailsForFkFrom;
        this.skillses = skillses;
        this.itemInstances = itemInstances;
        this.guildEventsesForFkEventReceiver = guildEventsesForFkEventReceiver;
        this.mailsForFkTo = mailsForFkTo;
        this.reputations = reputations;
        this.spells = spells;
        this.socialsForFkOwner = socialsForFkOwner;
        this.socialsForFkRelation = socialsForFkRelation;
        this.whispersesForFkFrom = whispersesForFkFrom;
        this.actionbars = actionbars;
        this.guildEventsesForFkEventSender = guildEventsesForFkEventSender;
        this.tickets = tickets;
        this.whispersesForFkTo = whispersesForFkTo;
    }

    public int getGuid() {
        return this.guid;
    }

    public void setGuid(int guid) {
        this.guid = guid;
    }

    public GuildRank getGuildRank() {
        return this.guildRank;
    }

    public void setGuildRank(GuildRank guildRank) {
        this.guildRank = guildRank;
    }

    public ItemInstance getItemInstance() {
        return this.itemInstance;
    }

    public void setItemInstance(ItemInstance itemInstance) {
        this.itemInstance = itemInstance;
    }

    public int getFkAccount() {
        return this.fkAccount;
    }

    public void setFkAccount(int fkAccount) {
        this.fkAccount = fkAccount;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getRace() {
        return this.race;
    }

    public void setRace(byte race) {
        this.race = race;
    }

    public byte getFkDbcClass() {
        return this.fkDbcClass;
    }

    public void setFkDbcClass(byte fkDbcClass) {
        this.fkDbcClass = fkDbcClass;
    }

    public byte getGender() {
        return this.gender;
    }

    public void setGender(byte gender) {
        this.gender = gender;
    }

    public byte getLevel() {
        return this.level;
    }

    public void setLevel(byte level) {
        this.level = level;
    }

    public int getXp() {
        return this.xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getMoney() {
        return this.money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public float getPositionX() {
        return this.positionX;
    }

    public void setPositionX(float positionX) {
        this.positionX = positionX;
    }

    public float getPositionY() {
        return this.positionY;
    }

    public void setPositionY(float positionY) {
        this.positionY = positionY;
    }

    public float getPositionZ() {
        return this.positionZ;
    }

    public void setPositionZ(float positionZ) {
        this.positionZ = positionZ;
    }

    public int getFkDbcMap() {
        return this.fkDbcMap;
    }

    public void setFkDbcMap(int fkDbcMap) {
        this.fkDbcMap = fkDbcMap;
    }

    public float getOrientation() {
        return this.orientation;
    }

    public void setOrientation(float orientation) {
        this.orientation = orientation;
    }

    public byte getOnline() {
        return this.online;
    }

    public void setOnline(byte online) {
        this.online = online;
    }

    public byte getCinematic() {
        return this.cinematic;
    }

    public void setCinematic(byte cinematic) {
        this.cinematic = cinematic;
    }

    public int getTotaltime() {
        return this.totaltime;
    }

    public void setTotaltime(int totaltime) {
        this.totaltime = totaltime;
    }

    public int getLeveltime() {
        return this.leveltime;
    }

    public void setLeveltime(int leveltime) {
        this.leveltime = leveltime;
    }

    public long getLogoutTime() {
        return this.logoutTime;
    }

    public void setLogoutTime(long logoutTime) {
        this.logoutTime = logoutTime;
    }

    public float getRestBonus() {
        return this.restBonus;
    }

    public void setRestBonus(float restBonus) {
        this.restBonus = restBonus;
    }

    public int getResettalentsCost() {
        return this.resettalentsCost;
    }

    public void setResettalentsCost(int resettalentsCost) {
        this.resettalentsCost = resettalentsCost;
    }

    public long getResettalentsTime() {
        return this.resettalentsTime;
    }

    public void setResettalentsTime(long resettalentsTime) {
        this.resettalentsTime = resettalentsTime;
    }

    public float getTransX() {
        return this.transX;
    }

    public void setTransX(float transX) {
        this.transX = transX;
    }

    public float getTransY() {
        return this.transY;
    }

    public void setTransY(float transY) {
        this.transY = transY;
    }

    public float getTransZ() {
        return this.transZ;
    }

    public void setTransZ(float transZ) {
        this.transZ = transZ;
    }

    public float getTransO() {
        return this.transO;
    }

    public void setTransO(float transO) {
        this.transO = transO;
    }

    public long getFkTransguid() {
        return this.fkTransguid;
    }

    public void setFkTransguid(long fkTransguid) {
        this.fkTransguid = fkTransguid;
    }

    public boolean isStableSlots() {
        return this.stableSlots;
    }

    public void setStableSlots(boolean stableSlots) {
        this.stableSlots = stableSlots;
    }

    public int getFkDbcZone() {
        return this.fkDbcZone;
    }

    public void setFkDbcZone(int fkDbcZone) {
        this.fkDbcZone = fkDbcZone;
    }

    public long getDeathExpireTime() {
        return this.deathExpireTime;
    }

    public void setDeathExpireTime(long deathExpireTime) {
        this.deathExpireTime = deathExpireTime;
    }

    public String getFkDbcTaxiPath() {
        return this.fkDbcTaxiPath;
    }

    public void setFkDbcTaxiPath(String fkDbcTaxiPath) {
        this.fkDbcTaxiPath = fkDbcTaxiPath;
    }

    public int getHonorHighestRank() {
        return this.honorHighestRank;
    }

    public void setHonorHighestRank(int honorHighestRank) {
        this.honorHighestRank = honorHighestRank;
    }

    public int getHonorStanding() {
        return this.honorStanding;
    }

    public void setHonorStanding(int honorStanding) {
        this.honorStanding = honorStanding;
    }

    public float getStoredHonorRating() {
        return this.storedHonorRating;
    }

    public void setStoredHonorRating(float storedHonorRating) {
        this.storedHonorRating = storedHonorRating;
    }

    public int getStoredDishonorableKills() {
        return this.storedDishonorableKills;
    }

    public void setStoredDishonorableKills(int storedDishonorableKills) {
        this.storedDishonorableKills = storedDishonorableKills;
    }

    public int getStoredHonorableKills() {
        return this.storedHonorableKills;
    }

    public void setStoredHonorableKills(int storedHonorableKills) {
        this.storedHonorableKills = storedHonorableKills;
    }

    public int getFkDbcWatchedFaction() {
        return this.fkDbcWatchedFaction;
    }

    public void setFkDbcWatchedFaction(int fkDbcWatchedFaction) {
        this.fkDbcWatchedFaction = fkDbcWatchedFaction;
    }

    public short getDrunk() {
        return this.drunk;
    }

    public void setDrunk(short drunk) {
        this.drunk = drunk;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower1() {
        return this.power1;
    }

    public void setPower1(int power1) {
        this.power1 = power1;
    }

    public int getPower2() {
        return this.power2;
    }

    public void setPower2(int power2) {
        this.power2 = power2;
    }

    public int getPower3() {
        return this.power3;
    }

    public void setPower3(int power3) {
        this.power3 = power3;
    }

    public int getPower4() {
        return this.power4;
    }

    public void setPower4(int power4) {
        this.power4 = power4;
    }

    public int getPower5() {
        return this.power5;
    }

    public void setPower5(int power5) {
        this.power5 = power5;
    }

    public int getFkAmmoId() {
        return this.fkAmmoId;
    }

    public void setFkAmmoId(int fkAmmoId) {
        this.fkAmmoId = fkAmmoId;
    }

    public boolean isDeleted() {
        return this.deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Date getDeleteDate() {
        return this.deleteDate;
    }

    public void setDeleteDate(Date deleteDate) {
        this.deleteDate = deleteDate;
    }

    public Byte getSkin() {
        return this.skin;
    }

    public void setSkin(Byte skin) {
        this.skin = skin;
    }

    public Byte getFace() {
        return this.face;
    }

    public void setFace(Byte face) {
        this.face = face;
    }

    public Byte getHairstyle() {
        return this.hairstyle;
    }

    public void setHairstyle(Byte hairstyle) {
        this.hairstyle = hairstyle;
    }

    public Byte getHaircolor() {
        return this.haircolor;
    }

    public void setHaircolor(Byte haircolor) {
        this.haircolor = haircolor;
    }

    public Byte getFacialhair() {
        return this.facialhair;
    }

    public void setFacialhair(Byte facialhair) {
        this.facialhair = facialhair;
    }

    public Byte getUnknownByte() {
        return this.unknownByte;
    }

    public void setUnknownByte(Byte unknownByte) {
        this.unknownByte = unknownByte;
    }

    public Byte getBankbagslot() {
        return this.bankbagslot;
    }

    public void setBankbagslot(Byte bankbagslot) {
        this.bankbagslot = bankbagslot;
    }

    public Byte getResttype() {
        return this.resttype;
    }

    public void setResttype(Byte resttype) {
        this.resttype = resttype;
    }

    public Byte getChangename() {
        return this.changename;
    }

    public void setChangename(Byte changename) {
        this.changename = changename;
    }

    public Byte getResetspell() {
        return this.resetspell;
    }

    public void setResetspell(Byte resetspell) {
        this.resetspell = resetspell;
    }

    public Byte getResettalents() {
        return this.resettalents;
    }

    public void setResettalents(Byte resettalents) {
        this.resettalents = resettalents;
    }

    public Byte getCharcustom() {
        return this.charcustom;
    }

    public void setCharcustom(Byte charcustom) {
        this.charcustom = charcustom;
    }

    public Byte getGroupleader() {
        return this.groupleader;
    }

    public void setGroupleader(Byte groupleader) {
        this.groupleader = groupleader;
    }

    public Byte getAfk() {
        return this.afk;
    }

    public void setAfk(Byte afk) {
        this.afk = afk;
    }

    public Byte getDnd() {
        return this.dnd;
    }

    public void setDnd(Byte dnd) {
        this.dnd = dnd;
    }

    public Byte getGm() {
        return this.gm;
    }

    public void setGm(Byte gm) {
        this.gm = gm;
    }

    public Byte getGhost() {
        return this.ghost;
    }

    public void setGhost(Byte ghost) {
        this.ghost = ghost;
    }

    public Byte getResting() {
        return this.resting;
    }

    public void setResting(Byte resting) {
        this.resting = resting;
    }

    public Byte getUnknown7() {
        return this.unknown7;
    }

    public void setUnknown7(Byte unknown7) {
        this.unknown7 = unknown7;
    }

    public Byte getFfapvp() {
        return this.ffapvp;
    }

    public void setFfapvp(Byte ffapvp) {
        this.ffapvp = ffapvp;
    }

    public Byte getContestedpvp() {
        return this.contestedpvp;
    }

    public void setContestedpvp(Byte contestedpvp) {
        this.contestedpvp = contestedpvp;
    }

    public Byte getInpvp() {
        return this.inpvp;
    }

    public void setInpvp(Byte inpvp) {
        this.inpvp = inpvp;
    }

    public Byte getHidehelm() {
        return this.hidehelm;
    }

    public void setHidehelm(Byte hidehelm) {
        this.hidehelm = hidehelm;
    }

    public Byte getHidecloak() {
        return this.hidecloak;
    }

    public void setHidecloak(Byte hidecloak) {
        this.hidecloak = hidecloak;
    }

    public Byte getPartialplaytime() {
        return this.partialplaytime;
    }

    public void setPartialplaytime(Byte partialplaytime) {
        this.partialplaytime = partialplaytime;
    }

    public Byte getNoplaytime() {
        return this.noplaytime;
    }

    public void setNoplaytime(Byte noplaytime) {
        this.noplaytime = noplaytime;
    }

    public Byte getUnknown15() {
        return this.unknown15;
    }

    public void setUnknown15(Byte unknown15) {
        this.unknown15 = unknown15;
    }

    public Byte getUnknown16() {
        return this.unknown16;
    }

    public void setUnknown16(Byte unknown16) {
        this.unknown16 = unknown16;
    }

    public Byte getSanctuary() {
        return this.sanctuary;
    }

    public void setSanctuary(Byte sanctuary) {
        this.sanctuary = sanctuary;
    }

    public Byte getTaxibenchmark() {
        return this.taxibenchmark;
    }

    public void setTaxibenchmark(Byte taxibenchmark) {
        this.taxibenchmark = taxibenchmark;
    }

    public Byte getPvptimer() {
        return this.pvptimer;
    }

    public void setPvptimer(Byte pvptimer) {
        this.pvptimer = pvptimer;
    }

    public Byte getGmon() {
        return this.gmon;
    }

    public void setGmon(Byte gmon) {
        this.gmon = gmon;
    }

    public Byte getGmaccepttickets() {
        return this.gmaccepttickets;
    }

    public void setGmaccepttickets(Byte gmaccepttickets) {
        this.gmaccepttickets = gmaccepttickets;
    }

    public Byte getGmacceptwhispers() {
        return this.gmacceptwhispers;
    }

    public void setGmacceptwhispers(Byte gmacceptwhispers) {
        this.gmacceptwhispers = gmacceptwhispers;
    }

    public Byte getGmtaxicheat() {
        return this.gmtaxicheat;
    }

    public void setGmtaxicheat(Byte gmtaxicheat) {
        this.gmtaxicheat = gmtaxicheat;
    }

    public Byte getGminvisible() {
        return this.gminvisible;
    }

    public void setGminvisible(Byte gminvisible) {
        this.gminvisible = gminvisible;
    }

    public Byte getGmchat() {
        return this.gmchat;
    }

    public void setGmchat(Byte gmchat) {
        this.gmchat = gmchat;
    }

    public Byte getGmauctionneutral() {
        return this.gmauctionneutral;
    }

    public void setGmauctionneutral(Byte gmauctionneutral) {
        this.gmauctionneutral = gmauctionneutral;
    }

    public Byte getGmauctionenemy() {
        return this.gmauctionenemy;
    }

    public void setGmauctionenemy(Byte gmauctionenemy) {
        this.gmauctionenemy = gmauctionenemy;
    }

    public Byte getPvpdeath() {
        return this.pvpdeath;
    }

    public void setPvpdeath(Byte pvpdeath) {
        this.pvpdeath = pvpdeath;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getOfficernote() {
        return this.officernote;
    }

    public void setOfficernote(String officernote) {
        this.officernote = officernote;
    }

    public float getHomeX() {
        return homeX;
    }

    public void setHomeX(float homeX) {
        this.homeX = homeX;
    }

    public float getHomeY() {
        return homeY;
    }

    public void setHomeY(float homeY) {
        this.homeY = homeY;
    }

    public float getHomeZ() {
        return homeZ;
    }

    public void setHomeZ(float homeZ) {
        this.homeZ = homeZ;
    }

    public float getHomeOrientation() {
        return homeOrientation;
    }

    public void setHomeOrientation(float homeOrientation) {
        this.homeOrientation = homeOrientation;
    }

    public int getHomeFkDbcMap() {
        return homeFkDbcMap;
    }

    public void setHomeFkDbcMap(int homeFkDbcMap) {
        this.homeFkDbcMap = homeFkDbcMap;
    }

    public int getHomeFkDbcZone() {
        return homeFkDbcZone;
    }

    public void setHomeFkDbcZone(int homeFkDbcZone) {
        this.homeFkDbcZone = homeFkDbcZone;
    }

    public Set getMailsForFkFrom() {
        return this.mailsForFkFrom;
    }

    public void setMailsForFkFrom(Set mailsForFkFrom) {
        this.mailsForFkFrom = mailsForFkFrom;
    }

    public Set getSkillses() {
        return this.skillses;
    }

    public void setSkillses(Set skillses) {
        this.skillses = skillses;
    }

    public Set getItemInstances() {
        return this.itemInstances;
    }

    public void setItemInstances(Set itemInstances) {
        this.itemInstances = itemInstances;
    }

    public Set getGuildEventsesForFkEventReceiver() {
        return this.guildEventsesForFkEventReceiver;
    }

    public void setGuildEventsesForFkEventReceiver(Set guildEventsesForFkEventReceiver) {
        this.guildEventsesForFkEventReceiver = guildEventsesForFkEventReceiver;
    }

    public Set getMailsForFkTo() {
        return this.mailsForFkTo;
    }

    public void setMailsForFkTo(Set mailsForFkTo) {
        this.mailsForFkTo = mailsForFkTo;
    }

    public Set getReputations() {
        return this.reputations;
    }

    public void setReputations(Set reputations) {
        this.reputations = reputations;
    }

    public Set getSpells() {
        return this.spells;
    }

    public void setSpells(Set spells) {
        this.spells = spells;
    }

    public Set getSocialsForFkOwner() {
        return this.socialsForFkOwner;
    }

    public void setSocialsForFkOwner(Set socialsForFkOwner) {
        this.socialsForFkOwner = socialsForFkOwner;
    }

    public Set getSocialsForFkRelation() {
        return this.socialsForFkRelation;
    }

    public void setSocialsForFkRelation(Set socialsForFkRelation) {
        this.socialsForFkRelation = socialsForFkRelation;
    }

    public Set getWhispersesForFkFrom() {
        return this.whispersesForFkFrom;
    }

    public void setWhispersesForFkFrom(Set whispersesForFkFrom) {
        this.whispersesForFkFrom = whispersesForFkFrom;
    }

    public Set getActionbars() {
        return this.actionbars;
    }

    public void setActionbars(Set actionbars) {
        this.actionbars = actionbars;
    }

    public Set getGuildEventsesForFkEventSender() {
        return this.guildEventsesForFkEventSender;
    }

    public void setGuildEventsesForFkEventSender(Set guildEventsesForFkEventSender) {
        this.guildEventsesForFkEventSender = guildEventsesForFkEventSender;
    }

    public Set getTickets() {
        return this.tickets;
    }

    public void setTickets(Set tickets) {
        this.tickets = tickets;
    }

    public Set getWhispersesForFkTo() {
        return this.whispersesForFkTo;
    }

    public void setWhispersesForFkTo(Set whispersesForFkTo) {
        this.whispersesForFkTo = whispersesForFkTo;
    }

}
