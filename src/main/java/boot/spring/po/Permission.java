package boot.spring.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel("权限表")
public class Permission {
    @ApiModelProperty("权限ID标识")
    Integer pid;

    @ApiModelProperty("权限名称")
    String permissionname;

    List<Role_permission> rp;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPermissionname() {
        return permissionname;
    }

    public void setPermissionname(String permissionname) {
        this.permissionname = permissionname;
    }

    public List<Role_permission> getRp() {
        return rp;
    }

    public void setRp(List<Role_permission> rp) {
        this.rp = rp;
    }

}
