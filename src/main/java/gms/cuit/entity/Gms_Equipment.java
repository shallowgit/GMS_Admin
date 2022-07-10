package gms.cuit.entity;

import java.io.Serializable;

public class Gms_Equipment implements Serializable {

    /**
     * 器材编号
     */
    private String equipment_Id;
    /**
     * 器材名字
     */
    private String equipment_Name;
    /**
     * 器材数量
     */
    private Integer equipment_Count;
    /**
     * 器材借用数量
     */
    private Integer equipment_Lend;

    /**
     * 器材是否被删除 为0代表器材未被删除,1代表器材被删除了
     */
    private Integer equipment_IsDel;

    public Gms_Equipment() {
        super();
    }

    @Override
    public String toString() {
        return "Gms_Equipment{" +
                "equipment_Id='" + equipment_Id + '\'' +
                ", equipment_Name='" + equipment_Name + '\'' +
                ", equipment_Count=" + equipment_Count +
                ", equipment_Lend=" + equipment_Lend +
                ", equipment_IsDel=" + equipment_IsDel +
                '}';
    }

    public String getEquipment_Id() {
        return equipment_Id;
    }

    public void setEquipment_Id(String equipment_Id) {
        this.equipment_Id = equipment_Id;
    }

    public String getEquipment_Name() {
        return equipment_Name;
    }

    public void setEquipment_Name(String equipment_Name) {
        this.equipment_Name = equipment_Name;
    }

    public Integer getEquipment_Count() {
        return equipment_Count;
    }

    public void setEquipment_Count(Integer equipment_Count) {
        this.equipment_Count = equipment_Count;
    }

    public Integer getEquipment_Lend() {
        return equipment_Lend;
    }

    public void setEquipment_Lend(Integer equipment_Lend) {
        this.equipment_Lend = equipment_Lend;
    }

    public Integer getEquipment_IsDel() {
        return equipment_IsDel;
    }

    public void setEquipment_IsDel(Integer equipment_IsDel) {
        this.equipment_IsDel = equipment_IsDel;
    }
}