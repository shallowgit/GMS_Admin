package gms.cuit.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Gms_Equipment_Lease implements Serializable {

    /**
     * 租借编号
     */
    private String lease_Id;

    /**
     * 工号/学号
     */
    private Gms_User gms_User;

    /**
     * 器材编号
     */
    private Gms_Equipment gms_Equipment;

    /**
     * 借用数量
     */
    private Integer lease_Count;

    /**
     * 借用状态
     */
    private int lease_State;// 0表示未归还，1表示已归还

    /**
     * 器材借用开始日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+08")
    private Date lease_BorrowTime;

    /**
     * 器材借用归还日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+08")
    private Date lease_ReturnTime;

    public Gms_Equipment_Lease() {
        super();
    }

    public String getLease_Id() {
        return lease_Id;
    }

    public void setLease_Id(String lease_Id) {
        this.lease_Id = lease_Id;
    }

    public Gms_User getGms_User() {
        return gms_User;
    }

    public void setGms_User(Gms_User gms_User) {
        this.gms_User = gms_User;
    }

    public Gms_Equipment getGms_Equipment() {
        return gms_Equipment;
    }

    public void setGms_Equipment(Gms_Equipment gms_Equipment) {
        this.gms_Equipment = gms_Equipment;
    }

    public Integer getLease_Count() {
        return lease_Count;
    }

    public void setLease_Count(Integer lease_Count) {
        this.lease_Count = lease_Count;
    }

    public int getLease_State() {
        return lease_State;
    }

    public void setLease_State(int lease_State) {
        this.lease_State = lease_State;
    }

    public Date getLease_BorrowTime() {
        return lease_BorrowTime;
    }

    public void setLease_BorrowTime(Date lease_BorrowTime) {
        this.lease_BorrowTime = lease_BorrowTime;
    }

    public Date getLease_ReturnTime() {
        return lease_ReturnTime;
    }

    public void setLease_ReturnTime(Date lease_ReturnTime) {
        this.lease_ReturnTime = lease_ReturnTime;
    }
}