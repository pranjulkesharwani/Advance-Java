<%@ page import="java.util.HashMap" %>

    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
    </head>

    <body>
        <% HashMap map=(HashMap)request.getAttribute("records"); %>

            <hr>
            AAA: <%= map.get("aaa") %><br><br>
                BBB: <%= map.get("bbb") %><br><br>
                    CCC: <%= map.get("ccc") %>
    </body>

    </html>