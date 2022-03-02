package boot.spring.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("用户与角色中间关系")
public class User_role {

    @ApiModelProperty("主键标识")
    Integer urid;

    @ApiModelProperty("用户信息")
    User user;

    @ApiModelProperty("角色信息")
    Role role;

    public int getUrid() {
        return urid;
    }

    public void setUrid(int urid) {
        this.urid = urid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

}
