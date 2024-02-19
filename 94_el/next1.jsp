<%@ page import="models.User" %>

    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
    </head>

    <body>

        <h1>Next 1 Page</h1>

        <!-- <hr> -->
        <% User user=(User)request.getAttribute("user"); %>

            <hr>

            User Name: <%= user.getName() %> <br>
                User Age: <%= user.getAge() %>

    </body>

    </html>