package customer.chengcong.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import customer.chengcong.entity.Users;

public class UsersInterceptor implements HandlerInterceptor{

	public boolean preHandle(HttpServletRequest req, HttpServletResponse resp, Object handle) throws Exception {
		String url=req.getRequestURI();
		if(url.indexOf("/login")>=0) {
			return true;
		}
		HttpSession session=req.getSession();
		Users user=(Users)session.getAttribute("LOGIN");
		if(user != null) {
			return true;
		}
		req.setAttribute("msg", "您未登陆,请先登陆");
		req.getRequestDispatcher("/login.jsp").forward(req, resp);
		return false;
	}
	
	public void postHandle(HttpServletRequest req, HttpServletResponse resp, Object handle, ModelAndView modelAndView)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void afterCompletion(HttpServletRequest req, HttpServletResponse resp, Object handle, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}
}
