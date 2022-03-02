package boot.spring.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("角色与权限的关系表")
public class Role_permission {

    @ApiModelProperty("主键标识")
    Integer rpid;

    @ApiModelProperty("角色信息")
    Role role;

    @ApiModelProperty("权限信息")
    Permission permission;

    public int getRpid() {
        return rpid;
    }

    public void setRpid(int rpid) {
        this.rpid = rpid;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }

}
