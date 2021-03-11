package loginAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import antlr.collections.List;
import form.RegisterDAO;
import form.RegistrationFrom;

public class LoginAction extends Action{
	
	public ActionForward execute(ActionForm form,HttpServletRequest req,HttpServletResponse res,ActionMapping mapping) throws Exception{
		HttpSession session=req.getSession(true);
		RegisterDAO dao=new RegisterDAO();
		RegistrationFrom registrationFrom =(RegistrationFrom) form ;
		String userName=registrationFrom.getUsername();
		String password=registrationFrom.getPassword();
		List userdata;
		userdata=dao.checkUser(userName,password);
		
		return mapping.findForward("failure");
	}
	
}
