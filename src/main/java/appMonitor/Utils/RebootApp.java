package appMonitor.Utils;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;

/**
 * windows系统下
 */
@Component
public class RebootApp {
	/**
	 * 启动app
	 * @param batName
	 */
	public boolean runboot(String batName) {
	    boolean flag = false;
        try {
            Process ps = Runtime.getRuntime().exec(batName);
            //ps.isAlive();
            System.out.println(ps);
            InputStream in = ps.getInputStream();
            in.close();
            ps.waitFor();
            flag = true;
        } catch (IOException ioe) {
            ioe.printStackTrace();
            flag = false;
        } catch (InterruptedException e) {
            e.printStackTrace();
            flag = false;
        }
        System.out.println("child thread donn");
        return flag;
    }
	/**
	 * 关闭app
	 * @param pid
	 * @throws IOException
	 */
	public boolean shutdownApp(Integer pid) throws IOException {
	    boolean flag = false;
	    try{
            Process process = Runtime.getRuntime().exec("taskkill /f /pid "+pid);
            flag = true;
        }catch (Exception e){
            flag = false;
        }
        return flag;
	}
}
