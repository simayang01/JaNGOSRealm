package eu.jangos.realm.model.auth;
// Generated 06-mai-2016 21:16:44 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Bannedaccount generated by hbm2java
 */
@Entity
@Table(name="bannedaccount"
    ,catalog="jangosauth"
)
public class Bannedaccount  implements java.io.Serializable {


     private Integer id;
     private Account accountByFkBannedaccount;
     private Account accountByFkBannedby;
     private boolean active;
     private Date bandate;
     private String reason;
     private Date unban;

    public Bannedaccount() {
    }

	
    public Bannedaccount(Account accountByFkBannedaccount, Account accountByFkBannedby, boolean active, Date bandate, String reason) {
        this.accountByFkBannedaccount = accountByFkBannedaccount;
        this.accountByFkBannedby = accountByFkBannedby;
        this.active = active;
        this.bandate = bandate;
        this.reason = reason;
    }
    public Bannedaccount(Account accountByFkBannedaccount, Account accountByFkBannedby, boolean active, Date bandate, String reason, Date unban) {
       this.accountByFkBannedaccount = accountByFkBannedaccount;
       this.accountByFkBannedby = accountByFkBannedby;
       this.active = active;
       this.bandate = bandate;
       this.reason = reason;
       this.unban = unban;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fk_bannedaccount", nullable=false)
    public Account getAccountByFkBannedaccount() {
        return this.accountByFkBannedaccount;
    }
    
    public void setAccountByFkBannedaccount(Account accountByFkBannedaccount) {
        this.accountByFkBannedaccount = accountByFkBannedaccount;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fk_bannedby", nullable=false)
    public Account getAccountByFkBannedby() {
        return this.accountByFkBannedby;
    }
    
    public void setAccountByFkBannedby(Account accountByFkBannedby) {
        this.accountByFkBannedby = accountByFkBannedby;
    }

    
    @Column(name="active", nullable=false)
    public boolean isActive() {
        return this.active;
    }
    
    public void setActive(boolean active) {
        this.active = active;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="bandate", nullable=false, length=19)
    public Date getBandate() {
        return this.bandate;
    }
    
    public void setBandate(Date bandate) {
        this.bandate = bandate;
    }

    
    @Column(name="reason", nullable=false)
    public String getReason() {
        return this.reason;
    }
    
    public void setReason(String reason) {
        this.reason = reason;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="unban", length=19)
    public Date getUnban() {
        return this.unban;
    }
    
    public void setUnban(Date unban) {
        this.unban = unban;
    }




}


