/*
package appMonitor.common.shiroConfig;

*/
/**
 * AUTHOR: zhangbendong
 * DATE: 2018/10/18 21:37
 *//*

@Override
protected  class AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        System.out.println("权限配置-->MyShiroRealm.doGetAuthorizationInfo()");
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        UserInfo userInfo  = (UserInfo)principals.getPrimaryPrincipal();
        for(SysRole role:userInfo.getRoleList()){
        authorizationInfo.addRole(role.getRole());
        for(SysPermission p:role.getPermissions()){
        authorizationInfo.addStringPermission(p.getPermission());
        }
        }
        return authorizationInfo;
}
*/
