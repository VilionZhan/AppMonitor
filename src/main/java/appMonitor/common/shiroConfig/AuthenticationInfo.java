/*
package appMonitor.common.shiroConfig;

*/
/**
 * AUTHOR: zhangbendong
 * DATE: 2018/10/18 21:35
 *//*

@Override
protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println("MyShiroRealm.doGetAuthenticationInfo()");
        //获取用户的输入的账号.
        String username = (String)token.getPrincipal();
        System.out.println(token.getCredentials());
        //通过username从数据库中查找 User对象，如果找到，没找到.
        //实际项目中，这里可以根据实际情况做缓存，如果不做，Shiro自己也是有时间间隔机制，2分钟内不会重复执行该方法
        UserInfo userInfo = userInfoService.findByUsername(username);
        System.out.println("----->>userInfo="+userInfo);
        if(userInfo == null){
        return null;
        }
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
        userInfo, //用户名
        userInfo.getPassword(), //密码
        ByteSource.Util.bytes(userInfo.getCredentialsSalt()),//salt=username+salt
        getName()  //realm name
        );
        return authenticationInfo;
}
*/
