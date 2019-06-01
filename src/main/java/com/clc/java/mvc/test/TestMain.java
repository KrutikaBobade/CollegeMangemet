package com.clc.java.mvc.test;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.clc.java.mvc.bean.AcademicDetailBean;
import com.clc.java.mvc.bean.AddressBean;
import com.clc.java.mvc.bean.CourseBean;
import com.clc.java.mvc.bean.FeesBean;
import com.clc.java.mvc.bean.PermanentAddressBean;
import com.clc.java.mvc.bean.StudentBean;
import com.clc.java.mvc.bean.TempAddressBean;
import com.clc.java.mvc.configration.SpringHibernateConfig;
import com.clc.java.mvc.controller.RegistationController;
import com.clc.java.mvc.dao.impl.RegistationDaoImpl;
import com.clc.java.mvc.service.impl.RegistationServiceImpl;

public class TestMain {
public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(SpringHibernateConfig.class);
	RegistationController controller = (RegistationController) context.getBean("registationController");

RegistationServiceImpl service = controller.regisService;
System.out.println(service.hashCode());
RegistationDaoImpl rdao =service.registationdao;
System.out.println(rdao.hashCode());
SessionFactory session =rdao.sessionfactory;
System.out.println(session.hashCode());
RegistationServiceImpl impl = new RegistationServiceImpl();

PermanentAddressBean ad1 = new PermanentAddressBean(445001, "Yavatmal", "Yavatmal", "Yavatmal", "MH", "Yavatmal");
TempAddressBean ad2 = new TempAddressBean(445001, "Yavatmal", "Yavatmal", "Yavatmal", "MH", "Yavatmal");
FeesBean fee = new  FeesBean(144522.63);
AddressBean add = new AddressBean(ad2, ad1);
AcademicDetailBean academicDetailBean =new AcademicDetailBean(450,600,470,650,690,800);

CourseBean courseBean = new CourseBean(56,"Electronics","A",fee);

//StudentBean s1 = new StudentBean(45, "Krutika Kishor Bobade", "kishor", "karuna", "female", 31, 20, "krutika", 735084);
//StudentBean s2 = new StudentBean(12, "aaa sss ddd", "fdhs", "fdshhjs", "sdafhg", 12, yearLevel, emailId, mobileNumber)
/*s1.setAcademicDetailBean(academicDetailBean);
s1.setStudentFullName("Krutika kishor bobade");
s1.setMobileNumber(735083);
s1.setAddressBean(add);
s1.setCourseBean(courseBean);
*/


/*impl.addStudent(s1);
System.out.println(s1);*/
}
}
