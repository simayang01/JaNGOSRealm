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
 * Bannedip generated by hbm2java
 */
@Entity
@Table(name="bannedip"
    ,catalog="jangosauth"
)
public class Bannedip  implements java.io.Serializable {


     private Integer id;
     private Account account;
     private boolean active;
     private Date date;
     private String ip;
     private String reason;
     private Date unban;

    public Bannedip() {
    }

	
    public Bannedip(Account account, boolean active, Date date, String ip, String reason) {
        this.account = account;
        this.active = active;
        this.date = date;
        this.ip = ip;
        this.reason = reason;
    }
    public Bannedip(Account account, boolean active, Date date, String ip, String reason, Date unban) {
       this.account = account;
       this.active = active;
       this.date = date;
       this.ip = ip;
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
    @JoinColumn(name="fk_bannedby", nullable=false)
    public Account getAccount() {
        return this.account;
    }
    
    public void setAccount(Account account) {
        this.account = account;
    }

    
    @Column(name="active", nullable=false)
    public boolean isActive() {
        return this.active;
    }
    
    public void setActive(boolean active) {
        this.active = active;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date", nullable=false, length=19)
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }

    
    @Column(name="ip", nullable=false, length=30)
    public String getIp() {
        return this.ip;
    }
    
    public void setIp(String ip) {
        this.ip = ip;
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


