/**
 * Copyright © 2015-2016 北京银港科技有限公司. All rights reserved.
 */
package appMonitor.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;

/**
 * Create By zhangdd happy programming....
 *
 * @Author zhangdd
 * @Date 2019/8/15  21:42
 * @Version 1.0
 * @description
 */
public abstract class BaseController {

	protected final Logger logger = LoggerFactory.getLogger(getClass());

	protected ModelAndView ajaxDone(int statusCode, String message, String forwardUrl) {
		ModelAndView mav = new ModelAndView("ajaxDone");
		mav.addObject("statusCode", statusCode);
		mav.addObject("message", message);
		mav.addObject("forwardUrl", forwardUrl);
		return mav;
	}

	protected ModelAndView ajaxDoneSuccess(String message) {
		return ajaxDone(200, message, "");
	}

	protected ModelAndView ajaxDoneError(String message) {
		return ajaxDone(300, message, "");
	}

}
