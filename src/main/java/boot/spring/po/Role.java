package boot.spring.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel("角色表")
public class Role {
    @ApiModelProperty("角色主键标识")
    Integer rid;

    @ApiModelProperty("角色名称")
    String rolename;

    @ApiModelProperty("维护用户信息与角色信息的关系")
    List<User_role> user_roles;

    @ApiModelProperty("维护角色信息与权限信息的关系")
    List<Role_permission> role_permissions;

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public List<User_role> getUser_roles() {
        return user_roles;
    }

    public void setUser_roles(List<User_role> user_roles) {
        this.user_roles = user_roles;
    }

    public List<Role_permission> getRole_permission() {
        return role_permissions;
    }

    public void setRole_permission(List<Role_permission> role_permission) {
        this.role_permissions = role_permission;
    }


}
