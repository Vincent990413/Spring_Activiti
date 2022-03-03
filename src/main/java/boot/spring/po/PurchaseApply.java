package boot.spring.po;

import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.activiti.engine.task.Task;

import com.alibaba.fastjson.annotation.JSONField;

@ApiModel("采购申请表")
public class PurchaseApply {

    @ApiModelProperty("采购申请主键标识")
    private  Integer id;

    @ApiModelProperty("清单列表")
    private String itemlist;

    @ApiModelProperty("采购总量")
    private BigDecimal total;

    @ApiModelProperty("申请时间")
    private String applytime;

    @ApiModelProperty("申请人")
    private String applyer;

    @ApiModelProperty("Activiti自带的任务Task")
    private Task task;

    @ApiModelProperty("流程实例ID")
    private String processinstanceid;

    @ApiModelProperty("activiti标识")
    private String activityid;

    @ApiModelProperty("采购状态")
    private String state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemlist() {
        return itemlist;
    }

    public void setItemlist(String itemlist) {
        this.itemlist = itemlist;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }


    public String getApplytime() {
        return applytime;
    }

    public void setApplytime(String applytime) {
        this.applytime = applytime;
    }

    public String getApplyer() {
        return applyer;
    }

    public void setApplyer(String applyer) {
        this.applyer = applyer;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public String getProcessinstanceid() {
        return processinstanceid;
    }

    public void setProcessinstanceid(String processinstanceid) {
        this.processinstanceid = processinstanceid;
    }

    public String getActivityid() {
        return activityid;
    }

    public void setActivityid(String activityid) {
        this.activityid = activityid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
