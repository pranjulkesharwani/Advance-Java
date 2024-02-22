<%--<%@ page import="java.util.ArrayList" %>
    --%>
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
    </head>

    <body>
        <h1>Next Page</h1>

        <hr>
        <%--<% ArrayList list=(ArrayList)request.getAttribute("dholakpur"); %>

            <%= list.get(0) %><br><br>
                <%= list.get(1) %><br><br>
                    <%= list.get(2) %><br><br>
                        <%= list.get(3) %><br><br>
                            <%= list.get(4) %><br><br>
                                --%>

                                ${dholakpur[0]} <br><br>
                                ${dholakpur[1]} <br><br>
                                ${dholakpur[2]} <br><br>
                                ${dholakpur[3]} <br><br>
                                ${dholakpur[4]} <br><br>
    </body>

    </html>