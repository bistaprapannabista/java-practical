<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if(username.equals("bista") && password.equals("password"))
        out.println("Welcome.");
    else
        out.println("Rejected.");

    
%>