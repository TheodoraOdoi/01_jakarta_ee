<%-- 
    Document   : frmaddnums
    Created on : Sep 27, 2026, 1:30:23 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ADSE2501 - Addition Page</title>
        <script>
            // validate the add numbers form
            function validateForm()
            {
                const first = document.getElementById("txtFirstNum").value.trim();
                const second = document.getElementById("txtSecondNum").value.trim();
                
                if(first = "" || second = "")
                {
                    alert("Please enter both numbers.");
                    return false;
                }
                return true;
            }
        </script>
    </head>
    <body>
        <h1>Add Numbers</h1>
        
        <% if (request.getAttribute("error")!= null) { %>
        <p style="color: red; font-weight: 800;"><%= request.getAttribute("error") %></p>
        <% } %>
        
        <form method="post" id="frmAddNums" action="add" onsubmit="return validateForm();">
            <p>
                <label for="txtFirstNum">First Number *:</label><br/>
                <input type="text" id="txtFirstNum" name="txtFirstNum" tabindex="10"/>
            </p>
            <p>
                <label for="txtSecondNum">Second Number *:</label><br/>
                <input type="text" id="txtSecondNum" name="txtSecondNum" tabindex="20"/>
            </p>
            <p>
                <label for="txtSumNum">Sum Number *:</label><br/>
                <input type="text" id="txtSumNum" readonly value="${sum}"/>
            </p>
            <p>
                <input type="submit" tabindex="30" id="btnAdd" name="txtSum" value="Add"/>
            </p>
        </form>
    </body>
</html>
