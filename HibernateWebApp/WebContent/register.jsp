
<%@page import="com.akh.dao.UserDao"%>
<jsp:useBean id="obj" class="com.akh.dao.User">
</jsp:useBean>
<jsp:setProperty property="*" name="obj" />

<%  
int i=UserDao.register(obj);  
if(i>0)  
out.print("You are successfully registered");  
  
%>

<a href="index.jsp"> Index page</a>
