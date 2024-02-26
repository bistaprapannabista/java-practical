<!-- Scriptlet Tag -->
<%
    // Scriptlet tag is used for adding Java code directly into JSP
    String message = "Hello from Scriptlet!";
    int number = 10;
    for (int i = 1; i <= number; i++) {
%>
        <p>Count: <%= i %></p>
<%
    }
%>
<p>Message: <%= message %></p>

<!-- Declaration Tag -->
<%! 
    // Declaration tag is used for declaring member variables and methods
    private String name = "Prapanna Bista";

    // Method declaration
    public String getName() {
        return name;
    }
%>
<p>Name: <%= getName() %></p>

<!-- Expression Tag -->
<p>Result: <%= 10 + 20 %></p>
<p>Concatenation: <%= "Hello" + " " + "World" %></p>

<form method="post" action="process.jsp">
Username:<input type="text" name="username"/>
Password:<input type="password" name="password"/>
<input type="submit"/>
</form>