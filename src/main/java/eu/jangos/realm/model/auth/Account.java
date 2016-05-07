package eu.jangos.realm.model.auth;
// Generated 06-mai-2016 21:16:44 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Account generated by hbm2java
 */
@Entity
@Table(name="account"
    ,catalog="jangosauth"
    , uniqueConstraints = @UniqueConstraint(columnNames="name") 
)
public class Account  implements java.io.Serializable {


     private Integer id;
     private Set<Bannedaccount> bannedaccountsForFkBannedaccount = new HashSet<Bannedaccount>(0);
     private Set<Bannedaccount> bannedaccountsForFkBannedby = new HashSet<Bannedaccount>(0);
     private Set<Bannedip> bannedips = new HashSet<Bannedip>(0);
     private Date creation;
     private String email;
     private int failedattempt;
     private String hashPass;
     private String lastIp;
     private Date lastlogin;
     private Locale locale;
     private boolean locked;
     private String name;
     private boolean online;
     private Realm realm;
     private Set<RealmAccount> realmAccounts = new HashSet<RealmAccount>(0);
     private Set<Roles> roleses = new HashSet<Roles>(0);
     private String salt;
     private String sessionkey;
     private String verifier;

    public Account() {
    }

	
    public Account(Date creation, int failedattempt, String hashPass, String lastIp, Date lastlogin, boolean locked, String name, boolean online) {
        this.creation = creation;
        this.failedattempt = failedattempt;
        this.hashPass = hashPass;
        this.lastIp = lastIp;
        this.lastlogin = lastlogin;
        this.locked = locked;
        this.name = name;
        this.online = online;
    }
    public Account(Set<Bannedaccount> bannedaccountsForFkBannedaccount, Set<Bannedaccount> bannedaccountsForFkBannedby, Set<Bannedip> bannedips, Date creation, String email, int failedattempt, String hashPass, String lastIp, Date lastlogin, Locale locale, boolean locked, String name, boolean online, Realm realm, Set<RealmAccount> realmAccounts, Set<Roles> roleses, String salt, String sessionkey, String verifier) {
       this.bannedaccountsForFkBannedaccount = bannedaccountsForFkBannedaccount;
       this.bannedaccountsForFkBannedby = bannedaccountsForFkBannedby;
       this.bannedips = bannedips;
       this.creation = creation;
       this.email = email;
       this.failedattempt = failedattempt;
       this.hashPass = hashPass;
       this.lastIp = lastIp;
       this.lastlogin = lastlogin;
       this.locale = locale;
       this.locked = locked;
       this.name = name;
       this.online = online;
       this.realm = realm;
       this.realmAccounts = realmAccounts;
       this.roleses = roleses;
       this.salt = salt;
       this.sessionkey = sessionkey;
       this.verifier = verifier;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="accountByFkBannedaccount")
    public Set<Bannedaccount> getBannedaccountsForFkBannedaccount() {
        return this.bannedaccountsForFkBannedaccount;
    }
    
    public void setBannedaccountsForFkBannedaccount(Set<Bannedaccount> bannedaccountsForFkBannedaccount) {
        this.bannedaccountsForFkBannedaccount = bannedaccountsForFkBannedaccount;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="accountByFkBannedby")
    public Set<Bannedaccount> getBannedaccountsForFkBannedby() {
        return this.bannedaccountsForFkBannedby;
    }
    
    public void setBannedaccountsForFkBannedby(Set<Bannedaccount> bannedaccountsForFkBannedby) {
        this.bannedaccountsForFkBannedby = bannedaccountsForFkBannedby;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="account")
    public Set<Bannedip> getBannedips() {
        return this.bannedips;
    }
    
    public void setBannedips(Set<Bannedip> bannedips) {
        this.bannedips = bannedips;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="creation", nullable=false, length=19)
    public Date getCreation() {
        return this.creation;
    }
    
    public void setCreation(Date creation) {
        this.creation = creation;
    }

    
    @Column(name="email", length=50)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="failedattempt", nullable=false)
    public int getFailedattempt() {
        return this.failedattempt;
    }
    
    public void setFailedattempt(int failedattempt) {
        this.failedattempt = failedattempt;
    }

    
    @Column(name="hash_pass", nullable=false, length=40)
    public String getHashPass() {
        return this.hashPass;
    }
    
    public void setHashPass(String hashPass) {
        this.hashPass = hashPass;
    }

    
    @Column(name="lastIP", nullable=false, length=30)
    public String getLastIp() {
        return this.lastIp;
    }
    
    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="lastlogin", nullable=false, length=19)
    public Date getLastlogin() {
        return this.lastlogin;
    }
    
    public void setLastlogin(Date lastlogin) {
        this.lastlogin = lastlogin;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fk_locale")
    public Locale getLocale() {
        return this.locale;
    }
    
    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    
    @Column(name="locked", nullable=false)
    public boolean isLocked() {
        return this.locked;
    }
    
    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    
    @Column(name="name", unique=true, nullable=false, length=30)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="online", nullable=false)
    public boolean isOnline() {
        return this.online;
    }
    
    public void setOnline(boolean online) {
        this.online = online;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fk_prefrealm")
    public Realm getRealm() {
        return this.realm;
    }
    
    public void setRealm(Realm realm) {
        this.realm = realm;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="account")
    public Set<RealmAccount> getRealmAccounts() {
        return this.realmAccounts;
    }
    
    public void setRealmAccounts(Set<RealmAccount> realmAccounts) {
        this.realmAccounts = realmAccounts;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="account_roles", catalog="jangosauth", joinColumns = { 
        @JoinColumn(name="fk_account", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="fk_roles", nullable=false, updatable=false) })
    public Set<Roles> getRoleses() {
        return this.roleses;
    }
    
    public void setRoleses(Set<Roles> roleses) {
        this.roleses = roleses;
    }

    
    @Column(name="salt")
    public String getSalt() {
        return this.salt;
    }
    
    public void setSalt(String salt) {
        this.salt = salt;
    }

    
    @Column(name="sessionkey")
    public String getSessionkey() {
        return this.sessionkey;
    }
    
    public void setSessionkey(String sessionkey) {
        this.sessionkey = sessionkey;
    }

    
    @Column(name="verifier")
    public String getVerifier() {
        return this.verifier;
    }
    
    public void setVerifier(String verifier) {
        this.verifier = verifier;
    }




}


