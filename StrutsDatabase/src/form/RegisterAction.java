package form;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class RegisterAction extends Action {

	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest req,HttpServletResponse res) throws Exception{
		RegistrationFrom f=(RegistrationFrom) form;
		HttpSession ses=req.getSession(true);
		String firstName=f.getFirstName();
		String lastName=f.getLastName();
		String email=f.getEmail();
		String phoneNumber=f.getPhoneNumber();
		String username=f.getUsername();
		String password=f.getPassword();
		RegisterDAO dao=new RegisterDAO();
		
		if(firstName==""||lastName==""||email==""||phoneNumber==""){
			
			return mapping.findForward("failure");
		}
		dao.insert(firstName,lastName,email,phoneNumber,username,password);
		ses.setAttribute("firstName", firstName);
		ses.setAttribute("lastName", lastName);
		ses.setAttribute("email", email);
		ses.setAttribute("username", username);
		ses.setAttribute("password", password);
		ses.setAttribute("phoneNumber", phoneNumber);
		return mapping.findForward("success");
	}
}
