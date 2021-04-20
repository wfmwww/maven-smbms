package cn.smbms.filter;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authz.AuthorizationFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class RoleFilter extends AuthorizationFilter {

    @Override
    protected boolean isAccessAllowed(ServletRequest servletRequest, ServletResponse servletResponse, Object o) throws Exception {
        String[] roles = (String[])o;//roles中的要求的权限
        Subject subject = this.getSubject(servletRequest, servletResponse);
        if(roles==null|roles.length==0){
            return true;//放行
        }else{
            for (String role : roles) {
                if(subject.hasRole(role)){
                    return true;//放行     实际的用户subject具备了其中之一的权限，则放行通过
                }
            }
        }
        return false;
    }
}
